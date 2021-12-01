package core;

import util.StoryThing;
import util.Switchable;

public class Noize implements StoryThing, Switchable {
    private String name;
    private boolean status;

    public Noize(String name){
        this.name = name;
        joinStory();
        status = false;
    }
    public Noize(){
        name = "Шум";
        joinStory();
        status = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory() {
        System.out.println(name + " появился в истории");
    }
    @Override
    public void exitStory() {
        System.out.println(name + " исчез из истории");
    }

    @Override
    public void start() {
        System.out.println(name + " поднялся");
    }

    @Override
    public void finish() {
        System.out.println(name + " утих");
    }

    @Override
    public boolean isOn() {
        return status;
    }
}
