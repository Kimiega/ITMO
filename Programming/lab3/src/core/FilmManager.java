package core;

import film.Actor;
import util.StoryThing;
import util.Switchable;

public class FilmManager implements StoryThing, Switchable {
    private String name;
    private boolean status;


    public FilmManager(String name){
        this.name = name;
        joinStory();
        status = false;
    }
    public FilmManager(){
        name = "Фильм";
        joinStory();
        status = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory() {
        System.out.println(name + " присоединился к истории");
    }

    @Override
    public void exitStory() {
        System.out.println(name + " вышел из истории");
    }

    @Override
    public void start() {
        System.out.println(name + " начался");
        status = true;
    }

    @Override
    public void finish() {
        System.out.println(name + " закочился");
        status = false;
    }

    @Override
    public boolean isOn() {
        return status;
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
        if (obj instanceof FilmManager) {
            return (name.equals(((FilmManager) obj).getName()) && status == ((FilmManager) obj).status);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Фильм: "+name;
    }
}
