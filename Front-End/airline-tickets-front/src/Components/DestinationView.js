import { useParams } from "react-router-dom";

const DestinationView = (props) => {
  const originObj = useParams();
  const origin = originObj.origin;

  const API_URL = "http://localhost:9191/origins/";

  const getOrigins = async () => {
    const res = await fetch(API_URL);
    const data = await res.json();
    return data;
  };

  return <h1>{origin}</h1>;
};

export default DestinationView;
