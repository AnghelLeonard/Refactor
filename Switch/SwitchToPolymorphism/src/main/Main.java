package main;

import abstractfactoryplayers.SnookerPlayer;
import classicswitch.ClassicPlayer;
import classicswitch.Statistics;
import helpers.Type;

public class Main {

    public static void main(String[] args) {
                                
        Statistics statistics = new Statistics();
        
        ClassicPlayer player = new ClassicPlayer(Type.TENNIS, 54);                                
        int tennisPlayerEndurance = statistics.playerEndurance(player);
        System.out.println("Tennis player endurance: " + tennisPlayerEndurance);
                
        SnookerPlayer snookerPlayer = new SnookerPlayer(7);
        int snookerPlayerEndurance  = snookerPlayer.playerEndurance();
        System.out.println("Snooker player endurance: " + snookerPlayerEndurance);
    }
    
}
