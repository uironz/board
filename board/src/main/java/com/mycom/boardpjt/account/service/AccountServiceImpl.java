package com.mycom.boardpjt.account.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.boardpjt.account.dao.Account;
import com.mycom.boardpjt.account.dao.AccountDAO;
import com.mycom.boardpjt.board.dao.Board;
import com.mycom.boardpjt.board.dao.BoardDAO;


@Service("accountService")
public class AccountServiceImpl implements AccountService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private AccountDAO accountDAO;

	
	
	@Override
	public Account loadUserByUsername(String username) throws Exception {
		return accountDAO.loadUserByUsername(username);
	}
 

}
