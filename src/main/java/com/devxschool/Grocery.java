package com.devxschool;

import java.util.Arrays;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        /**
         * Write a program for a shopping
         * Create a list to go shopping in the grocery
         *
         * ex:
         * How many items do you want to add?
         * 3
         * Please enter item #1
         * watermelon
         * Please enter item #2
         * grapes
         * Please enter item #3
         * yogurt
         * Shopping list: [watermelon, grapes, yogurt]
         */

        Scanner scanner = new Scanner(System.in);
        //TODO WRITE YOUR CODE HERE
        System.out.println("Your list is " + Arrays.toString(createList(scanner)));
    }

    public static String[] createList(Scanner scanner) {
            System.out.println("How many items do you want to add?");
            int num = scanner.nextInt();
            //TODO WRITE YOUR CODE HERE
            String grocery[] = new String[num];

            for (int i = 0; i < num; i++) {
                System.out.println("Please enter item  " + (i + 1));
                grocery[i] = scanner.next();
            }
            // TODO IMPLEMENT THIS METHOD
            return grocery;

        }

    }
