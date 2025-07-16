package com.nit.sj.main;

import com.nit.sj.comps.ICar;
import com.nit.sj.factory.MarutiCarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		System.out.println("FactoryPatternTest.main()");
		
		ICar MScar = MarutiCarFactory.orderCar("MSwift");
		MScar.carOrder();
		MScar.carDrive();
		System.out.println("===================================");
		
		ICar MAcar = MarutiCarFactory.orderCar("MAlto");
		MAcar.carOrder();
		MAcar.carDrive();
		System.out.println("===================================");
		
		ICar MVcar = MarutiCarFactory.orderCar("MVitara");
		MVcar.carOrder();
		MVcar.carDrive();
		System.out.println("===================================");
	}

}
