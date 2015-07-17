package com.investment.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.investment.domain.objects.Resource;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		//AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		//ac.scan("com.investment");
		GetInfo g=(GetInfo)ac.getBean("getInfo");
		Resource r=g.getStockInfo("INFY.NS");
		System.out.println(r.getFields().getSymbol());
		System.out.println(r.getFields().getVolume());
		System.out.println(r.getFields().getPrice());
	}

}
