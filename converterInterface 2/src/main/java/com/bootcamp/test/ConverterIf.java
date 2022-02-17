package com.bootcamp.test;

public class ConverterIf implements Converter{

	@Override
	public String convertMonth(int monthNumber) {
		if(monthNumber==1)
			return "JANUARY";
		else if(monthNumber==2)
			return "FEBRUARY";
		else if(monthNumber==3)
			return "MARCH";
		else if(monthNumber==4)
			return "APRIL";
		else if(monthNumber==5)
			return "MAY";
		else if(monthNumber==6)
			return "JUNE";
		else if(monthNumber==7)
			return "JULY";
		else if(monthNumber==8)
			return "AUGUST";
		else if(monthNumber==9)
			return "SEPTEMBER";
		else if(monthNumber==10)
			return "OCTOBER";
		else if(monthNumber==11)
			return "NOVEMBER";
		else if(monthNumber==12)
			return "DECEMBER";
		else
			return "INVALID INPUT, VALID MONTHS ARE 1 - 12";
	}

	@Override
	public String convertDay(int dayNumber) {
		
		if(dayNumber==1)
			return "SUNDAY";
		else if(dayNumber==2)
			return "MONDAY";
		else if(dayNumber==3)
			return "TUESDAY";
		else if(dayNumber==4)
			return "WEDNESDAY";
		else if(dayNumber==5)
			return "THURSDAY";
		else if(dayNumber==6)
			return "FRIDAY";
		else if(dayNumber==7)
			return "SATURDAY";
		else
			return "INVALID INPUT, VALID DAYS ARE 1 - 7";
	}

}
