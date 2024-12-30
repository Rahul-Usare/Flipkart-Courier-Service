package com.ur.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {
	
		public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid) {
		return "order id  "+oid+ " order is set for deliver using DTDC courier Service";
	}

}

