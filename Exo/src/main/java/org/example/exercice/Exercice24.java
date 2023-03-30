package org.example.exercice;

import java.util.Arrays;

public class Exercice24 {
    public static void Inversion() {

        int[] tableau = {1,3,5,7,9};

        for (int i = 0; i <tableau.length/2 ; i++) {
            int tmp = tableau[tableau.length-1-i] ;
            tableau[tableau.length-1-i] = tableau[i];
            tableau[i] = tmp;
        }
        System.out.println(Arrays.toString(tableau));
    }
}
