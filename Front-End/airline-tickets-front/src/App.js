import "./App.css";
import DestinationView from "./Components/DestinationView.js";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";

import { Routes, Route } from "react-router-dom";
import MainView from "./MainView";
import SearchFligths from "./Components/SearchFlights";

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainView />}></Route>
        <Route
          path="/originFligths/:origin"
          element={<DestinationView />}
        ></Route>
        <Route
          path="/oneWay/:origin/:destination/:day/:month/:year"
          element={<SearchFligths></SearchFligths>}
        ></Route>
      </Routes>
    </>
  );
}

export default App;
