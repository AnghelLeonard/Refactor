package abstractfactoryplayers;

import helpers.Type;

public interface AbstractPlayerFactory {
    
    public Player createPlayer(Type type, int delta);
    
}
