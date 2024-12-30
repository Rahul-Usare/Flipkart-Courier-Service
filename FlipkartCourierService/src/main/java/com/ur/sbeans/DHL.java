package com.ur.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL.DHL()");
	}

	@Override
	public String deliver(int oid) {
		return "Order ID "+oid+" Order is set for DHL Courier Service";
	}

}
