package com.swing.checkprofile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;

import com.swing.DB.ShareVar;

public class CheckProfileDBAction {
	
	private final String url_mysql =  ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	String id;
	
	
	public CheckProfileDBAction(String id) {
		super();
		this.id = id;
	}

	String[] checkProfileInfo = new String[8];
	
public String[] insertAction(){
		
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            @SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();


            String A = "select id, name, mbti, github_id, subway, phone, strength, introduce from student where id = ?";
            
            ps = conn_mysql.prepareStatement(A);
            
            ps.setString(1, id.trim());

            rs = ps.executeQuery();
            
            rs.next();
            checkProfileInfo[0] = rs.getString(1);
            checkProfileInfo[1] = rs.getString(2);
            checkProfileInfo[2] = rs.getString(3);
            checkProfileInfo[3] = rs.getString(4);
            checkProfileInfo[4] = rs.getString(5);
            checkProfileInfo[5] = rs.getString(6);
            checkProfileInfo[6] = rs.getString(7);
            checkProfileInfo[7] = rs.getString(8);

            System.out.println(checkProfileInfo[7]);
            
            conn_mysql.close();
            
            
            
            return checkProfileInfo;
        } catch (Exception e){                    
            e.printStackTrace();
            return checkProfileInfo;
        }
    
		
	}

public BufferedImage getStudentImage() {
	PreparedStatement ps = null;
	ResultSet rs = null;
	BufferedImage im = null;
	
	try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
        @SuppressWarnings("unused")
		Statement stmt_mysql = conn_mysql.createStatement();

        String A = "select photo from student where id = ?";
        

        ps = conn_mysql.prepareStatement(A);
        
        ps.setString(1, id.trim());
        
      
        rs = ps.executeQuery();

        rs.next();
        
        im = ImageIO.read(rs.getBinaryStream(1));
        
        
        
        return im;
        
    } catch (Exception e){                    
        e.printStackTrace();
        return im;
        
    }
}
public 






}
