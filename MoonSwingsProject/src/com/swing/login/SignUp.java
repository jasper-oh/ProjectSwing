package com.swing.login;


// 비밀번호 제약 사항 몇자이상 몇사이내?
//어떤식으로 포함 할것 ?

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

public class SignUp {

	private JFrame frmSignUp;
	private JPanel panelSignUpImage;
	private JLabel lblSignUpImage;
	private JButton btnNewButton;
	private JLabel lblSignUpName;
	private JLabel lblSignUpId;
	private JLabel lblSignUpPw;
	private JLabel lblSignUpPwConfirm;
	private JLabel lblSignUpMbti;
	private JLabel lblSignUpAddress;
	private JLabel lblSignUpStrength;
	private JLabel lblSignUpPhoneNum;
	private JLabel lblSignUpGithub;
	private JLabel lblSignUpIntroduce;
	private JTextField tfSignUpId;
	private JPasswordField tfSignUpPw;
	private JPasswordField tfSignUpPwConfirm;
	private JTextField tfSignUpName;
	private JTextField tfSignUpPhone;
	private JTextField tfSignUpGithub;
	private JTextField txtJavacsql;
	private JTextField tfSignUpAddress;
	private JTextField tfSignUpBriefInfo;
	private JTextField tfSignUpMbti;
	private JButton btnSignUpSubmit;
	private JButton btnSignUpCancel;
	private JButton btnSignUpIdCheck;
	private JTextField txtJavacpython;
	private JTextField textField;
	private JTextField tfSignUpStrength;
	private JButton btnPwCheck;
	private JLabel lblSignUp;
	private JLabel lblSignUpPasswordCheck;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.getContentPane().setBackground(Color.WHITE);
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setBounds(100, 100, 500, 560);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		frmSignUp.setResizable(false);
		frmSignUp.getContentPane().add(getPanelSignUpImage());
		frmSignUp.getContentPane().add(getBtnNewButton());
		frmSignUp.getContentPane().add(getLblSignUpName());
		frmSignUp.getContentPane().add(getLblSignUpId());
		frmSignUp.getContentPane().add(getLblSignUpPw());
		frmSignUp.getContentPane().add(getLblSignUpPwConfirm());
		frmSignUp.getContentPane().add(getLblSignUpMbti());
		frmSignUp.getContentPane().add(getLblSignUpAddress());
		frmSignUp.getContentPane().add(getLblSignUpStrength());
		frmSignUp.getContentPane().add(getLblSignUpPhoneNum());
		frmSignUp.getContentPane().add(getLblSignUpGithub());
		frmSignUp.getContentPane().add(getLblSignUpIntroduce());
		frmSignUp.getContentPane().add(getTfSignUpId());
		frmSignUp.getContentPane().add(getTfSignUpPw());
		frmSignUp.getContentPane().add(getTfSignUpPwConfirm());
		frmSignUp.getContentPane().add(getTfSignUpName());
		frmSignUp.getContentPane().add(getTfSignUpPhone());
		frmSignUp.getContentPane().add(getTfSignUpGithub());
		frmSignUp.getContentPane().add(getTfSignUpAddress());
		frmSignUp.getContentPane().add(getTfSignUpBriefInfo());
		frmSignUp.getContentPane().add(getTfSignUpMbti());
		frmSignUp.getContentPane().add(getBtnSignUpSubmit());
		frmSignUp.getContentPane().add(getBtnSignUpCancel());
		frmSignUp.getContentPane().add(getBtnSignUpIdCheck());
		frmSignUp.getContentPane().add(getTfSignUpStrength());
		frmSignUp.getContentPane().add(getBtnPwCheck());
		frmSignUp.getContentPane().add(getLblSignUp());
		frmSignUp.getContentPane().add(getLblSignUpPasswordCheck());
	}
	private JPanel getPanelSignUpImage() {
		if (panelSignUpImage == null) {
			panelSignUpImage = new JPanel();
			panelSignUpImage.setBackground(new Color(0, 102, 204));
			panelSignUpImage.setBounds(35, 66, 100, 129);
			panelSignUpImage.setLayout(null);
			panelSignUpImage.add(getLblSignUpImage());
		}
		return panelSignUpImage;
	}
	private JLabel getLblSignUpImage() {
		if (lblSignUpImage == null) {
			lblSignUpImage = new JLabel("Image");
			lblSignUpImage.setForeground(Color.WHITE);
			lblSignUpImage.setHorizontalAlignment(SwingConstants.CENTER);
			lblSignUpImage.setBounds(17, 58, 61, 16);
		}
		return lblSignUpImage;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Import Image");
			btnNewButton.setForeground(new Color(0, 102, 204));
			btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
			btnNewButton.setBounds(35, 195, 100, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblSignUpName() {
		if (lblSignUpName == null) {
			lblSignUpName = new JLabel("Name :");
			lblSignUpName.setForeground(Color.GRAY);
			lblSignUpName.setBounds(35, 243, 53, 16);
		}
		return lblSignUpName;
	}
	private JLabel getLblSignUpId() {
		if (lblSignUpId == null) {
			lblSignUpId = new JLabel("ID : ");
			lblSignUpId.setForeground(Color.GRAY);
			lblSignUpId.setBounds(147, 78, 53, 16);
		}
		return lblSignUpId;
	}
	private JLabel getLblSignUpPw() {
		if (lblSignUpPw == null) {
			lblSignUpPw = new JLabel("Password :");
			lblSignUpPw.setForeground(Color.GRAY);
			lblSignUpPw.setBounds(147, 106, 75, 16);
		}
		return lblSignUpPw;
	}
	private JLabel getLblSignUpPwConfirm() {
		if (lblSignUpPwConfirm == null) {
			lblSignUpPwConfirm = new JLabel("ReCheck pw :");
			lblSignUpPwConfirm.setForeground(Color.GRAY);
			lblSignUpPwConfirm.setBounds(147, 135, 100, 16);
		}
		return lblSignUpPwConfirm;
	}
	private JLabel getLblSignUpMbti() {
		if (lblSignUpMbti == null) {
			lblSignUpMbti = new JLabel("MBTI :");
			lblSignUpMbti.setForeground(Color.GRAY);
			lblSignUpMbti.setBounds(35, 278, 61, 16);
		}
		return lblSignUpMbti;
	}
	private JLabel getLblSignUpAddress() {
		if (lblSignUpAddress == null) {
			lblSignUpAddress = new JLabel("Address (Nearby Station) :");
			lblSignUpAddress.setForeground(Color.GRAY);
			lblSignUpAddress.setBounds(35, 313, 178, 16);
		}
		return lblSignUpAddress;
	}
	private JLabel getLblSignUpStrength() {
		if (lblSignUpStrength == null) {
			lblSignUpStrength = new JLabel("Strength (language skill) :");
			lblSignUpStrength.setForeground(Color.GRAY);
			lblSignUpStrength.setBounds(35, 348, 164, 16);
		}
		return lblSignUpStrength;
	}
	private JLabel getLblSignUpPhoneNum() {
		if (lblSignUpPhoneNum == null) {
			lblSignUpPhoneNum = new JLabel("Phone :");
			lblSignUpPhoneNum.setForeground(Color.GRAY);
			lblSignUpPhoneNum.setBounds(224, 243, 61, 16);
		}
		return lblSignUpPhoneNum;
	}
	private JLabel getLblSignUpGithub() {
		if (lblSignUpGithub == null) {
			lblSignUpGithub = new JLabel("Github ID :");
			lblSignUpGithub.setForeground(Color.GRAY);
			lblSignUpGithub.setBounds(224, 278, 75, 16);
		}
		return lblSignUpGithub;
	}
	private JLabel getLblSignUpIntroduce() {
		if (lblSignUpIntroduce == null) {
			lblSignUpIntroduce = new JLabel("Tell us About Yourself !");
			lblSignUpIntroduce.setForeground(Color.GRAY);
			lblSignUpIntroduce.setBounds(36, 387, 164, 16);
		}
		return lblSignUpIntroduce;
	}
	private JTextField getTfSignUpId() {
		if (tfSignUpId == null) {
			tfSignUpId = new JTextField();
			tfSignUpId.setForeground(new Color(0, 102, 204));
			tfSignUpId.setBounds(239, 68, 150, 30);
			tfSignUpId.setColumns(10);
		}
		return tfSignUpId;
	}
	private JPasswordField getTfSignUpPw() {
		if (tfSignUpPw == null) {
			tfSignUpPw = new JPasswordField();
			tfSignUpPw.setForeground(new Color(0, 102, 204));
			tfSignUpPw.setBounds(239, 98, 150, 30);
		}
		return tfSignUpPw;
	}
	private JPasswordField getTfSignUpPwConfirm() {
		if (tfSignUpPwConfirm == null) {
			tfSignUpPwConfirm = new JPasswordField();
			tfSignUpPwConfirm.setForeground(new Color(0, 102, 204));
			tfSignUpPwConfirm.setBounds(239, 128, 150, 30);
		}
		return tfSignUpPwConfirm;
	}
	private JTextField getTfSignUpName() {
		if (tfSignUpName == null) {
			tfSignUpName = new JTextField();
			tfSignUpName.setForeground(new Color(0, 102, 204));
			tfSignUpName.setBounds(86, 236, 127, 30);
			tfSignUpName.setColumns(10);
		}
		return tfSignUpName;
	}
	private JTextField getTfSignUpPhone() {
		if (tfSignUpPhone == null) {
			tfSignUpPhone = new JTextField();
			tfSignUpPhone.setForeground(new Color(0, 102, 204));
			tfSignUpPhone.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfSignUpPhone.setText(null);
				}
			});
			tfSignUpPhone.setText("01011112222");
			tfSignUpPhone.setColumns(10);
			tfSignUpPhone.setBounds(275, 236, 190, 30);
		}
		return tfSignUpPhone;
	}
	private JTextField getTfSignUpGithub() {
		if (tfSignUpGithub == null) {
			tfSignUpGithub = new JTextField();
			tfSignUpGithub.setForeground(new Color(0, 102, 204));
			tfSignUpGithub.setColumns(10);
			tfSignUpGithub.setBounds(301, 271, 164, 30);
		}
		return tfSignUpGithub;
	}

	
	private JTextField getTfSignUpAddress() {
		if (tfSignUpAddress == null) {
			tfSignUpAddress = new JTextField();
			tfSignUpAddress.setForeground(new Color(0, 102, 204));
			tfSignUpAddress.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfSignUpAddress.setText(null);
				}
			});
			tfSignUpAddress.setText("GangnamStation");
			tfSignUpAddress.setColumns(10);
			tfSignUpAddress.setBounds(225, 306, 240, 30);
		}
		return tfSignUpAddress;
	}
	private JTextField getTfSignUpBriefInfo() {
		if (tfSignUpBriefInfo == null) {
			tfSignUpBriefInfo = new JTextField();
			tfSignUpBriefInfo.setForeground(new Color(0, 102, 204));
			tfSignUpBriefInfo.setBackground(Color.WHITE);
			tfSignUpBriefInfo.setBounds(35, 405, 430, 45);
			tfSignUpBriefInfo.setColumns(10);
		}
		return tfSignUpBriefInfo;
	}
	private JTextField getTfSignUpMbti() {
		if (tfSignUpMbti == null) {
			tfSignUpMbti = new JTextField();
			tfSignUpMbti.setForeground(new Color(0, 102, 204));
			tfSignUpMbti.setBounds(86, 271, 127, 30);
			tfSignUpMbti.setColumns(10);
		}
		return tfSignUpMbti;
	}
	
	private JTextField getTfSignUpStrength() {
		if (tfSignUpStrength == null) {
			tfSignUpStrength = new JTextField();
			tfSignUpStrength.setForeground(new Color(0, 102, 204));
			tfSignUpStrength.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfSignUpStrength.setText(null);
				}
			});
			tfSignUpStrength.setText("Java,C,Python");
			tfSignUpStrength.setBounds(225, 341, 240, 30);
			tfSignUpStrength.setColumns(10);
		}
		return tfSignUpStrength;
	}
	
	private JButton getBtnSignUpSubmit() {
		if (btnSignUpSubmit == null) {
			btnSignUpSubmit = new JButton("Submit");
			btnSignUpSubmit.setBackground(new Color(0, 102, 204));
			btnSignUpSubmit.setForeground(Color.WHITE);
			btnSignUpSubmit.setOpaque(true);
			btnSignUpSubmit.setBorderPainted(false);
			btnSignUpSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					signUpAction();
				}
			});
			btnSignUpSubmit.setBounds(343, 462, 117, 45);
		}
		return btnSignUpSubmit;
	}
	private JButton getBtnSignUpCancel() {
		if (btnSignUpCancel == null) {
			btnSignUpCancel = new JButton("Cancel");
			btnSignUpCancel.setForeground(new Color(0, 102, 204));
			btnSignUpCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frmSignUp.setVisible(false);
				}
			});
			btnSignUpCancel.setBounds(200, 462, 117, 45);
		}
		return btnSignUpCancel;
	}
	private JButton getBtnSignUpIdCheck() {
		if (btnSignUpIdCheck == null) {
			btnSignUpIdCheck = new JButton("ID Check");
			btnSignUpIdCheck.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			btnSignUpIdCheck.setForeground(new Color(0, 102, 204));
			btnSignUpIdCheck.setBounds(390, 68, 85, 29);
		}
		return btnSignUpIdCheck;
	}
	private JLabel getLblSignUpPasswordCheck() {
		if (lblSignUpPasswordCheck == null) {
			lblSignUpPasswordCheck = new JLabel("");
			lblSignUpPasswordCheck.setBounds(147, 170, 322, 16);
		}
		return lblSignUpPasswordCheck;
	}
	
	private void signUpAction() {
		char password1[] = tfSignUpPw.getPassword();
		char password2[] = tfSignUpPwConfirm.getPassword();
		
		for(int i = 0; i < password1.length;i++) {
			
			if(password1[i] == password2[i]) {
				
			}else {
				lblSignUpPasswordCheck.setText("Passwords are not match please check again!");
			}	
		}
	}
//	JOptionPane.showMessageDialog(null, "Sign Up Success! "+" \n Welcome "+ tfSignUpName.getText());
	private JButton getBtnPwCheck() {
		if (btnPwCheck == null) {
			btnPwCheck = new JButton("PW Check");
			btnPwCheck.setForeground(new Color(0, 102, 204));
			btnPwCheck.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			btnPwCheck.setBounds(390, 130, 85, 29);
		}
		return btnPwCheck;
	}
	private JLabel getLblSignUp() {
		if (lblSignUp == null) {
			lblSignUp = new JLabel("Sign Up");
			lblSignUp.setForeground(Color.GRAY);
			lblSignUp.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblSignUp.setBounds(35, 20, 75, 31);
		}
		return lblSignUp;
	}
}