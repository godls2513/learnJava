package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;
import java.net.*;

// URL에서 json 데이터 읽어오기
public class _4ReadFromJsonURL {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String path = "src/main/java/com/chafy/learn/backend/jackson/data/";
        URL url = new URL("file:" + path + "car.json");

        Car car = objectMapper.readValue(url, Car.class);
        System.out.println("car brand : " + car.getBrand());
        System.out.println("car name : " + car.getName());
    }
}
