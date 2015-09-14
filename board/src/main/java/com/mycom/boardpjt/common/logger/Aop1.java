package com.mycom.boardpjt.common.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Aop1 extends HandlerInterceptorAdapter {
	protected Log log = LogFactory.getLog(Aop1.class);
	

	public void  Aop1()  {
	
		log.debug(" AOP1  :  "  );
		
	}
	

}