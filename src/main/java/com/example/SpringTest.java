package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		com.example1.Address address = (com.example1.Address) context.getBean("address", com.example1.Address.class);

		String[] beans = context.getBeanDefinitionNames();

		for (String bean : beans) {
			System.out.println(bean);
		}

	}

}
