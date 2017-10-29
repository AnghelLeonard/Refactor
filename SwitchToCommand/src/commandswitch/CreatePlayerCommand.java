package commandswitch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import players.FootballPlayer;
import players.Player;
import players.SnookerPlayer;
import players.TennisPlayer;

public class CreatePlayerCommand {

    private static final Map<String, Command> PLAYERS;

    static {
        final Map<String, Command> players = new HashMap<>();
        players.put("TENNIS", new Command() {
            @Override
            public Player create() {
                return new TennisPlayer();
            }
        });

        players.put("FOOTBALL", new Command() {
            @Override
            public Player create() {
                return new FootballPlayer();
            }
        });

        players.put("SNOOKER", new Command() {
            @Override
            public Player create() {
                return new SnookerPlayer();
            }
        });

        PLAYERS = Collections.unmodifiableMap(players);
    }

    public Player createPlayer(String playerType) {
        Command command = PLAYERS.get(playerType);

        if (command == null) {
            throw new IllegalArgumentException("Invalid player type: " + playerType);
        }

        return command.create();
    }

}
