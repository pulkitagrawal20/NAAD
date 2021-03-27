//Java Program to Swap Two Numbers:
package com.company;

import java.util.Scanner;

public class JavaBasic6 {
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number a:");
        a= s.nextInt();
        System.out.println("Enter number b:");
        b= s.nextInt();
        s.close();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping a: " +a);
        System.out.println("After Swapping b: " +b);
    }
}
