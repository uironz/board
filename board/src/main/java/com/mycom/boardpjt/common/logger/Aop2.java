package com.mycom.boardpjt.common.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Aop2 extends HandlerInterceptorAdapter {
	protected Log log = LogFactory.getLog(Aop2.class);
	

	public void  Aop2()  {
	
		log.debug(" AOP2  :  "  );
		
	}
	

}