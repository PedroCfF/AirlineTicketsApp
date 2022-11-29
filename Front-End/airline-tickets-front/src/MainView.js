import Origins from "./Components/Origins.js";
import Container from "react-bootstrap/Container";
import "./MainView.css";

function MainView() {
  return (
    <Container className="parent container d-flex justify-content-center align-items-center h-100">
      <Container className="row justify-content-center ">
        <Origins />
      </Container>
    </Container>
  );
}

export default MainView;
