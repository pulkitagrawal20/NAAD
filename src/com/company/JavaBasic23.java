//Java Program to Check Whether a Character is Alphabet or Not:
package com.company;

import java.util.Scanner;

public class JavaBasic23 {
    public static void main(String[] args){
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter anything:");
        ch = s. next(). charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z'))
        {
            System.out.println(ch+ "is an Alphabet");
        }
        else
        {
            System.out.println(ch+ "is not an Alphabet");
        }
    }

}
