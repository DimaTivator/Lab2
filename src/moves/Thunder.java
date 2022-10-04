package moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {

    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.3) {
            Effect paralyse = new Effect().condition(Status.PARALYZE);
            defender.addEffect(paralyse);
        }
    }

    @Override
    protected String describe() {
        return "использует Thunder";
    }
}
