/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.shallow;

public class ShallowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu = new Student("Raj", "Hindi");

        System.out.println("\nOriginal Student Name: " + stu.getName());
        System.out.println("Original Student Sub : " + stu.getSubject().getName());

        // Cloning the original Object and Explicitly type casting
        Student stu1 = (Student) stu.clone();

        System.out.println("\nClone Student Name: " + stu1.getName());
        System.out.println("Clone Student Sub : " + stu1.getSubject().getName());

        stu1.setName("David");


        /*
         * In shallow Object contains other Objects which will have only
         * the address reference. Hence by below line Language will change
         * in both the Objects (Original as well as in Cloned)
         */
        stu1.getSubject().setName("Tamil");

        System.out.println("\nOriginal Student Name: " + stu.getName());
        System.out.println("Original Student Sub : " + stu.getSubject().getName());

        System.out.println("\nClone Student Name: " + stu1.getName());
        System.out.println("Clone Student Sub : " + stu1.getSubject().getName());
    }
}