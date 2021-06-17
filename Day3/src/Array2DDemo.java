/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2D array initialization using new keyword
		int arr[][] = new int [2][4];
		arr[0][1]=40;
		arr[1][1]=33;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("2D Array: "+arr[i][j]);
			}
		}
		System.out.println("----------------------------------");
		
		//2D array initialization without using new keyword
		int arr2[2][4] = {{{1,2,3,4},{4,5,6,7}},{{7,8,9,0},{1,2,3,4}}};
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.println("2D Array: "+arr2[i][j]);
			}
		}
	}

}
