/*
 * Copyright (c) 2019 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2019
 */

package com.example.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

public class MainOne {


/*    Optional is used :

    Empty Optionals :

     1 : Empty optional using Optional.empty()
     2 : NoSuchElementException
     3 : ifPresent, orElse, ifPresent, orElseThrow method


    Null Objects In Optionals :

     1 : of - Populate with null object - Throws Exception
     2 : ofNullable - allows null

    Values In Optionals :

     1 : Filtering and mapping in combination with Lambdas
     2 : flatMap to prevent Optional<Optional>

    */


    // Populate Bike with Optional<Wheels>
    private static Bike royalNField = new Bike("RoyalNF", Optional.of(new Wheel("CTR", 32)));

    // Dont do this - use a Optional.ofNullable
    private static Bike nullBike = new Bike("nowheels", (String) null);

    // Use a Optional.ofNullable
    private static Bike ofNullableBike = new Bike("noWheels", Optional.ofNullable(null));


    public static void main(String a[]) {

        Bike bikeOne = new Bike("Duke", (String) null);
        System.err.println(bikeOne.getEmail().map(String::toUpperCase).orElse("email not provided"));

        Optional<Bike> optionalEmptyBike = Optional.empty();

        // call get() on empty object throws NoSuchElementException

        try {
            Bike emptyBike = optionalEmptyBike.get();


        } catch (NoSuchElementException e) {
            System.out.println("get() on empty Optional throws java.util.NoSuchElementException " + e.getMessage());
        }

        // isPresent - check if object is empty - but not much advantage over != null checks

        if (!optionalEmptyBike.isPresent()) {
            System.out.println("isPresent() - ok - but not much improvement on != null");
        }

        //Better Alternatives -orElse - returns a default object if none set

        Bike orElseBike = optionalEmptyBike.orElse(royalNField);
        System.err.println("orElse - Optional is empty so return Bike : " + orElseBike.getBrand());

        // ifPresent(Consumer<? extends Bike>) - this prints nothing as Optional is empty

        optionalEmptyBike.ifPresent(bike -> System.err.println("ifPresent(Consumer) returns " + bike.getBrand()));

        // orElseThrow - Throw Exception
        try {
            Bike orElseThrowBike = optionalEmptyBike.orElseThrow(NoBikeException::new);
        } catch (NoBikeException nbe) {
            System.out.println("orElseThrow NoBikeException");
        }

        /*==============================================================*/

        // Populated Optional - now begin populating with Object
        Optional<Bike> optionalColnagoBike = Optional.of(royalNField);
        if (optionalColnagoBike.isPresent()) {
            System.out.println("isPresent() - ok - but not much improvement on != null");
        }

        // Filtering and mapping in combination with Lambdas
        Bike orElseThrowBike = optionalColnagoBike.filter(b -> "RoyalNF".equals(b.getBrand())).get();

        Optional<String> brand = optionalColnagoBike.map(b -> b.getBrand());
        brand.ifPresent(b -> System.out.println("brand : " + b));

        // flatMap to prevent Optional<Optional<Wheels>>
        Optional<Wheel> wheels = optionalColnagoBike.flatMap(b -> b.getWheels());
        wheels.ifPresent(w -> System.out.println("flatMap - Wheel Brand " + w.getBrand()));

    }
}
