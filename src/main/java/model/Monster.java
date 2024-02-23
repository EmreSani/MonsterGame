package model;
public class Monster extends GameElement{

    private String type;

    public Monster(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
