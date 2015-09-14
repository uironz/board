package com.mycom.boardpjt.account.service;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mycom.boardpjt.account.dao.Account;
import com.mycom.boardpjt.account.dao.AccountDAO;


public  class MemberDetailsService implements UserDetailsService {
	
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private AccountService accountService;

	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		
		
		UserDetails usr = null;
		try {
			Account account  = accountService.loadUserByUsername(username);
			
			Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
			roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			
			usr = new User(username,account.getUsrPwd(),roles);
			
			log.debug("+++++++++++++++++++++++++++ usr : " + usr + "++++++++++++");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usr;
	}

	

}
