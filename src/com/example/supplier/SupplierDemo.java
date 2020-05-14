/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.supplier;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

/*    Operation that returns a
    value to the caller
            (the returned value could
                    be same or different values)*/

    public static void main(String a[]) {
        Supplier<Car> carOne = () -> new Car("Ford", 1500, 4, 43000);
        Supplier<Car> cartwo = () -> new Car("BMW", 1500, 4, 83000);

        System.out.println(carOne.get());
        System.out.println(cartwo.get());
    }


    static class Car {
        String brand;
        int engineCC;
        int wheelCount;
        int price;

        public Car(String brand, int engineCC, int wheelCount, int price) {
            this.brand = brand;
            this.engineCC = engineCC;
            this.wheelCount = wheelCount;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", engineCC=" + engineCC +
                    ", wheelCount=" + wheelCount +
                    ", price=" + price +
                    '}';
        }
    }
}
