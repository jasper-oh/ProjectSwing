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

public class SignUp {

	private JFrame frmSignUp;
	private JPanel panelSignUpImage;
	private JLabel lblSignUpImage;
	private JButton btnNewButton;
	private JLabel lblSignUpName;
	private JLabel lblSignUpId;
	private JLabel lblSignUpPw;
	private JLabel lblSignUpPwConfirm;
	private JLabel lblLoginPersonalInfo;
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
	private JLabel lblSignUpPasswordCheck;
	private JTextField txtJavacpython;
	private JTextField textField;
	private JTextField tfSignUpStrength;

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
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setBounds(100, 100, 687, 541);
//		TODO 현재만 꺼질수 있게끔 해야함 
		
//		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		frmSignUp.getContentPane().add(getPanelSignUpImage());
		frmSignUp.getContentPane().add(getBtnNewButton());
		frmSignUp.getContentPane().add(getLblSignUpName());
		frmSignUp.getContentPane().add(getLblSignUpId());
		frmSignUp.getContentPane().add(getLblSignUpPw());
		frmSignUp.getContentPane().add(getLblSignUpPwConfirm());
		frmSignUp.getContentPane().add(getLblLoginPersonalInfo());
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
		frmSignUp.getContentPane().add(getLblSignUpPasswordCheck());
		frmSignUp.getContentPane().add(getTfSignUpStrength());
	}
	private JPanel getPanelSignUpImage() {
		if (panelSignUpImage == null) {
			panelSignUpImage = new JPanel();
			panelSignUpImage.setBounds(35, 16, 136, 129);
			panelSignUpImage.setLayout(null);
			panelSignUpImage.add(getLblSignUpImage());
		}
		return panelSignUpImage;
	}
	private JLabel getLblSignUpImage() {
		if (lblSignUpImage == null) {
			lblSignUpImage = new JLabel("Image");
			lblSignUpImage.setHorizontalAlignment(SwingConstants.CENTER);
			lblSignUpImage.setBounds(37, 58, 61, 16);
		}
		return lblSignUpImage;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Import Image");
			btnNewButton.setBounds(45, 157, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblSignUpName() {
		if (lblSignUpName == null) {
			lblSignUpName = new JLabel("Name :");
			lblSignUpName.setBounds(35, 216, 53, 16);
		}
		return lblSignUpName;
	}
	private JLabel getLblSignUpId() {
		if (lblSignUpId == null) {
			lblSignUpId = new JLabel("Your ID : ");
			lblSignUpId.setBounds(183, 22, 97, 16);
		}
		return lblSignUpId;
	}
	private JLabel getLblSignUpPw() {
		if (lblSignUpPw == null) {
			lblSignUpPw = new JLabel("Create your password :");
			lblSignUpPw.setBounds(183, 50, 152, 16);
		}
		return lblSignUpPw;
	}
	private JLabel getLblSignUpPwConfirm() {
		if (lblSignUpPwConfirm == null) {
			lblSignUpPwConfirm = new JLabel("Confirm your password :");
			lblSignUpPwConfirm.setBounds(183, 78, 178, 16);
		}
		return lblSignUpPwConfirm;
	}
	private JLabel getLblSignUpPasswordCheck() {
		if (lblSignUpPasswordCheck == null) {
			lblSignUpPasswordCheck = new JLabel("");
			lblSignUpPasswordCheck.setBounds(183, 111, 351, 16);
		}
		return lblSignUpPasswordCheck;
	}
	private JLabel getLblLoginPersonalInfo() {
		if (lblLoginPersonalInfo == null) {
			lblLoginPersonalInfo = new JLabel("<Personal Information>");
			lblLoginPersonalInfo.setBounds(246, 176, 152, 29);
		}
		return lblLoginPersonalInfo;
	}
	private JLabel getLblSignUpMbti() {
		if (lblSignUpMbti == null) {
			lblSignUpMbti = new JLabel("MBTI :");
			lblSignUpMbti.setBounds(35, 287, 61, 16);
		}
		return lblSignUpMbti;
	}
	private JLabel getLblSignUpAddress() {
		if (lblSignUpAddress == null) {
			lblSignUpAddress = new JLabel("Address (Nearby Station) :");
			lblSignUpAddress.setBounds(249, 216, 178, 16);
		}
		return lblSignUpAddress;
	}
	private JLabel getLblSignUpStrength() {
		if (lblSignUpStrength == null) {
			lblSignUpStrength = new JLabel("Strength (language skill) :");
			lblSignUpStrength.setBounds(249, 254, 164, 16);
		}
		return lblSignUpStrength;
	}
	private JLabel getLblSignUpPhoneNum() {
		if (lblSignUpPhoneNum == null) {
			lblSignUpPhoneNum = new JLabel("Phone :");
			lblSignUpPhoneNum.setBounds(35, 254, 61, 16);
		}
		return lblSignUpPhoneNum;
	}
	private JLabel getLblSignUpGithub() {
		if (lblSignUpGithub == null) {
			lblSignUpGithub = new JLabel("Github ID :");
			lblSignUpGithub.setBounds(249, 287, 75, 16);
		}
		return lblSignUpGithub;
	}
	private JLabel getLblSignUpIntroduce() {
		if (lblSignUpIntroduce == null) {
			lblSignUpIntroduce = new JLabel("Tell us About Yourself !");
			lblSignUpIntroduce.setBounds(35, 343, 164, 16);
		}
		return lblSignUpIntroduce;
	}
	private JTextField getTfSignUpId() {
		if (tfSignUpId == null) {
			tfSignUpId = new JTextField();
			tfSignUpId.setBounds(253, 16, 191, 29);
			tfSignUpId.setColumns(10);
		}
		return tfSignUpId;
	}
	private JPasswordField getTfSignUpPw() {
		if (tfSignUpPw == null) {
			tfSignUpPw = new JPasswordField();
			tfSignUpPw.setBounds(343, 45, 191, 26);
		}
		return tfSignUpPw;
	}
	private JPasswordField getTfSignUpPwConfirm() {
		if (tfSignUpPwConfirm == null) {
			tfSignUpPwConfirm = new JPasswordField();
			tfSignUpPwConfirm.setBounds(343, 73, 191, 26);
		}
		return tfSignUpPwConfirm;
	}
	private JTextField getTfSignUpName() {
		if (tfSignUpName == null) {
			tfSignUpName = new JTextField();
			tfSignUpName.setBounds(89, 211, 130, 26);
			tfSignUpName.setColumns(10);
		}
		return tfSignUpName;
	}
	private JTextField getTfSignUpPhone() {
		if (tfSignUpPhone == null) {
			tfSignUpPhone = new JTextField();
			tfSignUpPhone.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfSignUpPhone.setText(null);
				}
			});
			tfSignUpPhone.setText("01011112222");
			tfSignUpPhone.setColumns(10);
			tfSignUpPhone.setBounds(89, 246, 142, 29);
		}
		return tfSignUpPhone;
	}
	private JTextField getTfSignUpGithub() {
		if (tfSignUpGithub == null) {
			tfSignUpGithub = new JTextField();
			tfSignUpGithub.setColumns(10);
			tfSignUpGithub.setBounds(325, 282, 130, 26);
		}
		return tfSignUpGithub;
	}

	
	private JTextField getTfSignUpAddress() {
		if (tfSignUpAddress == null) {
			tfSignUpAddress = new JTextField();
			tfSignUpAddress.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfSignUpAddress.setText(null);
				}
			});
			tfSignUpAddress.setText("GangnamStation");
			tfSignUpAddress.setColumns(10);
			tfSignUpAddress.setBounds(420, 211, 261, 29);
		}
		return tfSignUpAddress;
	}
	private JTextField getTfSignUpBriefInfo() {
		if (tfSignUpBriefInfo == null) {
			tfSignUpBriefInfo = new JTextField();
			tfSignUpBriefInfo.setBounds(35, 371, 623, 80);
			tfSignUpBriefInfo.setColumns(10);
		}
		return tfSignUpBriefInfo;
	}
	private JTextField getTfSignUpMbti() {
		if (tfSignUpMbti == null) {
			tfSignUpMbti = new JTextField();
			tfSignUpMbti.setBounds(89, 284, 106, 21);
			tfSignUpMbti.setColumns(10);
		}
		return tfSignUpMbti;
	}
	
	private JTextField getTfSignUpStrength() {
		if (tfSignUpStrength == null) {
			tfSignUpStrength = new JTextField();
			tfSignUpStrength.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfSignUpStrength.setText(null);
				}
			});
			tfSignUpStrength.setText("Java,C,Python");
			tfSignUpStrength.setBounds(425, 254, 256, 29);
			tfSignUpStrength.setColumns(10);
		}
		return tfSignUpStrength;
	}
	
	private JButton getBtnSignUpSubmit() {
		if (btnSignUpSubmit == null) {
			btnSignUpSubmit = new JButton("Submit");
			btnSignUpSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					signUpAction();
				}
			});
			btnSignUpSubmit.setBounds(541, 463, 117, 29);
		}
		return btnSignUpSubmit;
	}
	private JButton getBtnSignUpCancel() {
		if (btnSignUpCancel == null) {
			btnSignUpCancel = new JButton("Cancel");
			btnSignUpCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frmSignUp.setVisible(false);
				}
			});
			btnSignUpCancel.setBounds(425, 463, 117, 29);
		}
		return btnSignUpCancel;
	}
	private JButton getBtnSignUpIdCheck() {
		if (btnSignUpIdCheck == null) {
			btnSignUpIdCheck = new JButton("ID Check");
			btnSignUpIdCheck.setBounds(552, 16, 117, 29);
		}
		return btnSignUpIdCheck;
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
}
