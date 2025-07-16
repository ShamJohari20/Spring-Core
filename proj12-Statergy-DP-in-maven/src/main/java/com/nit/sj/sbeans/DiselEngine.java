/**
 * 
 */
package com.nit.sj.sbeans;

import org.springframework.stereotype.Component;

@Component("de")
public class DiselEngine implements IEngine {
	
	public DiselEngine() {
	System.out.println("DiselEngine.DiselEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("DiselEngine.startEngine()");
		System.out.println("Diseal Engine Is Started");
	}

	@Override
	public void stopEngine() {
		System.out.println("DiselEngine.stopEngine()");
		System.out.println("Diseal Engine Is Stop");
	}

}
