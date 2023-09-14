package com.stackroute.basics;

import java.util.*;
import java.math.BigInteger;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome Palindrome = new Palindrome();
        new Palindrome().getValue();
    }

    // get values from the user using scanner
    public void getValue() {
        Scanner sc = new Scanner(System.in);
    }

    // validate the input using inputValidator and print the error message or the result from palindromeValidator
    public void outputPrinter(String number) {

    }
    // check whether the input is a valid integer and return boolean
    public boolean inputValidator(String number) {
        return true;
    }


    // write logic to check for palindrome using BigInteger & Do-while
    public String palindromeValidator(BigInteger number) {
        BigInteger A  = BigInteger.valueOf(0);
                if((number.compareTo(A)<0)){
                    return "Wrong input, give proper positive integer";
                }
                else if()
        return null;
    }
}
