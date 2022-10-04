package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {

    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        Effect paralyze = new Effect().condition(Status.PARALYZE);
        defender.addEffect(paralyze);
    }

    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Thunder Wave";
    }
}
