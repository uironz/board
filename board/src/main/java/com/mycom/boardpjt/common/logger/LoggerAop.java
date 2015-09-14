package com.mycom.boardpjt.common.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerAop extends HandlerInterceptorAdapter {
	protected Log log = LogFactory.getLog(LoggerAop.class);
	

	public Object  LoggerAop(ProceedingJoinPoint jointpoint) throws Throwable {
		
		String singStr =  jointpoint.getSignature().toShortString();
			
		log.debug(" singStr  :  " +singStr );
		
		long st = System.currentTimeMillis();
		
		
		try{
			log.debug(" 경과시간  시작 :  ");
			Object obj = jointpoint.proceed();
			return obj;
		}finally{
			long et = System.currentTimeMillis();
			log.debug(" 경과시간   :  " +( et - st) );
			
		}
	}
	

}