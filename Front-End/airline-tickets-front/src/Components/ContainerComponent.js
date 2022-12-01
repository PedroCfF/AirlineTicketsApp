import Container from "react-bootstrap/esm/Container";
import "./ContainerComponent.css";
import Navbar from "react-bootstrap/Navbar";
import NavDropdown from "react-bootstrap/NavDropdown";
import Nav from "react-bootstrap/Nav";
import { Link } from "react-router-dom";

function ContainerComponent(props) {
  const classes = "card" + props.className;
  return (
    <>
      <Navbar bg="light" expand="lg">
        <Container>
          <Navbar.Brand href="#home">Airlines</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Link className="text-dark" to={`/`}>
                Home
              </Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <Container className="parent container d-flex flex-column justify-content-center align-items-center h-100">
        <Container className="row justify-content-center d-flex flex-column ">
          <div className={classes}>{props.children}</div>
        </Container>
      </Container>
    </>
  );
}

export default ContainerComponent;
