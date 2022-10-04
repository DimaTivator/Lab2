package moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {

    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon attacker, Pokemon defender) {
        return super.calcCriticalHit(attacker, defender) * 3;
    }

    @Override
    protected String describe() {
        return "использует Stone Edge";
    }
}
