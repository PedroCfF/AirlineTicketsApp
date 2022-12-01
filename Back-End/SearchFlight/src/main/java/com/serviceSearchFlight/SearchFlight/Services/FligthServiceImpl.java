package com.serviceSearchFlight.SearchFlight.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.serviceSearchFlight.SearchFlight.Models.Flight;
import com.serviceSearchFlight.SearchFlight.Repo.FligthsRepo;

@Service
public class FligthServiceImpl implements FligthService {
	
	@Autowired
    private FligthsRepo flightsRepo;
	
	@Override
	public List<Flight> findAll() {
		return flightsRepo.findAll();
	}
	
	@Override
	public Flight findFlight(String id) {
		return flightsRepo.findById(id).orElse(null);
	}

	@Override
	public List<String> findAllOrigins() {
		
	List<Flight> flights =  flightsRepo.findAll();
	
	List<String> origins = new ArrayList<>();
	
	for(Flight f: flights)
		{
		    if(origins.contains(f.origin)) continue;
			origins.add(f.origin);
		}
		
		return origins;
	}

	@Override
	public Flight saveFlight(Flight flight) {
		flightsRepo.save(flight);
		return flight;
	}

	@Override
	public List<String> findDestinationsByOrigin(String origin) {
		
	List<Flight> flights =  flightsRepo.findAll();
	
	List<String> destinations = new ArrayList<>();
		
	for(Flight f: flights)
		{
		    if(f.origin.equals(origin))
		    {
		    	destinations.add(f.destination);
		    }
			  			    
		}
			
	   return destinations;
	}

	@Override
	public List<Flight> findAvailableFlights(String destination) {
		
	List<Flight> flights =  flightsRepo.findAll();
		
	List<Flight> availableFlights = new ArrayList<>();
			
	for(Flight f: flights)
	     {
			 if(f.destination.equals(destination))
			 {
				 availableFlights.add(f);
			 }			    
		}	
        return availableFlights;
	}
	
	@Override
	public List<Flight> filterAvailableByDate(String date, List<Flight> availableFlights) {
			
	List<Flight> flightsAvailableByDate = new ArrayList<>();
					
	for(Flight f: availableFlights)
	    {		
            if(f.date.equals(date))
		    {
            	flightsAvailableByDate.add(f);
		    }
	    }
						
		    return flightsAvailableByDate;
	}	

	@Override
	public List<Flight> filterByAirline(String airline) {
		
	System.out.println(airline);
		
	List<Flight> flights =  flightsRepo.findAll();
		
	List<Flight> flightsByAirline = new ArrayList<>();
				
	for(Flight f: flights)
		 {
			if(f.airline.equals(airline))
			{
				flightsByAirline.add(f);
			}
         }
					
	    return flightsByAirline;
	}
}
