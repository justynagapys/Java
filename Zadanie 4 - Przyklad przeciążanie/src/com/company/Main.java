package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie pp = new PrzykladPrzeciazanie();
        pp.wypisz(10);
        pp.wypisz(19.2);
        pp.wypisz("Przeciazenie argument tekst");
    }
}

class PrzykladPrzeciazanie {

    public void wypisz(int x) {
        System.out.println("int = " + x);
    }

    public void wypisz(double y) {
        System.out.println("double = " + y);
    }

    public void wypisz(String z) {
        System.out.println("string = " + z);
    }
}