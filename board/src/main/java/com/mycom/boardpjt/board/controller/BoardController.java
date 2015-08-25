package com.mycom.boardpjt.board.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycom.boardpjt.board.dao.Board;
import com.mycom.boardpjt.board.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private BoardService boardService;
	

	
	@RequestMapping("/list")
    public String list(ModelMap model) throws Exception{


    	List<Board> list = boardService.list();    	


    	model.addAttribute("list", 	list);
    	
    	return "/board/boardList";
    }
	
}
