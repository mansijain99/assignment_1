/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class MyDate {
	//variable initialization
	private int day,month,year;
	
	//create method initDate for MyDate class
	public void initDate() {
		day = 8;
		month = 6;
		year = 2021;
	}
	//create method printDate and display the date 
	public void printDate() {
		System.out.println("Date is:"+day
				                     +"/"+month
				                     +"/"+year);
	}

}
