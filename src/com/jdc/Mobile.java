package com.jdc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
			System.out.println("Configuration file Loaded");
			Sim a = (Sim) context.getBean("Sim");
			a.calling();
			a.data();
	
	}
}
