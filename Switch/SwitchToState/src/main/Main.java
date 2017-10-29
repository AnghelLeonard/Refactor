package main;

import classicswitch.ClassicPlayer;
import switchtostate.Player;

public class Main {

    public static void main(String[] args) {

        ClassicPlayer classicPlayer = new ClassicPlayer();
        classicPlayer.register();
        classicPlayer.unregister();
        classicPlayer.unregister();

        Player player = new Player();
        player.register();
        player.unregister();
        player.unregister();
    }

}
