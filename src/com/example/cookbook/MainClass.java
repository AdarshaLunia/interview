/*
 * Copyright (c) 2019 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2019
 */

package com.example.cookbook;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String a[]) throws Exception {
        // Winners Of Tours Greater Than or Less Than 3500km long
        winnersOfToursLessThan3500km();
        winnersOfToursGreaterThan3500km();

        //Matching and Reducing
        winnersMatching();
        winnersReducing();

        //groupby, join and grouping
        winnersGroupby();


    }


    public static void winnersGroupby() {
        // groupingby - make a map whose keys are names
        Map<String, List<Winner>> winnersByNationality = fifaWinners.stream()
                .collect(Collectors.groupingBy(Winner::getNationality));

        System.out.println("winnersByNationality :" + winnersByNationality);

        String allTDFWinnersTeamsCSV = fifaWinners.stream().map(Winner::getTeam).collect(Collectors.joining(", "));
        System.out.println("allTDFWinnersTeams " + allTDFWinnersTeamsCSV);

        Map<String, Long> winsByNationalityCounting = fifaWinners.stream().collect(Collectors.groupingBy(Winner::getNationality, Collectors.counting()));
        System.out.println("winsByNationalityCounting - " + winsByNationalityCounting);
    }


    public static void winnersOfToursLessThan3500km() {
        List<String> winnersOfToursLessThan3500km = fifaWinners.stream()
                .filter(d -> d.getLengthKm() < 3500)
                .map(Winner::getName)
                .collect(Collectors.toList());
        System.out.println("Winners of Tours Less than 3500km - " + winnersOfToursLessThan3500km);
    }

    public static void winnersOfToursGreaterThan3500km() throws Exception {
        List<String> winnersOfToursGreaterThan3500km = fifaWinners.stream()
                .filter(d -> d.getLengthKm() >= 3500)
                .map(Winner::getName)
                .collect(Collectors.toList());
        System.out.println("Winners of Tours Greater than 3500km - " + winnersOfToursGreaterThan3500km);


        long numberOfDistinceWinners = fifaWinners
                .stream()
                .map(Winner::getName)
                .distinct()
                .count();
        // numberOfDistinceWinners - 8
        System.out.println("numberOfDistinceWinners - " + numberOfDistinceWinners);

        // filter by distinct
        List<String> distinctTDFWinners = fifaWinners
                .stream()
                .map(Winner::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctTDFWinners - " + distinctTDFWinners);
    }

    public static void winnersMatching() {
        // matching - allMatch, noneMatch

        Optional<Winner> winner2012 = fifaWinners.stream()
                .filter(winner -> winner.getName().contains("Lunia"))
                .findAny();
        System.out.println(winner2012.get());


        Optional<Integer> winnerYear2014 = fifaWinners.stream()
                .map(Winner::getYear)
                .filter(x -> x == 2014)
                .findFirst();

        System.out.println(winnerYear2014.get());

    }

    public static void winnersReducing() {
        // reducing - 0 --> initial value
        int totalDistance = fifaWinners.stream()
                .map(Winner::getLengthKm)
                .reduce(0, Integer::sum);
        System.out.println("totalDistance - " + totalDistance);

        Optional<Integer> shortestYear = fifaWinners.stream()
                .map(Winner::getLengthKm)
                .reduce(Integer::min);

        // shortestYear - 3360
        System.out.println("shortestYear - " + shortestYear.get());


        Optional<Integer> longestYear = fifaWinners.stream()
                .map(Winner::getLengthKm)
                .reduce(Integer::max);
        // longestYear - 3661
        System.out.println("longestYear - " + longestYear.get());


        Optional<Winner> fastestWinner = fifaWinners
                .stream()
                .min(Comparator.comparingDouble(Winner::getLengthKm));
        System.out.println("fastestTDF - " + fastestWinner.get());


        // shorthand
        OptionalDouble fastestTDF = fifaWinners
                .stream()
                .mapToDouble(Winner::getLengthKm).min();

        Optional<Winner> fastestWinnerOne = fifaWinners.stream().min(Comparator.comparingDouble(Winner::getAveSpeed));
        System.out.println("fastestTDF One - " + fastestWinnerOne.get());

        OptionalDouble fastestTDFOne = fifaWinners.stream().mapToDouble(Winner::getAveSpeed).min();
        System.out.println("fastestTDF One - " + fastestTDFOne.getAsDouble());

    }

    public static final List<Winner> fifaWinners = Arrays.asList(

            new Winner(2006, "Spain", "Newton", "TEAM - A", 3657, Duration.parse("PT89H40M27S"), 8),
            new Winner(2007, "Spain", "Angry Prash", "TEAM - B", 3570, Duration.parse("PT91H00M26S"), 4),
            new Winner(2008, "Spain", "Adarsha Lunia", "TEAM - C", 3559, Duration.parse("PT87H52M52S"), 5),
            new Winner(2009, "Spain", "Adi", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
            new Winner(2010, "Luxembourg", "Andy", "TEAM - C", 3642, Duration.parse("PT91H59M27S"), 12),
            new Winner(2011, "Australia", "Ryna Gosling", "TEAM - A", 3430, Duration.parse("PT86H12M22S"), 2),
            new Winner(2012, "Berline", "Bradley Cooper", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
            new Winner(2013, "India", "Chris Brown", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
            new Winner(2014, "Italy", "Bebe Rexa", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
            new Winner(2015, "India", "Christina", "Team Sky", 2000, Duration.parse("PT84H46M14S"), 16),
            new Winner(2016, "India", "DJ Snake", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14)
    );
}


