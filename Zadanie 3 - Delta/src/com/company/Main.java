package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;

        try
        {
            Scanner skan = new Scanner(System.in);
            System.out.println("Podaj wartość parametru a:");
            a = skan.nextDouble();

            if (a == 0)
            {
                throw new Exception("Parametr a nie może być równy 0.");
            }

            System.out.println("Podaj wartość parametru b:");
            b = skan.nextDouble();
            System.out.println("Podaj wartość parametru c:");
            c = skan.nextDouble();

            delta = b * b - 4 * a * c;

            if (delta > 0)
            {
                x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
                x2= ((-b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("Równanie ma dwa pierwiastki rzeczywiste: x1= " + x1 + " i x2= " + x2);
            }
            else if (delta == 0)
            {
                x1 = (-b) / (2 * a);
                System.out.println("Równanie ma jeden pierwiastek rzeczywisty: x= " + x1);
            }
            else
            {
                System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
            }

        }
        catch (Exception ex)
        {
            System.out.println("Program nie może obliczyć delty. " + ex.toString());
        }
    }
}