package com.ur.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bdart")
@Primary
public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		return "order id  "+oid+ " order is set for deliver using BlueDart courier Service";
	}

}
