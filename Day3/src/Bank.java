

/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Interest Rate is: "+Account.getInterestRate());
		
		//create a object of Account class using default constructor
		Account a = new Account();
		
		//invoke setter and getter methods
		a.setAccNo(1008);
		a.setOwnerName("Mansi Jain");
		a.setBalnce(30000);
		a.setDurationYears(2);
		//a.setinterestRate(1.5f);
		
		System.out.println("Acoount No: "+a.getAccNo());
		System.out.println("Owner Name: "+a.getOwnerName());
		System.out.println("Balance: "+a.getBalance());
		System.out.println("Duration Years: "+a.getDurationYears());
		System.out.println("Interest Rate: "+a.getInterestRate());
		a.calculateInterest();
		
		//create object using parameterized constructor
		Account c = new Account(1009,"Mahi",40000,5);
		c.printDetails();
		
		
		//count the object of Account class
		System.out.println("No. of Account object: "+Account.getCount());
		

	}

}







	
