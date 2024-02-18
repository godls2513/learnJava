package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;

// Json Byte Array에서 데이터 읽어오기
public class _5ReadFromJsonByteArray {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String carJson = "{\"brand\":\"Hyundai\",\"name\":\"Avante\"}";

        byte[] bytes = carJson.getBytes("UTF-8");

        Car car = objectMapper.readValue(bytes, Car.class);
        System.out.println("car brand : " + car.getBrand());
        System.out.println("car name : " + car.getName());
    }
}
