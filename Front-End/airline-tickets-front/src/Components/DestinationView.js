import { useParams } from "react-router-dom";
import ContainerComponent from "./ContainerComponent";
import { useState, useEffect } from "react";
import Card from "./Card.js";

const DestinationView = () => {
  const originObj = useParams();
  const city = originObj.origin;
  console.log(city);
  const [destinations, setDestinations] = useState([]);

  const API_URL = "http://localhost:9191/flights/origins/" + city;

  const getOrigins = async () => {
    const res = await fetch(API_URL);
    const data = await res.json();
    return data;
  };

  useEffect(() => {
    getOrigins().then((data) => setDestinations(data));
  }, []);

  return (
    <ContainerComponent>
      <div className="row justify-content-lg-center mb-4">
        {destinations?.map((dest) => (
          <Card destination={dest} origin={city}></Card>
        ))}
      </div>
    </ContainerComponent>
  );
};

export default DestinationView;
