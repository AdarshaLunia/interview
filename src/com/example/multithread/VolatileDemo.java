/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

import java.util.Scanner;

public class VolatileDemo {

    private static boolean flag = false;
    /*
        On running this code you will see that the first thread (Thread-1) displays value of i till 2000 and
        change the status flag but the second thread won’t print the message “Start other processing ” and
        the program won’t terminate. Since flag variable is accessed frequently in the thread-2 in the while loop,
        the compiler may optimize by placing the value of flag in a register,
        then it will keep testing the loop condition (while (!flag)) without reading the value of flag from
        main memory.
        Now if you change the boolean variable flag and mark it as volatile that will guarantee that the change done
        to the shared variable by one thread is visible to other threads.

    */

    //private static volatile boolean flag = false;

    public static void main(String[] args) {
        // Thread-1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 2000; i++) {
                    System.out.println("value - " + i);
                }
                // changing status flag
                flag = true;
                System.out.println("status flag changed " + flag);
            }

        }).start();

        // Thread-2
        new Thread(new Runnable() {

            @Override
            public void run() {
                int i = 1;
                while (!flag) {
                    i++;
                }
                System.out.println("Start other processing " + i);
            }

        }).start();
    }
}
