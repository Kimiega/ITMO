package film;

import core.CinemaManager;
import util.StoryThing;

public abstract class Actor implements StoryThing, Arming,Fighting,Transportable {
    private String name;
    private boolean armed;
    private boolean usingTransport;
    private TransportEnum[] transport;
    private WeaponsEnum[] weapons;
    private boolean fighting;
    private StoryThing opponent;
    private StoryThing followingForWho;

    public Actor(String name, WeaponsEnum[] weapons, TransportEnum[] transport, boolean armed, boolean usingTransport){
        this.name = name;
        joinStory();
        this.armed = armed;
        this.usingTransport = usingTransport;
        this.transport = transport;
        fighting = false;
        opponent = null;
        this.weapons = weapons;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory() {
        System.out.println(name + " присоединились к истории");
    }

    @Override
    public void exitStory() {
        System.out.println(name + " вышли из истории");
    }

    @Override
    public boolean isArmed() {
        if (armed)
        System.out.println(name + " вооружены "+ withWeapons());
        else
            System.out.println(name + " не вооружены");
        return armed;
    }

    @Override
    public void setFighting(StoryThing opponent) {
        fighting = true;
        this.opponent = opponent;
    }

    @Override
    public void setOffFighting() {
        fighting = false;
        opponent = null;
    }

    @Override
    public boolean isFighting() {
        if (fighting)
            System.out.println(name + " воюет с " + opponent.getName());
        else
            System.out.println(name + " не воюет");
        return fighting;
    }

    @Override
    public boolean isUsingTransport() {
        if (usingTransport)
            System.out.println(name + " использует " + withTransport());
        return usingTransport;
    }

    @Override
    public String withWeapons() {
        String s = "";
        for (WeaponsEnum x : weapons)
            s += x.name()+' ';
        return s;
    }

    @Override
    public String withTransport() {
        String s = "";
        for (TransportEnum x : transport)
            s += x.name()+' ';
        return s;
    }


    @Override
    public StoryThing isFollowingFor() {
        System.out.println(name + " преследует " + opponent.getName());
        return opponent;
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
        if (obj instanceof Actor) {
            return (name.equals(((Actor) obj).getName()) && opponent == ((Actor) obj).opponent && weapons == ((Actor) obj).weapons);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Актёр: "+name;
    }
}

