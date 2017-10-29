package enumswitch;

import players.FootballPlayer;
import players.Player;
import players.SnookerPlayer;
import players.TennisPlayer;

public enum PlayerTypes {

    TENNIS {
        @Override
        public Player createPlayer() {
            return new TennisPlayer();
        }
    },
    FOOTBALL {
        @Override
        public Player createPlayer() {
            return new FootballPlayer();
        }
    },
    SNOOKER {
        @Override
        public Player createPlayer() {
            return new SnookerPlayer();
        }
    };
       
    public abstract Player createPlayer();
}
