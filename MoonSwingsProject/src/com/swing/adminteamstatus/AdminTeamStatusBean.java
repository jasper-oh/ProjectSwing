package com.swing.adminteamstatus;

public class AdminTeamStatusBean {
	
	//학생 정보
	String name;
	
	//팀 정보
	int no;
	
	public AdminTeamStatusBean(int no, String name) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
