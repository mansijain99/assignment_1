/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape {
	//variable declaration
	private int length;
	private int breadth;
	
	//default constructor
	public Rectangle() {
		length = 5;
		breadth = 10;
	}
	//parameterized constructor
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	//abstract methods
	public void calculateArea() {
		System.out.println("Area of rectangle: "+length*breadth);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of rectangle: "+(2*(length+breadth)));
		System.out.println();
	}
}
