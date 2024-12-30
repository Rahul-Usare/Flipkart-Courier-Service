package com.ur.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ur.sbeans.Flipkart;

public class StarategyPatternTest {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext fsc = new 
				ClassPathXmlApplicationContext("ApplicationContext.xml");
		//get target class obj
		Flipkart fpkt = (Flipkart)fsc.getBean("fpkt");
		
		String resultMsg = fpkt.shopping(new String[] {"Book", "mobail", "laptop", "sweeter", "pen"},
                new double[] {500.0, 29999.9, 60400.0,1199.8,50.0});
		
		System.out.println(resultMsg);
		
		fsc.close();

	}//main
}//class
