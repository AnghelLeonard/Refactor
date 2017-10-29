package classicswitch;

public class ClassicPlayer {

    private int state;

    public void register() {
        switch (state) {
            case 0:
                state = 1;
                System.out.println("Registering ...");
                break;
            default:
                System.out.println("Aready Registered ...");        
        }
    }

    public void unregister() {
        switch (state) {
            case 1:
                state = 0;
                System.out.println("Un-registering ...");
                break;
            default:
                System.out.println("Aready Unregistered ...");        
        }
    }
}
