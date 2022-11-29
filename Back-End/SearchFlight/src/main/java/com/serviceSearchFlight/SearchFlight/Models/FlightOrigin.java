package com.serviceSearchFlight.SearchFlight.Models;

import java.util.List;

public class FlightOrigin {
	public String id;
	public String origin;
	
	public FlightOrigin() {
		super();
	}
	public FlightOrigin(String id, String origin) {
		super();
		this.id = id;
		this.origin = origin;
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
	
}
