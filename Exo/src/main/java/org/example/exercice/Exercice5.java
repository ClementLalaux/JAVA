package org.example.exercice;

import java.util.Scanner;

public class Exercice5 {

    public static void Produit() {
        int nba;
        int nbb;

        System.out.println("Entrez le nb a?");
        Scanner sc = new Scanner(System.in);
        nba = sc.nextInt();

        System.out.println("Entrez le nb b?");
        Scanner scb = new Scanner(System.in);
        nbb = scb.nextInt();

        System.out.println((nba * nbb) > 0 ? "Supérieur à 0" : (nba * nbb) == 0 ? "Egal à 0" : "Inférieur à 0");
    }
}
