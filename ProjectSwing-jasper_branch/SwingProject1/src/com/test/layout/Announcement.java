package com.test.layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Announcement {

	private JFrame frame;
	private JPanel panel;
	private JPanel ImagePanel;
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblMbti;
	private JLabel lblGithub;
	private JLabel lblShowGithub;
	private JLabel lblShowName;
	private JLabel lblShowMbti;
	private JLabel lblShowId;
	private JButton btnAnnounce;
	private JButton btnCheckProfile;
	private JButton btnFindTeammate;
	private JButton btnTeamReview;
	private JButton btnTeammateStatus;
	private JLabel lblNewLabel;
	private JLabel lblTitle;
	private JPanel panelAnnouncement;

	
	private JScrollPane scrollPane;
	private JTable tableAnnoucement;
	private JPanel panelTeamStatus;
	private JRadioButton rbTeam1;
	private JRadioButton tbTeam2;
	private JTextField tfmate2_1;
	private JTextField tfmate2_2;
	private JTextField tfmate2_3;
	private JTextField tfmate2_4;
	private JRadioButton rbTeam3;
	private JRadioButton rbTeam4;
	private JRadioButton rbTeam5;
	private JRadioButton tbTeam6;
	private JButton btnNewButton;
	private JButton btnOut;
	
	// Table
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	
	
	private JTextField tfmate3_1;
	private JTextField tfmate3_2;
	private JTextField tfmate3_3;
	private JTextField tfmate3_4;
	private JTextField tfmate4_1;
	private JTextField tfmate4_2;
	private JTextField tfmate4_3;
	private JTextField tfmate4_4;
	private JTextField tfmate5_1;
	private JTextField tfmate5_2;
	private JTextField tfmate5_3;
	private JTextField tfmate5_4;
	private JTextField tfmate1_1;
	private JTextField tfmate1_2;
	private JTextField tfmate1_3;
	private JTextField tfmate1_4;
	private JTextField tfmate6_1;
	private JTextField tfmate6_2;
	private JTextField tfmate6_3;
	private JTextField tfmate6_4;
	private JTextField tfmate6_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblAnnoucementTitle;
	private JLabel lblAnnoucementTitle_1;
	private JSeparator separator;
	private JTextArea txtrAnnouncementContent;
	private JLabel lblNewLabel_1;
	//
	
	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Announcement window = new Announcement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Announcement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				TableInit();
				panelTeamStatus.setVisible(false);
			}
		});
		frame.setBounds(100, 100,790, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getPanel());
		frame.getContentPane().add(getLblTitle());
		frame.getContentPane().add(getPanelAnnouncement());
		frame.getContentPane().add(getPanelTeamStatus());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 102, 153));
			panel.setBounds(0, 0, 300, 542);
			panel.setLayout(null);
			panel.add(getImagePanel());
			panel.add(getLblId());
			panel.add(getLblName());
			panel.add(getLblMbti());
			panel.add(getLblGithub());
			panel.add(getLblShowId());
			panel.add(getLblShowName());
			panel.add(getLblShowGithub());
			panel.add(getLblShowMbti());
			panel.add(getBtnAnnounce());
			panel.add(getBtnCheckProfile());
			panel.add(getBtnFindTeammate());
			panel.add(getBtnTeamReview());
			panel.add(getBtnTeammateStatus());
			panel.add(getLblNewLabel_1());
		}
		return panel;
	}
	private JPanel getImagePanel() {
		if (ImagePanel == null) {
			ImagePanel = new JPanel();
			ImagePanel.setBounds(23, 54, 87, 108);
			ImagePanel.setLayout(null);
			ImagePanel.add(getLblNewLabel());
		}
		return ImagePanel;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID");
			lblId.setBounds(133, 54, 61, 16);
		}
		return lblId;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(133, 82, 61, 16);
		}
		return lblName;
	}
	private JLabel getLblMbti() {
		if (lblMbti == null) {
			lblMbti = new JLabel("MBTI");
			lblMbti.setBounds(133, 110, 37, 16);
		}
		return lblMbti;
	}
	private JLabel getLblGithub() {
		if (lblGithub == null) {
			lblGithub = new JLabel("Github");
			lblGithub.setBounds(133, 138, 47, 16);
		}
		return lblGithub;
	}
	private JLabel getLblShowGithub() {
		if (lblShowGithub == null) {
			lblShowGithub = new JLabel("jasper-oh");
			lblShowGithub.setBounds(193, 138, 101, 16);
		}
		return lblShowGithub;
	}
	private JLabel getLblShowName() {
		if (lblShowName == null) {
			lblShowName = new JLabel("오영준");
			lblShowName.setBounds(193, 82, 61, 16);
		}
		return lblShowName;
	}
	private JLabel getLblShowMbti() {
		if (lblShowMbti == null) {
			lblShowMbti = new JLabel("ENFJ");
			lblShowMbti.setBounds(193, 110, 61, 16);
		}
		return lblShowMbti;
	}
	private JLabel getLblShowId() {
		if (lblShowId == null) {
			lblShowId = new JLabel("Jasper");
			lblShowId.setBounds(193, 54, 61, 16);
		}
		return lblShowId;
	}
	private JButton getBtnAnnounce() {
		if (btnAnnounce == null) {
			btnAnnounce = new JButton("Announcement");
			btnAnnounce.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					CheckAnnouncementUIAction();
				}
			});
			btnAnnounce.setBounds(23, 234, 246, 43);
		}
		return btnAnnounce;
	}
	private JButton getBtnCheckProfile() {
		if (btnCheckProfile == null) {
			btnCheckProfile = new JButton("Check Profile");
			btnCheckProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					CheckProfileUIAction();
				}
			});
			btnCheckProfile.setBounds(23, 289, 246, 43);
		}
		return btnCheckProfile;
	}
	private JButton getBtnFindTeammate() {
		if (btnFindTeammate == null) {
			btnFindTeammate = new JButton("Find Teammate");
			btnFindTeammate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkFindTeammateUIAction();
				}
			});
			btnFindTeammate.setBounds(23, 342, 246, 43);
		}
		return btnFindTeammate;
	}
	private JButton getBtnTeamReview() {
		if (btnTeamReview == null) {
			btnTeamReview = new JButton("Team Review");
			btnTeamReview.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkTeamReviewAction();
				}
			});
			btnTeamReview.setBounds(23, 397, 246, 43);
		}
		return btnTeamReview;
	}
	private JButton getBtnTeammateStatus() {
		if (btnTeammateStatus == null) {
			btnTeammateStatus = new JButton("Teammate Status");
			btnTeammateStatus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkTeammateStatusAction();
				}
			});
			btnTeammateStatus.setBounds(23, 452, 246, 43);
		}
		return btnTeammateStatus;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Image");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(6, 44, 75, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblTitle() {
		if (lblTitle == null) {
			lblTitle = new JLabel("Announcement");
			lblTitle.setForeground(new Color(128, 128, 128));
			lblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblTitle.setBounds(309, 0, 327, 36);
		}
		return lblTitle;
	}
	
	// ---------------------
	// button action method
	// ---------------------
	
	private void CheckAnnouncementUIAction(){
		lblTitle.setText("Announcement");
		panelAnnouncement.setVisible(true);
		panelTeamStatus.setVisible(false);

		
	}
	
	private void CheckProfileUIAction() {
		lblTitle.setText("Check Profile");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(false);
		
	}
	
	private void checkFindTeammateUIAction() {
		lblTitle.setText("Find Teammate");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(false);
		
	}
	private void checkTeamReviewAction(){
		lblTitle.setText("Team Review");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(false);
		
		
	}
	private void checkTeammateStatusAction(){
		lblTitle.setText("Teammate Status");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(true);
		
		
	}
	
	
	// 21.04.24 hyokyeong -------------
	// PanelAnnoucement
	// --------------------------------
	
	private JPanel getPanelAnnouncement() {
		if (panelAnnouncement == null) {
			panelAnnouncement = new JPanel();
			panelAnnouncement.setBackground(new Color(255, 255, 255));
			panelAnnouncement.setBounds(300, 35, 490, 507);
			panelAnnouncement.setLayout(null);
			panelAnnouncement.add(getScrollPane());
			panelAnnouncement.add(getLblAnnoucementTitle());
			panelAnnouncement.add(getLblAnnoucementTitle_1());
			panelAnnouncement.add(getSeparator());
			panelAnnouncement.add(getTxtrAnnouncementContent());
		}

		return panelAnnouncement;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 470, 230);
			scrollPane.setViewportView(gettableAnnoucement());
		}
		return scrollPane;
	}
	private JTable gettableAnnoucement() {
		if (tableAnnoucement == null) {
			tableAnnoucement = new JTable();
			tableAnnoucement.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableAnnoucement.getTableHeader().setReorderingAllowed(false);
			tableAnnoucement.setModel(Outer_Table); // <--***************************************************
		}
		return tableAnnoucement;
	}
	
	private void TableInit(){
		
	    int i = Outer_Table.getRowCount();
	    Outer_Table.addColumn("No");
	    Outer_Table.addColumn("Date");
	    Outer_Table.addColumn("Title");
	    Outer_Table.addColumn("Count");
	    Outer_Table.setColumnCount(4);
	    
	    for(int j = 0 ; j < i ; j++){
	      Outer_Table.removeRow(0);
	    }
	    tableAnnoucement.setAutoResizeMode(tableAnnoucement.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    int width = 30;
	    col.setPreferredWidth(width);
	    
	    vColIndex = 1;
	    col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    width = 100;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    width = 290;
	    col.setPreferredWidth(width);
	    vColIndex = 3;
	    col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    width = 50;
	    col.setPreferredWidth(width);
		}
	
	private JLabel getLblAnnoucementTitle() {
		if (lblAnnoucementTitle == null) {
			lblAnnoucementTitle = new JLabel("Announcement Title");
			lblAnnoucementTitle.setForeground(new Color(51, 102, 153));
			lblAnnoucementTitle.setBounds(30, 266, 295, 38);
		}
		return lblAnnoucementTitle;
	}
	private JLabel getLblAnnoucementTitle_1() {
		if (lblAnnoucementTitle_1 == null) {
			lblAnnoucementTitle_1 = new JLabel("2021-04-23");
			lblAnnoucementTitle_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			lblAnnoucementTitle_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAnnoucementTitle_1.setForeground(new Color(153, 153, 153));
			lblAnnoucementTitle_1.setBounds(350, 266, 110, 38);
		}
		return lblAnnoucementTitle_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(204, 204, 204));
			separator.setBounds(20, 298, 450, 12);
		}
		return separator;
	}
	private JTextArea getTxtrAnnouncementContent() {
		if (txtrAnnouncementContent == null) {
			txtrAnnouncementContent = new JTextArea();
			txtrAnnouncementContent.setRows(20);
			txtrAnnouncementContent.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			txtrAnnouncementContent.setForeground(new Color(51, 102, 153));
			txtrAnnouncementContent.setText("Announcement Content\nhello everyone\ni'm fine thank you and you?");
			txtrAnnouncementContent.setBounds(30, 316, 430, 162);
		}
		return txtrAnnouncementContent;
	}
	
	
	// 21.04.24 hyokyeong -------------
	// Panel Team Status
	// --------------------------------
	private JPanel getPanelTeamStatus() {
		if (panelTeamStatus == null) {
			panelTeamStatus = new JPanel();
			panelTeamStatus.setBounds(300, 35, 490, 507);
			panelTeamStatus.setBackground(new Color(255, 255, 255));
			panelTeamStatus.setLayout(null);
			panelTeamStatus.add(getRbTeam1());
			panelTeamStatus.add(getTbTeam2());
			panelTeamStatus.add(getTextField_4_1());
			panelTeamStatus.add(getTfmate2_2());
			panelTeamStatus.add(getTfmate2_3());
			panelTeamStatus.add(getTfmate2_4());
			panelTeamStatus.add(getRbTeam3());
			panelTeamStatus.add(getRbTeam4());
			panelTeamStatus.add(getRbTeam5());
			panelTeamStatus.add(getTbTeam6());
			panelTeamStatus.add(getBtnNewButton());
			panelTeamStatus.add(getBtnOut());
			panelTeamStatus.add(getTextField_8_1());
			panelTeamStatus.add(getTextField_9_1());
			panelTeamStatus.add(getTextField_10_1());
			panelTeamStatus.add(getTextField_11_1());
			panelTeamStatus.add(getTextField_12_1());
			panelTeamStatus.add(getTextField_13_1());
			panelTeamStatus.add(getTextField_14_1());
			panelTeamStatus.add(getTextField_15_1());
			panelTeamStatus.add(getTextField_16_1());
			panelTeamStatus.add(getTextField_17_1());
			panelTeamStatus.add(getTextField_18_1());
			panelTeamStatus.add(getTextField_19_1());
			panelTeamStatus.add(getTextField_20_1());
			panelTeamStatus.add(getTextField_21_1());
			panelTeamStatus.add(getTextField_22_1());
			panelTeamStatus.add(getTextField_23_1());
			panelTeamStatus.add(getTfmate6_1());
			panelTeamStatus.add(getTfmate6_2());
			panelTeamStatus.add(getTfmate6_3());
			panelTeamStatus.add(getTfmate6_4());
			panelTeamStatus.add(getTextField_24_1());
		}
		return panelTeamStatus;
	}
	private JRadioButton getRbTeam1() {
		if (rbTeam1 == null) {
			rbTeam1 = new JRadioButton("Team 1");
			buttonGroup.add(rbTeam1);
			rbTeam1.setForeground(new Color(0, 51, 102));
			rbTeam1.setBounds(20, 22, 107, 23);
		}
		return rbTeam1;
	}
	private JRadioButton getTbTeam2() {
		if (tbTeam2 == null) {
			tbTeam2 = new JRadioButton("Team 2");
			buttonGroup.add(tbTeam2);
			tbTeam2.setForeground(new Color(0, 51, 102));
			tbTeam2.setBounds(20, 86, 107, 23);
		}
		return tbTeam2;
	}
	private JTextField getTextField_4_1() {
		if (tfmate2_1 == null) {
			tfmate2_1 = new JTextField();
			tfmate2_1.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate2_1.setForeground(new Color(0, 51, 102));
			tfmate2_1.setColumns(10);
			tfmate2_1.setBounds(20, 111, 110, 30);
		}
		return tfmate2_1;
	}
	private JTextField getTfmate2_2() {
		if (tfmate2_2 == null) {
			tfmate2_2 = new JTextField();
			tfmate2_2.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate2_2.setForeground(new Color(0, 51, 102));
			tfmate2_2.setColumns(10);
			tfmate2_2.setBounds(130, 111, 110, 30);
		}
		return tfmate2_2;
	}
	private JTextField getTfmate2_3() {
		if (tfmate2_3 == null) {
			tfmate2_3 = new JTextField();
			tfmate2_3.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate2_3.setForeground(new Color(0, 51, 102));
			tfmate2_3.setColumns(10);
			tfmate2_3.setBounds(240, 111, 110, 30);
		}
		return tfmate2_3;
	}
	private JTextField getTfmate2_4() {
		if (tfmate2_4 == null) {
			tfmate2_4 = new JTextField();
			tfmate2_4.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate2_4.setForeground(new Color(0, 51, 102));
			tfmate2_4.setColumns(10);
			tfmate2_4.setBounds(350, 111, 110, 30);
		}
		return tfmate2_4;
	}
	private JRadioButton getRbTeam3() {
		if (rbTeam3 == null) {
			rbTeam3 = new JRadioButton("Team 3");
			buttonGroup.add(rbTeam3);
			rbTeam3.setForeground(new Color(0, 51, 102));
			rbTeam3.setBounds(20, 149, 107, 23);
		}
		return rbTeam3;
	}
	private JRadioButton getRbTeam4() {
		if (rbTeam4 == null) {
			rbTeam4 = new JRadioButton("Team 4");
			buttonGroup.add(rbTeam4);
			rbTeam4.setForeground(new Color(0, 51, 102));
			rbTeam4.setBounds(20, 212, 107, 23);
		}
		return rbTeam4;
	}
	private JRadioButton getRbTeam5() {
		if (rbTeam5 == null) {
			rbTeam5 = new JRadioButton("Team 5");
			buttonGroup.add(rbTeam5);
			rbTeam5.setForeground(new Color(0, 51, 102));
			rbTeam5.setBounds(20, 275, 107, 23);
		}
		return rbTeam5;
	}
	private JRadioButton getTbTeam6() {
		if (tbTeam6 == null) {
			tbTeam6 = new JRadioButton("Team 6");
			buttonGroup.add(tbTeam6);
			tbTeam6.setForeground(new Color(0, 51, 102));
			tbTeam6.setBounds(20, 345, 107, 23);
		}
		return tbTeam6;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("IN");
			btnNewButton.setForeground(new Color(51, 102, 153));
			btnNewButton.setBounds(20, 455, 220, 40);
		}
		return btnNewButton;
	}
	private JButton getBtnOut() {
		if (btnOut == null) {
			btnOut = new JButton("OUT");
			btnOut.setBackground(new Color(255, 255, 255));
			btnOut.setForeground(new Color(51, 102, 153));
			btnOut.setBounds(240, 455, 220, 40);
		}
		return btnOut;
	}
	private JTextField getTextField_8_1() {
		if (tfmate3_1 == null) {
			tfmate3_1 = new JTextField();
			tfmate3_1.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate3_1.setForeground(new Color(0, 51, 102));
			tfmate3_1.setColumns(10);
			tfmate3_1.setBounds(20, 170, 110, 30);
		}
		return tfmate3_1;
	}
	private JTextField getTextField_9_1() {
		if (tfmate3_2 == null) {
			tfmate3_2 = new JTextField();
			tfmate3_2.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate3_2.setForeground(new Color(0, 51, 102));
			tfmate3_2.setColumns(10);
			tfmate3_2.setBounds(130, 170, 110, 30);
		}
		return tfmate3_2;
	}
	private JTextField getTextField_10_1() {
		if (tfmate3_3 == null) {
			tfmate3_3 = new JTextField();
			tfmate3_3.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate3_3.setForeground(new Color(0, 51, 102));
			tfmate3_3.setColumns(10);
			tfmate3_3.setBounds(240, 170, 110, 30);
		}
		return tfmate3_3;
	}
	private JTextField getTextField_11_1() {
		if (tfmate3_4 == null) {
			tfmate3_4 = new JTextField();
			tfmate3_4.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate3_4.setForeground(new Color(0, 51, 102));
			tfmate3_4.setColumns(10);
			tfmate3_4.setBounds(350, 170, 110, 30);
		}
		return tfmate3_4;
	}
	private JTextField getTextField_12_1() {
		if (tfmate4_1 == null) {
			tfmate4_1 = new JTextField();
			tfmate4_1.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate4_1.setForeground(new Color(0, 51, 102));
			tfmate4_1.setColumns(10);
			tfmate4_1.setBounds(20, 233, 110, 30);
		}
		return tfmate4_1;
	}
	private JTextField getTextField_13_1() {
		if (tfmate4_2 == null) {
			tfmate4_2 = new JTextField();
			tfmate4_2.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate4_2.setForeground(new Color(0, 51, 102));
			tfmate4_2.setColumns(10);
			tfmate4_2.setBounds(130, 233, 110, 30);
		}
		return tfmate4_2;
	}
	private JTextField getTextField_14_1() {
		if (tfmate4_3 == null) {
			tfmate4_3 = new JTextField();
			tfmate4_3.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate4_3.setForeground(new Color(0, 51, 102));
			tfmate4_3.setColumns(10);
			tfmate4_3.setBounds(240, 233, 110, 30);
		}
		return tfmate4_3;
	}
	private JTextField getTextField_15_1() {
		if (tfmate4_4 == null) {
			tfmate4_4 = new JTextField();
			tfmate4_4.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate4_4.setForeground(new Color(0, 51, 102));
			tfmate4_4.setColumns(10);
			tfmate4_4.setBounds(350, 233, 110, 30);
		}
		return tfmate4_4;
	}
	private JTextField getTextField_16_1() {
		if (tfmate5_1 == null) {
			tfmate5_1 = new JTextField();
			tfmate5_1.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate5_1.setForeground(new Color(0, 51, 102));
			tfmate5_1.setColumns(10);
			tfmate5_1.setBounds(20, 303, 110, 30);
		}
		return tfmate5_1;
	}
	private JTextField getTextField_17_1() {
		if (tfmate5_2 == null) {
			tfmate5_2 = new JTextField();
			tfmate5_2.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate5_2.setForeground(new Color(0, 51, 102));
			tfmate5_2.setColumns(10);
			tfmate5_2.setBounds(130, 303, 110, 30);
		}
		return tfmate5_2;
	}
	private JTextField getTextField_18_1() {
		if (tfmate5_3 == null) {
			tfmate5_3 = new JTextField();
			tfmate5_3.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate5_3.setForeground(new Color(0, 51, 102));
			tfmate5_3.setColumns(10);
			tfmate5_3.setBounds(240, 303, 110, 30);
		}
		return tfmate5_3;
	}
	private JTextField getTextField_19_1() {
		if (tfmate5_4 == null) {
			tfmate5_4 = new JTextField();
			tfmate5_4.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate5_4.setForeground(new Color(0, 51, 102));
			tfmate5_4.setColumns(10);
			tfmate5_4.setBounds(350, 303, 110, 30);
		}
		return tfmate5_4;
	}
	private JTextField getTextField_20_1() {
		if (tfmate1_1 == null) {
			tfmate1_1 = new JTextField();
			tfmate1_1.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate1_1.setForeground(new Color(0, 51, 102));
			tfmate1_1.setColumns(10);
			tfmate1_1.setBounds(20, 44, 110, 30);
		}
		return tfmate1_1;
	}
	private JTextField getTextField_21_1() {
		if (tfmate1_2 == null) {
			tfmate1_2 = new JTextField();
			tfmate1_2.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate1_2.setForeground(new Color(0, 51, 102));
			tfmate1_2.setColumns(10);
			tfmate1_2.setBounds(130, 44, 110, 30);
		}
		return tfmate1_2;
	}
	private JTextField getTextField_22_1() {
		if (tfmate1_3 == null) {
			tfmate1_3 = new JTextField();
			tfmate1_3.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate1_3.setForeground(new Color(0, 51, 102));
			tfmate1_3.setColumns(10);
			tfmate1_3.setBounds(240, 44, 110, 30);
		}
		return tfmate1_3;
	}
	private JTextField getTextField_23_1() {
		if (tfmate1_4 == null) {
			tfmate1_4 = new JTextField();
			tfmate1_4.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate1_4.setForeground(new Color(0, 51, 102));
			tfmate1_4.setColumns(10);
			tfmate1_4.setBounds(350, 44, 110, 30);
		}
		return tfmate1_4;
	}
	private JTextField getTfmate6_1() {
		if (tfmate6_1 == null) {
			tfmate6_1 = new JTextField();
			tfmate6_1.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate6_1.setForeground(new Color(0, 51, 102));
			tfmate6_1.setColumns(10);
			tfmate6_1.setBounds(20, 370, 110, 30);
		}
		return tfmate6_1;
	}
	private JTextField getTfmate6_2() {
		if (tfmate6_2 == null) {
			tfmate6_2 = new JTextField();
			tfmate6_2.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate6_2.setForeground(new Color(0, 51, 102));
			tfmate6_2.setColumns(10);
			tfmate6_2.setBounds(130, 370, 110, 30);
		}
		return tfmate6_2;
	}
	private JTextField getTfmate6_3() {
		if (tfmate6_3 == null) {
			tfmate6_3 = new JTextField();
			tfmate6_3.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate6_3.setForeground(new Color(0, 51, 102));
			tfmate6_3.setColumns(10);
			tfmate6_3.setBounds(240, 370, 110, 30);
		}
		return tfmate6_3;
	}
	private JTextField getTfmate6_4() {
		if (tfmate6_4 == null) {
			tfmate6_4 = new JTextField();
			tfmate6_4.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate6_4.setForeground(new Color(0, 51, 102));
			tfmate6_4.setColumns(10);
			tfmate6_4.setBounds(350, 370, 110, 30);
		}
		return tfmate6_4;
	}
	private JTextField getTextField_24_1() {
		if (tfmate6_5 == null) {
			tfmate6_5 = new JTextField();
			tfmate6_5.setHorizontalAlignment(SwingConstants.CENTER);
			tfmate6_5.setForeground(new Color(0, 51, 102));
			tfmate6_5.setColumns(10);
			tfmate6_5.setBounds(20, 399, 110, 30);
		}
		return tfmate6_5;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(0, 0, 300, 542);
			lblNewLabel_1.setIcon(new ImageIcon(Announcement.class.getResource("/image/leftPanel_Main.png")));
		}
		return lblNewLabel_1;
	}
} // end line
