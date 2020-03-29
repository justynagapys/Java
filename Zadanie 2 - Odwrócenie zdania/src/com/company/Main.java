package com.company;

import java.io.Console;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Wprowadź zdanie:");
        String [] text = skan.nextLine().split(" ");
        String [] zdanie = new String [text.length];

        for (int i = 0; i < text.length; i++)
        {
            zdanie[i] = text[i];
        }
        for(int j=0; j<zdanie.length/2; j++){
            String temp = zdanie[j];
            zdanie[j] = zdanie[zdanie.length -j -1];
            zdanie[zdanie.length -j -1] = temp;
        }

        System.out.println("Odwrócone zdanie:");
        for (String x : zdanie)
        {
            System.out.print(x + " ");
        }    }
}
