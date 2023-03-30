package org.example.exercice;

import java.util.Arrays;

public class Exercice28 {
    public static void RemplirMatrice() {
        int tmp = 1;
        float moy = 0;
        float somme = 1;
        int[][] tableau = new int[4][5];

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = tmp++;
                moy=moy+tmp;
                somme = somme*tmp;
            }
        }

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(Arrays.toString(tableau[i]));
        }
        System.out.println("La moyenne de la matrice est de "+(moy/20));
        System.out.println("La somme de la matrice est de "+moy);
        System.out.println("Le produit de la matrice est de "+somme);
    }
}
