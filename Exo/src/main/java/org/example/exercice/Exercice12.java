package org.example.exercice;

import java.util.Scanner;

public class Exercice12 {
    public static void Somme() {
        int nb;
        int res = 0;
        String concat = "";

        System.out.println("Entrez un nombre");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextInt();

        for (int i = 1; i <= nb; i++) {
            res = res + i;
            if(i !=nb){
                concat = concat+i + " + ";
            } else {
                concat = concat + i + " = " + res;
            }
        }
        System.out.println(concat);
    }
}
