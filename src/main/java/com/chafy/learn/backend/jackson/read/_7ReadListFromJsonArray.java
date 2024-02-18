package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;
import java.util.*;

// Json Array에서 데이터 읽어오기
public class _7ReadListFromJsonArray {
    public static void main(String[] args) throws IOException {
        String jsonArray = "[{\"brand\":\"Hyundai\",\"name\":\"Avante\"},{\"brand\":\"KIA\",\"name\":\"K3\"}]";

        ObjectMapper objectMapper = new ObjectMapper();
        // TypeReference 매개변수는 Jakson에서 Car객체의 목록을 읽어오라고 지시함
        List<Car> list = objectMapper.readValue(jsonArray, new TypeReference<List<Car>>() {
        });

        for (Car car : list) {
            System.out.println(car.getName());
            System.out.println(car.getBrand());
        }
    }
}
