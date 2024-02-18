package com.chafy.learn.backend.jackson.read;

import com.chafy.learn.backend.jackson.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class _9ReadNull {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"brand\":\"KIA\",\"doors\":null}";

        ObjectMapper objectMapper = new ObjectMapper();
        /*
        자바의 기본유형(int, long, double, float 등등)은 null값을 가질 수가 없다.
        Jackson Mapper는 이를 무시하기 때문에 예외처리가 필요하다.
        */
        objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true);
        // FAIL_ON_NULL_FOR_PRIMITIVES의 구성값을 true로 하면 EXCEPTION을 출력하도록 설정할 수 있다.
        
        Car car = objectMapper.readValue(json, Car.class);
        System.out.println(car.getDoors());

    }
}
