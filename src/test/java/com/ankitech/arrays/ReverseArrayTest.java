package com.ankitech.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArrayTest {

    @Test
    public void reverseTest1() {

        int[] arr = {1,2,3,4,5};
        int[] expected = {5,4,3,2,1};

        assertArrayEquals(expected, ReverseArray.reverse(arr));
    }

    @Test
    public void reverseTest2() {

        int[] arr = {1,2,3,4,5,6};
        int[] expected = {6,5,4,3,2,1};

        assertArrayEquals(expected, ReverseArray.reverse(arr));
    }

    @Test
    public void reverseTest3() {

        int[] arr = {};
        int[] expected = {};

        assertArrayEquals(expected, ReverseArray.reverse(arr));
    }
}