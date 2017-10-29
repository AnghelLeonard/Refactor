package players;

public class TennisPlayer implements Player {
   
    private final String name;

    public TennisPlayer(String name) {
        this.name = name;
    }     
    
     @Override
    public String name() {
        return name;
    }
}
