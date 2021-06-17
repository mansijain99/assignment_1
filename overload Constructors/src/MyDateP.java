/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class MyDateP {
	//variable declaration
	private int day,month,year;
	//default constructor
	MyDateP(){
	System.out.println("Default constructor");
	}
	//parameterized constructor
	MyDateP(int d,int m,int y){
		this.day = d;
		this.month = m;
		this.year = y;
		System.out.println("Parameterized constructor");
	}
	//create method printDate and display the date 
	public void printDate() {
		System.out.println("Date is:"+day
				                     +"/"+month
				                     +"/"+year);
	}
}
