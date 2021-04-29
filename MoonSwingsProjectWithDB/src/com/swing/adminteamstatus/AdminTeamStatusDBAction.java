package com.swing.adminteamstatus;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import com.swing.adminteamstatus.AdminTeamStatusBean;
import com.swing.DB.ShareVar;

public class AdminTeamStatusDBAction {
	
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	String id;
	String name;
	
	int team_no;

	public AdminTeamStatusDBAction() {
	}
	
	public AdminTeamStatusDBAction(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//TeamStatus In Action
	public boolean teamStatusInAction(int team_no) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get ( cal.YEAR );
		int month = cal.get ( cal.MONTH ) + 1 ;
		int date = cal.get ( cal.DATE ) ;
		String now = year + "-" + month + "-" + date ;
		
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			//여기만 변경될거야
			String query = "INSERT INTO joining (creation, student_id, team_no) VALUES (?, ?, ?)"; //? 쓰기위해 프리페어 선언 ?에 입력창에 들어갈것
			ps = conn_mysql.prepareStatement(query); //컴파일전에 자바로 바꿔줘
			
			ps.setString(1, now);
			ps.setString(2, id);
			ps.setInt(3, team_no);
			ps.executeUpdate();//입력되면 업데이트된다
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//TeamStatus Out Action
	public boolean teamStatusOutAction(int selectedrdb) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get ( cal.YEAR );
		int month = cal.get ( cal.MONTH ) + 1 ;
		int date = cal.get ( cal.DATE ) ;
		String now = year + "-" + month + "-" + date ;
		
		PreparedStatement ps = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			@SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();
			//수정하기
			String A = "update joining set secession = ? where team_no =" + selectedrdb;
			ps = conn_mysql.prepareStatement(A);
			
			ps.setString(1, now);
			ps.executeUpdate();
			
			conn_mysql.close();
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//team status 불러오기
	public ArrayList<AdminTeamStatusBean> ShowTeammateStatus(){
		
		ArrayList<AdminTeamStatusBean> beanList = new ArrayList<AdminTeamStatusBean>();
		String WhereDefault = "SELECT t.name, s.name FROM student s, joining j, team t WHERE s.id = j.student_id AND j.team_no = t.no";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault);//레코드 단위로 가져온다
		
			while(rs.next()){
				int wkteamname = rs.getInt(1);
				String wkname = rs.getString(2);
				
				AdminTeamStatusBean bean = new AdminTeamStatusBean(wkteamname, wkname);
				beanList.add(bean);
			}
			conn_mysql.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
			
		return beanList;
	}
	
	//팀 없는 학생 출력
	public ArrayList<AdminTeamStatusBean> AdminTeamStatusList() {
		
		ArrayList<AdminTeamStatusBean> BeanList = new ArrayList<AdminTeamStatusBean>();
		
		String WhereDefault = "SELECT s.id, s.name, s.mbti, count(d.target) picked\n"
				+ "FROM student s\n"
				+ "LEFT JOIN dip d on s.id = d.target\n"
				+ "WHERE NOT EXISTS (SELECT s.id FROM joining j WHERE s.id = j.student_id)\n"
				+ "group by s.id;";
		
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

            ResultSet rs = stmt_mysql.executeQuery(WhereDefault);

            while(rs.next()){
            	
            	String wkId = rs.getString(1);
            	String wkName = rs.getString(2);
            	String wkMbti = rs.getString(3);
            	String wkDip = rs.getString(4);
            	
            	AdminTeamStatusBean bean = new AdminTeamStatusBean(wkId, wkName, wkMbti, wkDip);
            	BeanList.add(bean);
            }
            
            conn_mysql.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
		return BeanList;
	}
	

}