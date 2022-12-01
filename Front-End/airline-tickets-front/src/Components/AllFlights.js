import FligthCard from "./FlightCard";
import { useState, useEffect } from "react";
import ContainerComponent from "./ContainerComponent";

const AllFlights = () => {
  const API_URL = "http://localhost:9191/flights";
  const [flights, setFlights] = useState([]);

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
        <FligthCard
          origin={flight.origin}
          destination={flight.destination}
          date={flight.date}
          time={flight.time}
          airline={flight.airline}
          flight={flight}
        ></FligthCard>
      ))}
    </ContainerComponent>
  );
};

export default AllFlights;
