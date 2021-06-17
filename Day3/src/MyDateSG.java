/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class MyDateSG {
	//variable declaration
	private int day,month,year;
	
	//default constructor
	MyDateSG(){
		
	}
	//parameterized constructor
	MyDateSG(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//setter method for date
	public void setDay(int d) {
		this.day=d;
	}
	public void setMonth(int m) {
		this.month=m;
	}
	public void setYear(int y) {
		this.year=y;
	}
	//getter method for data members
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	//create method printDate and display the date 
		public void printDate() {
			System.out.println("Date is:"+day
					                     +"/"+month
					                     +"/"+year);
		}
	
	
}