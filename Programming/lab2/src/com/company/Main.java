package com.company;
import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();
        Guzzlord p1 = new Guzzlord("Гарик", 1);
        Darumaka p2 = new Darumaka("Даня", 1);
        Darmanitan_Standard p3 = new Darmanitan_Standard("Димон", 1);
        Poliwag p4 = new Poliwag("Арчём", 1);
        Poliwhirl p5 = new Poliwhirl("Cёма", 1);
        Poliwrath p6 = new Poliwrath("Сеня", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}
