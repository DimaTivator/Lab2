package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {

    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.7) {
            defender.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }
}
