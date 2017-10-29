package abstractfactoryplayers;

import helpers.ComputeEnduranceAlgorithm;
import helpers.Type;

public class TennisPlayer extends Player {

    public TennisPlayer(Type type, int delta) {
        super(type, delta);
    }

    @Override
    public int playerEndurance() {
        return ComputeEnduranceAlgorithm.basicEndurance(this.getDelta())
                + ComputeEnduranceAlgorithm.hardEndurance(this.getDelta());
    }

}
