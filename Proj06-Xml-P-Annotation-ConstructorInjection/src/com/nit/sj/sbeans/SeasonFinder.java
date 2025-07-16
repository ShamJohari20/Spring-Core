package com.nit.sj.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private LocalDate date;
	
	
	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()");
	}

	@Autowired
	public void setLocalDate(LocalDate date) {
		System.out.println("SeasonFinder.setLocalDate()");
		this.date = date;
	}
	
	public String showSeasonName(String name) {
		System.out.println("SeasonFinder.showSeasonName()");
		int month = date.getMonthValue();
		
		if (month>=3 && month<=6) {
			return "Happy Summer Season " + name;
		}
		else if (month>=7 && month<=10) {
			return "Happy Ranny Season " + name;
		}
		else {
			return "Happy Winter Season " + name;
		}
	}

}
