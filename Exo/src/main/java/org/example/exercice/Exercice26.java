package org.example.exercice;

import java.util.Arrays;

public class Exercice26 {
    public static void TrieABulle() {

        int[] tableau = {1,3,2,7,6};

        int taille = tableau.length;
        int tmp = 0;
        for(int i=0; i < taille; i++)
        {
            for(int j=1; j < (taille-i); j++)
            {
                if(tableau[j-1] > tableau[j])
                {
                    tmp = tableau[j-1];
                    tableau[j-1] = tableau[j];
                    tableau[j] = tmp;
                }

            }
        }
        System.out.println(Arrays.toString(tableau));
    }
}
