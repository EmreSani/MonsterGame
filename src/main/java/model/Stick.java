package model;

public class Stick extends Tool {

    private static final int INITIAL_DURABILITY = 50;
    private int durability;
    public Stick(){
        super(10,5);
        this.durability=INITIAL_DURABILITY;

    }

    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public void refill() {
        this.durability = INITIAL_DURABILITY;
        System.out.println("stick refill");
    }

    @Override
    public String toString() {
        return "Stick{" +
                "durability=" + durability +
                ", power=" + getPower() +
                ", price=" + getPrice() +
                '}';
    }
}
