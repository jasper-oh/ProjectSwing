package com.swing.mainpage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.swing.announcement.Announcement;
import com.swing.checkprofile.CheckProfile;
import com.swing.findteammate.FindTeammate;
import com.swing.teammatereview.TeammateReview;
import com.swing.teamstatus.Teamstatus;

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

public class MainPage {

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
	private JLabel lblImageDefaultLabel;
	private JLabel lblTitle;


	Teamstatus teamStatus = new Teamstatus();
	TeammateReview teammateReview = new TeammateReview();	
	FindTeammate findTeammate = new FindTeammate();
	CheckProfile checkProfile = new CheckProfile();
	Announcement announcement = new Announcement();
	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
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
				
				announcement.AnnouncementTable();
				teamStatus.setVisible(false);
				teammateReview.setVisible(false);
				checkProfile.setVisible(false);
				findTeammate.setVisible(false);
			}
		});
		frame.setBounds(100, 100,790, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(fixedPanel());
		frame.getContentPane().add(getLblTitle());
		frame.getContentPane().add(announcement.getAnnouncement());
		frame.getContentPane().add(teamStatus.getTeamstatus());
		frame.getContentPane().add(checkProfile.getCheckProfile());
		frame.getContentPane().add(teammateReview.getTeamReview());
		frame.getContentPane().add(findTeammate.getFindTeammate());
	}
	private JPanel fixedPanel() {
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
		announcement.getAnnouncement().setVisible(true);
		teamStatus.getTeamstatus().setVisible(false);
		checkProfile.getCheckProfile().setVisible(false);
		teammateReview.getTeamReview().setVisible(false);
		findTeammate.getFindTeammate().setVisible(false);

		
	}
	
	private void CheckProfileUIAction() {
		lblTitle.setText("Check Profile");
		announcement.getAnnouncement().setVisible(false);
		teamStatus.getTeamstatus().setVisible(false);
		checkProfile.getCheckProfile().setVisible(true);
		checkProfile.CheckProfileTableProject();
		checkProfile.CheckProfileTableReview();
		teammateReview.getTeamReview().setVisible(false);
		findTeammate.getFindTeammate().setVisible(false);
	}
	
	private void checkFindTeammateUIAction() {
		lblTitle.setText("Find Teammate");
		announcement.getAnnouncement().setVisible(false);
		teamStatus.getTeamstatus().setVisible(false);
		checkProfile.getCheckProfile().setVisible(false);
		teammateReview.getTeamReview().setVisible(false);
		findTeammate.getFindTeammate().setVisible(true);
		findTeammate.FindTeammateTableFindTeammate();
		findTeammate.FindTeammateTableYouPickedBy();
		
	}
	private void checkTeamReviewAction(){
		lblTitle.setText("Team Review");
		announcement.getAnnouncement().setVisible(false);
		teamStatus.getTeamstatus().setVisible(false);
		checkProfile.getCheckProfile().setVisible(false);
		teammateReview.getTeamReview().setVisible(true);
		findTeammate.getFindTeammate().setVisible(false);
		
	}
	private void checkTeammateStatusAction(){
		lblTitle.setText("Teammate Status");
		announcement.getAnnouncement().setVisible(false);
		teamStatus.getTeamstatus().setVisible(true);
		checkProfile.getCheckProfile().setVisible(false);
		teammateReview.getTeamReview().setVisible(false);
		findTeammate.getFindTeammate().setVisible(false);
		
	}

} 
