import ContainerComponent from "./ContainerComponent";
import { useParams } from "react-router-dom";

const SearchFligths = () => {
  const params = useParams();
  const origin = params.origin;
  const destination = params.destination;
  const day = params.day;
  const month = params.month;
  const year = params.year;
  return (
    <ContainerComponent>
      {origin + destination + day + month + year}
    </ContainerComponent>
  );
};

export default SearchFligths;
