package org.example.exercice;

import java.util.Scanner;

public class Exercice2 {

    public static void Bonjour(){

        String nom;

        System.out.println("Quel est votre prénom ?");
        Scanner sc = new Scanner(System.in);
        nom = sc.next();

        System.out.println("Bonjour " + nom + " !");

    }

}
