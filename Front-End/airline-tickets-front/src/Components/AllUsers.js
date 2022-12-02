import ContainerComponent from "./ContainerComponent";
import { useEffect, useState } from "react";
import Card from "react-bootstrap/Card";

const AllUsers = () => {
  const API_URL = "http://localhost:9191/users";
  const [users, setUsers] = useState([]);

  const getUsers = async () => {
    const res = await fetch(API_URL);
    const data = await res.json();
    return data;
  };

  useEffect(() => {
    getUsers().then((data) => setUsers(data));
  }, []);

  return (
    <ContainerComponent>
      {users.map((user) => (
        <Card style={{ width: "18rem" }}>
          <Card.Body>
            <Card.Title>{user.name}</Card.Title>
            <Card.Text>{}</Card.Text>
          </Card.Body>
        </Card>
      ))}
    </ContainerComponent>
  );
};

export default AllUsers;
