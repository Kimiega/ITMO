package moves;

import ru.ifmo.se.pokemon.*;

public class Sludge_Wave extends SpecialMove {
    public Sludge_Wave(){
        super(Type.POISON, 95, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.1){
            Effect.poison(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Sludge Wave";
    }
}
