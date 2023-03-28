package org.example.operator;

public class Operator {

    public static void getOperators(){
        int i = 10;
        int i2 = -10;
        int i3 = i++;
        int i4 = ++i;
        int i5 = --i;
        int i6 = i--;

        System.out.println(i5);
        System.out.println(i6);
    }

}
