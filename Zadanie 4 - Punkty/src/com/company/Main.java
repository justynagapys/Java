package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D();
        p1.wypisz();

        Punkt2D p2 = new Punkt2D(10, 20);
        p2.wypisz();

        Punkt3D p3 = new Punkt3D();
        p3.wypisz();

        Punkt3D p4 = new Punkt3D(10, 20, 30);
        p4.wypisz();
    }
}

class Punkt2D {
    int x;
    int y;

    Punkt2D() {
    }

    Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void wypisz() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Punkt3D extends Punkt2D {
    int z;

    Punkt3D() {
    }

    Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void wypisz() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}