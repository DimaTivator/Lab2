package moves;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {

    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Stat.ATTACK.isHidden()) {
            defender.setMod(Stat.ATTACK, 3);
        }
        else {
            defender.setMod(Stat.ATTACK, 2);
        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon defender, Pokemon attacker) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Charm";
    }
}
