package org.example.exercice;

import java.util.Scanner;

public class Exercice14 {

    public static void Recurrence() {
        String phrase;
        String lettre;

        System.out.println("Entrez votre phrase");
        Scanner sc = new Scanner(System.in);
        phrase = sc.nextLine();

        System.out.println("Entrez votre lettre");
        Scanner sc2 = new Scanner(System.in);
        lettre = sc.next();

        System.out.println("Occurence de la lettre " + lettre + " = " + phrase.split(lettre).length);
    }

}
