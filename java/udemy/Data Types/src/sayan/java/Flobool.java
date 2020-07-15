package sayan.java;

public class Flobool {
    public static void main(String[] args) {
        char myChar='D';
        char myUnicodeChar='\u0044';
        char myUni='\u00B5';
//        char myName='\u09B8';
//        char myName1='\u09BE';
//        char myName2='\u09DF';
//        char myName3='\u09A8';
        System.out.println(myUni);
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
//        System.out.println(myName+myName1+myName2+myName3);

        boolean trueVal=true;
        boolean falVal=false;
        boolean isCustomerOverTwentyOne=true;

    }
}

//NOTES-->

//char data-type is of 2 byte because it stores unicode in the memory

//unicode-international encoding for use with diff languages and scripts by which each letter, digit, symbol is assigned a unique numeric value that applies across diff platforms and programs

//Output--->
//µ
//D
//D