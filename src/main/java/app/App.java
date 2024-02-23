package app;

import model.Cannon;
import model.Catapult;
import model.Player;
import model.Stick;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
       //  game.startGame();

    Player player = new Player("Emre Sani", 25);
    player.addTool(new Stick());
    player.addTool(new Cannon());
    player.addTool(new Catapult());
    player.addTool(new Stick());
    player.printTools();
    player.refillTools();






         
    }
}
