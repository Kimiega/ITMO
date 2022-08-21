package core;

import util.*;

public class SeatManager implements StoryThing, Reclinable {
    private String name;
    private boolean reclined;
    private Comfortability levelComfort = Comfortability.УДОБНО;

    public SeatManager(String name){
        this.name = name;
        joinStory();
        reclined = false;
    }
    public SeatManager(){
        name = "Места";
        joinStory();
        reclined = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory() {
        System.out.println(name + " появились в истории");
    }

    @Override
    public void exitStory() {
        System.out.println(name + " пропали из истории");
    }

    @Override
    public void recline() {
        if (reclined) {
            reclined = false;
            levelComfort = Comfortability.УДОБНО;
            System.out.println("Спинка объекта " + name + " поднята");
            System.out.println("Комфортность " + name + ": " + levelComfort);
        }
        else {
            reclined = true;
            levelComfort = Comfortability.УДОБНО_КАК_В_АВТОБУСАХ;
            System.out.println("Спинка объекта " + name + " откинута");
            System.out.println("Комфортность " + name + ": " + levelComfort);
        }
    }

    @Override
    public boolean isReclined() {
        return reclined;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+name.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeatManager) {
            return (name.equals(((SeatManager) obj).getName()) && reclined == ((SeatManager) obj).reclined && levelComfort == ((SeatManager) obj).levelComfort);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Сиденье: "+name;
    }
}

