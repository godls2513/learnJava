package com.chafy.learn.backend.DAO;

public class City {
    // 외부에서 필드에 접근할 수 없게 private으로 선언
    private String name;
    private String country;

    // 기본 생성자 추가
    public City() {
    }

    // 매개변수가 있는 생성자도 추가
    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // getter와 setter를 만들어준다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
