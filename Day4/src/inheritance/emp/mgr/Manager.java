/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 11-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee {
	private double incentives;
	
	//default constructor
	public Manager() {
		incentives = 0.05;
		
	}
	//parameterized constructor
	public Manager(int empId,String name,double salary,double incentives) {
		super(empId,name,salary);
		this.incentives = incentives;
	}
	
	public void showIncentives() {
		System.out.println("Incentives: "+incentives);
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
