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
	public String airLine;
	public String flightNumber;
	
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
	public String getAirLine() {
		return airLine;
	}
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(airLine, date, destination, flightNumber, id, origin, time);
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
		return Objects.equals(airLine, other.airLine) && Objects.equals(date, other.date)
				&& Objects.equals(destination, other.destination) && Objects.equals(flightNumber, other.flightNumber)
				&& Objects.equals(id, other.id) && Objects.equals(origin, other.origin)
				&& Objects.equals(time, other.time);
	}
	
}
