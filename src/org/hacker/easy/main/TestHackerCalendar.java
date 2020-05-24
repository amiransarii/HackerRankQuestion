package org.hacker.easy.main;

import java.util.Calendar;
import java.util.Date;

public class TestHackerCalendar {
static	String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	public static void main(String args[]) {
		
		int month = 10;
		int day =  05;
		int year = 2020;
		
		
		
		
		String res = findDay(month,day,year);
		System.out.println(res);
	}
	
	
	public static String findDay(int month, int day, int year) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month -1, day);
		
		String res =days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
		res.toUpperCase();
		return res.toUpperCase();
		
	}
}
