import { useParams } from "react-router-dom";

//const data = [{ origin: "madrid" }, {}];

const DestinationView = (props) => {
  const originObj = useParams();
  const origin = originObj.origin;

  return <h1>{origin}</h1>;
};

export default DestinationView;
