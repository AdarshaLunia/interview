package com.example.designs.abstractfactory;

public class AbstractPatternDriverMain {
    public static void main(String[] args){
        AbstractFactory abstractFactory;

        abstractFactory=FactoryProvider.geAbstractFactory("toy");
        Animal toy= (Animal) abstractFactory.create("duck");

        abstractFactory = FactoryProvider.geAbstractFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");

        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();

        System.out.println(result);
    }
}
