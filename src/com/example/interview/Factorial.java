/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(3));
    }
    public static long factorialRecursive( long n )
    {
        return n == 1 ? 1 : n * factorialRecursive( n-1 );
    }
}
