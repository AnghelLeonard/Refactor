package main;

import trifunctionswitch.impl.FunctionalStatistics;
import classicswitch.ComputeTennisPlayerStatistics;
import java.time.Period;
import players.TennisPlayer;

public class Main {

    public static void main(String[] args) {

        String serveTrend = ComputeTennisPlayerStatistics.
                computeTrend(new TennisPlayer(), Period.ZERO, "TENNIS MAGAZINE", "SERVE");
        System.out.println("Serve: " + serveTrend);
       
        String forehandTrend = FunctionalStatistics.
                computeTrend(new TennisPlayer(), Period.ZERO, "SPORT TV", "FOREHAND");
        System.out.println("Forehand: " + forehandTrend);
    }

}
