package org.example.exercice;

import java.util.Scanner;

public class Exercice1 {
    public static void Carre(){

        int nombre;

        System.out.println("Quel nombre ?");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();

        System.out.println("Le carré de " + nombre + " = " + (nombre*nombre));

    }
}
