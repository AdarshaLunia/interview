/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.designs.prototype;

public class Demo {

    public static void main(String[] args) {
        Registry registry=new Registry();
        Movie movie= (Movie) registry.createItem("Movie");
        movie.setTitle("Lunchbox");
        System.out.println(movie);
        System.out.println(movie.getTitle()+"\n"+movie.getPrice());

        Movie anotherMovie= (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Hindi Medium");
        System.out.println(anotherMovie);

    }
}
