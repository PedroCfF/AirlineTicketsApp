package com.serviceSearchFlight.SearchFlight.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.serviceSearchFlight.SearchFlight.Models.Flight;

@Service
public interface FligthService {
	
	List<Flight> findAll();
	
	Flight findFlight(String id);
	
	List<String> findAllOrigins();
	
	List<String> findDestinationsByOrigin(String id);
	
	Flight saveFlight(Flight flight);
}
