package org.example.exercice;

import java.util.Scanner;

public class Exercice11 {
    public static void TableDeMultiplication() {
        int nb;

        System.out.println("Entrez un nombre");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(nb + " x "+ i + " = "+ i*nb );
        }

    }
}
