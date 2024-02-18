package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;

// Json Reader로 Json 데이터 읽어오기
public class _2ReadFromJsonReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String carJackson = "{\"brand\":\"Audi\",\"name\":\"A6\"}";

        Reader reader = new StringReader(carJackson);
        Car car = objectMapper.readValue(reader, Car.class);

        System.out.println("reader : " + reader);
        System.out.println("CarBrand : " + car.getBrand());
        System.out.println("CarName : " + car.getName());
    }
}
