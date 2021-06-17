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

public class RTTIMain {
	
	public static void showEmpInfo(Employee emp) {
		//emp.display();
		
		//using instance-of operator
		if(emp instanceof Manager) {
			((Manager)emp).showIncentives();//type casting for special method of Manager class
		}
		if(emp instanceof WageEmp) {
			((WageEmp)emp).calculateWage();//type casting for special method of Manager class
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(222,"PQR",5000.00,5.6);//parameterized constructor
		showEmpInfo(m);
		
		WageEmp w = new WageEmp(777,"DEF",5,3.3f);//parameterized constructor
		showEmpInfo(w);


	}

}
