//Java Program to Reverse a Number:
package com.company;

import java.util.Scanner;

public class JavaBasic20 {
    public static void main(String[] args) {

        int num,rev=0,dig;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a digit ");
        num = s.nextInt();
        while(num!=0){
            dig = num % 10;
            rev= rev * 10 + dig;
            num /= 10;
        }
        System.out.println("Reversed Number ="+rev);
    }
}
