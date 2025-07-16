package com.nit.sj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("v")
public class Vehicle {
	@Autowired
	@Qualifier("pe")
	IEngine engine ;
	
	public String jounery(String from, String to) {
		System.out.println("Vehicle.jounery()");
		
		engine.startEngine();
		engine.stopEngine();
		return "Happy jounery " + from + " to " + to;

	}
	
}

