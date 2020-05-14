/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

public class TernaryDemo {
    public static void main(String[] args) {
        Double input = -21.19;
        String output;

        output = (input > 0.0) ? "positive" : "not positive";
        System.out.println(input + " is " + output);
    }
}
