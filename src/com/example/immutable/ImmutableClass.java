/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.immutable;

public class ImmutableClass {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyImmutableClass immutableClass = new MyImmutableClass(1, new Employee(100, "adarsha", 21));

        // Here we have created Immutable object for "MyImmutableClass" class
        // Lets see how to change values of mutable object inside Immutable object

        immutableClass.getEmployee().setName("James");  // -- Complied time Exception as Clone not support

        System.out.println("Count    : " + immutableClass.getCount());
        System.out.println("Emp ID   : " + immutableClass.getEmployee().getId());
        System.out.println("Emp Name : " + immutableClass.getEmployee().getName());
        System.out.println("Emp Age  : " + immutableClass.getEmployee().getAge());



 /*     Next we will see how to avoid changing mutable object in Immutable class.
        For this we need to change 2 things in our above classes
        1. In Employee class implements Cloneable and override clone method.
        2 .Next in MyImmutableClass class we need to return clone object instead of original Employee Object.
*/


    }
}
