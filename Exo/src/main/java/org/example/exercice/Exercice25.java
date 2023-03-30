package org.example.exercice;

import java.util.Arrays;

public class Exercice25 {
    public static void TrieSelection() {

        int[] tableau = {1,3,2,7,6};

        for (int i = 0; i <tableau.length-1 ; i++) {
            int index = i ;
            for(int j = i+1;j<tableau.length;j++){
                if(tableau[j]<tableau[index]){
                    index = j;
                }
            }
            int tmp = tableau[index];
            tableau[index] = tableau[i];
            tableau[i] = tmp;
        }
        System.out.println(Arrays.toString(tableau));
    }
}
