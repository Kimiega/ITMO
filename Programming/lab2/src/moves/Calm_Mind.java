package moves;

import ru.ifmo.se.pokemon.*;

public class Calm_Mind extends StatusMove{
    public Calm_Mind(){
        super(Type.PSYCHIC, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    @Override
    protected String describe() {
        return "Использует Calm Mind";
    }
}
