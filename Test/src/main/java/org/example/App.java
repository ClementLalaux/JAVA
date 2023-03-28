package org.example;

import org.example.models.Maison;
import org.example.operator.Operator;
import org.example.variables.Variable;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Variable.getVariable();
        //Operator.getOperators();

        Maison maison1 = new Maison(10,"Ma maison1");
        Maison maison2 = new Maison(100,"Ma maison2");

        demoSystem();

    }
    public static void demoSystem(){
        int nombre;

        System.out.println("Quel age ?");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();

        System.out.println("J'ai " + nombre + " ans.");
    }
}
