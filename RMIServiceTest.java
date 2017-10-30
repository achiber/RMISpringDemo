package com.rmi.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServiceTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("rmiServer.xml");
		ICalculateRMIService iCalculateRMIService = applicationContext.getBean("calculateRMIServiceImpl", ICalculateRMIService.class);
		iCalculateRMIService.setAvalue(4);
		iCalculateRMIService.setBvalue(5);
		System.out.println(iCalculateRMIService.get());
		System.out.println("server发布服务成功！");
	}

}
