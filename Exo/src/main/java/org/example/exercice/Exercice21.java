package org.example.exercice;
import java.util.Random;

import java.util.Scanner;

public class Exercice21 {
    public static int[] SizeAleatoire(int taille) {
        int[] newTab = new int[taille];
        Random random = new Random();
        for (int i = 0; i < taille-1; i++) {
            newTab[i] = random.nextInt(20);
        }
        return newTab;
    }

    public static int[] SizeDouble(int[] tab) {
        int[] newTab = new int[(tab.length*2)];
        for (int i = 0; i < tab.length-1; i++) {
            newTab[i] = tab[i];
        }
        int j = 0;
        for (int i = tab.length-1; i < newTab.length; i++) {
            newTab[i] = newTab[j]*2;
            j++;
        }
        return newTab;
    }

    public static void Table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une taille");
        int taille = sc.nextInt();
        int[] tFinal;
        tFinal = SizeDouble(SizeAleatoire(taille));

        for (int i = 0; i < tFinal.length; i++) {
            System.out.print(tFinal[i] + " , ");
        }
    }
}
