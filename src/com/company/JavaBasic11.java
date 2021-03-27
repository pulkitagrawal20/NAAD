//Java Program to Remove All Whitespaces from a String:
package com.company;

import java.util.Scanner;

public class JavaBasic11 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter spaced string");
        s1=s.nextLine();
        s2=s1.replaceAll("\\s+","");
        System.out.println("resulted string is:\n"+s2);
    }
}
