//Java Program to Check Leap Year:

package com.company;

import java.util.Scanner;

public class JavaBasic15 {
    public static void main(String[] args) {
        int y;
        Boolean l=false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year:");
        y = s.nextInt();
        if(y % 4==0){
            if (y % 100 == 0) {

                if (y % 400 == 0)
                    l= true;
                else
                    l= false;
            }

            else
                l= true;
    }

    else
    l= false;

    if (l)
            System.out.println(y+ " is a leap year.");
    else
            System.out.println(y+ " is not a leap year.");

    }
}