package abstractfactoryplayers;

import helpers.Type;

public abstract class Player {

    private final Type type;
    private final int delta;

    public Player(Type type, int delta) {
        this.type = type;
        this.delta = delta;
    }

    public Type getType() {
        return type;
    }

    public int getDelta() {
        return delta;
    }    
    
    public abstract int playerEndurance();

    // more similar methods
}
