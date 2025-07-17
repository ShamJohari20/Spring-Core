package com.nit.sj.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
public class Printer {
	
	private static Printer INSTANCE;
	private Printer() {
		System.out.println("Private Printer.Printer()");
	}
	
	public static Printer getInstance() {
		System.out.println("Printer.getInstance()");
		if (INSTANCE==null)
			return new Printer();
		return INSTANCE;	
	}
	
	public void printMessage(String msg) {
		System.out.println("Printer.printMessage()");
		System.out.println(msg);
	}
}
