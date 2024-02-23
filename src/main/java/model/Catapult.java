package model;

public class Catapult extends Tool {
    private static final int INITIAL_ROCK_COUNT =15;
    private int numberOfRocks;

    public Catapult(){
        super(15,20);
        this.numberOfRocks = INITIAL_ROCK_COUNT;

    }
    public int getNumberOfRocks() {
        return numberOfRocks;
    }

    public void setNumberOfRocks() {
        this.numberOfRocks = numberOfRocks;
    }

    @Override
    public void refill() {
        this.numberOfRocks = INITIAL_ROCK_COUNT;
        System.out.println("cata refill");
    }

    @Override
    public String toString() {
        return "Catapult{" +
                "numberOfRocks=" + numberOfRocks +
                ", power=" + getPower() +
                ", price=" + getPrice() +
                '}';
    }
}
