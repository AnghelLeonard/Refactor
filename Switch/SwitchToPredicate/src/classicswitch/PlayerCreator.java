package classicswitch;

import players.SnookerPlayer;
import players.FootballPlayer;
import players.Player;
import players.TennisPlayer;

public class PlayerCreator {

    public Player createPlayer(String playerType, int rank) {
        switch (playerType) {
            case "TENNIS":
                if (rank == 1) {
                    return new TennisPlayer("Rafael Nadal");
                }
                if (rank > 1 && rank < 5) {
                    return new TennisPlayer("Roger Federer");
                }
                if (rank >= 5 && rank <= 10) {
                    return new TennisPlayer("Andy Murray");
                }                
                
            case "FOOTBALL":
                if (rank == 1 || rank == 2) {
                    return new FootballPlayer("Lionel Messi");
                }
                if (rank > 2 && rank <= 10) {
                    return new FootballPlayer("Cristiano Ronaldo");
                }
                
            case "SNOOKER":
                if (rank == 1) {
                    return new SnookerPlayer("Ronnie O'Sullivan");
                }
                if (rank == 2) {
                    return new SnookerPlayer("Mark Selby");
                }
                if (rank > 3 && rank < 7) {
                        return new SnookerPlayer("John Higgins");
                }
                if (rank >= 7 && rank <= 10) {
                    return new SnookerPlayer("Neil Robertson");
                }                
               
            default:
                throw new IllegalArgumentException("Invalid player. Type: " + playerType + " Rank: " + rank);
        }
    }

}
