/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.covariant;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData ed = new EmployeeData();
		Employee e = ed.getEmployee();
		//e.display();
		
		ManagerData md = new ManagerData();
		Manager m = md.getEmployee();
		m.display();
		
		WageEmpData wd = new WageEmpData();
		WageEmp w = wd.getEmployee();
		w.display();

	}

}
