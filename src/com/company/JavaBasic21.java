//Java Program to Calculate the Power of a Number:
package com.company;

import java.util.Scanner;

public class JavaBasic21 {
    public static void main(String[] args) {

        int base,exponent,result=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base:");
        base = s.nextInt();
        System.out.println("Enter exponent:");
        exponent = s.nextInt();
        s.close();
        while(exponent!=0){
            result=result*base;
            exponent--;
        }
        System.out.println("Solution="+result);
    }
}
