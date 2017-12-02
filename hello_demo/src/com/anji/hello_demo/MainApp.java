package com.anji.hello_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMes();

		/*
		 * XmlBeanFactory factory = new XmlBeanFactory (new
		 * ClassPathResource("Beans.xml")); HelloWorld obj = (HelloWorld)
		 * factory.getBean("helloWorld"); obj.getMes();
		 */
	}
}
