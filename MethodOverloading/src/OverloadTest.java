/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object(d & s) of MathEngine class so we can display the date
		MathEngine d = new MathEngine();
		
		//invoke multiply method of MathEngine class
		System.out.println(d.multiply(2, 3));
		d.multiply(20, 30, 40);
		System.out.println(d.multiply(2.3f, 5));
		System.out.println(d.multiply(20, 3.5f));
		
		MathEngine s = new MathEngine();
		
		System.out.println(s.multiply(2, 5));
		s.multiply(20, 70, 40);
		System.out.println(s.multiply(2.3f, 10));
		System.out.println(s.multiply(40, 3.5f));

	}

}
