import { useState, useEffect } from "react";
import ListGroup from "react-bootstrap/ListGroup";

import "./Origins.css";
import SearchOriginButton from "./SearchOriginButton";

const Origins = () => {
  const [activeIndex, setActiveIndex] = useState(null);
  const [someSelected, setSomeSelectedTrue] = useState(false);
  const [origins, setOrigins] = useState([]);
  const [originId, setOriginId] = useState("");
  const API_URL = "http://localhost:9191/flights/origins";

  const getOrigins = async () => {
    const res = await fetch(API_URL);
    const data = await res.json();
    return data;
  };

  useEffect(() => {
    getOrigins().then((data) => setOrigins(data));
  }, []);

  return (
    <>
      <ListGroup as="ul">
        {origins.map((ori, index) => {
          return (
            <ListGroup.Item
              as="li"
              active={activeIndex === index ? true : false}
              action={true}
              onClick={() => {
                setActiveIndex(index);
                setSomeSelectedTrue(true);
                setOriginId(ori);
              }}
              key={ori}
            >
              {ori}
            </ListGroup.Item>
          );
        })}
      </ListGroup>
      <SearchOriginButton selected={someSelected} origin={originId} />
    </>
  );
};

export default Origins;
