package org.example.exercice;

public class Exercice23 {
    public static void Triage() {
        boolean condition = true;

        int[] tableau = {1,3,5,7,5};

        for (int i = 0; i <tableau.length-1 ; i++) {
            if(tableau[i] > tableau[i+1]){
                condition = false;
                break;
            }
        }
        System.out.println((condition ? "Trié" : "Pas trié" ) + " dans l'ordre croissant");
    }
}
