package org.example.exercice;

import java.util.Scanner;

public class Exercice17 {
    public static void Pyramide() {
        int taille;
        String etoile = "*";
        System.out.println("Entrez la taille de la pyramide");
        Scanner sc = new Scanner(System.in);
        taille = sc.nextInt();

        for (int i = 1; i < taille; i++) {
            System.out.println(etoile.repeat(i));
        }
        for (int i = taille; i > 0; i--) {
            System.out.println(etoile.repeat(i));
        }
    }
}
