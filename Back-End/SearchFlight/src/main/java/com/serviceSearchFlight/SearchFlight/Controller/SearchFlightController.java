package com.serviceSearchFlight.SearchFlight.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

		List<FlightOrigin> listOfOrigins = sfService.findAllFligthOrigins();

		return new ResponseEntity<>(listOfOrigins, HttpStatus.OK);
	}

}
