import { useEffect, useState } from "react";
import ListGroup from "react-bootstrap/ListGroup";
import Button from "react-bootstrap/Button";
import { Link, useParams } from "react-router-dom";

const Origins = () => {
  const [activeIndex, setActiveIndex] = useState(null);

  const origins = ["Madrid", "Barcelona", "Paris", "Berlin", "London"];

  //   useEffect(() => {
  //     console.log(activeIndex);
  //   }, [activeIndex]);

  return (
    <>
      <ListGroup as="ul">
        {origins.map((origin, index) => {
          return (
            <ListGroup.Item
              as="li"
              active={activeIndex === index ? true : false}
              action
              onClick={() => setActiveIndex(index)}
              key={index}
            >
              {origin}
            </ListGroup.Item>
          );
        })}
      </ListGroup>
      <Link
        className="text-light"
        to={`/originFligths/${origins[activeIndex]}`}
      >
        <Button variant="outline-primary">Search</Button>
      </Link>
    </>
  );
};

export default Origins;
