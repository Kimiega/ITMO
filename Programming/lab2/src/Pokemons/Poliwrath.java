package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
    public Poliwrath(String name, int level){
        super(name, level);
        setStats(90,95,95,70,90,70);
        addType(Type.FIGHTING);
        addMove(new Sludge_Wave());
    }
}
