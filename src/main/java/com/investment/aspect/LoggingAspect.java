package com.investment.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class LoggingAspect {

	@Before("loggableMethod()")//"execution(public String getPrice())")
	public void logIt(){
		System.out.println("Called before");
		
		//logging messages
	}
	
	
	@Pointcut("@annotation(com.investment.annotations.Loggable)")
	private void loggableMethod(){}
	
}
