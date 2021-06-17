/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape {
	private int side;
	
	//default constructor
	public Square() {
		side = 5;
	}
	//parameterized constructor
	public Square(int side) {
		this.side = side;
	}
	//abstract methods
	public void calculateArea() {
		System.out.println("Area of Square: "+side*side);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Square: "+(4*(side)));
	}

}
