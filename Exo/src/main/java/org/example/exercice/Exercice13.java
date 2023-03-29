package org.example.exercice;

import java.util.Scanner;

public class Exercice13 {
    public static void Comptage() {
        String phrase;
        System.out.println("Entrez votre phrase");
        Scanner sc = new Scanner(System.in);
        phrase = sc.nextLine();
        System.out.println(phrase.split(" ").length);
    }
}
