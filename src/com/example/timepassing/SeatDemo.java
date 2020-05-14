/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.timepassing;

import java.util.*;
import java.util.stream.Stream;

public class SeatDemo {
    public static void main(String[] args) {
        int numRows = 3;
        int numCols = 5;
        System.out.println(seats(numRows, numCols));
    }

    private static List<String> seats(int numRows, int numCols) {
        List<String> s = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            char rowIdentity = 'A';
            for (int j = 1; j <= numCols; ++j) {
                String seat = "" + i + rowIdentity + " ";
                System.err.println(seat);
                if(!seat.equalsIgnoreCase("1A ")){
                    s.add(seat);
                }
                ++rowIdentity;
            }
        }
        return s;
    }

}


