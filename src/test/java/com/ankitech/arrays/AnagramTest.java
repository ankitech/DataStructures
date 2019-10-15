package com.ankitech.arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void checkPositive(){
        assertTrue(Anagram.checkAnagram("fluster","restful"));
    }

    @Test
    public void checkNegative(){
        assertFalse(Anagram.checkAnagram("ankit","kumar"));
    }

    @Test
    public void checkSizeDifferent(){
        assertFalse(Anagram.checkAnagram("ankit","Kum"));
    }
}
