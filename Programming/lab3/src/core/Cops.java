package core;

import film.Actor;
import film.TransportEnum;
import film.WeaponsEnum;

public class Cops extends Actor{

    public Cops(String name, WeaponsEnum[] weapons, TransportEnum[] usedTransport, boolean armed, boolean usingTransport){
        super(name, weapons,usedTransport, armed,usingTransport);
    }
    public Cops(){
        super("Копы", new WeaponsEnum[]{WeaponsEnum.ПИСТОЛЕТЫ,WeaponsEnum.АВТОМАТЫ},TransportEnum.values(),true,true);
    }
}
