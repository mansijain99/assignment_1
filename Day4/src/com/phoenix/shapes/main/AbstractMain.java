/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 13-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = null;//create reference type
		
		s = new Circle(4.5f);
		s.calculateArea();
		s.calculatePerimeter();
		
		s = new Rectangle(2,4);
		s.calculateArea();
		s.calculatePerimeter();
		
		s = new Square(7);
		s.calculateArea();
		s.calculatePerimeter();

	}

}
