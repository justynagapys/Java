package com.company;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulatorPostawowy = new Kalkulator();
        System.out.println(kalkulatorPostawowy.dodaj(10,20));
        System.out.println(kalkulatorPostawowy.odejmij(10,20));

        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystyczny.dodaj(10,20));
        System.out.println(kalkulatorStatystyczny.odejmij(10,20));
        System.out.println(kalkulatorStatystyczny.sinus(10));
    }
}

class Kalkulator {
    public int dodaj(int x, int y) {
        return x + y;
    }

    public int odejmij(int x, int y) {
        return x - y;
    }
}
class KalkulatorStatystyczny extends Kalkulator{
    public double sinus(double x){
        return Math.sin(x);
    }
}