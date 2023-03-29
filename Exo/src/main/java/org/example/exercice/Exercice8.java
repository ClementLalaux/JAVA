package org.example.exercice;

import java.util.Scanner;

public class Exercice8 {

    public static void Categorie() {
        int age;

        System.out.println("Entrez votre age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        System.out.println("Vous etes : " + (age == 6 || age == 7 ? "Poussin" : age == 8 || age == 9 ? "Pupille" :
                age == 10 || age == 11 ? "Minime" : age == 12 ? "Cadet" : "Pas de catégories"));

    }
}
