package com.company;

public class Main {

    public static void main(String[] args) {
        Przyklad p1 = new Przyklad();
        p1.wypisz();
        Przyklad p2 = new Przyklad(19);
        p2.wypisz();
    }
}

class Przyklad {
    int wartosc;

    public void wypisz() {
        System.out.println(wartosc);
    }

    Przyklad() {
        wartosc = 10;
    }

    Przyklad(int x) {
        wartosc = x;
    }
}