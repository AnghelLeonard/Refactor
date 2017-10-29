package abstractfactoryplayers;

public abstract class Player {
   
    private final int delta;

    public Player(int delta) {    
        this.delta = delta;
    }
   
    public int getDelta() {
        return delta;
    }    
    
    public abstract int playerEndurance();

    // more similar methods
}
