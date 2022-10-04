package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Dedenne extends Pokemon {

    public Dedenne(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.FAIRY);
        setStats(67, 58, 57,81, 67, 101);
        setMove(new Rest(), new Charm(), new Facade(), new Thunder());
    }
}
