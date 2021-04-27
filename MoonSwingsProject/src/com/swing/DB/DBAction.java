package com.swing.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import com.swing.DB.Bean;
import com.swing.DB.ShareVar;

public class DBAction {
	
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	String id;
	String name;
	String mbti;
	String github_id;
	String subway;
	String phone;
	String strength;
	String introduce;
	
	//팀 정보
	int no;
	
	public DBAction() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DBAction(String id, String name, String mbti, String github_id, String subway, String phone,
			String strength, String introduce) {
		super();
		this.id = id;
		this.name = name;
		this.mbti = mbti;
		this.github_id = github_id;
		this.subway = subway;
		this.phone = phone;
		this.strength = strength;
		this.introduce = introduce;
	}
	
	
	//checkkProfile 내 정보 불러오기
	public Bean checkProfileAction(){
		
		Bean bean = null;
		//수정해야함
		String WhereDefault = "SELECT id, name, mbti, github_id, subway, phone, strength, introduce FROM student WHERE id = 'crybaby'";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault);//레코드 단위로 가져온다
		
			while(rs.next()){
				String id = rs.getString(1);
				String name = rs.getString(2);
				String mbti = rs.getString(3);
				String github_id = rs.getString(4);
				String subway = rs.getString(5);
				String phone = rs.getString(6);
				String strength = rs.getString(7);
				String introduce = rs.getString(8);
				
				bean = new Bean(id, name, mbti, github_id, subway, phone, strength, introduce);
			}
			conn_mysql.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
			
		return bean;
	}
	
	//checkProfile 수정하기
	public boolean checkProfileUpdateAction() {
		
		PreparedStatement ps = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			@SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "UPDATE student SET mbti = ?, github_id = ?, subway = ?, phone = ?, strength = ?, introduce = ? WHERE id = ?";

			ps = conn_mysql.prepareStatement(A);
	        ps.setString(1, mbti.trim());
	        ps.setString(2, github_id.trim());
	        ps.setString(3, subway.trim());
	        ps.setString(4, phone.trim());
	        ps.setString(5, strength.trim());
	        ps.setString(6, introduce.trim());
	        ps.setString(7, id);
			ps.executeUpdate();
			
			conn_mysql.close();
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
      
		}
	}
	
	//TeamStatus In Action
	public boolean teamStatusInAction(int selectedrdb) {
		
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
			ps.setString(2, "crybaby");
			ps.setInt(3, selectedrdb);
			ps.executeUpdate();//입력되면 업데이트된다
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
			JOptionPane.showMessageDialog(null, selectedrdb + "님의 정보가 입력되었습니다.");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//TeamStatus Out Action
	public boolean teamStatusOutAction() {
		
		PreparedStatement ps = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			@SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();
			//수정하기
			String A = "DELETE FROM joining WHERE student_id = 'crybaby'";

			ps = conn_mysql.prepareStatement(A);
//	        ps.setString(1, Integer.toString(no).trim());
			ps.executeUpdate();
			
			conn_mysql.close();
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//teammate status 불러오기
	public ArrayList<Bean> ShowTeammateStatus(){
		
		ArrayList<Bean> beanList = new ArrayList<Bean>();
		String WhereDefault = "SELECT t.name, s.name FROM student s, joining j, team t WHERE s.id = j.student_id AND j.team_no = t.no";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault);//레코드 단위로 가져온다
		
			while(rs.next()){
				int wkteamname = rs.getInt(1);
				String wkname = rs.getString(2);
				
				Bean bean = new Bean(wkteamname, wkname);
				beanList.add(bean);
			}
			conn_mysql.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
			
		return beanList;
	}
	

}
