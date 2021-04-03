//Java Program to Find the Frequency of Character in a String:
package com.company;

public class JavaBasic12 {
    public static void main(String[] args){
        String name="my name is pulkit agrawal";
        char c='a';
        int frequency=0;
        for(int i=0;i<name.length();i++)
        {
            if(c==name.charAt(i)){
                ++frequency;
            }
        }
            System.out.println("Frequency of " +c+ " = " + frequency);
    }
}
