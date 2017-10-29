package abstractfactoryplayers;

import helpers.ComputeEnduranceAlgorithm;

public class FootballPlayer extends Player {

    public FootballPlayer(int delta) {
        super(delta);
    }

    @Override
    public int playerEndurance() {
        return ComputeEnduranceAlgorithm.hardEndurance(this.getDelta())
                * ComputeEnduranceAlgorithm.factorEndurance(this.getDelta());
    }
}
