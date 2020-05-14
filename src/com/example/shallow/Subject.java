/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.shallow;

public class Subject {
    private String name;

    public Subject(String name) {
        System.out.println("Inside Constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject() {
        System.out.println("Inside Default Constructor");
    }
}
