/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class VarArgDemo {
	
	public static double average(int...x) {
		int n = x.length;
		
		double sum = 0;
		
		for(double i:x)
			sum+=i;
		
		
		double result = sum/n;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(10,20,30,40));

	}

}
