package com.nit.sj.comps;

public class MAlto implements ICar {
	
	public MAlto() {
		System.out.println("MAlto.MAlto()");
	}

	@Override
	public void carOrder() {
		System.out.println("MAlto.carOrder()");
	}

	@Override
	public void carDrive() {
		System.out.println("MAlto.carDrive()");

	}

}
