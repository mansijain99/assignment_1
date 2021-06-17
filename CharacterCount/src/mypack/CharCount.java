package mypack;
import java.util.Scanner;
public class CharCount {
	
	public static int countChar(String str,char ch) {
		int count = 0;
	  
	    for (int i = 0; i < str.length()-1; i++) {
	        if (str.charAt(i) == ch) {
	            count++;
	        }
	    }
	    return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println("Number of occurance:"+countChar(str,'l'));

	}

}
