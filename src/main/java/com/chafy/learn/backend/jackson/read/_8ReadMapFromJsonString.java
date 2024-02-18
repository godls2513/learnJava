package com.chafy.learn.backend.jackson.read;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;
import java.util.*;

// Json Array에서 데이터 읽어오기
public class _8ReadMapFromJsonString {
    public static void main(String[] args) throws IOException {
        String jsonObject = "{\"brand\":\"Hyundai\",\"doors\":5}";

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(jsonObject, new TypeReference<Map<String, Object>>() {
        });

        System.out.println(map);

    }
}
