package com.ankitech.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DuplicatesTest {

    @Test
    public void testDuplicates(){
        int[] expected = {2,3};
        assertArrayEquals(expected,Duplicates.checkDuplicates(new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void noDuplicates(){
        int[] expected = {};
        assertArrayEquals(expected,Duplicates.checkDuplicates(new int[]{0,1,2,}));
    }

}