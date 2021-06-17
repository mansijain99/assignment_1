/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 11-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp;

public class WageEmp extends Employee {
	//variable declaration
	private int noOfHours;
	private float ratePerHour;
	
	//default constructor
	public WageEmp() {
		noOfHours = 2;
		ratePerHour = 1.5f;
	}
	
	//parameterized constructor
	public WageEmp(int empId,String name,int hours,float rate) {
		super(empId,name);
		this.noOfHours = hours;
		this.ratePerHour=rate;
	}
	//calculate total wage
	public void calculateWage() {
		System.out.println("Total Wage: "+(noOfHours*ratePerHour));
	}
	//overridden display method 
	public void display() {
		super.display();
	}
	//overridden toString method
	public String toString() {
		return super.toString();
	}

}
