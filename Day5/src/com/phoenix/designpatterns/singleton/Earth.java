/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class Earth {
	private static Earth ob;

	private Earth() {
		System.out.println("Earth is created");
	}

	// singleton method
	public static Earth getInstance() {
		if (ob == null) {
			ob = new Earth();
		}
		return ob;
	}

	// concrete method
	public static void createLife() {
		System.out.println("Earth gives life\n");
	}

}
