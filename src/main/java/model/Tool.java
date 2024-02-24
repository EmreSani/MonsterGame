package model;

public abstract class Tool {
    private int power;
    private int price;

    public Tool(int power, int price){
       this.power =power;
       this.price =price;

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void refill();



}
