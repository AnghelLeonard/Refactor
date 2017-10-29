package abstractfactoryplayers;

import helpers.ComputeEnduranceAlgorithm;
import helpers.Type;

public class FootballPlayer extends Player {

    public FootballPlayer(Type type, int delta) {
        super(type, delta);
    }

    @Override
    public int playerEndurance() {
        return ComputeEnduranceAlgorithm.hardEndurance(this.getDelta())
                * ComputeEnduranceAlgorithm.factorEndurance(this.getDelta());
    }
}
