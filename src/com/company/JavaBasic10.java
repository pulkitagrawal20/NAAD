package com.company;

import java.util.Scanner;

public class JavaBasic10 {
    public static void main(String[] args){
        double a,b,c,d,root1,root2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number a:");
        a= s.nextInt();
        System.out.println("Enter number b:");
        b= s.nextInt();
        System.out.println("Enter number c:");
        c= s.nextInt();
        s.close();
        d= b*b - 4*a*c;
        if(d>0){
            System.out.println("roots are real and different \n");
            root1=(-b + Math.sqrt(d))/(2*a);
            root2=(-b - Math.sqrt(d))/(2*a);
            System.out.println("roots are:"+root1+" And "+root2);
        }
        else if(d==0)
        {
            System.out.println("roots are real and same \n");
            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2 ="+root1);
        }

    }
}
