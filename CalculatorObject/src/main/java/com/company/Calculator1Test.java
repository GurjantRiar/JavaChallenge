package com.company;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Calculator1Test {

    @Test
        public void addition_TwoPlusTwo_ReturnsFour(){
                final int expected =4;
                final int actual =Math.addExact(2,2);
                assertEquals(actual,expected);
        }

    @Test
    public void subtract_TwoSubtractTwo_ReturnsZero(){
        final int expected =0;
        final int actual =Math.subtractExact(2,2);
        assertEquals(actual,expected);
    }
    @Test
    public void multiply_TwoMultiplyTwo_ReturnsFour(){
        final int expected =4;
        final int actual =Math.multiplyExact(2,2);
        assertEquals(actual,expected);
    }
    @Test
    public void divide_TwoDivideTwo_ReturnsOne(){
        final int expected =1;
        final int actual =Math.floorDiv(2,2);
        assertEquals(actual,expected);
    }
    }

