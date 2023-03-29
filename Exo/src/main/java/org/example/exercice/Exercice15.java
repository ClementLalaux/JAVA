package org.example.exercice;

import java.util.Scanner;

public class Exercice15 {

    public static void Anagramme() {
        String mot1;
        String mot2;
        Boolean res = false;

        System.out.println("Entrez votre 1er mot");
        Scanner sc = new Scanner(System.in);
        mot1 = sc.nextLine();

        System.out.println("Entrez votre 1er mot");
        Scanner sc2 = new Scanner(System.in);
        mot2 = sc2.nextLine();

        if(mot1.length() == mot2.length()){
            for (int i = 0; i < mot1.length(); i++) {
                if(!mot2.contains(mot1.split("")[i])){
                    res = true;
                    break;
                }
                if(!mot1.contains(mot2.split("")[i])){
                    res = true;
                    break;
                }
            }
        } else {
            res = true;
        }

        System.out.println(res == true ? "Ce n'est pas un anagramme" : "C'est un anagramme");

    }

}
