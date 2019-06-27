package com.app.service.jsonParser;

import com.app.model.Car;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface CarJsonParser {
	Car jsonToCar(String carJson) throws IOException;
	String carToJson(Car car) throws JsonProcessingException;
}
