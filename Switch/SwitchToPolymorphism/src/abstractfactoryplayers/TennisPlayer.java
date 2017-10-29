package abstractfactoryplayers;

import helpers.ComputeEnduranceAlgorithm;

public class TennisPlayer extends Player {

    public TennisPlayer(int delta) {
        super(delta);
    }

    @Override
    public int playerEndurance() {
        return ComputeEnduranceAlgorithm.basicEndurance(this.getDelta())
                + ComputeEnduranceAlgorithm.hardEndurance(this.getDelta());
    }

}
