package com.swing.teamstatus;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Teamstatus extends JPanel {

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
	
	/**
	 * Create the panel.
	 */
	
	public JPanel getTeamstatus() {
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

	}




