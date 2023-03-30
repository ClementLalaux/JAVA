package org.example.exercice;

import java.util.Scanner;

public class Exercice19 {
    public static void TableauNotes() {
        int[] notes = new int[10];
        Scanner sc = new Scanner(System.in);
        float moyenne = 0;
        int max=0;
        int min=20;

        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez la note n° " + (i+1));
            notes[i] = sc.nextInt();
            if( notes[i] > max){
                max =  notes[i];
            }
            if( notes[i]<min){
                min =  notes[i];
            }
            moyenne = moyenne +  notes[i];
        }

        System.out.println("La moyenne de l'élève est de : " + moyenne/10);
        System.out.println("La note minimal de l'élève est : " + min);
        System.out.println("La note maximal de l'élève est : " + max);
    }
}
