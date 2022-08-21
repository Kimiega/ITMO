package core;

import film.Actor;
import film.TransportEnum;
import film.WeaponsEnum;

public class Persons extends Actor{
    private boolean suspicious;

    public Persons(String name, boolean suspicious, WeaponsEnum[] weapons, TransportEnum[] usedTransport, boolean armed, boolean usingTransport){
        super(name, weapons,usedTransport,armed,usingTransport);
        this.suspicious = suspicious;
        isSuspicious();
    }
    public Persons(){
        super("Личности", new WeaponsEnum[]{WeaponsEnum.НОЖИ,WeaponsEnum.ФИНКИ, WeaponsEnum.КИНЖАЛЫ,WeaponsEnum.ПИСТОЛЕТЫ},TransportEnum.values(),true,true);
        suspicious = true;
        isSuspicious();
    }
    private void isSuspicious()
    {
        if (suspicious)
            System.out.println(super.getName()+ " подозрительные");
    }
}
