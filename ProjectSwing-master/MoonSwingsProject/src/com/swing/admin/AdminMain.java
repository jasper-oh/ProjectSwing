package com.swing.admin;

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

public class AdminMain {

	private JFrame frame;
	private JPanel fixedpanel;
	private JLabel lblMake;
	private JLabel lblTeam3;
	private JLabel lblBun;
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
	
//	Panel for Main Page == Announcement
	
	private JLabel lblImageDefaultLabel;
	private JLabel lblTitle;
	private JPanel panelAnnouncement;
	private JScrollPane scrollPane;
	private JTable tableAnnoucement;
	
//	Outer_table in Announcement
	private final DefaultTableModel Outer_Table_Announcement = new DefaultTableModel();
	
//  *** Panel Announcement end
	
	
//	Panel for TeamStatus 
	private JPanel panelTeamStatus;
	private JRadioButton rbTeam1;
	private JRadioButton tbTeam2;
	private JRadioButton rbTeam3;
	private JRadioButton rbTeam4;
	private JRadioButton rbTeam5;
	private JRadioButton tbTeam6;
//	Need to Change
	private JButton btnInTeamStatus;
	private JButton btnOutTeamStatus;
	private JTextField tfmate1_1;
	private JTextField tfmate1_2;
	private JTextField tfmate1_3;
	private JTextField tfmate1_4;
	private JTextField tfmate2_1;
	private JTextField tfmate2_2;
	private JTextField tfmate2_3;
	private JTextField tfmate2_4;
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
	private JTextField tfmate6_1;
	private JTextField tfmate6_2;
	private JTextField tfmate6_3;
	private JTextField tfmate6_4;
	private JTextField tfmate6_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblAnnoucementTitle;
	private JLabel lblAnnoucementDate;
	private JSeparator separator;
	private JTextArea txtrAnnouncementContent;
//	*** Panel TeamStatus end
	
//	Panel for CheckProfile
	private JPanel panelCheckProfile;
	private JPanel ImagePanel_1;
	private JLabel lblCheckProfileId;
	private JLabel lblCheckProfileName;
	private JLabel lblCheckProfileMbti;
	private JLabel lblCheckProfileGithub;
	private JLabel lblCheckProfileAddress;
	private JTextField tfCheckProfileId;
	private JTextField tfCheckProfileName;
	private JTextField tfCheckProfileAddress;
	private JTextField tfCheckProfileMbti;
	private JTextField tfCheckProfileGithub;
	private JLabel lblCheckProfileStrength;
	private JTextField tfCheckProfileStrength;
	private JLabel lblCheckProfileIntroduce;
	private JTextField tfCheckProfileIntroduse;
	private JScrollPane scrollPane_Project;
	private JTable ProjectTable;
	
//	outerTable for what??
	
	private final DefaultTableModel Outer_Table_ProjectTable = new DefaultTableModel();
	
//	outerTable for what??
	
	private final DefaultTableModel Outer_Table_TeammateReviewTable = new DefaultTableModel();
	
