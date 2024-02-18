package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.*;

public class _10CustomDeserializer {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"brand\":\"KIA\",\"doors\":null}";

        SimpleModule simpleModule = new SimpleModule("CarDeserializer", new Version(3, 1, 8, null, null, null));
        simpleModule.addDeserializer(Car.class, new CarDeserializer(Car.class));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(simpleModule);

        Car car = objectMapper.readValue(json, Car.class);
    }
}
