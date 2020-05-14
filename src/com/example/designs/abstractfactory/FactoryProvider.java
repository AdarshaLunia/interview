package com.example.designs.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory geAbstractFactory(String choice) {
        if ("Toy".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
