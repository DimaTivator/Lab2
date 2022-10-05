package moves;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {

    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected boolean checkAccuracy(Pokemon attacker, Pokemon defender) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Charm";
    }
}
