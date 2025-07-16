/**
 * 
 */
package com.nit.sj.sbeans;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
	System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine.startEngine()");
		System.out.println("Petrol ENgine Is Started ");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine.stopEngine()");
		System.out.println("Petrol ENgine Is Stop ");
	}

}
