package moves;

import ru.ifmo.se.pokemon.*;

public class Shell_Smash extends StatusMove {
    public Shell_Smash() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
        p.setMod(Stat.ATTACK, 2);
        p.setMod(Stat.SPECIAL_ATTACK, 2);
    }
    @Override
    protected String describe() {
        return "Использует Shell Smash";
    }
}
