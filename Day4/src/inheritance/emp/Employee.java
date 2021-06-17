/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 11-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp;

public class Employee {
	//variable declaration
	private int empId;
	private String name;
	private double salary;
	
	//default constructor
	public Employee(){
		//System.out.println("Default constructor");
	}
	
	//parameterized constructor
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	//display employee details
	protected void display() {
		System.out.println("Emp Id: "+empId+"\tName: "+name+"\tSalary: "+salary);
	}
	
	public String toString() {
		return "Emp Id: "+empId+"Name: "+name+"Salary: "+salary;
	}

}
