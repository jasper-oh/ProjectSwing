
//------- Manage Project UI --------//

package com.swing.adminProject;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public class AdminProjectManagement extends JPanel {
	private JPanel adminProjectManagement;
	private JScrollPane scrollPane_ManageProject;
	private JTable tableManageProject;
	private JButton btnCreate;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JScrollPane scrollPane_ProjectDetails;
	private JLabel lblProjectName;
	private JTextField tfTeammate1;
	private JTextField tfTeammate2;
	private JTextField tfTeammate3;
	private JTextField tfTeammate4;
	private JTextField tfTeammate5;
	private JTable tableProjectDetails;
	private final DefaultTableModel Outer_Table_ManageProject = new DefaultTableModel();
	private final DefaultTableModel Outer_Table_ProjectDetails = new DefaultTableModel();

	/**
	 * Create the panel.
	 */

	
	public AdminProjectManagement() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(300,45,490,497);
		add(getScrollPane_ManageProject());
		add(getBtnCreate());
		add(getBtnDelete());
		add(getBtnUpdate());
		add(getScrollPane_ProjectDetails());
		add(getLblProjectName());
		add(getTfTeammate1());
		add(getTextField_1());
		add(getTextField_1_1());
		add(getTfTeammate4());
		add(getTfTeammate5());

	}
	private JScrollPane getScrollPane_ManageProject() {
		if (scrollPane_ManageProject == null) {
			scrollPane_ManageProject = new JScrollPane();
			scrollPane_ManageProject.setBounds(20, 16, 300, 150);
			scrollPane_ManageProject.setViewportView(getTableManageProject());
		}
		return scrollPane_ManageProject;
	}
	private JTable getTableManageProject() {
		if (tableManageProject == null) {
			tableManageProject = new JTable();
			tableManageProject.setForeground(new Color(0, 102, 204));
			tableManageProject.setBackground(Color.WHITE);
			tableManageProject.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableManageProject.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1){
						
					}
				}
			});
			tableManageProject.getTableHeader().setReorderingAllowed(false);
			tableManageProject.setModel(Outer_Table_ManageProject); 
		}
		return tableManageProject;
	}
	private JButton getBtnCreate() {
		if (btnCreate == null) {
			btnCreate = new JButton("Create");
			btnCreate.setBackground(Color.WHITE);
			btnCreate.setForeground(new Color(0, 102, 204));
			btnCreate.setBounds(340, 15, 130, 40);
		}
		return btnCreate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.setForeground(new Color(0, 102, 204));
			btnDelete.setBackground(Color.WHITE);
			btnDelete.setBounds(340, 126, 130, 40);
		}
		return btnDelete;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.setForeground(new Color(0, 102, 204));
			btnUpdate.setBackground(Color.WHITE);
			btnUpdate.setBounds(340, 70, 130, 40);
		}
		return btnUpdate;
	}
	private JScrollPane getScrollPane_ProjectDetails() {
		if (scrollPane_ProjectDetails == null) {
			scrollPane_ProjectDetails = new JScrollPane();
			scrollPane_ProjectDetails.setBounds(20, 232, 450, 200);
			scrollPane_ProjectDetails.setViewportView(getTableProjectDetails());
		}
		return scrollPane_ProjectDetails;
	}
	private JLabel getLblProjectName() {
		if (lblProjectName == null) {
			lblProjectName = new JLabel("Swing Project Details");
			lblProjectName.setForeground(Color.GRAY);
			lblProjectName.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblProjectName.setBounds(20, 190, 444, 30);
		}
		return lblProjectName;
	}
	private JTextField getTfTeammate1() {
		if (tfTeammate1 == null) {
			tfTeammate1 = new JTextField();
			tfTeammate1.setBackground(Color.WHITE);
			tfTeammate1.setForeground(new Color(0, 102, 204));
			tfTeammate1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			tfTeammate1.setBounds(20, 440, 90, 35);
			tfTeammate1.setColumns(10);
		}
		return tfTeammate1;
	}
	private JTextField getTextField_1() {
		if (tfTeammate2 == null) {
			tfTeammate2 = new JTextField();
			tfTeammate2.setBackground(Color.WHITE);
			tfTeammate2.setForeground(new Color(0, 102, 204));
			tfTeammate2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			tfTeammate2.setColumns(10);
			tfTeammate2.setBounds(110, 440, 90, 35);
		}
		return tfTeammate2;
	}
	private JTextField getTextField_1_1() {
		if (tfTeammate3 == null) {
			tfTeammate3 = new JTextField();
			tfTeammate3.setBackground(Color.WHITE);
			tfTeammate3.setForeground(new Color(0, 102, 204));
			tfTeammate3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			tfTeammate3.setColumns(10);
			tfTeammate3.setBounds(200, 440, 90, 35);
		}
		return tfTeammate3;
	}
	private JTextField getTfTeammate4() {
		if (tfTeammate4 == null) {
			tfTeammate4 = new JTextField();
			tfTeammate4.setBackground(Color.WHITE);
			tfTeammate4.setForeground(new Color(0, 102, 204));
			tfTeammate4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			tfTeammate4.setColumns(10);
			tfTeammate4.setBounds(290, 440, 90, 35);
		}
		return tfTeammate4;
	}
	private JTextField getTfTeammate5() {
		if (tfTeammate5 == null) {
			tfTeammate5 = new JTextField();
			tfTeammate5.setBackground(Color.WHITE);
			tfTeammate5.setForeground(new Color(0, 102, 204));
			tfTeammate5.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			tfTeammate5.setColumns(10);
			tfTeammate5.setBounds(380, 440, 90, 35);
		}
		return tfTeammate5;
	}
	private JTable getTableProjectDetails() {
		if (tableProjectDetails == null) {
			tableProjectDetails = new JTable();
			tableProjectDetails.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableProjectDetails.setForeground(new Color(0, 102, 204));
			tableProjectDetails.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1){
						
					}
				}
			});
			tableProjectDetails.getTableHeader().setReorderingAllowed(false);
			tableProjectDetails.setModel(Outer_Table_ProjectDetails); 
		}
		return tableProjectDetails;
	}

	
	// tableManageProject Column설정 and 초기화
	public void tableManageProject(){
		
	    int i = Outer_Table_ManageProject.getRowCount();
	    Outer_Table_ManageProject.addColumn("No");
	    Outer_Table_ManageProject.addColumn("Date");
	    Outer_Table_ManageProject.addColumn("ProjectName");
	    Outer_Table_ManageProject.setColumnCount(3);
	    
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_ManageProject.removeRow(0);
	    }
