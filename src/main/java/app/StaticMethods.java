package app;

public class StaticMethods {
    public static int getRandomNumber(int min, int max){
        return min+(int) (Math.random() * max);
    }
}
