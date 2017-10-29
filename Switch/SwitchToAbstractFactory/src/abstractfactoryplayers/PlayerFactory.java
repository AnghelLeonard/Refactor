package abstractfactoryplayers;

import helpers.Type;

public class PlayerFactory implements AbstractPlayerFactory {

    @Override
    public Player createPlayer(Type type, int delta) {
        switch (type) {
            case TENNIS:
                return new TennisPlayer(type, delta);
            case FOOTBALL:
                return new FootballPlayer(type, delta);
            case SNOOKER:
                return new SnookerPlayer(type, delta);

            default:
                throw new IllegalArgumentException("Invalid player type: " + type);
        }
    }
}
