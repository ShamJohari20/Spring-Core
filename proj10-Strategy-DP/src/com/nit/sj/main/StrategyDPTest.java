package com.nit.sj.main;

import com.nit.sj.component.ECommerceStore;
import com.nit.sj.factory.ECommerceFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		System.out.println("StrategyDPTest.main()");
		
		ECommerceStore store = ECommerceFactory.getInstance("dtdc");
		
		String result = store.shopping(new String [] {"Rakhi","Sweet","Dress"}, new double [] {1000.0,5000.0,10000.0});
		
		System.out.println(result);
	}

}
