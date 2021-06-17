/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 17-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.factory.main;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.Sedancar;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String carType = args[0];
		  
		  Car car1 = CarFactory.newCar(carType); 
		  car1.start(); 
		  car1.run(); 
		  car1.stop();
		 
		
		
		/*
		 * Car ob1 = CarFactory.newCar("Sedan"); ob1.start(); ob1.run(); ob1.stop();
		 * System.out.println("-----------------");
		 * 
		 * Car ob2 = CarFactory.newCar("Couple"); ob2.start(); ob2.run(); ob2.stop();
		 * System.out.println("-----------------");
		 * 
		 * Car ob3 = CarFactory.newCar("Sport"); ob3.start(); ob3.run(); ob3.stop();
		 * System.out.println("-----------------");
		 * 
		 * Car ob4 = CarFactory.newCar("Luxury"); ob4.start(); ob4.run(); ob4.stop();
		 */
		
		
		

	}

}
