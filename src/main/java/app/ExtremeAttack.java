package app;

public class ExtremeAttack implements Attack{
    @Override
    public int calculateAttackPoints(int attackPoints) {
        System.out.println("EXTREME ATTACK");
        return attackPoints *3;
    }
}
