package com.company;

public class Main {

    public static void main(String[] args) {
        int tab[] = {10, 20, 30, 10, 20};
        int szukanyEle = 30;
        WyszukiwanieRownych wR = new WyszukiwanieRownych();
        int index = wR.szukaj(tab, szukanyEle);
        if (index == -1) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Znaleziono w indeksie numer: " + index);
        }
    }
}
abstract class Wyszukiwanie {
    public boolean porownaj(int a, int b) {
        return true;
    }

    public int szukaj(int a[], int ele) {
        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}

class WyszukiwanieRownych extends Wyszukiwanie {
    @Override
    public boolean porownaj(int a, int b) {
        if(a==b){
            return true;
        }
        else{
            return false;
        }
    }
}

class WyszukiwanieNierownych extends Wyszukiwanie {
    @Override
    public boolean porownaj(int a, int b) {
        if(a!=b){
            return true;
        }
        else{
            return false;
        }
    }
}