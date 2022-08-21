package core;

import util.StoryThing;
import util.Switchable;

public class Light implements StoryThing, Switchable {
    private String name;
    private boolean status;

    public Light(String name){
        this.name = name;
        joinStory();
        status = false;
    }
    public Light(){
        name = "Свет";
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
        System.out.println(name + " зажёгся");
    }

    @Override
    public void finish() {
        System.out.println(name + " погас");
    }

    @Override
    public boolean isOn() {
        return status;
    }
}
