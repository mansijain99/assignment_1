/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 11-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(102,"Mansi",50000.00);
		//e1.display();
		e1.toString();
		
		System.out.println("Manager's Default constructor");
		Manager m1 = new Manager();
	
		m1.showIncentives();
		m1.display();
		m1.toString();
		
		System.out.println("\nManager's parameterized constructor");
		Manager m2 = new Manager(301,"Abc",10000.00,2.5);
		
		m2.showIncentives();
		m2.display();
		m2.toString();
		
		System.out.println("\nWageEmp's Default constructor");
		WageEmp w1 = new WageEmp();
		
		w1.calculateWage();
		w1.display();
		w1.toString();
		
		System.out.println("\nWageEmp's parameterized constructor");
		WageEmp w2 = new WageEmp(701,"XYZ",3,1.2f);
	
		w2.display();
		w2.toString();

	}

}
