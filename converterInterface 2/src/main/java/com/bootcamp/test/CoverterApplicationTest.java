package com.bootcamp.test;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CoverterApplicationTest {

            @Test
            public void addition_TwoPlusTwo_ReturnsFour(){
                final String expected ="FEBRUARY";
                final String actual =new ConverterIf().convertMonth(2) ;
                assertEquals(actual,expected);
            }
    @Test
    public void addition_TwoConvertTwo_ReturnsFour(){
        final String expected ="MONDAY";
        final String actual =new ConverterIf().convertDay(2) ;
        assertEquals(actual,expected);
    }
    @Test
    public void addition_OneConvertTwo_ReturnsFour(){
        final String expected ="FEBRUARY";
        final String actual =new ConverterSwitch().convertMonth(2) ;
        assertEquals(actual,expected);
    }
    @Test
    public void addition_ThreeConvertTwo_ReturnsFour(){
        final String expected ="MONDAY";
        final String actual =new ConverterSwitch().convertDay(2) ;
        assertEquals(actual,expected);
    }

        }

