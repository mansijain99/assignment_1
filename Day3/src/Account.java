/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Account {
	//non-static data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//static data members
	private static float interestRate;
	private static int count;
	
	//static-init block initialization
	static {
		interestRate=0.05f;
	}
	
	//default constructor
	Account(){
		accNo = 1008;
		ownerName = "Mansi Jain";
		balance = 20000;
		durationYears = 1;
		count++;
	}
	
	//parameterized constructor
	Account(int accNo,String ownerName,double balance,float durationYears){
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = durationYears;
		count++;
		
	}
	
	//setter method for all data members
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setBalnce(double balance) {
		this.balance = balance;
	}
	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public static int getCount() {
		return count;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public float getDurationYears() {
		return durationYears;
	}
	public static float getInterestRate() {
		return interestRate;
	}
	
	//calculate simple interest
	public void calculateInterest() {
		double total = balance*interestRate*durationYears;
		System.out.println("The Simple interest is: "+total);
	}
	
	//print details of Account
	public void printDetails() {
		System.out.println("\nAccount No.: "+accNo+"\tOwner Name: "+ownerName+"\tBalance: "
	                             +balance+"\tDuration Years:"+durationYears);
	}
	
}






