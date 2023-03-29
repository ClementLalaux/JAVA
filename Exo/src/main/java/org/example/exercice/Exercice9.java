package org.example.exercice;

import java.util.Scanner;

public class Exercice9 {
    public static void DivisibleParTrois() {
        int nb;

        System.out.println("Entrez un nombre");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextInt();

        System.out.println("Le nombre " + nb + (nb%3==0 ? " est divisible par 3" : " n'est pas divisible par 3"));

    }
}
