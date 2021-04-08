package com.java.swingproject;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		//	JFrame this = new JFrame(); //  'Cause of inheritance we do not need to call instance
		 this.setTitle("작심삼분");
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setResizable(true);
		 this.setSize(1400,800);
		 this.setVisible(true);
	
		 
//		 ImageIcon image = new ImageIcon("teammaker.png"); //create an ImageIcon
	//	 this.setIconImage(image.getImage()); //change icon of this // IguessNotWorkAtMac Doesn't have iconthis
		 this.getContentPane().setBackground(new Color(2,130,255)); //change color of background
	}
}
