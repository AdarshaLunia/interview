/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class SleepDemo extends Thread {

    String[] timeStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine"};


    @Override
    public void run() {
        for (int i = 9; i >= 0; i--) {
            try {
                System.out.println(timeStr[i]);
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.getLocalizedMessage();
            }
        }
    }


/*    The Thread class has the instance method join() for waiting for a thread to “die.”
      In the TimeBomb program, you want
      the main() thread to wait for the timer thread to complete its execution.
      You can use the instance method join()
      in the Thread class to achieve that. Here is the improved version of the TimeBomb program,
      with changes only in the
      main() method:

 */

    public static void main(String[] s) {
        SleepDemo timer = new SleepDemo();
        System.out.println("Starting 10 second count down. . . ");
        timer.start();
        // System.out.println("Boom!!!");

        try {
            timer.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Boom!!!");
    }
}
