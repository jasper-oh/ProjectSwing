package com.swing.findteammate;


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

public class OthersProfile {

	private JFrame frmProfile;
//	private JPanel panelOtherProfile;
	private JPanel Panel_Ima_otherProfile;
	private JLabel lblOtherProfileId;
	private JLabel lblOtherProfileName;
	private JLabel lblOtherProfileMbti;
	private JLabel lblOtherProfileGithub;
	private JLabel lblOtherProfileAddress;
	private JTextField tfOtherProfileId;
	private JTextField tfOtherProfileName;
	private JTextField tfOtherProfileAddress;
	private JTextField tfOtherProfileMbti;
	private JTextField tfOtherProfileGithub;
	private JLabel lblOtherProfileStrength;
	private JTextField tfOtherProfileStrength;
	private JLabel lblOtherProfileIntroduce;
	private JTextField tfOtherProfileIntroduse;
	private JScrollPane scrollPane_Project;
	private JTable ProjectTable;
	
	// Outer Table for Project
	private final DefaultTableModel Outer_Table_ProjectTable = new DefaultTableModel();
	// Outer Table for Teammate Review
	private final DefaultTableModel Outer_Table_TeammateReviewTable = new DefaultTableModel();
	
	private JLabel lblOtherProfileProject;
	private JLabel lblOtherTeammateReview;
	private JScrollPane scrollPane_TeammateReview;
	private JButton btnPTWMOtherProfile;
	private JTable TeammateReviewTable;
	private JLabel lblOtherProfilePhone;
	private JTextField tfOtherProfilePhone;
	private JButton btnCancel;
	private JLabel lblOtherProfile;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OthersProfile window = new OthersProfile();
					window.frmProfile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OthersProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProfile = new JFrame();
		frmProfile.getContentPane().setBackground(Color.WHITE);
		frmProfile.setBounds(100, 100, 500, 600);
		
//		frmProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfile.getContentPane().setLayout(null);
		frmProfile.getContentPane().add(getPanel_Ima_otherProfile());
		frmProfile.getContentPane().add(getLblOtherProfileId());
		frmProfile.getContentPane().add(getLblOtherProfileName());
		frmProfile.getContentPane().add(getLblOtherProfileMbti());
		frmProfile.getContentPane().add(getLblOtherProfileGithub());
		frmProfile.getContentPane().add(getLblOtherProfileAddress());
		frmProfile.getContentPane().add(getTfOtherProfileId());
		frmProfile.getContentPane().add(getTfOtherProfileName());
		frmProfile.getContentPane().add(getTfOtherProfileAddress());
		frmProfile.getContentPane().add(getTfOtherProfileMbti());
		frmProfile.getContentPane().add(getTfOtherProfileGithub());
		frmProfile.getContentPane().add(getLblOtherProfileStrength());
		frmProfile.getContentPane().add(getTextField_4());
		frmProfile.getContentPane().add(getLblOtherProfileIntroduce());
		frmProfile.getContentPane().add(getTextField_5());
		frmProfile.getContentPane().add(getScrollPane_Project());
		frmProfile.getContentPane().add(getLblOtherProfileProject());
		frmProfile.getContentPane().add(getLblOtherTeammateReview());
		frmProfile.getContentPane().add(getScrollPane_TeammateReview());
		frmProfile.getContentPane().add(getBtnPTWMOtherProfile());
		frmProfile.getContentPane().add(getLblOtherProfilePhone());
		frmProfile.getContentPane().add(getTfOtherProfilePhone());
		frmProfile.getContentPane().add(getBtnCancel());
		frmProfile.getContentPane().add(getLblOtherProfile());

	}

	
	private JPanel getPanel_Ima_otherProfile() {
		if (Panel_Ima_otherProfile == null) {
			Panel_Ima_otherProfile = new JPanel();
			Panel_Ima_otherProfile.setBackground(new Color(245, 245, 245));
			Panel_Ima_otherProfile.setLayout(null);
			Panel_Ima_otherProfile.setBounds(30, 59, 102, 136);
		}
		return Panel_Ima_otherProfile;
	}
	private JLabel getLblOtherProfileId() {
		if (lblOtherProfileId == null) {
			lblOtherProfileId = new JLabel("ID :");
			lblOtherProfileId.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileId.setForeground(Color.GRAY);
			lblOtherProfileId.setBounds(144, 59, 61, 16);
		}
		return lblOtherProfileId;
	}
	private JLabel getLblOtherProfileName() {
		if (lblOtherProfileName == null) {
			lblOtherProfileName = new JLabel("Name :");
			lblOtherProfileName.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileName.setForeground(Color.GRAY);
			lblOtherProfileName.setBounds(144, 87, 61, 16);
		}
		return lblOtherProfileName;
	}
	private JLabel getLblOtherProfileMbti() {
		if (lblOtherProfileMbti == null) {
			lblOtherProfileMbti = new JLabel("MBTI :");
			lblOtherProfileMbti.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileMbti.setForeground(Color.GRAY);
			lblOtherProfileMbti.setBounds(144, 115, 47, 16);
		}
		return lblOtherProfileMbti;
	}
	private JLabel getLblOtherProfileGithub() {
		if (lblOtherProfileGithub == null) {
			lblOtherProfileGithub = new JLabel("Github :");
			lblOtherProfileGithub.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileGithub.setForeground(Color.GRAY);
			lblOtherProfileGithub.setBounds(144, 143, 61, 16);
		}
		return lblOtherProfileGithub;
	}
	
	private JLabel getLblOtherProfileAddress() {
		if (lblOtherProfileAddress == null) {
			lblOtherProfileAddress = new JLabel("Address :");
			lblOtherProfileAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileAddress.setForeground(Color.GRAY);
			lblOtherProfileAddress.setBounds(144, 173, 61, 16);
		}
		return lblOtherProfileAddress;
	}
	private JTextField getTfOtherProfileId() {
		if (tfOtherProfileId == null) {
			tfOtherProfileId = new JTextField();
			tfOtherProfileId.setForeground(new Color(0, 102, 204));
			tfOtherProfileId.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileId.setBounds(207, 59, 230, 21);
			tfOtherProfileId.setColumns(10);
		}
		return tfOtherProfileId;
	}
	private JTextField getTfOtherProfileName() {
		if (tfOtherProfileName == null) {
			tfOtherProfileName = new JTextField();
			tfOtherProfileName.setForeground(new Color(0, 102, 204));
			tfOtherProfileName.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileName.setColumns(10);
			tfOtherProfileName.setBounds(207, 87, 230, 21);
		}
		return tfOtherProfileName;
	}
	private JTextField getTfOtherProfileAddress() {
		if (tfOtherProfileAddress == null) {
			tfOtherProfileAddress = new JTextField();
			tfOtherProfileAddress.setForeground(new Color(0, 102, 204));
			tfOtherProfileAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileAddress.setColumns(10);
			tfOtherProfileAddress.setBounds(207, 171, 230, 21);
		}
		return tfOtherProfileAddress;
	}
	private JTextField getTfOtherProfileMbti() {
		if (tfOtherProfileMbti == null) {
			tfOtherProfileMbti = new JTextField();
			tfOtherProfileMbti.setForeground(new Color(0, 102, 204));
			tfOtherProfileMbti.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileMbti.setColumns(10);
			tfOtherProfileMbti.setBounds(207, 115, 230, 21);
		}
		return tfOtherProfileMbti;
	}
	private JTextField getTfOtherProfileGithub() {
		if (tfOtherProfileGithub == null) {
			tfOtherProfileGithub = new JTextField();
			tfOtherProfileGithub.setForeground(new Color(0, 102, 204));
			tfOtherProfileGithub.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileGithub.setColumns(10);
			tfOtherProfileGithub.setBounds(207, 143, 230, 21);
		}
		return tfOtherProfileGithub;
	}
	private JLabel getLblOtherProfileStrength() {
		if (lblOtherProfileStrength == null) {
			lblOtherProfileStrength = new JLabel("Strength :");
			lblOtherProfileStrength.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileStrength.setForeground(Color.GRAY);
			lblOtherProfileStrength.setBounds(36, 226, 74, 15);
		}
		return lblOtherProfileStrength;
	}
	private JTextField getTextField_4() {
		if (tfOtherProfileStrength == null) {
			tfOtherProfileStrength = new JTextField();
			tfOtherProfileStrength.setForeground(new Color(0, 102, 204));
			tfOtherProfileStrength.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileStrength.setBounds(126, 223, 311, 21);
			tfOtherProfileStrength.setColumns(10);
		}
		return tfOtherProfileStrength;
	}
	private JLabel getLblOtherProfileIntroduce() {
		if (lblOtherProfileIntroduce == null) {
			lblOtherProfileIntroduce = new JLabel("한줄 자기소개 :");
			lblOtherProfileIntroduce.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfileIntroduce.setForeground(Color.GRAY);
			lblOtherProfileIntroduce.setBounds(36, 253, 91, 15);
		}
		return lblOtherProfileIntroduce;
	}
	private JTextField getTextField_5() {
		if (tfOtherProfileIntroduse == null) {
			tfOtherProfileIntroduse = new JTextField();
			tfOtherProfileIntroduse.setForeground(new Color(0, 102, 204));
			tfOtherProfileIntroduse.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfileIntroduse.setColumns(10);
			tfOtherProfileIntroduse.setBounds(126, 248, 311, 21);
		}
		return tfOtherProfileIntroduse;
	}
	private JScrollPane getScrollPane_Project() {
		if (scrollPane_Project == null) {
			scrollPane_Project = new JScrollPane();
			scrollPane_Project.setBounds(36, 303, 401, 74);
			scrollPane_Project.setViewportView(getProjectTable());
		}
		return scrollPane_Project;
	}
	private JTable getProjectTable() {
		if (ProjectTable == null) {
			ProjectTable = new JTable();
			ProjectTable.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			ProjectTable.setForeground(new Color(0, 102, 204));
			ProjectTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			ProjectTable.setModel(Outer_Table_ProjectTable); // <--***************************************************
			ProjectTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			ProjectTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			
		}
		return ProjectTable;
	}
	private JLabel getLblOtherProfileProject() {
		if (lblOtherProfileProject == null) {
			lblOtherProfileProject = new JLabel("Project");
			lblOtherProfileProject.setForeground(Color.GRAY);
			lblOtherProfileProject.setFont(new Font("Dialog", Font.BOLD, 13));
			lblOtherProfileProject.setBounds(36, 281, 67, 21);
		}
		return lblOtherProfileProject;
	}
	private JLabel getLblOtherTeammateReview() {
		if (lblOtherTeammateReview == null) {
			lblOtherTeammateReview = new JLabel("Teammate Review");
			lblOtherTeammateReview.setForeground(Color.GRAY);
			lblOtherTeammateReview.setFont(new Font("Dialog", Font.BOLD, 13));
			lblOtherTeammateReview.setBounds(36, 389, 170, 21);
		}
		return lblOtherTeammateReview;
	}
	private JScrollPane getScrollPane_TeammateReview() {
		if (scrollPane_TeammateReview == null) {
			scrollPane_TeammateReview = new JScrollPane();
			scrollPane_TeammateReview.setBounds(36, 409, 401, 93);
			scrollPane_TeammateReview.setViewportView(getTeammateReviewTable());
		}
		return scrollPane_TeammateReview;
	}
	private JButton getBtnPTWMOtherProfile() {
		if (btnPTWMOtherProfile == null) {
			btnPTWMOtherProfile = new JButton("Please Team with Me!");
			btnPTWMOtherProfile.setBackground(new Color(0, 102, 204));
			btnPTWMOtherProfile.setForeground(Color.WHITE);
			btnPTWMOtherProfile.setOpaque(true);
			btnPTWMOtherProfile.setBounds(36, 514, 190, 33);
		}
		return btnPTWMOtherProfile;
	}
	
	private JTable getTeammateReviewTable() {
		if (TeammateReviewTable == null) {
			TeammateReviewTable = new JTable();
			TeammateReviewTable.setForeground(new Color(0, 102, 204));
			TeammateReviewTable.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			TeammateReviewTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TeammateReviewTable.setModel(Outer_Table_TeammateReviewTable); // <--***************************************************
			TeammateReviewTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TeammateReviewTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TeammateReviewTable;
	}
	private JLabel getLblOtherProfilePhone() {
		if (lblOtherProfilePhone == null) {
			lblOtherProfilePhone = new JLabel("Phone :");
			lblOtherProfilePhone.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblOtherProfilePhone.setForeground(Color.GRAY);
			lblOtherProfilePhone.setBounds(36, 200, 61, 16);
		}
		return lblOtherProfilePhone;
	}
	private JTextField getTfOtherProfilePhone() {
		if (tfOtherProfilePhone == null) {
			tfOtherProfilePhone = new JTextField();
			tfOtherProfilePhone.setForeground(new Color(0, 102, 204));
			tfOtherProfilePhone.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfOtherProfilePhone.setColumns(10);
			tfOtherProfilePhone.setBounds(126, 198, 311, 21);
		}
		return tfOtherProfilePhone;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.setOpaque(true);
			btnCancel.setForeground(new Color(0, 102, 204));
			btnCancel.setBackground(Color.WHITE);
			btnCancel.setBounds(247, 514, 190, 33);
		}
		return btnCancel;
	}
	private JLabel getLblOtherProfile() {
		if (lblOtherProfile == null) {
			lblOtherProfile = new JLabel("JaePill's Profile");
			lblOtherProfile.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			lblOtherProfile.setForeground(Color.GRAY);
			lblOtherProfile.setBounds(30, 17, 401, 30);
		}
		return lblOtherProfile;
	}
} // End Line