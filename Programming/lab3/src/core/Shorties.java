package core;

import util.*;

public class Shorties implements StoryThing, Afraidable, Sitting, Sleepable, Walkable,Watching, Tirable{
    private String name;
    private String seat;

    public Shorties(String name){
        this.name = name;
        seat = "";
        joinStory();
    }
    public Shorties(){
        name = "Коротышки";
        seat = "";
        joinStory();
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
    public void getScared() {
        System.out.println(name + " кричат от ужаса");
    }

    @Override
    public void walkTo(StoryThing place) {
        System.out.println(name + " пришли к " + place.getName());
    }

    @Override
    public void watch(StoryThing obj) {
        System.out.println(name + " смотрят на " + obj.getName());
    }

    @Override
    public void sitOn(StoryThing seat) {
        this.seat = seat.getName();
        System.out.println(name + " сели на " + this.seat);
    }

    @Override
    public void stand() {
        seat = "";
        System.out.println(name + " встали");
    }

    @Override
    public void fallAsleep() {
        System.out.println(name + " уснули");
    }

    @Override
    public void wakeUp(String when) {
        System.out.println(name + " проснулись " + when);
    }

    @Override
    public void getTired() {
        System.out.println(name + " устали");
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
        if (obj instanceof Shorties) {
            return (name.equals(((Shorties) obj).getName()) && seat == ((Shorties) obj).seat);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Персонажи: "+name;
    }
}
