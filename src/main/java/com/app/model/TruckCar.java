package com.app.model;

public class TruckCar extends Car {
	private Double maxCapacity;
	private Integer mileage;

	public TruckCar(String name, Integer weight, Boolean hasAirCondition, Double maxCapacity, Integer mileage) {
		super(name, weight, hasAirCondition);
		this.maxCapacity = maxCapacity;
		this.mileage = mileage;
	}

	public Double getMaxCapacity() {
		return maxCapacity;
	}

	public Integer getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				", hasAirCondition=" + hasAirCondition +
				"}, TruckCar{" +
				"maxCapacity=" + maxCapacity +
				", mileage=" + mileage +
				'}';
	}
}
