package com.chafy.learn.backend.jackson.write;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class _1WriteFromObject {
    public static void main(String[] args) throws JsonProcessingException {
        /*
            writeValue()
            writeValueAsString()
            writeValueAsBytes()
         */
        ObjectMapper objectMapper = new ObjectMapper();

        Car car = new Car();
        car.setBrand("BMW");
        car.setName("520i");
        car.setDoors(5);

        String json = objectMapper.writeValueAsString(car);
        System.out.println(json);
    }
}
