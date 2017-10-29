package switchtostate;

public class Player implements PlayerState {

    private PlayerState registered;
    private PlayerState unregistered;
    
    private PlayerState state;
    
    public Player() {
        this.registered = new PlayerRegister(this);
        this.unregistered = new PlayerUnregister(this);
        
        this.state = this.unregistered;
    }
    
    @Override
    public void register() {
        state.register();
    }

    @Override
    public void unregister() {
        state.unregister();
    }

    public PlayerState getRegistered() {
        return registered;
    }

    public void setRegistered(PlayerState registered) {
        this.registered = registered;
    }

    public PlayerState getUnregistered() {
        return unregistered;
    }

    public void setUnregistered(PlayerState unregistered) {
        this.unregistered = unregistered;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }
             
}
