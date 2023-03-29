package com.devxschool;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinaryUtil {
    public static void main(String... args) {
        /**
         * Binary number is a number expressed in the base-2 numeral system
         * which only use two symbols: 0 and 1
         * each digit is referred as a bit

         * Given an int variable decimal, write a program to calculate binary value
         * of the decimal variable and assign it to binary array.
         * print out value of binary array matching below format:
         * decimal -> 3
         * binary -> [0, 0, 0, 0, 0, 0, 1, 1]
         *            128, 64 32 16 8 4 2 1
         * decimal -> 255
         * binary -> [1, 1, 1, 1, 1, 1, 1, 1]
         *            // 255/128 = 1
         *            //255 % 128 = 127
         *            127 /64 = 1
         *            127 % 64 = 63

         * https://www.binaryhexconverter.com/decimal-to-binary-converter -- check this site for seeing conversions
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        int decimal = scanner.nextInt();
        int[] binary = getBinary(decimal);

        System.out.println(Arrays.toString(binary));
    }

    public static int[] getBinary(int decimal) {
        //TODO IMPLEMENT THIS METHOD
        int[] binary = new int[8];
        int index = binary.length - 1;

        while (decimal > 0 && index >= 0) {
            binary[index--] = decimal % 2;
            decimal /= 2;
        }
        return binary;
    }
}
