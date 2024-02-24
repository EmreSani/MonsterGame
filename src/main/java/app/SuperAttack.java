package app;

public class SuperAttack implements Attack{
    @Override
    public int calculateAttackPoints(int attackPoints) {
        System.out.println("SUPER ATTACK");
        return attackPoints * 2;
    }
}
