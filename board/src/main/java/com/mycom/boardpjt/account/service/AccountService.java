package com.mycom.boardpjt.account.service;

import java.util.List;
import java.util.Map;

import com.mycom.boardpjt.account.dao.Account;
import com.mycom.boardpjt.board.dao.Board;

public interface AccountService {

	Account loadUserByUsername(String username) throws Exception;

}
