import { useParams } from "react-router-dom";
import ContainerComponent from "./ContainerComponent";
import { useState, useEffect } from "react";
import Card from "./Card.js";

const DestinationView = (props) => {
  const originObj = useParams();
  const id = originObj.origin;
  const [destinations, setDestinations] = useState([]);

  const API_URL = "http://localhost:9191/origins";

  const getOrigins = async () => {
    const res = await fetch(API_URL);
    const data = await res.json();
    return data;
  };

  useEffect(() => {
    getOrigins().then((data) => setDestinations(data));
    console.log(destinations);
  }, []);

  return (
    <ContainerComponent>
      <div className="row justify-content-lg-center mb-4">
        {destinations?.map(({ id, origin }) => (
          <Card destination={origin}></Card>
        ))}
      </div>
    </ContainerComponent>
  );
};

export default DestinationView;
