package moves;

import ru.ifmo.se.pokemon.*;

public class Aurora_Beam extends SpecialMove {
    public Aurora_Beam(){
        super(Type.ICE, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.1){
            p.setMod(Stat.ATTACK, -1);
        }
    }
    @Override
    protected String describe(){
        return "использует Aurora Beam";
    }
}
