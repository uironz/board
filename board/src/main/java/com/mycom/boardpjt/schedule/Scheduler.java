package com.mycom.boardpjt.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mycom.boardpjt.board.dao.BoardDAO;
import com.mycom.boardpjt.board.service.BoardService;

@Component
public class Scheduler {

 
	@Autowired 
	private BoardService boardService;
	
	@Scheduled(cron = "00 58 01 * * *")
	public void croneTest1(){		
		try {
			boardService.insertSchedule();
		} catch (Exception e) {
			System.out.println("실패!!!!!!!!!!!!!!!!!!!!!!!!!!.");
		}		
		System.out.println("1자동실행됩니다.");
	}
	
	
 
	@Scheduled(cron = "00 54 01 * * *")
	public void croneTestDatabase(){
		//boardService.insertSchedule();
		System.out.println("22디비 자동 등록!!");
	}
 
	
}
