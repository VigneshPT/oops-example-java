package org.amdocs;

public class DryExample {
	public static void main(String[] args) {
		
		MyDate myDate = new MyDate();
		myDate.setYear(2017);
		myDate.setMonth(15);
		myDate.setDay(21);
		myDate.isLeapYear();
		System.out.println(myDate.getYear() + " " + myDate.getMonth() + " " + myDate.getDay());

		MyDate myDate2 = new MyDate();
		myDate2.setYear(2018);
		myDate2.setMonth(9);
		myDate2.setDay(9);
		myDate2.isLeapYear();
		System.out.println(myDate2.getYear() + " " + myDate2.getMonth() + " " + myDate2.getDay());
		
		//TODO: create two more copies like this..
		/**
		 * 1. Create one more private field in MyDate object called `era` like "AD", "BC"
		 * 2. To print that value, you need to change it in all the places where we have printed. 
		 * 3. Start changing the code to add it in all those places, and explain.. 
		 * 4. create a static `printMyDateObject` method and put the common printing code there. 
		 * 5. Add one more private field, `dayOfTheWeek`, add getters setters, etc. 
		 * 6. Now show how easy it is to modify the print, to add the new variable. 
		 * 
		 * further refactor to implement the print as a toString() method of the MyDate class.
		 */
	}
		
}

class MyDate {

	private long year;
	private int month;
	private int day;
	
	
	boolean isLeapYear() {
		return this.year % 4 == 0;
	};
	
	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
