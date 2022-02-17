package com.company;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Calculator1Test {

    @Test
        public void add_TwoPlusTwo_ReturnsFour(){
                final int expected =4;
                final int actual =Math.add(2,2);
                assertEquals(actual,expected);
        }

    }

