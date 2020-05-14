/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

public class ReverseString {

    public static void main(String arr[]) {
        String original = "Adarsha", reverse = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
            System.out.println(reverse);
        }
        System.err.println("reversed :" + reverse);
    }
}
