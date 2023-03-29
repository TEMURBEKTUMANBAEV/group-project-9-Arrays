package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayHas55Test {
    @Test
    public void checkTest1() {
        int[] arr = {1, 5, 5, 1, 2};
        assertTrue("Following number should return true: 1, 5, 5, 1, 2", ArrayHas55.check(arr));
    }

    @Test
    public void checkTest2() {
        int[] arr = {1, 5, 1, 1, 5};
        assertFalse("Following number should return false: 1, 5, 1, 1, 5", ArrayHas55.check(arr));
    }
}
