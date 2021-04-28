package com.swing.findteammate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.swing.DB.ShareVar;
import com.swing.findteammate.Bean;

public class DbAction {
	
	// Field
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	String id;
	String name;
	String github_id;
	String mbti;
	
	
	// constructor
	public DbAction() {
		// TODO Auto-generated constructor stub
	}
	
	// method
	
	// 전체 검색
	public ArrayList<Bean> selectList(){
		System.out.println("selectList start");
		ArrayList<Bean> beanList = new ArrayList<Bean>();
		String WhereDefault = "select name, github_id, id, mbti from Student ";
		
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	        Statement stmt_mysql = conn_mysql.createStatement();
	        
	        ResultSet rs = stmt_mysql.executeQuery(WhereDefault);
	
			while(rs.next()){
				String wkName = rs.getString(1);
				String wkGithub_id = rs.getString(2);
				String wkId = rs.getString(3);
				String wkMbti =rs.getString(4);
				  
				Bean bean = new Bean(wkName, wkGithub_id, wkId, wkMbti);
				beanList.add(bean);
				System.out.println(bean.name + bean.github_id + bean.id + bean.mbti);
				}
			
			conn_mysql.close();
	    }
	    catch (Exception e){
	        e.printStackTrace();
	    }
	    return beanList;
		
	}
	
}
