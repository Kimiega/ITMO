package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Darmanitan_Standard extends Darumaka {
    public Darmanitan_Standard(String name, int level){
        super(name, level);
        setStats(105,140,55,30,55,95);
        addMove(new Shell_Smash());
    }
}
