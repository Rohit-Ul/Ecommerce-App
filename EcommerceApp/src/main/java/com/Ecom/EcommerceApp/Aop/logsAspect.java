package com.Ecom.EcommerceApp.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class logsAspect {
	
	private static final Logger LOGGER =LoggerFactory.getLogger(logsAspect.class);
	
	@Before("execution(* com.Ecom.EcommerceApp.service.*.*(..))")
	public void BeforeMethodCall(JoinPoint jp) {
		LOGGER.info("Method Called ✅:"+jp.getSignature().getName());
	}
	
	@After("execution(* com.Ecom.EcommerceApp.service.*.*(..))")
	public void AfterMethodCall(JoinPoint jp) {
		LOGGER.info("Method Ended ✅:"+jp.getSignature().getName());
	}
	
	@AfterThrowing("execution(* com.Ecom.EcommerceApp.service.*.*(..))")
	public void AfterThrowingMethodCall(JoinPoint jp) {
		LOGGER.info("☠️☠️☠️☠️ Eroor Occured in ☠️☠️☠️☠️:"+jp.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.Ecom.EcommerceApp.service.*.*(..))")
	public void AfterReturningMethodCall(JoinPoint jp) {
		LOGGER.info("Method Executed ✅ :"+jp.getSignature().getName());
	}
	
	
}
