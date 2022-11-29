import { useState } from "react";
import ListGroup from "react-bootstrap/ListGroup";

import "./Origins.css";
import SearchOriginButton from "./SearchOriginButton";

const Origins = () => {
  const [activeIndex, setActiveIndex] = useState(null);
  const [someSelected, setSomeSelectedTrue] = useState(false);

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
              action={true}
              onClick={() => {
                setActiveIndex(index);
                setSomeSelectedTrue(true);
              }}
              key={index}
            >
              {origin}
            </ListGroup.Item>
          );
        })}
      </ListGroup>
      <SearchOriginButton
        selected={someSelected}
        origins={origins}
        activeIndex={activeIndex}
      />
    </>
  );
};

export default Origins;
