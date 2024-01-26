package com.sit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		Employee emp1 = (Employee) container.getBean("emp1");
		System.out.println(emp1);

		Employee emp2 = (Employee) container.getBean("emp2");
		System.out.println(emp2);

	}

}
