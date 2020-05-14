/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class ThreadStatesEnumeration {

    public static void main(String[] s) {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
}
