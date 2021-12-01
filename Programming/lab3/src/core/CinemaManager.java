package core;

import util.*;

public class CinemaManager implements StoryThing {
    private String name;
    public SeatManager seats;
    public FilmManager film;

    public CinemaManager(String name, String name_film, String name_seats){
        this.name = name;
        joinStory();
        film = new FilmManager(name_film);
        seats = new SeatManager(name_seats);
    };
    public CinemaManager(){
        name = "Кинотеатр";
        joinStory();
        film = new FilmManager();
        seats = new SeatManager();
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory() {
        System.out.println(name+" присоединился к истории");
    }

    @Override
    public void exitStory() {
        System.out.println(name+" вышел из истории");
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
        if (obj instanceof CinemaManager) {
            return (name.equals(((CinemaManager) obj).getName()) && seats == ((CinemaManager) obj).seats && film == ((CinemaManager) obj).film);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Кинотеатр: "+name;
    }
}

