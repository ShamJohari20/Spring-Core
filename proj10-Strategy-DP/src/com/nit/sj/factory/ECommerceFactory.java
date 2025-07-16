package com.nit.sj.factory;

import com.nit.sj.component.DHL;
import com.nit.sj.component.DTDC;
import com.nit.sj.component.ECommerceStore;
import com.nit.sj.component.ICourier;

public class ECommerceFactory {

	public static ECommerceStore getInstance(String courierType) {
		
		ICourier courier = null;
		
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		
		// create target class object
		
		ECommerceStore store = new ECommerceStore();
		store.setCourier(courier);
		
		return store;
		
	}
}
