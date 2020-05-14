/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.functionalCourse;

public class SomeFucntionDemo implements SomeFucntional {

    @Override
    public String someMethod() {
        return "welcome functional";
    }

    @Override
    public int someAnotherDefaultMethod() {
        return 56;
    }



    public static void main(String[] args) {
        SomeFucntional demoOne=new SomeFucntionDemo();
        System.err.println(demoOne.someAnotherDefaultMethod());
        System.err.println(demoOne.someMethod());
        System.err.println(demoOne.someDefaultMethod());
        System.err.println(SomeFucntional.someStatic());
    }
}
