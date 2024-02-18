package com.chafy.learn.backend.jackson;

public class Car {
    private String brand = null;
    private String name = null;
    private int doors = 0;

    public Car() {
    }

    public Car(String brand, String name, int doors) {
        this.brand = brand;
        this.name = name;
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
