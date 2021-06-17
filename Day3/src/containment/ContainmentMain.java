/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package containment;

import containment.emp.Employee;
import containment.Date.*;

public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpId(701);
		e1.setName("Mahi");
		e1.setBirthDate(MyDate);
		
		System.out.println("empId: "+e1.getEmpId());
		System.out.println("Name: "+e1.getName());
		System.out.println("BirthDate: "+e1.getBirthDate());
		System.out.println(e1.toString());
		
		Employee e2 = new Employee(701,"Mahi",MyDate()); 
		e2.display();
		

	}

}
