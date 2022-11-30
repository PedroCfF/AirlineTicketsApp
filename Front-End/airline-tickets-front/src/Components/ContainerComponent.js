import Container from "react-bootstrap/esm/Container";
import "./ContainerComponent.css";

function ContainerComponent(props) {
  const classes = "card" + props.className;
  return (
    <Container className="parent container d-flex flex-column justify-content-center align-items-center h-100">
      <Container className="row justify-content-center d-flex flex-column ">
        <div className={classes}>{props.children}</div>
      </Container>
    </Container>
  );
}

export default ContainerComponent;
