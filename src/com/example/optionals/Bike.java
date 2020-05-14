package com.example.optionals;

import java.util.Optional;

public class Bike {

    private String brand;
    private Optional<Wheel> wheels;
    private String email;

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bike(String brand, Optional<Wheel> wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public Bike(String brand, String email) {
        this.brand = brand;
        this.email = email;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Optional<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Optional<Wheel> wheels) {
        this.wheels = wheels;
    }
}
