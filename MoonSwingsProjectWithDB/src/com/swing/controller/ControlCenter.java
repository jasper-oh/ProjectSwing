package com.swing.controller;

import java.awt.EventQueue;

import com.swing.view.common.Login;





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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
