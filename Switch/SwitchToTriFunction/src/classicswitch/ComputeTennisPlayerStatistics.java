package classicswitch;

import trifunctionswitch.util.Statistics;
import java.time.Period;
import players.TennisPlayer;

public final class ComputeTennisPlayerStatistics {
    
    private ComputeTennisPlayerStatistics() {
        throw new AssertionError();
    }

    public static String computeTrend(TennisPlayer tennisPlayer, Period period, String owner, String trend) {
        switch (trend) {
            case "SERVE":
                return Statistics.computeServeTrend(tennisPlayer, period, owner);
            case "FOREHAND":
                return Statistics.computeForehandTrend(tennisPlayer, period, owner);
            case "BACKHAND":
                return Statistics.computeBackhandTrend(tennisPlayer, period, owner);

            default:
                throw new IllegalArgumentException("Invalid trend attribute: " + trend);
        }
    }

}
