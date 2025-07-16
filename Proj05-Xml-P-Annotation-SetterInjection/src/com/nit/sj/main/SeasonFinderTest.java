package com.nit.sj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sj.sbeans.SeasonFinder;

public class SeasonFinderTest {

	public static void main(String[] args) {
		
		System.out.println("SeasonFinderTest.main()");
		
		try(	
		ClassPathXmlApplicationContext cfg = new ClassPathXmlApplicationContext("com/nit/sj/cfg/ApplicationContext.xml");
		){
			
		SeasonFinder finder = cfg.getBean("sf",SeasonFinder.class);
		String result = finder.showSeasonName("Sham");
		System.out.println(result);
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
