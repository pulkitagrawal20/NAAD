//Java Program to Round a Number to n Decimal Places:
package com.company;

import java.util.Scanner;

public class JavaBasic13 {
    public static void main(String[] args){
        double n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        n= s.nextDouble();
        System.out.format("the round off digit is =%.2f",n);

    }

}
