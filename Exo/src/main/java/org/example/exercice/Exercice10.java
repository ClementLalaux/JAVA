package org.example.exercice;

import java.util.Scanner;

public class Exercice10 {
    public static void Photocopie() {
        int nbPhotocopies;

        System.out.println("Entrez un nombre");
        Scanner sc = new Scanner(System.in);
        nbPhotocopies = sc.nextInt();

        System.out.println("Le prix est de : " + (nbPhotocopies>20 ? nbPhotocopies*0.05 :
            nbPhotocopies>=10 && nbPhotocopies<=20 ? nbPhotocopies*0.10 :
            nbPhotocopies*0.15));

    }
}
