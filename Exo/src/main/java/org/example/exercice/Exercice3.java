package org.example.exercice;

import java.util.Scanner;

public class Exercice3 {

    public static void TVA(){

        int tva;
        int quantite;
        float prix;

        System.out.println("Entrez la tva ?");
        Scanner sc = new Scanner(System.in);
        tva = sc.nextInt();
        System.out.println("Entrez le nombre de d'articles ?");
        Scanner sc2 = new Scanner(System.in);
        quantite = sc2.nextInt();
        System.out.println("Entrez le prix de l'article ?");
        Scanner sc3 = new Scanner(System.in);
        prix = sc3.nextFloat();

        System.out.println((prix + (prix*tva)/100)*quantite);

    }

}
