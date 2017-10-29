package classicswitch;

import enumswitch.PlayerTypes;
import players.SnookerPlayer;
import players.FootballPlayer;
import players.Player;
import players.TennisPlayer;

public class PlayerCreator {

    public Player createPlayer(PlayerTypes playerType) {
        switch (playerType) {
            case TENNIS:
                return new TennisPlayer();
            case FOOTBALL:
                return new FootballPlayer();
            case SNOOKER:
                return new SnookerPlayer();

            default:
                throw new IllegalArgumentException("Invalid player type: " + playerType);
        }
    }

}
