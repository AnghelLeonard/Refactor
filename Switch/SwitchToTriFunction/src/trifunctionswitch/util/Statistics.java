package trifunctionswitch.util;

import java.time.Period;
import players.TennisPlayer;

public final class Statistics {
    
    private Statistics() {
        throw new AssertionError("Not supported");
    }
    
    public static String computeServeTrend(TennisPlayer tennisPlayer, Period period, String owner) {       
        return "Serve Trend";
    }
    
    public static String computeForehandTrend(TennisPlayer tennisPlayer, Period period, String owner) {       
        return "Forehand Trend";
    }
    
    public static String computeBackhandTrend(TennisPlayer tennisPlayer, Period period, String owner) {       
        return "Backhand Trend";
    }
}
