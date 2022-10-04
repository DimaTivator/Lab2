package moves;

import ru.ifmo.se.pokemon.*;

public class Coil extends StatusMove {

    public Coil() {
        super(Type.POISON, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        attacker.setMod(Stat.ATTACK, 1);
        attacker.setMod(Stat.DEFENSE, 1);
        attacker.setMod(Stat.ACCURACY, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Coil";
    }
}
