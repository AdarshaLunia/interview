/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;
/*
   Threads share memory,and they can concurrently modify data.Since the modification can be done at
   the same time
   without safeguards,this can lead to unintuitive results.
   When two or more threads are trying to access a variable and one of them wants to modify it,
   you get a problem
   known as a data race

*/
public class DataRaceDemo implements Runnable {
    public static void main(String args[]) {
        DataRaceDemo r1 = new DataRaceDemo();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        increment();
        increment();
        increment();

    }

    public void increment() { // synchronized the program does not have the data race problem.
        // increments the counter and prints the value
        // of the counter shared between threads
        Counter.count++;
        System.out.print(Counter.count + " ");
    }


}

class Counter {
    public static long count = 0;
}
