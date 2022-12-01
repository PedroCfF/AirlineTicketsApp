import ContainerComponent from "./ContainerComponent";
import { useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import FlightCard from "./FlightCard";
const SearchFligths = () => {
  const params = useParams();
  const origin = params.origin;
  const destination = params.destination;
  const day = params.day;
  const month = params.month;
  const year = params.year;
  const [flights, setFlights] = useState([]);

  const API_URL =
    "http://localhost:9191/flights/origins/" +
    origin +
    "/" +
    destination +
    "/" +
    day +
    "-" +
    month +
    "-" +
    year;

  const getFlights = async () => {
    const res = await fetch(API_URL);
    const data = await res.json();
    return data;
  };

  useEffect(() => {
    getFlights().then((data) => setFlights(data));
  }, []);

  return (
    <ContainerComponent>
      {flights?.map((flight) => (
        <FlightCard
          origin={flight.origin}
          destination={flight.destination}
          date={flight.date}
          time={flight.time}
          airline={flight.airline}
          flight={flight}
        ></FlightCard>
      ))}
    </ContainerComponent>
  );
};

export default SearchFligths;
