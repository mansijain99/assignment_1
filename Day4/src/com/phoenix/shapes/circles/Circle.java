/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape {
	
	private float radius;
	
	//default constructor 
	public Circle() {
		radius = 2.0f;
	}
	//parameterized constructor
	public Circle(float radius) {
		this.radius = radius;
	}
	//abstract methods
	public void calculateArea() {
		System.out.println("Area of circle: "+MATH_PI*radius*radius);
	}

	public void calculatePerimeter() {
		System.out.println("Perimeter of circle: "+2*MATH_PI*radius);
		System.out.println();
	}
}
