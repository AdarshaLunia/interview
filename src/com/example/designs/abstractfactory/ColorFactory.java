package com.example.designs.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String t) {
        if ("Brown".equalsIgnoreCase(t)) {
            return new Brown();
        } else if ("White".equalsIgnoreCase(t)) {
            return new White();
        }
        return null;
    }
}
