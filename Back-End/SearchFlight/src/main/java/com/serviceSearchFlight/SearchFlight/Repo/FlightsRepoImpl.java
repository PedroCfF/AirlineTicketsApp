package com.serviceSearchFlight.SearchFlight.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.serviceSearchFlight.SearchFlight.Models.FlightOrigin;

@Component
public class FlightsRepoImpl implements FligthsRepo {
	
	FlightOrigin origin1= new FlightOrigin("i1","Madrid");
	FlightOrigin origin2= new FlightOrigin("i2","Paris");
	FlightOrigin origin3= new FlightOrigin("i3","Londres");
	FlightOrigin origin4= new FlightOrigin("i4","Barcelona");
	FlightOrigin origin5= new FlightOrigin("i5","Roma");
	
	List<FlightOrigin> origins=List.of(origin1, origin2, origin3, origin4,origin5);

	@Override
	public List<FlightOrigin> findAllFligthOrigins() {
		return origins; 
	}

}
