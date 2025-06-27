package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Car bc = con.getBean(Car.class);
		bc.Drive();
		
	}
}
