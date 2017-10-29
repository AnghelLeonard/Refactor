package abstractfactoryplayers;

import helpers.ComputeEnduranceAlgorithm;

public class SnookerPlayer extends Player {

    public SnookerPlayer(int delta) {
        super(delta);
    }

    @Override
    public int playerEndurance() {
        return ComputeEnduranceAlgorithm.basicEndurance(this.getDelta());
    }
}