/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 18-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotable;

public abstract class Planet implements Movable, Rotable, Revolvable {
	private int noOfMoons;
	
	//setter and getter methods
	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	public int getNoofMoons() {
		return noOfMoons;
	}
	
	//abstract method
	protected abstract boolean supportsLife();
	
	
	public String toSting() {
		return "No of Moons: "+noOfMoons;
	}
	
	//invoke interfaces methods
	public void revolve() {
		// TODO Auto-generated method stub

	}


	public void rotate() {
		// TODO Auto-generated method stub

	}


	public void move() {
		// TODO Auto-generated method stub

	}

}
