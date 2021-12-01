package main;
import core.*;
import film.Actor;


public class Story {

    public static void main(String[] args) {

        CinemaManager cinema = new CinemaManager();
        Shorties aShorties = new Shorties();
        Light light = new Light();
        light.start();
        aShorties.sitOn(cinema.seats);

        cinema.film.start();
        light.finish();
        Persons friends = new Persons();
        Cops police = new Cops();
        friends.isArmed();
        police.isArmed();
        friends.setFighting(police);
        police.setFighting(friends);
        friends.isFollowingFor();
        police.isFollowingFor();
        friends.isFighting();
        police.isFighting();
        friends.isUsingTransport();
        police.isUsingTransport();

        aShorties.watch(cinema.film);
        Noize noise = new Noize();
        noise.start();
        aShorties.getScared();
        aShorties.getTired();
        noise.finish();
        cinema.seats.recline();
        aShorties.fallAsleep();
        aShorties.wakeUp("утро следующего дня");

    }
}
