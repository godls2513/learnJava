package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;

// File에서 json 데이터 읽어오기
public class _3ReadFromJsonFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String path = "src/main/java/com/chafy/learn/backend/jackson/data/";
        File file = new File(path + "car.json");
        System.out.println(file.canRead());

        Car car = objectMapper.readValue(file, Car.class);
        System.out.println("car brand : " + car.getBrand());
        System.out.println("car name : " + car.getName());
    }
}
