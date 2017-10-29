package main;

import classicswitch.PlayerCreator;
import enumswitch.PlayerTypes;
import players.Player;

public class Main {

    public static void main(String[] args) {

        PlayerCreator playerCreator = new PlayerCreator();
        Player tennisPlayer = playerCreator.createPlayer(PlayerTypes.TENNIS);
        System.out.println("Tennis player: " + tennisPlayer);

        Player footballPlayer = PlayerTypes.valueOf("FOOTBALL").createPlayer();
        System.out.println("Football player: " + footballPlayer);
    }

}
