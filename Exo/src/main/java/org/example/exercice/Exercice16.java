package org.example.exercice;

import java.util.Scanner;

public class Exercice16 {
    public static void Palindrome() {
        String mot;
        Boolean res = true;

        System.out.println("Entrez votre mot");
        Scanner sc = new Scanner(System.in);
        mot = sc.next();
        for (int i = 0; i < mot.length(); i++) {
            if(mot.split("")[i] != mot.split("")[mot.length()-i-1]){
                res = true;
            }
        }
        System.out.println(res == false ? "Ce n'est pas un palindrome" : "C'est un palindrome");
    }
}
