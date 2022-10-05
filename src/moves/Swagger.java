package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.confuse();
        defender.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
