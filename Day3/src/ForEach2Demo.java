/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2D array initialization using new keyword
		int arr[][] = new int[2][4];
		arr[0][1]=1;
		arr[1][1]=2;
		
		
        //for-each loop
		for (int []a:arr)
			for(int b:a)
				System.out.println("Array: "+b);
		System.out.println("---------------------");
				
			
		//2D array initialization without using new keyword	
		int arr2[][] = { { 1, 2 }, { 20, 40, 50, 60 } };

		for (int []c:arr2)
			for(int d:c)
				System.out.println("Array is: "+d);

	}

}
