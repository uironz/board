package com.mycom.boardpjt.board.controller;

import java.util.List;











import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycom.boardpjt.board.dao.Board;
import com.mycom.boardpjt.board.dao.BoardDs;
import com.mycom.boardpjt.board.service.BoardService;
import com.mycom.boardpjt.common.logger.LoggerInterceptor;

@Controller
public class BoardController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private BoardService boardService;
	@Autowired 
	EhCacheManagerFactoryBean ehCacheManagerFactoryBean;
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	@RequestMapping("/list")
    public String list(ModelMap model) throws Exception{

    	List<Board> list = boardService.list();   	   	
    	model.addAttribute("list", 	list);	
    	
			
    	List<Board> listCached = null; 
    	CacheManager cacheManager  = CacheManager.create();
    	Ehcache cache = cacheManager.getEhcache("cashe1");  
    	Element element = cache.get("listCached");
    	
		if (element == null) {
			listCached = list   ;
			element = new Element("listCached", list);			
	    	cache.put(element);
			if (log.isDebugEnabled()) {
				log.debug("  cache :  null"  );
			}
		} else {
			listCached = (List<Board>) element.getObjectValue()   ;
			if (log.isDebugEnabled()) {
				log.debug("  cache :  not null" + listCached.size());
			}
		}
		
		 
    	model.addAttribute("listCached", 	listCached);
    	
    	return "/board/boardList";
    }
	
	
	
	@RequestMapping("/insert")
    public String insert(ModelMap model) throws Exception{

    	boardService.insert();   	   	

    	return "redirect:/list";
    }
	

	
	@RequestMapping(value="/listRestfull" ,method = RequestMethod.GET)
	public @ResponseBody ModelMap golfclubdate(			
			ModelMap model) throws Exception {
		
		List<Board> list = boardService.list();

		BoardDs boardDs = new BoardDs();
	
		
		if (boardDs != null){
			boardDs.setIdx(list.get(0).getIdx());
			boardDs.setUsrId(list.get(0).getUsrId());
		}
		
		
		model.addAttribute("list", 	boardDs);
		return model;
	}
	
	
	

	
	@RequestMapping("/login")
    public String login(ModelMap model) throws Exception{

    	
    	return "login";
    }
	
	
	
	@RequestMapping("/home")
    public String home(ModelMap model) throws Exception{

    	
    	return "home";
    }
	
	
	
	
	
}
