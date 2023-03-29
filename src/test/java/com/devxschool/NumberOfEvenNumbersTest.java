package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfEvenNumbersTest {
    @Test
    public void calculateTest1() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int actual = NumberOfEvenNumbers.calculate(arr);

        assertEquals("number of an even numbers in an array is 3",
                 3, actual);
    }

    @Test
    public void calculateTest2() {
        int[] arr = {1};

        int actual = NumberOfEvenNumbers.calculate(arr);

        assertEquals("number of an even numbers in an array is 0",
                 0, actual);
    }

    @Test
    public void calculateTest3() {
        int[] arr = {};

        int actual = NumberOfEvenNumbers.calculate(arr);

        assertEquals("number of an even numbers in an array is 0",
                 0, actual);
    }

    @Test
    public void calculateTest4() {
        int[] arr = {2, 2, 2, 2, 2};

        int actual = NumberOfEvenNumbers.calculate(arr);

        assertEquals("number of an even numbers in an array is 5",
                 5, actual);
    }
}
