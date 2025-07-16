package com.nit.sj.comps;

public class MVitara implements ICar {

	public MVitara() {
			System.out.println("MVitara.MVitara()");
	}

	@Override
	public void carOrder() {
		System.out.println("MVitara.carOrder() Order MSwift");

	}
	
	@Override
	public void carDrive() {
		System.out.println("MVitara.carDrive() Driving MSwift");
	}

}

