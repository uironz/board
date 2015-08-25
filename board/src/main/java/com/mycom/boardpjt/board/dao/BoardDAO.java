package com.mycom.boardpjt.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("BoardDAO")
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@SuppressWarnings("unchecked")
	public List<Board> list() throws Exception{
		return sqlSession.selectList("boardResult.list");
	}

}
