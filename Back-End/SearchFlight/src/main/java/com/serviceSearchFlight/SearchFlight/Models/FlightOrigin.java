package com.serviceSearchFlight.SearchFlight.Models;

public class FlightOrigin {
	public String id;
	public String origin;
	public String[] destinations;
	public String[] dates;
	
	public FlightOrigin() {
		super();
	}
	
	public FlightOrigin(String id, String origin, String[] destinations) {
		super();
		this.id = id;
		this.origin = origin;
		this.destinations = destinations;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String[] getDestinations() {
		return destinations;
	}
	public void setDestinations(String[] destinations) {
		this.destinations = destinations;
	}
	public String[] getDates() {
		return dates;
	}
	public void setDates(String[] dates) {
		this.dates = dates;
	}
	
}
