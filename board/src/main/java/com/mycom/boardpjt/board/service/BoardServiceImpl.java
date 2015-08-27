package com.mycom.boardpjt.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.boardpjt.board.dao.Board;
import com.mycom.boardpjt.board.dao.BoardDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<Board> list() throws Exception {
		return boardDAO.list();		
	}

	@Override
	public void insertSchedule() throws Exception {
		boardDAO.insertSchedule();	
	}

}
