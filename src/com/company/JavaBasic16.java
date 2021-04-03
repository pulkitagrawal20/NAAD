//Java Program to Check Whether a Number is Positive or Negative:
package com.company;

import java.util.Scanner;

public class JavaBasic16 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        num = s.nextInt();
        if(num>0)
        {
            System.out.println("This is a Positive Number:");
        }
        else if(num<0)
            {
                System.out.println("This is a Negative Number:");
        }
        else
        {
            System.out.println("number is 0:");
        }
    }
}