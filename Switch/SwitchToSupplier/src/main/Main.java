package main;

import classicswitch.PlayerCreator;
import players.Player;
import supplierswitch.PlayerSupplier;

public class Main {

    public static void main(String[] args) {

        PlayerCreator playerCreator = new PlayerCreator();
        Player tennisPlayer = playerCreator.createPlayer("TENNIS");
        System.out.println("Tennis player: " + tennisPlayer);
        
        PlayerSupplier playerSupplier = new PlayerSupplier();
        Player snookerPlayer = playerSupplier.supplyPlayer("SNOOKER");
        System.out.println("Snooker player: " + snookerPlayer);
    }

}
