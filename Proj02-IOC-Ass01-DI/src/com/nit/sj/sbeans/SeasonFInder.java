package com.nit.sj.sbeans;

import java.time.LocalDate;

public class SeasonFInder {

	// Has A property
	private LocalDate date;

	public SeasonFInder() {
		System.out.println("SeasonFInder.SeasonFInder()");
	}

	// Setter Method For Setter Injection
	public void setDate(LocalDate date) {
		System.out.println("SeasonFInder.setDate()");
		this.date = date;
	}

	// Developed the Business Method
	public String findSession(String user) {

		System.out.println("SeasonFInder.findSession()");
		
		// Get Current Hour Of the Day
		int month = date.getMonthValue();

		// Generate The Wish Message

		if (month == 3 || month == 4 || month == 5 || month == 6)
			return "WelCome into Spring Season  " + user;

		else if (month == 10 || month == 7 || month == 8 || month == 9)
			return "WelCome into Summer Season  " + user;

		else
			return "WelCome into Winter Season  " + user;

	}

}
