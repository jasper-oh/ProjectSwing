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
import java.awt.Color;

public class FindIdPw {

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
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindIdPw window = new FindIdPw();
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
	public FindIdPw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFindId = new JFrame();
		frmFindId.getContentPane().setBackground(new Color(255, 255, 255));
		frmFindId.getContentPane().setForeground(Color.GRAY);
		frmFindId.setTitle("Find ID / PW");
		frmFindId.setBounds(100, 100, 640, 360);
//		frmFindId.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFindId.getContentPane().setLayout(null);
		frmFindId.setResizable(false);
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
		frmFindId.getContentPane().add(getSeparator());
	}
	private JLabel getLblFIndIdPwFindId() {
		if (lblFIndIdPwFindId == null) {
			lblFIndIdPwFindId = new JLabel("Find ID");
			lblFIndIdPwFindId.setForeground(Color.GRAY);
			lblFIndIdPwFindId.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblFIndIdPwFindId.setBounds(35, 20, 85, 26);
		}
		return lblFIndIdPwFindId;
	}
	private JLabel getLblFindIdPwFindPw() {
		if (lblFindIdPwFindPw == null) {
			lblFindIdPwFindPw = new JLabel("FInd Password");
			lblFindIdPwFindPw.setForeground(Color.GRAY);
			lblFindIdPwFindPw.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblFindIdPwFindPw.setBounds(349, 20, 146, 26);
		}
		return lblFindIdPwFindPw;
	}
	private JLabel getLblFIndIdPwName() {
		if (lblFIndIdPwName == null) {
			lblFIndIdPwName = new JLabel("Enter Your Name");
			lblFIndIdPwName.setForeground(Color.GRAY);
			lblFIndIdPwName.setBounds(35, 80, 117, 16);
		}
		return lblFIndIdPwName;
	}
	private JLabel getLblFindIdPwPhone() {
		if (lblFindIdPwPhone == null) {
			lblFindIdPwPhone = new JLabel("Enter your Phone Number");
			lblFindIdPwPhone.setForeground(Color.GRAY);
			lblFindIdPwPhone.setBounds(35, 173, 177, 16);
		}
		return lblFindIdPwPhone;
	}
	private JLabel getLblFindIdPwId() {
		if (lblFindIdPwId == null) {
			lblFindIdPwId = new JLabel("Enter Your ID");
			lblFindIdPwId.setForeground(Color.GRAY);
			lblFindIdPwId.setBounds(349, 58, 105, 29);
		}
		return lblFindIdPwId;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(35, 108, 252, 30);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(35, 198, 252, 30);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(349, 80, 254, 30);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(349, 148, 254, 30);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(349, 214, 254, 30);
		}
		return textField_4;
	}
	private JLabel getLblFIndIdPwName_1() {
		if (lblFIndIdPwName_1 == null) {
			lblFIndIdPwName_1 = new JLabel("Enter Your Name");
			lblFIndIdPwName_1.setForeground(Color.GRAY);
			lblFIndIdPwName_1.setBounds(351, 131, 117, 16);
		}
		return lblFIndIdPwName_1;
	}
	private JLabel getLblFindIdPwPhone_1() {
		if (lblFindIdPwPhone_1 == null) {
			lblFindIdPwPhone_1 = new JLabel("Enter your Phone Number");
			lblFindIdPwPhone_1.setForeground(Color.GRAY);
			lblFindIdPwPhone_1.setBounds(349, 198, 177, 16);
		}
		return lblFindIdPwPhone_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Find ID");
			btnNewButton.setBackground(new Color(0, 102, 204));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setOpaque(true);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBounds(35, 263, 252, 40);
		}
		return btnNewButton;
	}
	private JButton getBtnFindPassword() {
		if (btnFindPassword == null) {
			btnFindPassword = new JButton("Find Password");
			btnFindPassword.setBackground(new Color(0, 102, 204));
			btnFindPassword.setForeground(Color.WHITE);
			btnFindPassword.setOpaque(true);
			btnFindPassword.setBorderPainted(false);
			btnFindPassword.setBounds(349, 263, 252, 40);
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
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBackground(new Color(245, 245, 245));
			separator.setForeground(new Color(245, 245, 245));
			separator.setBounds(313, 20, 30, 287);
		}
		return separator;
	}
}
