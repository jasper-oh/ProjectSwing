package com.swing.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestFindIdPw {

	private JFrame frmFindId;
	private JLabel lblFIndIdPwFindId;
	private JLabel lblFindIdPwFindPw;
	private JLabel lblFIndIdPwName;
	private JLabel lblFindIdPwPhone;
	private JLabel lblFindIdPwId;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblFIndIdPwName_1;
	private JLabel lblFindIdPwPhone_1;
	private JButton btnNewButton;
	private JButton btnFindPassword;
	private JButton btnCanel;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFindIdPw window = new TestFindIdPw();
					window.frmFindId.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestFindIdPw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFindId = new JFrame();
		frmFindId.setTitle("Find ID / PW");
		frmFindId.setBounds(100, 100, 700, 526);
		frmFindId.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFindId.getContentPane().setLayout(null);
		frmFindId.getContentPane().add(getLblFIndIdPwFindId());
		frmFindId.getContentPane().add(getLblFindIdPwFindPw());
		frmFindId.getContentPane().add(getLblFIndIdPwName());
		frmFindId.getContentPane().add(getLblFindIdPwPhone());
		frmFindId.getContentPane().add(getLblFindIdPwId());
		frmFindId.getContentPane().add(getTextField());
		frmFindId.getContentPane().add(getTextField_1());
		frmFindId.getContentPane().add(getTextField_2());
		frmFindId.getContentPane().add(getTextField_3());
		frmFindId.getContentPane().add(getTextField_4());
		frmFindId.getContentPane().add(getLblFIndIdPwName_1());
		frmFindId.getContentPane().add(getLblFindIdPwPhone_1());
		frmFindId.getContentPane().add(getBtnNewButton());
		frmFindId.getContentPane().add(getBtnFindPassword());
		frmFindId.getContentPane().add(getBtnCanel());
	}
	private JLabel getLblFIndIdPwFindId() {
		if (lblFIndIdPwFindId == null) {
			lblFIndIdPwFindId = new JLabel("Find ID");
			lblFIndIdPwFindId.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblFIndIdPwFindId.setBounds(103, 32, 85, 26);
		}
		return lblFIndIdPwFindId;
	}
	private JLabel getLblFindIdPwFindPw() {
		if (lblFindIdPwFindPw == null) {
			lblFindIdPwFindPw = new JLabel("FInd Password");
			lblFindIdPwFindPw.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblFindIdPwFindPw.setBounds(423, 32, 146, 26);
		}
		return lblFindIdPwFindPw;
	}
	private JLabel getLblFIndIdPwName() {
		if (lblFIndIdPwName == null) {
			lblFIndIdPwName = new JLabel("Enter Your Name");
			lblFIndIdPwName.setBounds(20, 98, 117, 16);
		}
		return lblFIndIdPwName;
	}
	private JLabel getLblFindIdPwPhone() {
		if (lblFindIdPwPhone == null) {
			lblFindIdPwPhone = new JLabel("Enter your Phone Number");
			lblFindIdPwPhone.setBounds(20, 178, 177, 16);
		}
		return lblFindIdPwPhone;
	}
	private JLabel getLblFindIdPwId() {
		if (lblFindIdPwId == null) {
			lblFindIdPwId = new JLabel("Enter Your ID");
			lblFindIdPwId.setBounds(373, 92, 105, 29);
		}
		return lblFindIdPwId;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(92, 126, 197, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(92, 206, 204, 26);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(383, 126, 252, 26);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(395, 206, 240, 26);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(395, 285, 240, 26);
		}
		return textField_4;
	}
	private JLabel getLblFIndIdPwName_1() {
		if (lblFIndIdPwName_1 == null) {
			lblFIndIdPwName_1 = new JLabel("Enter Your Name");
			lblFIndIdPwName_1.setBounds(373, 178, 117, 16);
		}
		return lblFIndIdPwName_1;
	}
	private JLabel getLblFindIdPwPhone_1() {
		if (lblFindIdPwPhone_1 == null) {
			lblFindIdPwPhone_1 = new JLabel("Enter your Phone Number");
			lblFindIdPwPhone_1.setBounds(373, 256, 177, 16);
		}
		return lblFindIdPwPhone_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Find ID");
			btnNewButton.setBounds(81, 344, 117, 29);
		}
		return btnNewButton;
	}
	private JButton getBtnFindPassword() {
		if (btnFindPassword == null) {
			btnFindPassword = new JButton("Find Password");
			btnFindPassword.setBounds(472, 344, 117, 29);
		}
		return btnFindPassword;
	}
	private JButton getBtnCanel() {
		if (btnCanel == null) {
			btnCanel = new JButton("Canel");
			btnCanel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmFindId.setVisible(false);
					
				}
			});
			btnCanel.setBounds(577, 463, 117, 29);
		}
		return btnCanel;
	}
}
