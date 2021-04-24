package com.swing.login;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.swing.mainpage.MainPage;

import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmteam;
	private JPanel panel;
	private JLabel lblMake;
	private JLabel lblNewLabel;
	private JLabel lblBun;
	private JLabel lblSignIn;
	private JLabel lblLoginUserId;
	private JTextField tfLoginUserId;
	private JLabel lblLoginPassword;
	private JTextField tfLoginPassword;
	private JButton btnLoginSignIn;
	private JButton btnLoginSignUp;
	private JButton btnLoginFindIdPw;
	

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Login loginWindow = new Login();
					loginWindow.frmteam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmteam = new JFrame();
		frmteam.setTitle("작TEAM3분");
		frmteam.setBounds(100, 100, 790, 570);
		frmteam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmteam.getContentPane().setLayout(null);
		frmteam.getContentPane().add(getPanel());
		frmteam.getContentPane().add(getLblSignIn());
		frmteam.getContentPane().add(getLblLoginUserId());
		frmteam.getContentPane().add(getTfLoginUserId());
		frmteam.getContentPane().add(getLblLoginPassword());
		frmteam.getContentPane().add(getTfLoginPassword());
		frmteam.getContentPane().add(getBtnLoginSignIn());
		frmteam.getContentPane().add(getBtnLoginSignUp());
		frmteam.getContentPane().add(getBtnLoginFindIdPw());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 102, 153));
			panel.setBounds(0, 0, 363, 542);
			panel.setLayout(null);
			panel.add(getLblMake());
			panel.add(getLblNewLabel());
			panel.add(getLblBun());
		}
		return panel;
	}
	private JLabel getLblMake() {
		if (lblMake == null) {
			lblMake = new JLabel("作");
			lblMake.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
			lblMake.setBounds(71, 118, 45, 44);
		}
		return lblMake;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("TEAM3");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 33));
			lblNewLabel.setBounds(90, 192, 156, 44);
		}
		return lblNewLabel;
	}
	private JLabel getLblBun() {
		if (lblBun == null) {
			lblBun = new JLabel("BUN");
			lblBun.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
			lblBun.setBounds(185, 274, 61, 29);
		}
		return lblBun;
	}
	private JLabel getLblSignIn() {
		if (lblSignIn == null) {
			lblSignIn = new JLabel("SIGN IN");
			lblSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblSignIn.setBounds(434, 50, 83, 31);
		}
		return lblSignIn;
	}
	private JLabel getLblLoginUserId() {
		if (lblLoginUserId == null) {
			lblLoginUserId = new JLabel("User ID");
			lblLoginUserId.setForeground(new Color(0, 51, 102));
			lblLoginUserId.setBounds(434, 146, 61, 16);
		}
		return lblLoginUserId;
	}
	private JTextField getTfLoginUserId() {
		if (tfLoginUserId == null) {
			tfLoginUserId = new JTextField();
			tfLoginUserId.setBackground(SystemColor.window);
			tfLoginUserId.setBounds(434, 174, 319, 52);
			tfLoginUserId.setColumns(10);
		}
		return tfLoginUserId;
	}
	private JLabel getLblLoginPassword() {
		if (lblLoginPassword == null) {
			lblLoginPassword = new JLabel("Password");
			lblLoginPassword.setForeground(new Color(0, 51, 102));
			lblLoginPassword.setBounds(434, 258, 61, 16);
		}
		return lblLoginPassword;
	}
	private JTextField getTfLoginPassword() {
		if (tfLoginPassword == null) {
			tfLoginPassword = new JTextField();
			tfLoginPassword.setBackground(SystemColor.window);
			tfLoginPassword.setColumns(10);
			tfLoginPassword.setBounds(434, 286, 319, 52);
		}
		return tfLoginPassword;
	}
	private JButton getBtnLoginSignIn() {
		if (btnLoginSignIn == null) {
			btnLoginSignIn = new JButton("Sign In");
			btnLoginSignIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		
					MainPage mainPage= new MainPage();
					mainPage.run();
					frmteam.setVisible(false);
		
				}
			});
			btnLoginSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			btnLoginSignIn.setBounds(434, 399, 319, 43);
			btnLoginSignIn.setForeground(new Color(0, 51, 102));
			btnLoginSignIn.setBackground(new Color(51, 102, 153));
		}
		return btnLoginSignIn;
	}
	private JButton getBtnLoginSignUp() {
		if (btnLoginSignUp == null) {
			btnLoginSignUp = new JButton("Sign Up");
			btnLoginSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SignUp signUp = new SignUp();
					signUp.run();
				}
			});
			btnLoginSignUp.setForeground(new Color(0, 51, 102));
			btnLoginSignUp.setBackground(new Color(51, 102, 153));
			btnLoginSignUp.setBounds(434, 454, 159, 43);
		}
		return btnLoginSignUp;
	}
	private JButton getBtnLoginFindIdPw() {
		if (btnLoginFindIdPw == null) {
			btnLoginFindIdPw = new JButton("Find ID / PW");
			btnLoginFindIdPw.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FindIdPw findIdPw = new FindIdPw();
					findIdPw.run();
				}
			});
			btnLoginFindIdPw.setBounds(594, 454, 159, 43);
		}
		return btnLoginFindIdPw;
	}
}
