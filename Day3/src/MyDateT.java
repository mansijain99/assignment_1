/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class MyDateT {
	//variable declaration
		private int day,month,year;
		
		//default constructor
		MyDateT(){
			
		}
		//parameterized constructor
		MyDateT(int day,int month,int year){
			this.day=day;
			this.month=month;
			this.year=year;
		}
		
		//create method printDate and display the date 
		public void printDate() {
			System.out.println("Date is:"+day
					                     +"/"+month
					                     +"/"+year);
		}

}
