package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DecimalToBinaryUtilTest {
    @Test
    public void getBinaryOf3Test() {
        int[] actual = DecimalToBinaryUtil.getBinary(3);
        int[] expected = {0,0,0,0,0,0,1,1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getBinaryOf35Test() {
        int[] actual = DecimalToBinaryUtil.getBinary(35);
        int[] expected = {0,0,1,0,0,0,1,1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void getBinaryOf255Test() {
        int[] actual = DecimalToBinaryUtil.getBinary(255);
        int[] expected = {1,1,1,1,1,1,1,1};
        assertArrayEquals(actual, expected);
    }
}
