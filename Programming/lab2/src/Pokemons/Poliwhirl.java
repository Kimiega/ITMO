package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level){
        super(name, level);
        setStats(65,65,65,50,50,90);
        addMove(new Crunch());
    }
}
