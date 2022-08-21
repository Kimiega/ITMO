package moves;

import ru.ifmo.se.pokemon.*;

public class Poison_Jab extends PhysicalMove {
    public Poison_Jab() {
        super(Type.POISON,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.3){
            Effect.poison(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Poison Jab";
    }

}
