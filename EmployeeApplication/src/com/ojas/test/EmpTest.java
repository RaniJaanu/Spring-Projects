package com.ojas.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.Department;
import autowiring.Employee;
public class EmpTest {
	

		public static void main(String[] args) {
				ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
				Employee e1 = (Employee)context.getBean("empone");
				System.out.println(e1.toString());
				
				
			}

		}



