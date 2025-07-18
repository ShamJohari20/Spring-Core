package com.nit.sj.factory;

import com.nit.sj.comps.ICar;
import com.nit.sj.comps.MAlto;
import com.nit.sj.comps.MSwift;
import com.nit.sj.comps.MVitara;

public class MarutiCarFactory {
	
	public static ICar orderCar(String model){
		
		System.out.println("MarutiCarFactory.orderCar()");
		
			ICar car = null;

			if (model.equalsIgnoreCase("MSwift"))
					car = new MSwift();
			else if (model.equalsIgnoreCase("MAlto"))
				car = new MAlto();
			else if (model.equalsIgnoreCase("MVitara"))
				car = new MVitara();
			else 
				throw new IllegalArgumentException("Invalid Model Name ");
			return car;
	}
}
