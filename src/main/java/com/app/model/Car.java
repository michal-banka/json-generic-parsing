package com.app.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
		@JsonSubTypes.Type(value = RaceCar.class, name = "raceCar"),
		@JsonSubTypes.Type(value = TruckCar.class, name = "truckCar"),
		@JsonSubTypes.Type(value = Car.class, name = "car")
})

public class Car {
	String name;
	Integer weight;
	Boolean hasAirCondition;

	public Car(String name, Integer weight, Boolean hasAirCondition) {
		this.name = name;
		this.weight = weight;
		this.hasAirCondition = hasAirCondition;
	}


	/**
	 * setters are requiered to correct object to json generic converting
	 * */

	public String getName() {
		return name;
	}

	public Integer getWeight() {
		return weight;
	}

	public Boolean getHasAirCondition() {
		return hasAirCondition;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				", hasAirCondition=" + hasAirCondition +
				'}';
	}
}
