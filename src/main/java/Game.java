import java.util.Scanner;

public class Game {

    private Monster monster;
    private Player player;


    public void startGame(){
        buildPlayer();
        buildMonster();
        do {
            startAttacks();
            resetHealth();
            System.out.println("Tekrar oynat? Evet, Hayir");
             Scanner scanner = new Scanner(System.in);

        }

    }

    private void startAttacks() {
        while (monster.isAlive() && player.isAlive()){
            System.out.println("Player " + player.getName() + " attack");
            monster.decreaseHealth(getAttackPoint());
           


            if (!monster.isAlive()){
                break;
            }

            System.out.println("Monster " + monster.getType() + " attack");
            player.decreaseHealth(getAttackPoint());

            printHealthStatus();

        }
        System.out.println((player.getHealth()>0 ? ("Player " + player.getName()) : ("Monster " + monster.getType()))
                + " wins!");
    }

    private void resetHealth() {
        monster.resetHealth();
        player.resetHealth();
    }

    private void printHealthStatus() {
        System.out.println("Player " + player.getName()+" health " + player.getHealth());
        System.out.println("Monster " +monster.getType()+ " health " + monster.getHealth());
    }

    private void buildMonster(){
        monster = new Monster(100,"Big Head");
    }

 //   private String askType(){
  //      System.out.println("Canavarin tipini giriniz");
   //     Scanner scanner = new Scanner(System.in);
  //      return scanner.nextLine();

  //  }
    private void buildPlayer(){
        int age = askAge();
        String name = askName();
        player = new Player(100, name, age);

    }
    private int askAge(){
        System.out.println("Yasinizi giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private String askName(){
        System.out.println("Isminizi giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static int getAttackPoint() {
        return (int) (1 + (Math.random() * 10));
    }
}

