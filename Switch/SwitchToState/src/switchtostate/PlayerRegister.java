package switchtostate;

public class PlayerRegister implements PlayerState {

    private final Player player;
    
    public PlayerRegister(Player player) {
        this.player = player;
    }
    
    @Override
    public void register() {
        System.out.println("Already Registered ...");        
    }

    @Override
    public void unregister() {
        System.out.println("Unregistering ...");
        player.setState(player.getUnregistered());
    }
    
}
