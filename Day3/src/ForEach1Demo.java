/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array initialization using new keyword
		double arr[] = new double[5];

		// traditional for loop
		for (double x:arr)
			System.out.println("Array: "+x);
		
		// array initialization without using new keyword
		float arr1[] = { 1.2f, 2.8f, 3.0f, 4.8f, 5.5f };
		System.out.println("---------------------");

		// traditional for loop
		for (float y:arr1)
			System.out.println("Array: "+y);

		// array initialization for cities
		String arr2[] = { "Rose","Lotus","Marigold","Sunflower" };
		System.out.println("---------------------");

		for (String z:arr2)
			System.out.println("Flowers: "+z);

		// array initialization for hobbies
		String arr3[] = new String[3];
		arr3[0] = "India";
		arr3[1] = "Canada";
		arr3[2] = "Japan";
		System.out.println("---------------------");

		for (String a:arr3)
			System.out.println("Country: "+a);

	}

}
