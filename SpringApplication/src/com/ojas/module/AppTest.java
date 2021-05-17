package com.ojas.module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e1 = (Employee) context.getBean("empone");
		System.out.println(e1.toString());

	}

}
