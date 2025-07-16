package com.nit.sj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sj.cfg.AppConfig;
import com.nit.sj.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("DependencyInjectionTest.main()");
		try(
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		){
			
			WeekDayFinder finder = ctx.getBean("wdf",WeekDayFinder.class);
			String result = finder.showGreetMessage("Sham");
			
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
