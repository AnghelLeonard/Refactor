package main;

import classicswitch.PlayerCreator;
import players.Player;
import predicateswitch.PlayerSupplier;
import predicateswitch.PlayerTypes;

public class Main {

    public static void main(String[] args) {
        
        PlayerCreator playerCreator = new PlayerCreator();
        Player tennisPlayer = playerCreator.createPlayer("TENNIS", 5);
        System.out.println("Tennis player: " + tennisPlayer.name());
                
        Player footballPlayer = PlayerSupplier.supplyPlayer("FOOTBALL", 6);
        System.out.println("Football player: " + footballPlayer.name());
        
        Player snookerPlayer = PlayerTypes.supplyPlayer("SNOOKER", 10);
        System.out.println("Snooker player: " + snookerPlayer.name());
    }
    
}
