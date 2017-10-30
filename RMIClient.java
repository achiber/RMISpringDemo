package com.rmi.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
		HelloRMIService helloRMIService = applicationContext.getBean("myRMIClient", HelloRMIService.class);
		System.out.println("client: " + helloRMIService.getAdd(3, 5));
		
		ICalculateRMIService calculateRMIService = applicationContext.getBean("calculate", ICalculateRMIService.class);
		System.out.println(calculateRMIService.mul(5, 5));
		System.out.println(calculateRMIService.get());
	}
}
