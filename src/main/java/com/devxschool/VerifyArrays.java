package com.devxschool;

public class VerifyArrays {
    public static void main(String[] args) {
        /**
         * Write a program that checks if the given two arrays are equal
         *
         * Values and indexes must match.
         * must be case-sensitive
         *
         * EX:
         * String[] arr1 = new String[]{"A", "B", "C"};
         * String[] arr2 = new String[]{"A", "B", "C"}
         *
         * true
         *
         * EX2:
         * String[] arr2 = new String[]{"A", "B", "C"};
         * String[] arr3 = new String[]{"B", "B", "A"};
         *
         * false
         */

        //TODO WRITE YOUR CODE HERE
        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"B", "B", "C"};

        System.out.println(areEqual(arr1, arr2));
    }

    public static boolean areEqual(String[] arr1, String[] arr2) {
        //TODO IMPLEMENT THIS METHOD
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}
