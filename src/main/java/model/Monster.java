package model;

import app.Attack;
import app.StaticMethods;

public class Monster extends GameElement{

    private String type;

    public Monster(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public int getAttackPoint(Attack attack) {

        return  attack.calculateAttackPoints(StaticMethods.getRandomNumber(1, 10));
    }
}
