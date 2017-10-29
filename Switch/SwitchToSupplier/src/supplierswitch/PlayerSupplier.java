package supplierswitch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import players.FootballPlayer;
import players.Player;
import players.SnookerPlayer;
import players.TennisPlayer;

public class PlayerSupplier {

    private static final Map<String, Supplier<Player>> PLAYER_SUPPLIER;

    static {
        final Map<String, Supplier<Player>> players = new HashMap<>();
        players.put("TENNIS", TennisPlayer::new);
        players.put("FOOTBALL", FootballPlayer::new);
        players.put("SNOOKER", SnookerPlayer::new);

        PLAYER_SUPPLIER = Collections.unmodifiableMap(players);
    }

    public Player supplyPlayer(String playerType) {
        Supplier<Player> player = PLAYER_SUPPLIER.get(playerType);

        if (player == null) {
            throw new IllegalArgumentException("Invalid player type: " + playerType);
        }

        return player.get();
    }

}
