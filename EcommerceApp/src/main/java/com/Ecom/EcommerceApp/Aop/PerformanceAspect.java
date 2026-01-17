package com.Ecom.EcommerceApp.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Aspect
public class PerformanceAspect {

	private final static Logger LOGGER = LoggerFactory.getLogger(logsAspect.class);
	
	@Around("execution(* com.Ecom.EcommerceApp.service.*.*(..))")
	public Object ExecutionTime(ProceedingJoinPoint jp) throws Throwable {
		
		long start = System.currentTimeMillis();
		
		Object ob=jp.proceed();
		long end= System.currentTimeMillis();
		
		LOGGER.info("Time Taken to Execute ⏰ :"+(end-start)+" ms");
		
		return ob;
	}
}
