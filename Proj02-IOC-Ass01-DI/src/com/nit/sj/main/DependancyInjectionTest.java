package com.nit.sj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sj.sbeans.SeasonFInder;

public class DependancyInjectionTest {
	public static void main(String[] args) {
		
		//Ioc Contener
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/sj/cfgs/ApplicationContext.xml");
		
		//Target Spring BEan Object
		Object obj = ctx.getBean("sf");
		
		//TypeCasting - DownCasting 
		SeasonFInder generator = (SeasonFInder)obj;
		
		// Invoke Business Method 
		String result = generator.findSession("Sham");
		System.out.println(result );
		
		//Closed IOC Con
		ctx.close();
		
	}
}
