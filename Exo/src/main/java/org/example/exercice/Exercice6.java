package org.example.exercice;

import java.util.Scanner;

public class Exercice6 {

    public static void TrierMot() {
        String[] mots = new String[3];
        String tmp;

        for (int i = 0; i < 3; i++) {
            System.out.println("Entrez le " + i+1 + " mots :");
            Scanner sc = new Scanner(System.in);
            mots[i] = sc.next();
        }

        for (int i=0; i < 3; i++)
        {
            for (int j=i+1; j < 3; j++)
            {
                if (mots[i].compareTo(mots[j]) > 0)
                {
                    tmp = mots[i];
                    mots[i] = mots[j];
                    mots[j] = tmp;
                }
            }
        }
        System.out.print("Liste des mots dans l'ordre trié est : ");
        for (int i=0; i < 3; i++)
        {
            System.out.print(mots[i] + " ");
        }
    }
}
