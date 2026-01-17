package com.Ecom.EcommerceApp.Aop;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.Ecom.EcommerceApp.model.dto.OrderItemRequest;
import com.Ecom.EcommerceApp.model.dto.OrderRequest;

@Component
@Aspect
public class ValidationsAspect {
	
	private final Logger LOGGER= LoggerFactory.getLogger(ValidationsAspect.class);
	
	
	@Around("execution(* com.Ecom.EcommerceApp.service.*.*(..))")
	public Object ValidateInputs(ProceedingJoinPoint Jp) throws Throwable {
		
		LOGGER.info("Validation Called  ✅ "+Jp.getSignature().getName());
		Object[] args=Jp.getArgs().clone();
		
		if(args.length >0 && args[0] instanceof OrderRequest orderRequests) {
			
			
			List<OrderItemRequest> OrderList=new ArrayList<>(orderRequests.items());

			for(int i=0;i<OrderList.size();i++) {
				
				OrderItemRequest req=OrderList.get(i);
				
				if(req.quantity()<0) {
					LOGGER.info("Data Received : "+req);
					LOGGER.info("Order Quantity Cannot Be Less Than Zero!! ❌");
					
					int id=req.productId();
					int qty = 0;
					LOGGER.info("Order Quantity Modified to Zero ✅");

					OrderList.set(i, new OrderItemRequest(id,qty));
				}
			}
			
			OrderRequest updatedRequest = new OrderRequest(
					orderRequests.customerName(),
					orderRequests.email(),
					OrderList
	            );
			args[0] = updatedRequest; 
			
		}
		
		Object ob=Jp.proceed(args);
		
		return ob;
	}
}
