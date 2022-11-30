package com.serviceSearchFlight.SearchFlight.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;
import com.serviceSearchFlight.SearchFlight.Repo.FligthsRepo;

@Service
public class FligthOriginServiceImpl implements FligthOriginsService {
	
	@Autowired
    private FligthsRepo flightsRepository;

	@Override
	public List<FlightOrigin> findAll() {
		return flightsRepository.findAll();
	}

	@Override
	public FlightOrigin getOrigin(String id) {
		return flightsRepository.findById(id).orElse(null);
	}

	@Override
	public FlightOrigin save(FlightOrigin origin) {
		flightsRepository.save(origin);
		return origin;
	}



}
