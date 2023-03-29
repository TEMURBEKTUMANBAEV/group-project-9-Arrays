package com.devxschool;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        /**
         * Given an array of String, iterate through each word
         * Print first and last letters of each element in a separate line
         */
        String[] words = {"hello", "why", "by", "apple", "note", "aa", "bb", "cc", "dd", "ee"};
        printLetters(words);
    }

    public static void printLetters(String[] words) {
        for (String word : words) {
            System.out.print(word.charAt(0) + "" + word.charAt(word.length() - 1) + " ");
        }
    }
}