	private JLabel lblCheckProfileProject;
	private JLabel lblCheckProfileTeammateReview;
	private JScrollPane scrollPane_TeammateReview;
	private JButton btnEditinCheckProfile;
	private JTable TeammateReviewTable;
	private JLabel lblCheckProfilePhone;
	private JTextField tfCheckProfilePhone;
	
//	*** Panel CheckProfile end
	
//	Panel for TeamReview
	private JPanel panelTeamReview;
	private JScrollPane scrollPane_Project_1;
	private JLabel lblTeamReviewProject;
	private JLabel lblTeamReviewTeammateReview;
	private JScrollPane scrollPane_TeammateReview_1;
	private JButton btnTeamReviewSubmit;
	private JTable TRProjectTable;
	private JTable TRTeammateReviewTable;
//	*** Panel TeamReview end
	
//	Panel for FindTeammate
	private JPanel panelFindTeammate;
	private JScrollPane scrollPane_FindTeammate;
	private JTable TableFindTeammate;
	private final DefaultTableModel Outer_Table_FindTeammate = new DefaultTableModel();
	private JLabel lblFindTeammateYouPickedBy;
	private JScrollPane scrollPane_YouPickedBy;
	private JTable tableYouPickedBy;
	private final DefaultTableModel Outer_Table_YouPickedBy = new DefaultTableModel();
	
	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain window = new AdminMain();
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
	public AdminMain() {
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
				panelTeamReview.setVisible(false);
				panelCheckProfile.setVisible(false);
				panelFindTeammate.setVisible(false);
			}
		});
		frame.setBounds(100, 100,790, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getPanel());
		frame.getContentPane().add(getLblTitle());
		frame.getContentPane().add(getPanelAnnouncement());
		frame.getContentPane().add(getPanelTeamStatus());
		frame.getContentPane().add(getPanelCheckProfile());
		frame.getContentPane().add(getPanelTeamReview());
		frame.getContentPane().add(getPanel_1());
	}
	private JPanel getPanel() {
		if (fixedpanel== null) {
			fixedpanel= new JPanel();
			fixedpanel.setBackground(new Color(51, 102, 153));
			fixedpanel.setBounds(0, 0, 300, 542);
			fixedpanel.setLayout(null);
			fixedpanel.add(getLblMake());
			fixedpanel.add(getLblTeam3());
			fixedpanel.add(getLblBun());
			fixedpanel.add(getImagePanel());
			fixedpanel.add(getLblId());
			fixedpanel.add(getLblName());
			fixedpanel.add(getLblMbti());
			fixedpanel.add(getLblGithub());
			fixedpanel.add(getLblShowId());
			fixedpanel.add(getLblShowName());
			fixedpanel.add(getLblShowGithub());
			fixedpanel.add(getLblShowMbti());
			fixedpanel.add(getBtnAnnounce());
			fixedpanel.add(getBtnCheckProfile());
			fixedpanel.add(getBtnFindTeammate());
			fixedpanel.add(getBtnTeamReview());
			fixedpanel.add(getBtnTeammateStatus());
		}
		return fixedpanel;
	}
	private JLabel getLblMake() {
		if (lblMake == null) {
			lblMake = new JLabel("作");
			lblMake.setBounds(6, 6, 16, 16);
		}
		return lblMake;
	}
	private JLabel getLblTeam3() {
		if (lblTeam3 == null) {
			lblTeam3 = new JLabel("Team3");
			lblTeam3.setBounds(23, 6, 47, 16);
		}
		return lblTeam3;
	}
	private JLabel getLblBun() {
		if (lblBun == null) {
			lblBun = new JLabel("BUN");
			lblBun.setBounds(68, 6, 26, 16);
		}
		return lblBun;
	}
	private JPanel getImagePanel() {
		if (ImagePanel == null) {
			ImagePanel = new JPanel();
			ImagePanel.setBounds(23, 54, 87, 108);
			ImagePanel.setLayout(null);
			ImagePanel.add(getLblImageDefaultLabel());
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
	private JLabel getLblImageDefaultLabel() {
		if (lblImageDefaultLabel == null) {
			lblImageDefaultLabel = new JLabel("Image");
			lblImageDefaultLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblImageDefaultLabel.setBounds(6, 44, 75, 16);
		}
		return lblImageDefaultLabel;
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
		panelCheckProfile.setVisible(false);
		panelTeamReview.setVisible(false);
		panelFindTeammate.setVisible(false);

		
	}
	
	private void CheckProfileUIAction() {
		lblTitle.setText("Check Profile");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(false);
		panelCheckProfile.setVisible(true);
		CheckProfileTableProject();
		CheckProfileTableReview();
		panelTeamReview.setVisible(false);
		panelFindTeammate.setVisible(false);
	}
	
	private void checkFindTeammateUIAction() {
		lblTitle.setText("Find Teammate");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(false);
		panelCheckProfile.setVisible(false);
		panelTeamReview.setVisible(false);
		panelFindTeammate.setVisible(true);
		FindTeammateTableFindTeammate();
		FindTeammateTableYouPickedBy();
		
	}
	private void checkTeamReviewAction(){
		lblTitle.setText("Team Review");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(false);
		panelCheckProfile.setVisible(false);
		panelTeamReview.setVisible(true);
		panelFindTeammate.setVisible(false);
		
	}
	private void checkTeammateStatusAction(){
		lblTitle.setText("Teammate Status");
		panelAnnouncement.setVisible(false);
		panelTeamStatus.setVisible(true);
		panelCheckProfile.setVisible(false);
		panelTeamReview.setVisible(false);
		panelFindTeammate.setVisible(false);
		
	}
	// 21.04.24 SeongYeon-------------
	// PanelCheckProfile
	// --------------------------------
	private JPanel getPanelCheckProfile() {
		if (panelCheckProfile == null) {
			panelCheckProfile = new JPanel();
			panelCheckProfile.setBackground(new Color(255, 255, 255));
			panelCheckProfile.setForeground(Color.BLACK);
			panelCheckProfile.setBounds(300, 35, 470, 479);
			panelCheckProfile.setLayout(null);
			panelCheckProfile.add(getImagePanel_1());
			panelCheckProfile.add(getLblCheckProfileId());
			panelCheckProfile.add(getLblCheckProfileName());
			panelCheckProfile.add(getLblCheckProfileMbti());
			panelCheckProfile.add(getLblCheckProfileGithub());
			panelCheckProfile.add(getLblCheckProfileAddress());
			panelCheckProfile.add(getTfCheckProfileId());
			panelCheckProfile.add(getTfCheckProfileName());
			panelCheckProfile.add(getTfCheckProfileAddress());
			panelCheckProfile.add(getTfCheckProfileMbti());
			panelCheckProfile.add(getTfCheckProfileGithub());
			panelCheckProfile.add(getLblCheckProfileStrength());
			panelCheckProfile.add(getTextField_4());
			panelCheckProfile.add(getLblCheckProfileIntroduce());
			panelCheckProfile.add(getTextField_5());
			panelCheckProfile.add(getScrollPane_Project());
			panelCheckProfile.add(getLblCheckProfileProject());
			panelCheckProfile.add(getLblCheckProfileTeammateReview());
			panelCheckProfile.add(getScrollPane_TeammateReview());
			panelCheckProfile.add(getBtnEditinCheckProfile());
			panelCheckProfile.add(getLblCheckProfilePhone());
			panelCheckProfile.add(getTfCheckProfilePhone());
		}
		return panelCheckProfile;
	}
	
	private JPanel getImagePanel_1() {
		if (ImagePanel_1 == null) {
			ImagePanel_1 = new JPanel();
			ImagePanel_1.setLayout(null);
			ImagePanel_1.setBounds(36, 25, 132, 158);
		}
		return ImagePanel_1;
	}
	private JLabel getLblCheckProfileId() {
		if (lblCheckProfileId == null) {
			lblCheckProfileId = new JLabel("ID :");
			lblCheckProfileId.setBounds(180, 30, 61, 16);
		}
		return lblCheckProfileId;
	}
	private JLabel getLblCheckProfileName() {
		if (lblCheckProfileName == null) {
			lblCheckProfileName = new JLabel("Name :");
			lblCheckProfileName.setBounds(180, 55, 61, 16);
		}
		return lblCheckProfileName;
	}
	private JLabel getLblCheckProfileMbti() {
		if (lblCheckProfileMbti == null) {
			lblCheckProfileMbti = new JLabel("MBTI :");
			lblCheckProfileMbti.setBounds(180, 80, 47, 16);
		}
		return lblCheckProfileMbti;
	}
	private JLabel getLblCheckProfileGithub() {
		if (lblCheckProfileGithub == null) {
			lblCheckProfileGithub = new JLabel("Github :");
			lblCheckProfileGithub.setBounds(180, 105, 61, 16);
		}
		return lblCheckProfileGithub;
	}
	
	private JLabel getLblCheckProfileAddress() {
		if (lblCheckProfileAddress == null) {
			lblCheckProfileAddress = new JLabel("Address :");
			lblCheckProfileAddress.setBounds(180, 130, 61, 16);
		}
		return lblCheckProfileAddress;
	}
	private JTextField getTfCheckProfileId() {
		if (tfCheckProfileId == null) {
			tfCheckProfileId = new JTextField();
			tfCheckProfileId.setBounds(253, 25, 116, 21);
			tfCheckProfileId.setColumns(10);
		}
		return tfCheckProfileId;
	}
	private JTextField getTfCheckProfileName() {
		if (tfCheckProfileName == null) {
			tfCheckProfileName = new JTextField();
			tfCheckProfileName.setColumns(10);
			tfCheckProfileName.setBounds(253, 50, 116, 21);
		}
		return tfCheckProfileName;
	}
	private JTextField getTfCheckProfileAddress() {
		if (tfCheckProfileAddress == null) {
			tfCheckProfileAddress = new JTextField();
			tfCheckProfileAddress.setColumns(10);
			tfCheckProfileAddress.setBounds(253, 125, 184, 21);
		}
		return tfCheckProfileAddress;
	}
	private JTextField getTfCheckProfileMbti() {
		if (tfCheckProfileMbti == null) {
			tfCheckProfileMbti = new JTextField();
			tfCheckProfileMbti.setColumns(10);
			tfCheckProfileMbti.setBounds(253, 75, 116, 21);
		}
		return tfCheckProfileMbti;
	}
	private JTextField getTfCheckProfileGithub() {
		if (tfCheckProfileGithub == null) {
			tfCheckProfileGithub = new JTextField();
			tfCheckProfileGithub.setColumns(10);
			tfCheckProfileGithub.setBounds(253, 100, 184, 21);
		}
		return tfCheckProfileGithub;
	}
	private JLabel getLblCheckProfileStrength() {
		if (lblCheckProfileStrength == null) {
			lblCheckProfileStrength = new JLabel("Strength(사용가능언어) :");
			lblCheckProfileStrength.setBounds(36, 193, 143, 15);
		}
		return lblCheckProfileStrength;
	}
	private JTextField getTextField_4() {
		if (tfCheckProfileStrength == null) {
			tfCheckProfileStrength = new JTextField();
			tfCheckProfileStrength.setBounds(180, 190, 257, 21);
			tfCheckProfileStrength.setColumns(10);
		}
		return tfCheckProfileStrength;
	}
	private JLabel getLblCheckProfileIntroduce() {
		if (lblCheckProfileIntroduce == null) {
			lblCheckProfileIntroduce = new JLabel("한줄 자기소개 :");
			lblCheckProfileIntroduce.setBounds(36, 223, 91, 15);
		}
		return lblCheckProfileIntroduce;
	}
	private JTextField getTextField_5() {
		if (tfCheckProfileIntroduse == null) {
			tfCheckProfileIntroduse = new JTextField();
			tfCheckProfileIntroduse.setColumns(10);
			tfCheckProfileIntroduse.setBounds(126, 218, 311, 21);
		}
		return tfCheckProfileIntroduse;
	}
	private JScrollPane getScrollPane_Project() {
		if (scrollPane_Project == null) {
			scrollPane_Project = new JScrollPane();
			scrollPane_Project.setBounds(36, 271, 401, 74);
			scrollPane_Project.setViewportView(getProjectTable());
		}
		return scrollPane_Project;
	}
	private JTable getProjectTable() {
		if (ProjectTable == null) {
			ProjectTable = new JTable();
			ProjectTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			ProjectTable.setModel(Outer_Table_ProjectTable); // <--***************************************************
			ProjectTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			ProjectTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			
		}
		return ProjectTable;
	}
	private JLabel getLblCheckProfileProject() {
		if (lblCheckProfileProject == null) {
			lblCheckProfileProject = new JLabel("Project");
			lblCheckProfileProject.setFont(new Font("굴림", Font.BOLD, 18));
			lblCheckProfileProject.setBounds(36, 249, 67, 21);
		}
		return lblCheckProfileProject;
	}
	private JLabel getLblCheckProfileTeammateReview() {
		if (lblCheckProfileTeammateReview == null) {
			lblCheckProfileTeammateReview = new JLabel("Teammate Review");
			lblCheckProfileTeammateReview.setFont(new Font("굴림", Font.BOLD, 18));
			lblCheckProfileTeammateReview.setBounds(36, 349, 170, 21);
		}
		return lblCheckProfileTeammateReview;
	}
	private JScrollPane getScrollPane_TeammateReview() {
		if (scrollPane_TeammateReview == null) {
			scrollPane_TeammateReview = new JScrollPane();
			scrollPane_TeammateReview.setBounds(36, 369, 401, 74);
			scrollPane_TeammateReview.setViewportView(getTeammateReviewTable());
		}
		return scrollPane_TeammateReview;
	}
	private JButton getBtnEditinCheckProfile() {
		if (btnEditinCheckProfile == null) {
			btnEditinCheckProfile = new JButton("Edit");
			btnEditinCheckProfile.setBounds(180, 450, 97, 23);
		}
		return btnEditinCheckProfile;
	}

	private JTable getTeammateReviewTable() {
		if (TeammateReviewTable == null) {
			TeammateReviewTable = new JTable();
			TeammateReviewTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TeammateReviewTable.setModel(Outer_Table_TeammateReviewTable); // <--***************************************************
			TeammateReviewTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TeammateReviewTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TeammateReviewTable;
	}
	private JLabel getLblCheckProfilePhone() {
		if (lblCheckProfilePhone == null) {
			lblCheckProfilePhone = new JLabel("Phone :");
			lblCheckProfilePhone.setBounds(180, 155, 61, 16);
		}
		return lblCheckProfilePhone;
	}
	private JTextField getTfCheckProfilePhone() {
		if (tfCheckProfilePhone == null) {
			tfCheckProfilePhone = new JTextField();
			tfCheckProfilePhone.setColumns(10);
			tfCheckProfilePhone.setBounds(253, 150, 184, 21);
		}
		return tfCheckProfilePhone;
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
			panelAnnouncement.add(getLblAnnoucementDate());
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
			tableAnnoucement.setModel(Outer_Table_Announcement); 
		}
		return tableAnnoucement;
	}
	
	private void TableInit(){
		
	    int i = Outer_Table_Announcement.getRowCount();
	    Outer_Table_Announcement.addColumn("No");
	    Outer_Table_Announcement.addColumn("Date");
	    Outer_Table_Announcement.addColumn("Title");
	    Outer_Table_Announcement.addColumn("Count");
	    Outer_Table_Announcement.setColumnCount(4);
	    
	    for(int j = 0 ; j < i ; j++){
	      Outer_Table_Announcement.removeRow(0);
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
			lblAnnoucementTitle.setBounds(30, 266, 295, 38);
			lblAnnoucementTitle.setForeground(new Color(51, 102, 153));
		}
		return lblAnnoucementTitle;
	}
	private JLabel getLblAnnoucementDate() {
		if (lblAnnoucementDate == null) {
			lblAnnoucementDate = new JLabel("2021-04-23");
			lblAnnoucementDate.setBounds(350, 266, 110, 38);
			lblAnnoucementDate.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			lblAnnoucementDate.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAnnoucementDate.setForeground(new Color(153, 153, 153));
		}
		return lblAnnoucementDate;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(20, 298, 450, 12);
			separator.setForeground(new Color(204, 204, 204));
		}
		return separator;
	}
	private JTextArea getTxtrAnnouncementContent() {
		if (txtrAnnouncementContent == null) {
			txtrAnnouncementContent = new JTextArea();
			txtrAnnouncementContent.setBounds(30, 316, 430, 162);
			txtrAnnouncementContent.setRows(20);
			txtrAnnouncementContent.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			txtrAnnouncementContent.setForeground(new Color(51, 102, 153));
			txtrAnnouncementContent.setText("Announcement Content\nhello everyone\ni'm fine thank you and you?");
		}
		return txtrAnnouncementContent;
	}
	
//	CheckProfile Table
	private void CheckProfileTableProject(){
	    int i = Outer_Table_ProjectTable.getRowCount();
	    Outer_Table_ProjectTable.addColumn("Project Name");
	    Outer_Table_ProjectTable.addColumn("TeaName");
	    Outer_Table_ProjectTable.addColumn("결과물-Git Address");
	    Outer_Table_ProjectTable.setColumnCount(3);
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_ProjectTable.removeRow(0);
	    }
	    ProjectTable.setAutoResizeMode(ProjectTable.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = ProjectTable.getColumnModel().getColumn(vColIndex);
	    int width = 50;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = ProjectTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = ProjectTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    
	}
	@SuppressWarnings("static-access")
	private void CheckProfileTableReview(){
	    int i = Outer_Table_TeammateReviewTable.getRowCount();
	    Outer_Table_TeammateReviewTable.addColumn("Signal Name");
	    Outer_Table_TeammateReviewTable.addColumn("Project Name");
	    Outer_Table_TeammateReviewTable.addColumn("Review");
	    Outer_Table_TeammateReviewTable.setColumnCount(3);
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_TeammateReviewTable.removeRow(0);
	    }
	    TeammateReviewTable.setAutoResizeMode(TeammateReviewTable.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = TeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    int width = 50;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = TeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = TeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);

	}
