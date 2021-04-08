package com.java.swingproject;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
	 
		
		
		
		//JLabel = a GUI display area for a string of text, an image, or both
		JLabel label = new JLabel(); // create a label
		label.setText("작팀삼분"); // set text of label				
		
		// JFrame
		MyFrame myFrame = new MyFrame();
		myFrame.add(label);
		
	}
}
