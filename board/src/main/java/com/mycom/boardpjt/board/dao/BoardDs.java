package com.mycom.boardpjt.board.dao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BoardDs {

	private  int idx;
	private  String usrId;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
}
