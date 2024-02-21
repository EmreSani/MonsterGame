public class Monster {
    private int health;
    private String type;
    public Monster(int health, String type){
        setHealth(health);
        this.type=type;
    }
    public Monster(int health){
        setHealth(health);
    }



    private void setHealth(int health) {
        if (health > 100){
            throw new IllegalArgumentException("Health should be smaller than 100");
        }
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public String getType() {
        return type;
    }

    public void resetHealth(){
        health = 100;
    }

    public void decreaseHealth(int points) {
        health -= points;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
