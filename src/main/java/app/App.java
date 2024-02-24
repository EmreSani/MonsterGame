package app;

import model.Cannon;
import model.Catapult;
import model.Player;
import model.Stick;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
       //  game.startGame();

         Attack attack = new SuperAttack();
        System.out.println(attack.addNumbers(5, 4));
        System.out.println(Attack.multiplyNumbers(2, 3));



//    Player player = new Player("Emre Sani", 25);
//    player.addTool(new Stick());
//    player.addTool(new Cannon());
//    player.addTool(new Catapult());
//    player.addTool(new Stick());
//    player.printTools();
//    player.refillTools();






         
    }
}
