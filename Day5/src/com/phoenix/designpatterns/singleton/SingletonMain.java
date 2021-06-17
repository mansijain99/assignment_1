/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun ob1 = Sun.getInstance();
		ob1.giveLight();
		
		Earth ob2 = Earth.getInstance();
		ob2.createLife();
		
		PrimeMinister ob3 = PrimeMinister.getInstance();
		ob3.serveNation();
		
		President ob4 = President.getInstance();
		ob4.representNation();

	}

}
