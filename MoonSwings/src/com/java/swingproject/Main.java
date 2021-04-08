package com.java.swingproject;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	 JFrame frame = new JFrame();
	 frame.setTitle("작심삼분");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setResizable(true);
	 frame.setSize(1400,800);
	 frame.setVisible(true);

	 
	 ImageIcon image = new ImageIcon("teammaker.png"); //create an ImageIcon
//	 frame.setIconImage(image.getImage()); //change icon of frame // IguessNotWorkAtMac Doesn't have iconFrame
	 frame.getContentPane().setBackground(new Color(2,130,255)); //change color of background
	 
	}
}
