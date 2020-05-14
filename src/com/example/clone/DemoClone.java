/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.clone;

public class DemoClone {

/*
    What is Java Clone?
    Clone is nothing but creating a copy of Object with the same state of cloning Object.
    For example if we clone a Object called "obj1" to "obj2" then new Object will be created with same state and value.
    There are Shallow copy and Deep copy which we will discuss in our next tutorial.

    How its Working?
    Suppose if we need to use clone for our class then we need to implement Cloneable interface in our class
    with clone() method, which will create a copy of super class and return's the Object.
    Below example will gives you how to use use clone() on user defined class and Collection Objects.

*/
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee("adarsha", "mindtree");
        System.out.println("Employee One   : " + emp1);

        // Cloning the Object
        Employee emp2 = (Employee) emp1.clone();
        System.out.println("Employee Two    : " + emp2);

    }
}
