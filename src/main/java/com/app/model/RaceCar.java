package com.app.model;

public class RaceCar extends Car {
	private Integer maxSpeed;
	private Integer seats;

	public RaceCar(String name, Integer weight, Boolean hasAirCondition, Integer maxSpeed, Integer seats) {
		super(name, weight, hasAirCondition);
		this.maxSpeed = maxSpeed;
		this.seats = seats;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				", hasAirCondition=" + hasAirCondition +
				"}, RaceCar{" +
				"maxSpeed=" + maxSpeed +
				", seats=" + seats +
				'}';
	}
}
