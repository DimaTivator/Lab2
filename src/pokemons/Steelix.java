package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Steelix extends Onix {

    public Steelix(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.GROUND);
        setStats(75, 85, 200, 55, 65, 30);
        addMove(new ThunderFang());
    }
}
