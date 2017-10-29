package main;

import classicswitch.PlayerCreator;
import commandswitch.CreatePlayerCommand;
import players.Player;

public class Main {

    public static void main(String[] args) {

        PlayerCreator playerCreator = new PlayerCreator();
        Player tennisPlayer = playerCreator.createPlayer("TENNIS");
        System.out.println("Tennis player: " + tennisPlayer);

        CreatePlayerCommand createCommand = new CreatePlayerCommand();
        Player snookerPlayer = createCommand.createPlayer("SNOOKER");
        System.out.println("Snooker player: " + snookerPlayer);
    }

}
