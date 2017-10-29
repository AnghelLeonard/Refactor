package abstractfactoryplayers;

import helpers.ComputeEnduranceAlgorithm;
import helpers.Type;


public class SnookerPlayer extends Player {

    public SnookerPlayer(Type type, int delta) {
        super(type, delta);
    }

    @Override
    public int playerEndurance() {
        return ComputeEnduranceAlgorithm.basicEndurance(this.getDelta());
    }
}