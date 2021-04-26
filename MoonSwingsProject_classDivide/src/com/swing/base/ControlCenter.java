package com.swing.base;

import java.awt.EventQueue;

import com.swing.admin.AdminMainPage;
import com.swing.login.Login;





public class ControlCenter {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
					login.run();
//					AdminMainPage admin = new AdminMainPage();
//					admin.run();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
