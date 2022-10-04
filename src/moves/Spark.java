package moves;

import ru.ifmo.se.pokemon.*;

public class Spark extends PhysicalMove {

    public Spark() {
        super(Type.ELECTRIC, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.3) {
            Effect paralyze = new Effect().condition(Status.PARALYZE);
            defender.addEffect(paralyze);
        }
    }

    @Override
    protected String describe() {
        return "использует Spark";
    }
}
