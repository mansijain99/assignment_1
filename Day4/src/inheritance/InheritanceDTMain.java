/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of employee
		Employee ob;
		ob = new Manager(1,"ASP",12000.00,1.3f);//parameterized constructor
		//ob.display();
		
		((Manager)ob).showIncentives();//reference type casting
		
		//create object og WageEmp
		WageEmp obj = new WageEmp(2,"ZZZ",3,5.0f);//parameterized constructor
		
		obj.display();
		WageEmp we = (WageEmp)obj;//reference type casting
		we.calculateWage();

	}

}
