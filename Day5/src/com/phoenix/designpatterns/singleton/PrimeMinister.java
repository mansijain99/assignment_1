/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	private static PrimeMinister ob;

	private PrimeMinister() {
		System.out.println("PrimeMinister is created");
	}

	// singleton method
	public static PrimeMinister getInstance() {
		if (ob == null) {
			ob = new PrimeMinister();
		}
		return ob;
	}

	// concrete method
	public static void serveNation() {
		System.out.println("PrimeMinister serve to the nation\n");
	}

}
