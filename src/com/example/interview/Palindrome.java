/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeString("howtodoinjava"));
        System.out.println(isPalindromeString("abcba"));

        System.out.println(checkIntegerPalindrome(100));        //false
        System.out.println(checkIntegerPalindrome(101));        //true

    }

    public static boolean isPalindromeString(String originalString) {
        String reverse = "";
        int length = originalString.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + originalString.charAt(i);

        return originalString.equals(reverse);
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        } while (number > 0);
        return reverse;
    }

    public static boolean checkIntegerPalindrome(int number) {
        boolean isPalindrome = false;
        if (number == reverseNumber(number)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}

