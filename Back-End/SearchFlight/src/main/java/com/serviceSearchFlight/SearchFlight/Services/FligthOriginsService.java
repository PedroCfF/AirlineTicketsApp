package com.serviceSearchFlight.SearchFlight.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

public interface FligthOriginsService {
	
	public List<FlightOrigin> findAll();
	
	public FlightOrigin getOrigin(String id);

	public FlightOrigin save(FlightOrigin origin);

}
