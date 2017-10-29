package players;

public class FootballPlayer implements Player {
    
    private final String name;

    public FootballPlayer(String name) {
        this.name = name;
    }        

    @Override
    public String name() {
        return name;
    }
        
}
