package com.serviceSearchFlight.SearchFlight.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

@Component
public class FlightsRepoImpl implements FligthsRepo {
	
	public List<FlightOrigin> origins = new ArrayList<FlightOrigin>();

	@Override
	public List<FlightOrigin> findAllFligthOrigins() {
		return origins; 
	}

}
