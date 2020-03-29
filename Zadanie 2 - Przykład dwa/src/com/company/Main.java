package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladDwa p1 = new PrzykladDwa();
        p1.wypisz();
        PrzykladDwa p2 = new PrzykladDwa(10);
        p2.wypisz();
        PrzykladDwa p3 = new PrzykladDwa(50, 4.5);
        p3.wypisz();
    }
}

class PrzykladDwa {
    double prawdziwy;
    double wyimaginowany;

    public void wypisz() {
        System.out.println(prawdziwy + " + i " + wyimaginowany);
    }

    PrzykladDwa() {
        prawdziwy = 0;
        wyimaginowany = 0;
    }
    PrzykladDwa(double x) {
        prawdziwy = x;
        wyimaginowany = 0;
    }

    PrzykladDwa(double x, double y) {
        prawdziwy = x;
        wyimaginowany = y;
    }
}