package com.mycom.boardpjt.board.service;

import java.util.List;
import java.util.Map;

import com.mycom.boardpjt.board.dao.Board;

public interface BoardService {

	List<Board> list() throws Exception;

	void insertSchedule() throws Exception;

	void insert();

}
