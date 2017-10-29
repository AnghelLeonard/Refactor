package classicswitch;

import helpers.ComputeEnduranceAlgorithm;

public class Statistics {

    public int playerEndurance(ClassicPlayer player) {

        int delta = player.getDelta();

        switch (player.getType()) {
            case TENNIS:
                return ComputeEnduranceAlgorithm.basicEndurance(delta)
                        + ComputeEnduranceAlgorithm.hardEndurance(delta);
            case FOOTBALL:
                return ComputeEnduranceAlgorithm.hardEndurance(delta)
                        * ComputeEnduranceAlgorithm.factorEndurance(delta);
            case SNOOKER:
                return ComputeEnduranceAlgorithm.basicEndurance(delta);

            default:
                throw new IllegalArgumentException("Invalid player type: " + player.getType());
        }
    }

}
