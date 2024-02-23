package model;

public class Cannon extends Tool {
    private static final int INITIAL_BALL_COUNT = 165;
    private int numberOfCannonBalls;
    public Cannon(){
        super(88,77);
        this.numberOfCannonBalls = INITIAL_BALL_COUNT;
    }
    public int getNumberOfCannonBalls() {
        return numberOfCannonBalls;
    }

    public void setNumberOfCannonBalls() {
        this.numberOfCannonBalls = numberOfCannonBalls;
    }

    @Override
    public void refill() {
        this.numberOfCannonBalls = INITIAL_BALL_COUNT;
        System.out.println("cannon refill");
    }

    @Override
    public String toString() {
        return "Cannon{" +
                "numberOfCannonBalls=" + numberOfCannonBalls +
                ", power=" + getPower() +
                ", price=" + getPrice() +
                '}';
    }
}


