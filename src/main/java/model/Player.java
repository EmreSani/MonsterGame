package model;

import app.Attack;
import app.StaticMethods;

import java.util.ArrayList;
import java.util.Objects;

public class Player extends GameElement{
    private String name;
    private int age;
    ArrayList<Tool> tools;



    public Player(String name, int age) {
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
    public void addTool(Tool tool){
        if (this.tools == null){
            this.tools = new ArrayList<>();
        }
        this.tools.add(tool);
    }

    public void printTools(){
        for(Tool tool : tools){
            System.out.println(tool);
        }
    }
    public void refillTools(){
        for(Tool tool : tools){
            tool.refill();
        }
    }

    @Override
    public int getAttackPoint(Attack attack) {
        return StaticMethods.getRandomNumber(1, 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
