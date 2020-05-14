/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.demos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*The synchronizedMap() method of java.util.Collections class is used to return a synchronized (thread-safe) map
        backed by the specified map. In order to guarantee serial access,
        it is critical that all access to the backing map is accomplished through the returned map.*/

public class synchronizedMapDemo {
    public static void main(String[] argv)throws Exception {
        try {
            // creating object of Map<String, String>
            Map<String, String> map = new HashMap<>();

            // populate the map
            map.put("Value1", "20");
            map.put("Value2", "30");
            map.put("Value3", "40");
            // printing the Collection
            System.out.println("Map : " + map);

            // create a synchronized map
            Map<String, String>
                    synmap = Collections.synchronizedMap(map);

            // printing the Collection
            System.out.println("Synchronized map is : "
                    + synmap);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
