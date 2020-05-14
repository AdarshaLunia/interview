/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread.threadlocal;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        String[] names = {"one", "two", "three"};

        Arrays.stream(names)
                .forEach(Main::createThread);
    }

    private static void createThread(final String name) {
        new Thread(() -> {
            MyThreadLocal.createMyObject(name);

            for (int i = 0; i < 5; i++) {
                MyThreadLocal.getMyObject().showName();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
