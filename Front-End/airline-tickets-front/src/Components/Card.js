import "./Card.css";
import Modal from "react-bootstrap/Modal";
import React, { useState } from "react";
import Button from "react-bootstrap/Button";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { Link } from "react-router-dom";

function Card(props) {
  const destination = props.destination;
  const origin = props.origin;
  const [show, setShow] = useState(false);
  const [selected, setSelected] = useState("");
  const [showRounded, setShowRounded] = useState(false);
  const [showOneWay, setShowOneWay] = useState(false);
  const [outbondDate, setOutbondDate] = useState(null);
  const [returnDate, setReturnDate] = useState(null);
  const oneWayHandler = () => {
    setShowOneWay(true);
    setShowRounded(false);
  };
  const roundHandler = () => {
    setShowRounded(true);
    setShowOneWay(false);
  };
  const handleClose = () => {
    setShow(false);
  };
  const handleShow = () => {
    setShow(true);
  };

  const dateToString = (date) => {
    const day = date.toLocaleString("en-US", { day: "2-digit" });
    const month = outbondDate.toLocaleString("en-US", { month: "2-digit" });
    const year = date.getFullYear();
    return day + "-" + month + "-" + year;
  };

  return (
    <>
      {/*Botones con los destinos */}

      <div className="col-lg-2 col-sm-6 p-0 ms-2 me-2 d-flex justify-content-center ">
        <button className="btn btn-team m-3" onClick={handleShow}>
          <div className="text-uppercase fs-3 mb-4 mb-3 ms-3 me-3 font-monospace">
            {destination}
          </div>
        </button>
      </div>
      {/*Botones con los destinos */}

      {/*Modal cuando eliges un destino */}
      <Modal
        show={show}
        onHide={handleClose}
        backdrop="static"
        keyboard={false}
      >
        <Modal.Header closeButton>
          <Modal.Title>{destination}</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Button variant="success" onClick={oneWayHandler}>
            One Way
          </Button>
          {"   "}
          <Button variant="success" onClick={roundHandler}>
            Rounded
          </Button>
        </Modal.Body>

        {/*Vuelo solo ida*/}

        {showOneWay ? (
          <Modal.Footer>
            <DatePicker
              placeholderText="Select outbound flight date"
              selected={outbondDate}
              onChange={(date) => setOutbondDate(date)}
            />

            {outbondDate === null ? null : (
              <Link
                className="text-light"
                to={`/oneWay/${origin}/${destination}/${dateToString(
                  outbondDate
                )} `}
              >
                <button type="button" class="btn btn-primary">
                  Search
                </button>
              </Link>
            )}
          </Modal.Footer>
        ) : null}
        {/*Vuelo solo ida*/}

        {/*Vuelo ida y vuelta*/}
        {showRounded ? (
          <Modal.Footer>
            {" "}
            <DatePicker
              placeholderText="Select outbound flight date"
              selected={outbondDate}
              onChange={(date) => setOutbondDate(date)}
            />
            <DatePicker
              placeholderText="Select return flight date"
              selected={returnDate}
              onChange={(date) => setReturnDate(date)}
            />
            {outbondDate === null || returnDate === null ? null : (
              <Link
                className="text-light"
                to={`/oneWay/${origin}/${destination}/${dateToString(
                  outbondDate
                )}/${dateToString(returnDate)}`}
              >
                <button type="button" class="btn btn-primary">
                  Search
                </button>
              </Link>
            )}
          </Modal.Footer>
        ) : null}
        {/*Vuelo ida y vuelta*/}
      </Modal>

      {/*Modal cuando eliges un destino */}
    </>
  );
}

export default Card;
