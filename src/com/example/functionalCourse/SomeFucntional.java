/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.functionalCourse;

@FunctionalInterface
public interface SomeFucntional {

    String someMethod();

    default String someDefaultMethod() {
        return "I am default";
    }

    default int someAnotherDefaultMethod() {
        return 2;
    }

    static String someStatic() {
        return "welcome";
    }


    static String someAnotherStatic() {
        return "another static";
    }
}
