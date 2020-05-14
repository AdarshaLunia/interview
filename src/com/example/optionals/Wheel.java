package com.example.optionals;

public class Wheel {
    private String brand;
    private int spokes;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpokes() {
        return spokes;
    }

    public void setSpokes(int spokes) {
        this.spokes = spokes;
    }

    public Wheel(String brand, int spokes) {
        this.brand = brand;
        this.spokes = spokes;
    }
}
