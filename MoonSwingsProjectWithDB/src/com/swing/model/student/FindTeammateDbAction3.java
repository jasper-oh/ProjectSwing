package com.swing.model.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.swing.DB.ShareVar;
import com.swing.model.student.beans.FindTeammateBean;

public class FindTeammateDbAction3 {
	
	// Field
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	String id;
	String name;
	String github_id;
	int teamName;
	String loginedId;

	
	
	// constructor
	public FindTeammateDbAction3() {
		// TODO Auto-generated constructor stub
	}
	
	public FindTeammateDbAction3(String loginedId) {
		this.loginedId = loginedId;
	}
	
	
	

	
	// method

	// Admin : Student List Table에 ID, Name, TeamStatus, MBTI, Dip count 띄우기
	public ArrayList<FindTeammateBean> selectStudentList(){
		ArrayList<FindTeammateBean> beanFTList = new ArrayList<FindTeammateBean>();
		String query1 = "SELECT s.id, s.name, ";
		String query2 = "(SELECT t.name FROM joining j, team t WHERE s.id = j.student_id and j.team_no = t.no and secession is null AND t.project_no = (SELECT MAX(no) FROM project)), ";
		String query3 = "s.mbti, count(d.target) FROM student s ";
		String query4 =	"LEFT JOIN dip d on s.id = d.target WHERE s.id != '"+ loginedId +"' GROUP BY s.id";
		
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	        Statement stmt_mysql = conn_mysql.createStatement();
	        
	        ResultSet rs = stmt_mysql.executeQuery(query1+query2+query3+query4);
	
			while(rs.next()){
				String wkId = rs.getString(1);
				String wkName = rs.getString(2);
				int wkTeamName = rs.getInt(3);
				String wkMbti =rs.getString(4);
				int wkDiptargetCount =rs.getInt(5);
				  
				FindTeammateBean bean = new FindTeammateBean(wkId, wkName, wkTeamName, wkMbti, wkDiptargetCount);
				beanFTList.add(bean);
				}
			
			conn_mysql.close();
	    }
	    catch (Exception e){
	        e.printStackTrace();
	    }
	    return beanFTList;
	}

	
}// end line