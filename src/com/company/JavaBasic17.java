//Java Program to Calculate the Sum of Natural Numbers:
package com.company;

import java.util.Scanner;

public class JavaBasic17 {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a natural number");
        num = s.nextInt();
        for(int i=0;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("sum ="+sum);
    }
}
