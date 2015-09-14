package com.mycom.boardpjt.account.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("AccountDAO")
public class AccountDAO {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public Account loadUserByUsername(String usrId) throws Exception{
		log.debug("!!!!!!!!!!!!######## username : " + usrId); 
		return sqlSession.selectOne("accountResult.loadUserByUsername",usrId);
		
	}

	
	
}
