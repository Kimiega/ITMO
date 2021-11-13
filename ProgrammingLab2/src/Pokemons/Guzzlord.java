package Pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Guzzlord extends Pokemon {
    public Guzzlord(String name, int level){
        super(name, level);
        setStats(223,101,53,97,53,43);
        setType(Type.DARK, Type.DRAGON);
        setMove(new Swagger(), new Calm_Mind(), new Aurora_Beam(),new Psychic());
    }
}
