package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;

// Json String에서 객체 읽기
public class _1ReadFromJsonString {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String carJackson = "{\"brand\":\"KIA\",\"name\":\"K3\"}";

        Car car = objectMapper.readValue(carJackson, Car.class);

        System.out.println("car brand : " + car.getBrand());
        System.out.println("car name : " + car.getName());
    }
}
