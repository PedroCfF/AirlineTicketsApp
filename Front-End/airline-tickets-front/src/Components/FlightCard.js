import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";
import { useState } from "react";
import Modal from "react-bootstrap/Modal";
import Form from "react-bootstrap/Form";
import Toast from "react-bootstrap/Toast";
import ToastContainer from "react-bootstrap/ToastContainer";

const FlightCard = (props) => {
  const API_URL = "http://localhost:9191/users";
  const [show, setShow] = useState(false);
  const [name, setName] = useState("");
  const [lastName, setLastName] = useState("");
  const [nie, setNie] = useState("");
  const [passport, setPassport] = useState("");
  const [email, setEmail] = useState("");
  const [showToast, setShowToast] = useState(false);

  const handleShow = () => setShow(true);
  const handleClose = () => setShow(false);
  const handleNameChange = (e) => setName(e.target.value);
  const handleLastNameChange = (e) => setLastName(e.target.value);
  const handleNieChange = (e) => setNie(e.target.value);
  const handlePassportChange = (e) => setPassport(e.target.value);
  const handleEmailChange = (e) => setEmail(e.target.value);

  const postData = (data) => {
    const response = fetch(API_URL, {
      method: "POST",
      body: JSON.stringify(data),
      headers: {
        "Content-Type": "application/json",
      },
    });
    console.log(response);
  };

  const handleBook = () => {
    const newUser = {
      name: name,
      lastname: lastName,
      nie: nie,
      passport: passport,
      email: email,
      flights: [props.flight],
    };
    console.log(newUser);
    setShow(false);
    postData(newUser);
    setShowToast(true);
  };

  return (
    <>
      <div className="d-flex justify-content-around">
        <Card bg="Light" style={{ width: "18rem" }}>
          <Card.Body>
            <Card.Title>
              {props.origin} to {props.destination}
            </Card.Title>
            <Card.Text>Date: {props.date}</Card.Text>
            <Card.Text>Time: {props.time}</Card.Text>
            <Card.Text>Airline: {props.airline}</Card.Text>
          </Card.Body>
          <Button variant="success" onClick={handleShow}>
            Book
          </Button>
        </Card>
      </div>

      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Book Flight</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>
            <Form.Group className="mb-3">
              <Form.Label>First Name</Form.Label>
              <Form.Control
                value={name}
                onChange={handleNameChange}
              ></Form.Control>
            </Form.Group>

            <Form.Group className="mb-3">
              <Form.Label>Last Name</Form.Label>
              <Form.Control
                value={lastName}
                onChange={handleLastNameChange}
              ></Form.Control>
            </Form.Group>

            <Form.Group className="mb-3">
              <Form.Label>NIE</Form.Label>
              <Form.Control
                placeholder="A0000000B"
                value={nie}
                onChange={handleNieChange}
              ></Form.Control>
            </Form.Group>

            <Form.Group className="mb-3">
              <Form.Label>Passport</Form.Label>
              <Form.Control
                placeholder="PassportNumber"
                value={passport}
                onChange={handlePassportChange}
              ></Form.Control>
            </Form.Group>
            <Form.Label>Email address</Form.Label>
            <Form.Control
              type="email"
              placeholder="name@example.com"
              autoFocus
              value={email}
              onChange={handleEmailChange}
            />
          </Form>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Close
          </Button>
          <Button variant="primary" onClick={handleBook}>
            Book Flight
          </Button>
        </Modal.Footer>
      </Modal>
      <ToastContainer position="bottom-end" className="p-3">
        <Toast
          onClose={() => setShowToast(false)}
          //bg="dark"
          show={showToast}
          delay={3000}
          autohide
        >
          <Toast.Header>
            <img
              src="holder.js/20x20?text=%20"
              className="rounded me-2"
              alt=""
            />
            <strong className="me-auto">Airlines</strong>
            <small>1 s ago</small>
          </Toast.Header>
          <Toast.Body>Felicidades, acaba de reservar un vuelo</Toast.Body>
        </Toast>
      </ToastContainer>
    </>
  );
};

export default FlightCard;
