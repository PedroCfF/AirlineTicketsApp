package com.serviceSearchFlight.SearchFlight.Models;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Flight {
	@Id
	public String id;
	public String origin;
	public String destination;
	public String date;
	public String time;
	public String airline;
	public String flightnumber;
	
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
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(airline, date, destination, flightnumber, id, origin, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(airline, other.airline) && Objects.equals(date, other.date)
				&& Objects.equals(destination, other.destination) && Objects.equals(flightnumber, other.flightnumber)
				&& Objects.equals(id, other.id) && Objects.equals(origin, other.origin)
				&& Objects.equals(time, other.time);
	}
	
}
