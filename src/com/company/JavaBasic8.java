package com.company;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args){
        {

            char c= 'd';
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println(c+ " is a vowel");
                    break;
                default:
                    System.out.println(c+ " is a consonant");
            }
        }
    }
}
