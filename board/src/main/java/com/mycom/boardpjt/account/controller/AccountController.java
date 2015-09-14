package com.mycom.boardpjt.account.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycom.boardpjt.board.service.BoardService;

@Controller
public class AccountController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/account")
    public String list(ModelMap model) throws Exception{

    	return null;
    }
	
	
}
