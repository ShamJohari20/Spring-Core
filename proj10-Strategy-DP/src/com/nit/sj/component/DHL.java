package com.nit.sj.component;

public final class DHL implements ICourier {
	@Override
	public String deliverd(int oid) {
		System.out.println("DHL.deliverd()");
		return " having order id " + oid + ", items are kept for deliverd by DHL ";
	}

}

