package com.company;

import java.util.Scanner;

public class JavaBasic14 {
    public static void main(String[] args){
        String a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        a= s.nextLine();
        if(a==null)
        {
            System.out.println("NULL");
        }
        else if(a.isEmpty()){
            System.out.println("the string is Empty:");
        }
        else
        {
            System.out.println("Neither Empty nor Null:");
        }
        }
}
