package app;

public interface Attack {

    final static int MIN_ATTACK_POINT = 1;
    int calculateAttackPoints(int attackPoints);

    default int addNumbers(int number1, int number2) {
        return number1 + number2 ;}

    static int multiplyNumbers(int number1, int number2)
    {return number1 * number2;}

    private int subtractNumbers(int number1, int number2)
    {return number1 - number2;}

    private static int divideNumbers(int number1, int number2)
    {return number1 / number2;}

}
