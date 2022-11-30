package com.serviceSearchFlight.SearchFlight.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceSearchFlight.SearchFlight.Models.Flight;
import com.serviceSearchFlight.SearchFlight.Services.FligthService;


@RestController
@RequestMapping("flights")
@CrossOrigin
public class SearchFlightController {
	
	@Autowired
	FligthService sfService;

	@GetMapping()
	public ResponseEntity<List<Flight>> fetchAllFlights() throws Exception {

		List<Flight> listOfOrigins = sfService.findAll();

		return new ResponseEntity<>(listOfOrigins, HttpStatus.OK);
	}
	
	@GetMapping(path="/{id}")
    public ResponseEntity<Flight> GetFlight(@PathVariable String id) throws Exception {
		
		Flight flight = sfService.findFlight(id);

        return new ResponseEntity<>(flight, HttpStatus.OK);
    }
	
	@GetMapping(path="/origins")
    public ResponseEntity<List<String>> GetOrigins() throws Exception {

        List<String> origins = sfService.findAllOrigins();

        return new ResponseEntity<>(origins, HttpStatus.OK);
    }
	
	@GetMapping(path="/origins/{origin}")
    public ResponseEntity<List<String>> GetDestinations(@PathVariable String origin) throws Exception {

        List<String> destinations = sfService.findDestinationsByOrigin(origin);

        return new ResponseEntity<>(destinations, HttpStatus.OK);
    }
	
	@GetMapping(path="/origins/{origin}/{destination}")
    public ResponseEntity<List<Flight>> GetFlightsSelected(@PathVariable String destination) throws Exception {

        List<Flight> flightsAvailable = sfService.findAvailableFlights(destination);

        return new ResponseEntity<>(flightsAvailable, HttpStatus.OK);
    }
	
	@GetMapping(path="/{airline}")
    public ResponseEntity<List<Flight>> filterByAirline(@PathVariable String airline) throws Exception {

        List<Flight> flightsByAirline = sfService.filterByAirline(airline);

        return new ResponseEntity<>(flightsByAirline, HttpStatus.OK);
    }
	
	@PostMapping()
	public ResponseEntity<Flight> saveTeam(@RequestBody Flight flight) throws Exception {

		sfService.saveFlight(flight);
		
		return new ResponseEntity<>(flight, HttpStatus.CREATED);
	}
	
}
