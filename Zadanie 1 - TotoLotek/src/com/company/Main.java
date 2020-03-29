package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[6];
        Random generator = new Random();

        int i = 0;
        boolean flaga;
        do
        {
            tab[i] = generator.nextInt(49)+1; // od 1 do 49 -> 1=x, 49=y -> (y-x+1)+x

            flaga = true;
            for(int j=0; j<i; j++)
            {
                if(tab[i] == tab[j])
                {
                    flaga = false;
                    break;
                }
            }
            if(flaga) {
                i++;
            }
        } while( i < 6 );

        String wynik = "";
        System.out.println("Wylosowane liczby to:");
        for (int x : tab)
        {
            wynik += x + ", ";
        }
        System.out.print(wynik);
    }
}