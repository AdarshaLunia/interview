package com.example.designs.abstractfactory;

public class Dog implements Animal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
