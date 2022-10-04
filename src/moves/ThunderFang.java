package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {

    public ThunderFang() {
        super(Type.ELECTRIC, 65, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.1 && !defender.getCondition().equals(Status.PARALYZE)) {
            Effect paralyse = new Effect().condition(Status.PARALYZE);
            defender.addEffect(paralyse);
        }

        if (Math.random() < 0.1) {
            Effect.flinch(defender);
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Thunder Fang";
    }
}
