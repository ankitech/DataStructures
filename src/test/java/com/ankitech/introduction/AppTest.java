package com.ankitech.introduction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void print() {

        assertEquals("printed", App.print());
    }
}