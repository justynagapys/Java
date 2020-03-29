package com.company;

public class Main {

    public static void main(String[] args) {
        Zadanie10 z1 = new Zadanie10(5, 10);
        System.out.println(z1.wykonajOperacjeMatematycznaDodawanie());
        System.out.println(z1.wykonajOperacjeMatematycznaDodawanie(3));
        System.out.println(z1.wykonajOperacjeMatematycznaMnozenie(5, 6));
        Zadanie10 z2 = new Zadanie10();
        System.out.println(z2.wykonajOperacjeMatematycznaDodawanie());
        System.out.println(z2.wykonajOperacjeMatematycznaDodawanie(8));
        System.out.println(z2.wykonajOperacjeMatematycznaMnozenie(5, 5));

    }
}

class Zadanie10 {
    int a;
    int b;

    Zadanie10() {
        a = 0;
        b = 0;
    }

    Zadanie10(int x) {
        a = x;
        b = 0;
    }

    Zadanie10(int x, int y) {
        a = x;
        b = y;
    }

    public int wykonajOperacjeMatematycznaDodawanie() {
        return a + b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(int x) {
        return a + b + x;
    }

    public int wykonajOperacjeMatematycznaMnozenie(int x, int y) {
        return a * b * x * y;
    }

}