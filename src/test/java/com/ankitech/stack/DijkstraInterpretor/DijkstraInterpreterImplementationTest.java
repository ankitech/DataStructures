package com.ankitech.stack.DijkstraInterpretor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DijkstraInterpreterImplementationTest {

    @Test
    public void algorithm() {
        //                         5     *     35
        String expression = "( ( 2 + 3 ) * ( 5 * 7 ) )";

        assertEquals(175, DijkstraInterpreterImplementation.algorithm(expression));
    }
}