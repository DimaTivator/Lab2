import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon dedenne = new Dedenne("first", 3);
        Pokemon eelektrik = new Eelektrik("second", 3);
        Pokemon eelektross = new Eelektross("third", 3);
        Pokemon onix = new Onix("fourth", 3);
        Pokemon steelix = new Steelix("fifth", 3);
        Pokemon tynamo = new Tynamo("sixth", 3);

        Battle battle = new Battle();

        battle.addAlly(dedenne);
        battle.addAlly(eelektross);
        battle.addAlly(onix);

        battle.addFoe(eelektrik);
        battle.addFoe(steelix);
        battle.addFoe(tynamo);

        battle.go();
    }
}