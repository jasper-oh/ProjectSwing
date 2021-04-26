package com.swing.adminannouncement;


import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class AdminCreateAnnoucement {

	private JFrame frmCreate;
	
	// Outer Table for Project
	private final DefaultTableModel Outer_Table_ProjectTable = new DefaultTableModel();
	// Outer Table for Teammate Review
	private final DefaultTableModel Outer_Table_TeammateReviewTable = new DefaultTableModel();
	private JTextArea textArea;
	private JSeparator separator;
	private JEditorPane dtrpnTitle;
	private JButton btnCreate;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCreateAnnoucement window = new AdminCreateAnnoucement();
					window.frmCreate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminCreateAnnoucement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreate = new JFrame();
		frmCreate.setTitle("Create Annoucement");
		frmCreate.getContentPane().setBackground(Color.WHITE);
		frmCreate.setBounds(100, 100, 500, 350);
		
//		frmProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreate.getContentPane().setLayout(null);
		frmCreate.getContentPane().add(getTextArea());
		frmCreate.getContentPane().add(getSeparator());
		frmCreate.getContentPane().add(getDtrpnTitle());
		frmCreate.getContentPane().add(getBtnCreate());
		


	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBackground(Color.WHITE);
			textArea.setForeground(Color.GRAY);
			textArea.setText("내용 적는곳");
			textArea.setRows(20);
			textArea.setBounds(37, 76, 415, 165);
		}
		return textArea;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(Color.LIGHT_GRAY);
			separator.setBounds(27, 50, 438, 19);
		}
		return separator;
	}
	private JEditorPane getDtrpnTitle() {
		if (dtrpnTitle == null) {
			dtrpnTitle = new JEditorPane();
			dtrpnTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			dtrpnTitle.setForeground(Color.GRAY);
			dtrpnTitle.setText("Title");
			dtrpnTitle.setBounds(37, 18, 415, 30);
		}
		return dtrpnTitle;
	}
	private JButton getBtnCreate() {
		if (btnCreate == null) {
			btnCreate = new JButton("Create");
			btnCreate.setBackground(Color.WHITE);
			btnCreate.setForeground(new Color(0, 102, 204));
			btnCreate.setBounds(348, 267, 117, 40);
		}
		return btnCreate;
	}
} // End Line
