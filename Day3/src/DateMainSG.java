/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateSG d =new MyDateSG();//invoking default constructor
		
		//invoking all setter and getter methods for all data members
		d.setDay(2);
		d.setMonth(5);
		d.setYear(2020);
		d.getDay();
		d.getMonth();
		d.getYear();
		d.printDate();
		
		MyDateSG s =new MyDateSG(9,6,2021);//invoking parameterized constructor
		
		//invoke getter methods for all data members
		s.getDay();
		s.getMonth();
		s.getYear();
		s.printDate();//invoke printDate method to display date

	}

}
