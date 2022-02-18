package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AddressTest {
	
	   @Test
       public void addition_TwoPlusTwo_ReturnsFour(){
           final String expected ="street1";
           final String actual ="street1" ;
           assertEquals(actual,expected);
       }
	   @Test
       public void addition_onePlusTwo_ReturnsFour(){
           final String expected ="street2";
           final String actual ="street2" ;
           assertEquals(actual,expected);
       }
	   @Test
       public void addition_PlusTwo_ReturnsFour(){
           final String expected ="city";
           final String actual ="city" ;
           assertEquals(actual,expected);
       }
	   @Test
       public void addition_TwoPusTwo_ReturnsFour(){
           final String expected ="zip-code";
           final String actual ="zip-code" ;
           assertEquals(actual,expected);
       }
}
