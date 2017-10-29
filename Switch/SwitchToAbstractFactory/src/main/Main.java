package main;

import abstractfactoryplayers.Player;
import abstractfactoryplayers.PlayerFactory;
import classicswitch.ClassicPlayer;
import classicswitch.Statistics;
import helpers.Type;

public class Main {

    public static void main(String[] args) {
                                
        Statistics statistics = new Statistics();
        
        ClassicPlayer player = new ClassicPlayer(Type.TENNIS, 54);                                
        int tennisPlayerEndurance = statistics.playerEndurance(player);
        System.out.println("Tennis player endurance: " + tennisPlayerEndurance);
        
        PlayerFactory playerFactory = new PlayerFactory();
        Player snookerPlayer = playerFactory.createPlayer(Type.SNOOKER, 8);
        int snookerPlayerEndurance  = snookerPlayer.playerEndurance();
        System.out.println("Snooker player endurance: " + snookerPlayerEndurance);
    }
    
}