//	    Outer_Table_ManageProject.setAutoResizeMode(tableManageProject.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = tableManageProject.getColumnModel().getColumn(vColIndex);
	    int width = 50;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = tableManageProject.getColumnModel().getColumn(vColIndex);
	    width = 100;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = tableManageProject.getColumnModel().getColumn(vColIndex);
	    width = 130;
	    col.setPreferredWidth(width);
	}
	// tableManageProject Column설정 and 초기화
	public void tableProjectDetails(){
		
	    int i = Outer_Table_ProjectDetails.getRowCount();
	    Outer_Table_ProjectDetails.addColumn("Team No");
	    Outer_Table_ProjectDetails.addColumn("Team Name");
	    Outer_Table_ProjectDetails.addColumn("Result of Project - Git Address");
	    Outer_Table_ProjectDetails.setColumnCount(2);
	    
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_ProjectDetails.removeRow(0);
	    }
//	    Outer_Table_ManageProject.setAutoResizeMode(tableManageProject.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = tableProjectDetails.getColumnModel().getColumn(vColIndex);
	    int width = 50;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = tableProjectDetails.getColumnModel().getColumn(vColIndex);
	    width = 80;
	    vColIndex = 1;
	    col = tableProjectDetails.getColumnModel().getColumn(vColIndex);
	    width = 300;

	}
	
}
