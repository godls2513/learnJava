package com.chafy.learn.backend.jackson;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.*;

import java.io.*;

public class CarDeserializer extends StdDeserializer<Car> {
    public CarDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Car deserialize(JsonParser parser, DeserializationContext deserializer) throws IOException, JacksonException {
        Car car = new Car();
        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();
            if (jsonToken.FIELD_NAME.equals(jsonToken)) {
                String fieldName = parser.getCurrentName();
                System.out.println(fieldName);

                jsonToken = parser.nextToken();
                if ("brand".equals(fieldName)) {
                    car.setBrand(parser.getValueAsString());
                } else if ("doors".equals(fieldName)) {
                    car.setDoors(parser.getValueAsInt());
                }
            }
        }
        return car;
    }
}
