package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VerifyArraysTest {
    @Test
    public void areEqualTest1() {
        String[] arr1 = new String[]{"1", "2", "3"};
        String[] arr2 = new String[]{"1", "2", "3"};
        assertTrue("Given array's values should be equal", VerifyArrays.areEqual(arr1, arr2));
    }

    @Test
    public void areEqualTest2() {
        String[] arr1 = new String[]{"1", "2"};
        String[] arr2 = new String[]{"1", "2", "3"};
        assertFalse("First has 2 items, Second has 3 items", VerifyArrays.areEqual(arr1, arr2));
    }

    @Test
    public void areEqualTest3() {
        String[] arr1 = new String[]{"A"};
        String[] arr2 = new String[]{"A"};
        assertTrue("Given array's values should be equal", VerifyArrays.areEqual(arr1, arr2));
    }

    @Test
    public void areEqualTest4() {
        String[] arr1 = new String[0];
        String[] arr2 = new String[]{"A"};
        assertFalse("First has 0 items, Second has 1 item", VerifyArrays.areEqual(arr1, arr2));
    }

    @Test
    public void areEqualTest5() {
        String[] arr1 = new String[]{"1"};
        String[] arr2 = new String[]{"A"};
        assertFalse("Given array's values should not be equal", VerifyArrays.areEqual(arr1, arr2));
    }
}
