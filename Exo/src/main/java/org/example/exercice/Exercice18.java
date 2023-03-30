package org.example.exercice;

import java.util.Scanner;

public class Exercice18 {

    public static  void Rendre(int valeur,int dix, int cinq){
        dix = valeur/10;
        valeur = valeur%10;
        cinq = valeur/5;
        valeur = valeur%5;
        System.out.println("Je vous rends " + dix + " billets de 10, " + cinq + " billets de cinq et " + valeur + " pièces de 1");
    }

    public static void Courses() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int prix;
        int paye;
        int aRendre;
        int billetDeDix = 0;
        int billetDeCinq = 0;


        do{
            System.out.println("Entrez un prix , pour arrêter envoyez 0 ");
            prix = sc.nextInt();
            total = total + prix;

        }while(prix !=0);

        do{
            System.out.println("Vous devez " + total +" , entrez la valeur que vous donnez");
            paye = sc.nextInt();

        }while (paye<total);

        aRendre = paye - total;

        Rendre(aRendre,billetDeDix,billetDeCinq);
    }
}
