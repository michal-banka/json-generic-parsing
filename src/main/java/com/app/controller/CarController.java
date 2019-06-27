package com.app.controller;

import com.app.model.Car;
import com.app.model.RaceCar;
import com.app.model.TruckCar;
import com.app.service.jsonParser.CarJsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

	private CarJsonParser carJsonParser;

	@Autowired
	public CarController(CarJsonParser carJsonParser) {
		this.carJsonParser = carJsonParser;
	}

	@GetMapping(value = "/fromJsonToObject")
	public ResponseEntity<String> fromJsonToObject() throws IOException {
		String carJson = "{\n" +
				"    \"@type\": \"car\",\n" +
				"    \"name\": \"Volvo\",\n" +
				"    \"weight\": 5570,\n" +
				"    \"hasAirCondition\": true,\n" +
				"    \"maxCapacity\": 2500,\n" +
				"    \"mileage\": 7425231\n" +
				"}";
		Car car = carJsonParser.jsonToCar(carJson);
		return new ResponseEntity<>(car.toString(), HttpStatus.OK);
	}

	@GetMapping(value = "/fromObjectToJson")
	public ResponseEntity<List<String>> fromObjectToJson() throws JsonProcessingException {
		Car truckCar = new TruckCar("Mercedes", 6000,
				Boolean.TRUE, 2412.64, 321321);
		Car raceCar = new RaceCar("Mercedes", 6000,
				Boolean.TRUE, 320, 5);

		String raceCarJson = carJsonParser.carToJson(raceCar);
		String truckCarJson = carJsonParser.carToJson(truckCar);
		List<String> cars = Arrays.asList(raceCarJson, truckCarJson);
		return new ResponseEntity<>(cars, HttpStatus.OK);
	}

}
