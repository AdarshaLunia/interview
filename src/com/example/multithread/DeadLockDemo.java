/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class DeadLockDemo {

    static Object lockOne = new Object();
    static Object lockTwo = new Object();

    private static class ThreadOne extends Thread {
        @Override
        public void run() {

            synchronized (lockOne) {  // Change order to release lock : lockTwo
                System.out.println("ThreadOne has lockOne");
                try {
                    sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }

                System.out.println("ThreadOne waiting for lockTwo");
                synchronized (lockTwo) { // Change order to release lock : lockOne
                    System.out.println("ThreadOne no lock");
                }
            }
        }
    }

    private static class ThreadTwo extends Thread {
        @Override
        public void run() {
            synchronized (lockTwo) {  // Change order to release lock : lockOne
                System.out.println("ThreadTwo has lockTwo");
                try {
                    sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }

                System.out.println("ThreadTwo waiting for lockOne");
                synchronized (lockOne) { // Change order to release lock : lockTwo
                    System.out.println("ThreadTwo no lock");
                }
            }
        }
    }

    public static void main(String args[]) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }
}
