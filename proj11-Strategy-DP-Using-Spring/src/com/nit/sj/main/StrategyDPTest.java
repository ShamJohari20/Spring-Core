package com.nit.sj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sj.config.AppConFig;
import com.nit.sj.sbeans.ECommerceStore;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		System.out.println("StrategyDPTest.main()");
		
		try(
			 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConFig.class)	){
			
			ECommerceStore store = ctx.getBean("ecs",ECommerceStore.class);
			
			String result = store.shopping(new String [] {"Rakhi","Sweet","Dress"}, new double [] {1000.0,5000.0,10000.0});
			
			System.out.println(result);
		}
		
		
	}

}
