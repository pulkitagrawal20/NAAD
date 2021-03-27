//Java Program to Check Whether a Number is Even or Odd:
package com.company;

import java.util.Scanner;

public class JavaBasic7 {

    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        num= s.nextInt();
            if (num % 2 == 0)
            {
                System.out.println("Entered number is an Even number:");
            }
            else
            {
                System.out.println("Entered number is an Odd number:");
            }

    }
}
