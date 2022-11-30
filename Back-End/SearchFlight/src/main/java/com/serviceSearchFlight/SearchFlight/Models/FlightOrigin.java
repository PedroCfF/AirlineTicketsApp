package com.serviceSearchFlight.SearchFlight.Models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FlightOrigin {
	@Id
	public String id;
	public String origin;
	public List<String> destinations;
	
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
	public List<String> getDestinations() {
		return destinations;
	}
	public void setDestinations(List<String> destinations) {
		this.destinations = destinations;
	}
	@Override
	public int hashCode() {
		return Objects.hash(destinations, id, origin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightOrigin other = (FlightOrigin) obj;
		return Objects.equals(destinations, other.destinations) && Objects.equals(id, other.id)
				&& Objects.equals(origin, other.origin);
	}
	
	
	
	
	

	
	
}
