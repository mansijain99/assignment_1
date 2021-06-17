/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class DateMainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDateP d = new MyDateP();//invoking default constructor
		d.printDate();
		
		MyDateP s = new MyDateP(8,6,2021);//invoking parameterized constructor
		s.printDate();

	}

}
