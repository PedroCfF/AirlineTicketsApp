import Button from "react-bootstrap/Button";
import { Link } from "react-router-dom";

const SearchOriginButton = (props) => {
  return (
    <>
      {props.selected ? (
        <Link className="text-light" to={`/originFligths/${props.origin}`}>
          <Button variant="outline-primary">Search</Button>
        </Link>
      ) : (
        <Button disabled={true} variant="outline-primary">
          Search
        </Button>
      )}
    </>
  );
};

export default SearchOriginButton;
