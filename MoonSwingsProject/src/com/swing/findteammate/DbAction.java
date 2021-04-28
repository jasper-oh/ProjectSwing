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
	
/*
 * ###################FIND TEAM MATE########################
#select all student
SELECT s.name, s.github_id, t.name, s.mbti 
FROM student s, joining j, team t
WHERE s.id = j.student_id AND j.team_no = t.no;
#seach for condition = name
SELECT s.name, s.github_id, t.name, s.mbti 
FROM student s, joining j, team t
WHERE s.name LIKE "%윤%" AND s.id = j.student_id AND j.team_no = t.no;
#seach for condition = github_id
SELECT s.name, s.github_id, t.name, s.mbti 
FROM student s, joining j, team t
WHERE s.github_id LIKE "%g%" AND s.id = j.student_id AND j.team_no = t.no;
#seach for condition = team name : find none team = null
SELECT s.name, s.github_id, t.name, s.mbti 
FROM student s, joining j, team t
WHERE t.name LIKE "%m%" AND s.id = j.student_id AND j.team_no = t.no;
#seach for condition = mbti
SELECT s.name, s.github_id, t.name, s.mbti 
FROM student s, joining j, team t
WHERE s.mbti LIKE "%e%" AND s.id = j.student_id AND j.team_no = t.no;
#!!!!!!!!!!!!!!1picked
SELECT sender.name, sender.github_id, (SELECT t.name
									   FROM dip d, team t, joining j
                                       WHERE d.sender = j.student_id AND
											 j.team_no = t.no) team_name, sender.mbti
FROM dip d, (SELECT st.id d.taget, st.name, st.github_id, st.mbti
				  FROM student st, dip d
				  WHERE st.id = d.sender) sender
WHERE d.taget = 'dbswovlf2009' AND d.sender = sender.id
 */
	
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
