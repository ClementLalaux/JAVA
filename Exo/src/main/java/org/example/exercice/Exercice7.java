package org.example.exercice;

import java.util.Scanner;

public class Exercice7 {
    public static void DemandeNb() {
        int nb;


        System.out.println("Entrez un nb entre 1 et 3 ?");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextInt();
        while (nb<1 || nb>3){
            System.out.println("Entrez un nb entre 1 et 3");
            nb = sc.nextInt();
        }
        System.out.println("Le nombre choisi est correct");
    }
}
