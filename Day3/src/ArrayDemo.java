/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array initialization using new keyword
		int arr[] = new int [5];
		
		//traditional for loop
		for (int i=0;i<arr.length;i++) {
			System.out.println("Array is: "+arr[i]);
		}
		
		//array initialization without using new keyword
		int arr1[] = {1,2,3,4,5};
		System.out.println("---------------------");
		
		//traditional for loop
		for(int i=0;i<arr1.length;i++) {
			System.out.println("\nArray is: "+arr1[i]);
		}
		
		//array initialization for cities
		String arr2[] = {"Ahmedabad","Surat","Vadodara","Pune","Bengaluru"};
		System.out.println("---------------------");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("\nCity Name: "+arr2[i]);
		}
		
		//array initialization for hobbies
		String arr3[] = new String[3];
		arr3[0] = "Travelling";
		arr3[1] = "Book reading";
		arr3[2] = "Watching Movies"; 
		System.out.println("---------------------");
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println("\nHobbies: "+arr3[i]);
		}
		
	}

}