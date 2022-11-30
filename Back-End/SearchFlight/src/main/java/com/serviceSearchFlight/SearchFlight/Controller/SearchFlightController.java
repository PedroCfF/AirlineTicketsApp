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

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;
import com.serviceSearchFlight.SearchFlight.Services.FligthOriginsService;


@RestController
@RequestMapping("origins")
@CrossOrigin
public class SearchFlightController {
	
	@Autowired
	FligthOriginsService sfService;

	@GetMapping()
	public ResponseEntity<List<FlightOrigin>> fetchAllOrigins() throws Exception {

		List<FlightOrigin> listOfOrigins = sfService.findAll();

		return new ResponseEntity<>(listOfOrigins, HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<FlightOrigin> fetchTeam(@PathVariable String id) throws Exception {
		FlightOrigin team = sfService.getOrigin(id);
		if (team == null) {
			throw new Exception("ID not found: " + id);
		}
		return new ResponseEntity<>(team, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<FlightOrigin> saveTeam(@RequestBody FlightOrigin origin) throws Exception {

		sfService.save(origin);

		return new ResponseEntity<>(origin, HttpStatus.CREATED);
	}

}
