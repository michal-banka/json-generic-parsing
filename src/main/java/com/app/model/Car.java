package com.app.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
		@JsonSubTypes.Type(value = RaceCar.class, name = "raceCar"),
		@JsonSubTypes.Type(value = TruckCar.class, name = "truckCar")
})

public abstract class Car {
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
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public void setHasAirCondition(Boolean hasAirCondition) {
		this.hasAirCondition = hasAirCondition;
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
