package org.example.exercice;

import java.util.Arrays;

public class Exercice27 {
    public static void ValeurMaxMatrice() {
        int tmp =0;

        int[][] tableau = {
                {1,3,2,7,6}
                ,{8,9,2,1,6}
                ,{5,2,2,8,6}
            };

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if(tableau[i][j]>tmp){
                    tmp = tableau[i][j];
                }
            }
        }

        System.out.println("La valeur la plus élevée de la matrice est " + tmp);
    }
}
