package org.example.exercice;

import java.util.Scanner;

public class Exercice20 {
    public static void Decalage() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un mot");
        String motADecaler = sc.next();

        String[] motA = motADecaler.split("");
        String[] motB = new String[motADecaler.length()];

        for (int i = 0; i < motADecaler.length()-1; i++) {
            motB[i] = motA[i+1];
        }

        motB[motADecaler.length()-1] = motA[0];

        for (int i = 0; i < motB.length; i++) {
            System.out.print(motB[i]);
        }
    }
}
