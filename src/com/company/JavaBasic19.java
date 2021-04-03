//Java Program to Count Number of Digits in an Integer:
package com.company;
import java.util.Scanner;

public class JavaBasic19 {
    public static void main(String[] args){

        int count = 0, num ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a digit ");
        num= s.nextInt();
        while (num != 0) {
            num =num/10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}


