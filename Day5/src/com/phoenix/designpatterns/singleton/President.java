/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class President {
	private static President ob;

	private President() {
		System.out.println("President is created");
	}

	// singleton method
	public static President getInstance() {
		if (ob == null) {
			ob = new President();
		}
		return ob;
	}

	// concrete method
	public static void representNation() {
		System.out.println("President represent to the nation");
	}

}
