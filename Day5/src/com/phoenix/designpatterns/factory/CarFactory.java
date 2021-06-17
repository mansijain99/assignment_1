/* 
 * Author: mansi.jain@stltech.in
 * Creation Date: 17-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.Sedancar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {
	
	public static Car newCar(String carType) {
		if(carType.equals("Sedan"))
			return new Sedancar();
		else if(carType.equals("Couple"))
			return new CoupleCar();
		else if(carType.equals("Sport"))
			return new SportCar();
		else if(carType.equals("Luxury"))
			return new LuxuryCar();
		else
			return null;
	}

}
