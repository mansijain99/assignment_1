/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
package containment.emp;

import containment.Date.MyDate;

public class Employee {
	//data members
	private int empId;
	private String name;
	
	private MyDate birthDate;
	
	//default constructor
	public Employee() {
		empId = 1001;
		name = "Mansi";
		birthDate = MyDate;
	}
	//parameterized constructor
	public Employee(int empId,String name,Mydate birthDate) {
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public void setEmpId(int e) {
		this.empId = e;
	}
	public void setName(String n) {
		this.name = n;;
	}
	public void setBirthDate(MyDate b) {
		this.birthDate=b;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	
	public void display() {
		System.out.println("empId: "+empId+"\tName: "+name+"\tBirthDate: "+birthDate);
	}
	public String toString() {
		return "EmpId:"+empId+"name:"+name+"Birthdate:"+birthDate;
	}
	
	
	
	

}
