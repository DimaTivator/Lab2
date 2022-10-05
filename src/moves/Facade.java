package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon defender, double damage) {
        defender.setMod(Stat.HP, (int) Math.round(damage));

        Status condition = defender.getCondition();
        if (condition.equals(Status.BURN) || condition.equals(Status.POISON) || condition.equals(Status.PARALYZE)) {
            defender.setMod(Stat.HP, (int) Math.round(2 * damage));
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
