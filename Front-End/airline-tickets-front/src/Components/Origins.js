import { useState, useEffect } from "react";
import ListGroup from "react-bootstrap/ListGroup";

import "./Origins.css";
import SearchOriginButton from "./SearchOriginButton";

const Origins = () => {
  const [activeId, setActiveId] = useState(null);
  const [someSelected, setSomeSelectedTrue] = useState(false);
  const [origins, setOrigins] = useState([]);
  const [originName, setOriginName] = useState("");
  const API_URL = "http://localhost:9191/origins";

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
        {origins.map((ori) => {
          return (
            <ListGroup.Item
              as="li"
              active={activeId === ori.id ? true : false}
              action={true}
              onClick={() => {
                setActiveId(ori.id);
                setSomeSelectedTrue(true);
                setOriginName(ori.origin);
              }}
              key={ori.id}
            >
              {ori.origin}
            </ListGroup.Item>
          );
        })}
      </ListGroup>
      <SearchOriginButton selected={someSelected} origin={originName} />
    </>
  );
};

export default Origins;