// 		21.04.24 SeongYeon -------------
// 		Panel Team Review
// 		--------------------------------
	
	private JPanel getPanelTeamReview() {
		if (panelTeamReview == null) {
			panelTeamReview = new JPanel();
			panelTeamReview.setBounds(300, 35, 470, 479);
			panelTeamReview.setLayout(null);
			panelTeamReview.add(getScrollPane_Project_1());
			panelTeamReview.add(getLblTeamReviewProject());
			panelTeamReview.add(getLblTeamReviewTeammateReview());
			panelTeamReview.add(getScrollPane_TeammateReview_1());
			panelTeamReview.add(getBtnTeamReviewSubmit());
		}
		return panelTeamReview;
	}
	private JScrollPane getScrollPane_Project_1() {
		if (scrollPane_Project_1 == null) {
			scrollPane_Project_1 = new JScrollPane();
			scrollPane_Project_1.setBounds(33, 67, 401, 116);
			scrollPane_Project_1.setViewportView(getTRProjectTable());
		}
		return scrollPane_Project_1;
	}
	private JLabel getLblTeamReviewProject() {
		if (lblTeamReviewProject == null) {
			lblTeamReviewProject = new JLabel("Project");
			lblTeamReviewProject.setFont(new Font("굴림", Font.BOLD, 18));
			lblTeamReviewProject.setBounds(33, 45, 67, 21);
		}
		return lblTeamReviewProject;
	}
	private JLabel getLblTeamReviewTeammateReview() {
		if (lblTeamReviewTeammateReview == null) {
			lblTeamReviewTeammateReview = new JLabel("Teammate Review");
			lblTeamReviewTeammateReview.setFont(new Font("굴림", Font.BOLD, 18));
			lblTeamReviewTeammateReview.setBounds(33, 201, 170, 21);
		}
		return lblTeamReviewTeammateReview;
	}
	private JScrollPane getScrollPane_TeammateReview_1() {
		if (scrollPane_TeammateReview_1 == null) {
			scrollPane_TeammateReview_1 = new JScrollPane();
			scrollPane_TeammateReview_1.setBounds(33, 221, 401, 156);
			scrollPane_TeammateReview_1.setViewportView(getTRTeammateReviewTable());
		}
		return scrollPane_TeammateReview_1;
	}
	private JButton getBtnTeamReviewSubmit() {
		if (btnTeamReviewSubmit == null) {
			btnTeamReviewSubmit = new JButton("Submit");
			btnTeamReviewSubmit.setBounds(337, 400, 97, 23);
		}
		return btnTeamReviewSubmit;
	}
	private JTable getTRProjectTable() {
		if (TRProjectTable == null) {
			TRProjectTable = new JTable();
			TRProjectTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TRProjectTable.setModel(Outer_Table_ProjectTable); // <--***************************************************
			TRProjectTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TRProjectTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TRProjectTable;
	}
	private JTable getTRTeammateReviewTable() {
		if (TRTeammateReviewTable == null) {
			TRTeammateReviewTable = new JTable();
			TRTeammateReviewTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TRTeammateReviewTable.setModel(Outer_Table_TeammateReviewTable); // <--***************************************************
			TRTeammateReviewTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TRTeammateReviewTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TRTeammateReviewTable;
	}
	
	
// 		21.04.24 hyokyeong -------------
// 		Panel Team Status
// 		--------------------------------
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
			panelTeamStatus.add(getBtnInTeamStatus());
			panelTeamStatus.add(getBtnOutTeamStatus());
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
	private JButton getBtnInTeamStatus() {
		if (btnInTeamStatus == null) {
			btnInTeamStatus = new JButton("IN");
			btnInTeamStatus.setForeground(new Color(51, 102, 153));
			btnInTeamStatus.setBounds(20, 455, 220, 40);
		}
		return btnInTeamStatus;
	}
	private JButton getBtnOutTeamStatus() {
		if (btnOutTeamStatus == null) {
			btnOutTeamStatus = new JButton("OUT");
			btnOutTeamStatus.setBackground(new Color(255, 255, 255));
			btnOutTeamStatus.setForeground(new Color(51, 102, 153));
			btnOutTeamStatus.setBounds(240, 455, 220, 40);
		}
		return btnOutTeamStatus;
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
	
	/* Panel Find Teammate*/
	

	private JPanel getPanel_1() {
		if (panelFindTeammate == null) {
			panelFindTeammate = new JPanel();
			panelFindTeammate.setBounds(300, 35, 490, 507);
			panelFindTeammate.setLayout(null);
			panelFindTeammate.add(getScrollPane_FindTeammate());
			panelFindTeammate.add(getLblFindTeammateYouPickedBy());
			panelFindTeammate.add(getScrollPane_YouPickedBy());

		}
		return panelFindTeammate;
	}
//	Find Teammate Table
	private JScrollPane getScrollPane_FindTeammate() {
		if (scrollPane_FindTeammate == null) {
			scrollPane_FindTeammate = new JScrollPane();
			scrollPane_FindTeammate.setBounds(6, 6, 478, 225);
			scrollPane_FindTeammate.setViewportView(getTableFindTeammate());
		}
		return scrollPane_FindTeammate;
	}
	private JTable getTableFindTeammate() {
		if (TableFindTeammate == null) {
			TableFindTeammate = new JTable();
			TableFindTeammate.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TableFindTeammate.setModel(Outer_Table_FindTeammate); // <--***************************************************
			TableFindTeammate.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			TableFindTeammate.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
		}
		return TableFindTeammate;
	}
	
	private void FindTeammateTableFindTeammate(){
		int i = Outer_Table_FindTeammate.getRowCount();
		Outer_Table_FindTeammate.addColumn("Name");
		Outer_Table_FindTeammate.addColumn("Github");
		Outer_Table_FindTeammate.addColumn("TeamStatus");
		Outer_Table_FindTeammate.addColumn("MBTI");
		Outer_Table_FindTeammate.setColumnCount(4);
		for(int j = 0 ; j < i ; j++){
			Outer_Table_YouPickedBy.removeRow(0);
		}
		tableYouPickedBy.setAutoResizeMode(TeammateReviewTable.AUTO_RESIZE_OFF);
		int vColIndex = 0;
		TableColumn col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		int width = 120;
		col.setPreferredWidth(width);
		vColIndex = 1;
		col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 2;
		col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 3;
		col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
}
//	*** End Find Teammate Table
	
//	You Picked By Table
	private JLabel getLblFindTeammateYouPickedBy() {
		if (lblFindTeammateYouPickedBy == null) {
			lblFindTeammateYouPickedBy = new JLabel("You Picked By");
			lblFindTeammateYouPickedBy.setForeground(Color.GRAY);
			lblFindTeammateYouPickedBy.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblFindTeammateYouPickedBy.setBounds(6, 255, 327, 36);
		}
		return lblFindTeammateYouPickedBy;
	}
	private JScrollPane getScrollPane_YouPickedBy() {
		if (scrollPane_YouPickedBy == null) {
			scrollPane_YouPickedBy = new JScrollPane();
			scrollPane_YouPickedBy.setBounds(6, 287, 478, 214);
			scrollPane_YouPickedBy.setViewportView(getTableYouPickedBy());
		}
		return scrollPane_YouPickedBy;
	}
	private JTable getTableYouPickedBy() {
		if (tableYouPickedBy == null) {
			tableYouPickedBy = new JTable();
			tableYouPickedBy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableYouPickedBy.setModel(Outer_Table_YouPickedBy); // <--***************************************************
			tableYouPickedBy.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			tableYouPickedBy.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
		}
		return tableYouPickedBy;
	}
		private void FindTeammateTableYouPickedBy(){
			int i = Outer_Table_FindTeammate.getRowCount();
			Outer_Table_YouPickedBy.addColumn("Name");
			Outer_Table_YouPickedBy.addColumn("Github");
			Outer_Table_YouPickedBy.addColumn("TeamStatus");
			Outer_Table_YouPickedBy.addColumn("MBTI");
			Outer_Table_YouPickedBy.setColumnCount(4);
			for(int j = 0 ; j < i ; j++){
				Outer_Table_YouPickedBy.removeRow(0);
			}
			tableYouPickedBy.setAutoResizeMode(TeammateReviewTable.AUTO_RESIZE_OFF);
			int vColIndex = 0;
			TableColumn col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			int width = 120;
			col.setPreferredWidth(width);
			vColIndex = 1;
			col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			width = 120;
			col.setPreferredWidth(width);
			vColIndex = 2;
			col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			width = 120;
			col.setPreferredWidth(width);
			vColIndex = 3;
			col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			width = 120;
			col.setPreferredWidth(width);
	}
//		*** You Picked By Table
} 
