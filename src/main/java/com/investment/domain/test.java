package com.investment.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		GetInfo g=(GetInfo)ac.getBean("getInfo");
		System.out.println(g.getStockInfo("INFY.NS").getFields().getSymbol());
	}

}
