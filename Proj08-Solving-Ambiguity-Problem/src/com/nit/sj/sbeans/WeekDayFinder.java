package com.nit.sj.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {

	@Autowired
	@Qualifier("ldate")
	private LocalDate date;
	
	public WeekDayFinder() {
		System.out.println("WeekDayFinder.WeekDayFinder()");
	}
	
	public String showGreetMessage(String name) {
		
		System.out.println("WeekDayFinder.showGreetMessage()");
		int day = date.getDayOfWeek().getValue();
		
		System.out.println(date);
		
		if (day!=6 && day!=7) {
			return "Happy Week Day " + name;
		}else {
			return "Happy Week End  " + name;
		}
		
		
	}
	
}
