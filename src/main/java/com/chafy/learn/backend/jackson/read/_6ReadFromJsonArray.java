package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;

// Json Array에서 데이터 읽어오기
public class _6ReadFromJsonArray {
    public static void main(String[] args) throws IOException {
        String jsonArray = "[{\"brand\":\"Hyundai\",\"name\":\"Avante\"},{\"brand\":\"KIA\",\"name\":\"K3\"}]";

        ObjectMapper objectMapper = new ObjectMapper();
        Car[] car = objectMapper.readValue(jsonArray, Car[].class);
        System.out.println("first car name : " + car[0].getName());
        System.out.println("first car brand : " + car[0].getBrand());
    }
}
