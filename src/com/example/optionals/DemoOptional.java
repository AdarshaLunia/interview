/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.optionals;

import java.util.Optional;

public class DemoOptional {

    public static void main(String a[]) {
        // Optional<String> empty = Optional.empty();

        Optional<String> empty = Optional.of("sample");
        System.out.println(empty.isPresent());

        Optional<String> hello = Optional.ofNullable(null);
        /*of(null) ;
          When you will not sure wehater value will be null then you use "ofNullable"*/

        String orElse = hello.orElse("welcome");
        System.out.println(orElse);



        Optional<String> world = Optional.ofNullable("adarsha");
        String nameElse = world.map(String::toUpperCase).orElse("welcome");
           //map() used to transform actual value
        System.out.println(nameElse);




    }
}
