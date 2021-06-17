/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.Scanner;
public class Palindrome {
	
	//Create checkPalindrome method 
	public static boolean checkPalindrome(String str) {
		
       //initialize the variables
	   //initialize the length of a string
        int i = 0, j = str.length() - 1;
 
        //characters to compare
        while (i < j) {
 
            // check if there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment and decrement the variable
            i++;
            j--;
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to check if it is palindrome or not:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(checkPalindrome(str)) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}
		
		
	}

}
