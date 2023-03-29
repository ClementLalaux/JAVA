package org.example.exercice;

import java.util.Scanner;

public class Exercice4 {

    public static void PositifNegatif(){

        int nb;

        System.out.println("Entrez le nb ?");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextInt();

        System.out.println(nb>0 ? "Supérieur à 0" : nb == 0 ? "Egal à 0" : "Inférieur à 0");

    }

}
