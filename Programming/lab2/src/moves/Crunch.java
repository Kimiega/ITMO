package moves;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.1){
            p.setMod(Stat.DEFENSE,-1);
        }
    }
    @Override
    protected String describe(){
        return "использует Crunch";
    }
}
