//Java Program to Find the Largest Among Three Numbers:
package com.company;

import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number a:");
        a= s.nextInt();
        System.out.println("Enter number b:");
        b= s.nextInt();
        System.out.println("Enter number c:");
        c= s.nextInt();
        s.close();
        if(a>=b && a>=c)
        {
            System.out.println("a is the largest:");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("b is the largest:");
        }
        else
        {
            System.out.println("c is the largest:");
        }
    }
}
