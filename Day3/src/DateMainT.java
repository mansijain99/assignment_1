/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class DateMainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateT d = new MyDateT();//invoking default constructor
		d.printDate();
		MyDateT s = new MyDateT(9,6,2021);//invoking parameterized constructor
		s.printDate();

	}

}
