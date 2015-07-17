package com.investment;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.investment.domain.GetInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/resources/beans.xml"})
public class Tests {

	@Autowired
	protected ApplicationContext ac;
	
	@Test
	public void testResourceNotNull(){
		GetInfo info=(GetInfo)ac.getBean("getInfo");
		String symbol="INFY.NS";
		assertNotNull(info.getStockInfo(symbol));
		//assert(info.getStockInfo(symbol).getFields().getSymbol().equals(symbol));
	}
	
}
