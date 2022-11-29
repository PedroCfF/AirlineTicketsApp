package com.serviceSearchFlight.SearchFlight.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;
import com.serviceSearchFlight.SearchFlight.Repo.FlightsRepoImpl;

@Service
public class FligthOriginsService {
	
	@Autowired 
	FlightsRepoImpl originService;
	
	public List<FlightOrigin> findAllFligthOrigins()
	{
		return originService.findAllFligthOrigins();
	}

}
