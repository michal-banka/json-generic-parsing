package com.app.service.jsonParser;

import com.app.model.Car;
import com.app.service.Printer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CarJsonParserImpl implements CarJsonParser {

	private ObjectMapper objectMapper;

	@Autowired
	public CarJsonParserImpl(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Override
	public Car jsonToCar(String carJson) {
		Car receivedCar = null;
		try {
			receivedCar = objectMapper.readValue(carJson, Car.class);
			System.out.println(Printer.format("PARSED TO TYPE", receivedCar.getClass().getTypeName(), ""));
			System.out.println(Printer.format("PARSED TO VALUE", receivedCar.toString(), ""));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return receivedCar;
	}

	@Override
	public String carToJson(Car car) {
		String carJson = null;
		try {
			carJson = objectMapper.writeValueAsString(car);
			System.out.println(Printer.format("PARSED FROM OBJECT", car.toString(), ""));
			System.out.println(Printer.format("PARSED TO JSON", carJson, ""));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return carJson;
	}
}
