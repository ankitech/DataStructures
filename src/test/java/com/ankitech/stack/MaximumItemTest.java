package com.ankitech.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumItemTest {

    @Test
    public void getMax() {

        MaximumItem<Integer> integerMaximumItem = new MaximumItem<>();

        integerMaximumItem.push(5);
        integerMaximumItem.push(7);
        integerMaximumItem.push(9);
        integerMaximumItem.push(1);
        integerMaximumItem.push(3);
        integerMaximumItem.push(4);

        assertEquals(Integer.valueOf(9) , integerMaximumItem.getMax());
    }
}