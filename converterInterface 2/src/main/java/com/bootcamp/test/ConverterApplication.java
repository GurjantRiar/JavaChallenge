package com.bootcamp.test;

public class ConverterApplication {
	public static void main(String[] args) {

		Converter converterIf = new ConverterIf();
		Converter converterSwitch = new ConverterSwitch();
		System.out.println("Convert day using converterIf :"+converterIf.convertMonth(2));
		System.out.println("Convert day using converterIf :"+converterIf.convertDay(2));
		System.out.println("Convert day using converterSwitch :"+converterSwitch.convertMonth(2));
		System.out.println("Convert day using converterSwitch :"+converterSwitch.convertDay(2));		
	}

}
