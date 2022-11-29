package com.serviceSearchFlight.SearchFlight.Repo;

import java.util.List;

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

public interface FligthsRepo {
	
	public List<FlightOrigin> findAllFligthOrigins();

}
