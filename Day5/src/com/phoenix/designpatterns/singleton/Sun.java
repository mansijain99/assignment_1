/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 17-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;
//Singleton class
public class Sun {
	
	private static Sun ob;
	
	private Sun() {
		System.out.println("Sun is created");
	}
	
	//singleton method
	public static Sun getInstance() {
		if(ob == null) {
			ob = new Sun();
		}
		return ob;
	}
	
	//concrete method
	public static void giveLight() {
		System.out.println("Sun gives light\n");
	}

}
