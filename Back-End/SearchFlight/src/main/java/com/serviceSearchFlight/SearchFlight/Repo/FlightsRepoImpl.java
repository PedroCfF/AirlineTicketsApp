package com.serviceSearchFlight.SearchFlight.Repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

@Component
public class FlightsRepoImpl implements FligthsRepo {
	
	String[] destinations1 = {"Sevilla", "Roma", "Frankfurt"};
	String[] destinations2 = {"Sevilla", "Roma", "Frankfurt"};
	String[] destinations3 = {"Sevilla", "Roma", "Frankfurt"};
	String[] destinations4 = {"Sevilla", "Roma", "Frankfurt"};
	String[] destinations5 = {"Sevilla", "Roma", "Frankfurt"};
	String[] destinations6 = {"Sevilla", "Roma", "Frankfurt"};
	
	FlightOrigin origin1= new FlightOrigin("i1","Madrid", destinations1);
	FlightOrigin origin2= new FlightOrigin("i2","Paris", destinations2);
	FlightOrigin origin3= new FlightOrigin("i3","Londres", destinations3);
	FlightOrigin origin4= new FlightOrigin("i4","Barcelona", destinations4);
	FlightOrigin origin5= new FlightOrigin("i5","Roma", destinations5);
	
	List<FlightOrigin> origins=List.of(origin1, origin2, origin3, origin4, origin5);

	@Override
	public List<FlightOrigin> findAllFligthOrigins() {
		return origins; 
	}

	@Override
	public FlightOrigin selectOriginByName(String name) {
		for(int i=0;i<origins.size();i++)
		{
			if(origins.get(i).origin.equals(name))
			{
				return origins.get(i);
			}
		}
		
		return null;
	}

}
