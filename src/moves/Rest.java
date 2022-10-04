package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        Effect sleep = new Effect().condition(Status.SLEEP).turns(2);
        attacker.addEffect(sleep);
        attacker.restore();
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
