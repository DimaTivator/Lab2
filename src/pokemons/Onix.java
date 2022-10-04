package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Onix extends Pokemon {

    public Onix(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.GROUND);
        setStats(35, 45, 160, 30, 45, 70);
        setMove(new Swagger(), new StoneEdge(), new BrutalSwing());
    }
}
