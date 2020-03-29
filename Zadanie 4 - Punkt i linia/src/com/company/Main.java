package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt pkt = new Punkt (10,20);
        System.out.println(pkt.toString());
        Linia lin = new Linia(5,7,10,2);
        System.out.println(lin.toString());
        Punkt pkt2 = new Punkt(4,20);
        System.out.println(pkt2.toString());
        Punkt pkt3 = new Punkt(5,50);
        System.out.println(pkt3.toString());
        Linia lin2 = new Linia(pkt2,pkt3);
        System.out.println(lin2.toString());
    }
}

class Punkt {
    int x, y;

    public String toString(){
        String tekst = "Punkt: (" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
        return tekst;
    }

    Punkt(int a, int b) {
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Linia {
    Punkt poczatek;
    Punkt koniec;

    Linia(Punkt a1, Punkt b1){
        poczatek = a1;
        koniec = b1;
    }

    Linia(int x1, int x2, int y1, int y2){
        poczatek = new Punkt (x1, y1);
        koniec = new Punkt (x2, y2);
    }

    public Punkt getPoczatek() {
        return poczatek;
    }

    public Punkt getKoniec() {
        return koniec;
    }

    public void setPoczatek(Punkt poczatek) {
        this.poczatek = poczatek;
    }

    public void setKoniec(Punkt koniec) {
        this.koniec = koniec;
    }
}