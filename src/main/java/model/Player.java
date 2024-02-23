package model;
import app.Game;

public class Player {
    private int health;
    private String name;

    public Player(int health, String name, int age) {
        setHealth(health);
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 10) {
            throw new IllegalArgumentException("model.Player age should be greater than 10");
        }
        this.age = age;
    }

    private int age;


    private void setHealth(int health) {
        if (health > Game.FULL_HEALTH) {
            throw new IllegalArgumentException("Health shouldn't be higher than " + Game.FULL_HEALTH);
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void resetHealth() {
        health = Game.FULL_HEALTH;
    }

    public void decreaseHealth(int points) {
        health -= points;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
