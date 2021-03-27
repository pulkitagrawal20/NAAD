//Java Program to Compute Quotient and Remainder:
package com.company;

import java.util.Scanner;

public class JavaBasic5 {
    public static void main(String[] args){
        float dividend,quotient,remainder,divisor;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter dividend:");
        dividend= s.nextInt();
        System.out.println("Enter divisor:");
        divisor= s.nextInt();
        s.close();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);

    }
}
