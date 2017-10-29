package predicateswitch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.function.Supplier;
import players.Player;
import players.TennisPlayer;

public final class PlayerSupplier {

    private PlayerSupplier() {
        throw new AssertionError();
    }

    private static final Map<String, Map<Predicate<Integer>, Supplier<Player>>> PLAYER_CREATOR;

    static {
        final Map<String, Map<Predicate<Integer>, Supplier<Player>>> playerCreator = new HashMap<>();

        final Map<Predicate<Integer>, Supplier<Player>> tennisPlayers = new HashMap<>();
        tennisPlayers.put(rank -> rank == 1, () -> new TennisPlayer("Rafael Nadal"));
        tennisPlayers.put(rank -> rank > 1 && rank < 5, () -> new TennisPlayer("Roger Federer"));
        tennisPlayers.put(rank -> rank >= 5 && rank <= 10, () -> new TennisPlayer("Andy Murray"));

        final Map<Predicate<Integer>, Supplier<Player>> footballPlayers = new HashMap<>();
        footballPlayers.put(rank -> rank == 1 || rank == 2, () -> new TennisPlayer("Lionel Messsi"));
        footballPlayers.put(rank -> rank > 2 && rank <= 10, () -> new TennisPlayer("Cristiano Ronaldo"));

        final Map<Predicate<Integer>, Supplier<Player>> snookerPlayers = new HashMap<>();
        snookerPlayers.put(rank -> rank == 1, () -> new TennisPlayer("Ronnie O'Sullivan"));
        snookerPlayers.put(rank -> rank == 2, () -> new TennisPlayer("Mark Selby"));
        snookerPlayers.put(rank -> rank > 3 && rank < 7, () -> new TennisPlayer("John Higgins"));
        snookerPlayers.put(rank -> rank >= 7 && rank <= 10, () -> new TennisPlayer("Neil Robertson"));

        playerCreator.put("TENNIS", tennisPlayers);
        playerCreator.put("FOOTBALL", footballPlayers);
        playerCreator.put("SNOOKER", snookerPlayers);
        
        PLAYER_CREATOR = Collections.unmodifiableMap(playerCreator);
    }

    public static final Player supplyPlayer(String playerType, int rank) {

        if (rank < 1 || rank > 10) {
            throw new IllegalArgumentException("Invalid rank: " + rank);
        }

        if (!PLAYER_CREATOR.containsKey(playerType)) {
            throw new IllegalArgumentException("Invalid player type: " + playerType);
        }

        Map<Predicate<Integer>, Supplier<Player>> players = PLAYER_CREATOR.get(playerType);
        for (Entry<Predicate<Integer>, Supplier<Player>> entry : players.entrySet()) {
            if (entry.getKey().test(rank)) {
                return entry.getValue().get();
            }
        }

        throw new IllegalStateException("The players map is corrupted");
    }

}
