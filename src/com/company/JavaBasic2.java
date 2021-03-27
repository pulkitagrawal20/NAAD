//program to add two integers:
package com.company;

import java.util.Scanner;

public class JavaBasic2 {
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1= s.nextInt();
        System.out.println("Enter second integer:");
        num2= s.nextInt();
        s.close();
        num3=num1+num2;
        System.out.println("sum of the entered integer is:"+num3);
    }
}
