package org.example.exercice;

import java.util.Scanner;

public class Exercice22 {

    public static void Comptage(int value) {
        int cpt = 0;
        int[] tableau = {1,9,2,6,7,2,5,6,1,7,8,6,2};
        for (int i = 0; i <tableau.length ; i++) {
            if(tableau[i] == value){
                cpt++;
            }
        }
        System.out.println("La valeur " + value + " apparait " + cpt + " fois.");
    }

}
