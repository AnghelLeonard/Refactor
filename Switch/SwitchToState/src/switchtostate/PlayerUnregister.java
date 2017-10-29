package switchtostate;

public class PlayerUnregister implements PlayerState {

    private final Player player;
    
    public PlayerUnregister(Player player) {
        this.player = player;
    }
    
    @Override
    public void register() {
        System.out.println("Registering ...");
        player.setState(player.getRegistered());
    }

    @Override
    public void unregister() {
        System.out.println("Already Unregistered ...");        
    }
    
}

