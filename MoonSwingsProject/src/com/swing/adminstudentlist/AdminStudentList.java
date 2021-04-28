package com.swing.adminstudentlist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.Scrollable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


//Need To Change 

public class AdminStudentList extends JPanel {
	
	/**
	 * Create the panel.
	 */
	
//	Panel for StrudentList
	private JPanel panelStudentList;
	private JScrollPane scrollPane_StudentList;
	private JTable tableStudentList;
	private final DefaultTableModel Outer_Table_StudentList = new DefaultTableModel();
	
	public JPanel getStudentList() {
		if (panelStudentList == null) {
			panelStudentList = new JPanel();
			panelStudentList.setBackground(Color.white);
			panelStudentList.setBounds(300, 45, 490, 497);
			panelStudentList.setLayout(null);
			panelStudentList.add(getScrollPane_StudentList());

		}
		return panelStudentList;
	}
	
	private JScrollPane getScrollPane_StudentList() {
		if (scrollPane_StudentList == null) {
			scrollPane_StudentList = new JScrollPane();
			scrollPane_StudentList.setBounds(25, 20, 440, 450);
			scrollPane_StudentList.setViewportView(getTableStudentList());
		}
		return scrollPane_StudentList;
	}
	private JTable getTableStudentList() {
		if (tableStudentList == null) {
			tableStudentList = new JTable();
			tableStudentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableStudentList.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tableStudentList.setForeground(new Color(0, 102, 204));
			tableStudentList.setModel(Outer_Table_StudentList); // <--***************************************************
			tableStudentList.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			tableStudentList.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
		}
		return tableStudentList;
	}
	
	@SuppressWarnings("static-access")
	public void SLStudentListTable(){
		int i = Outer_Table_StudentList.getRowCount();
		Outer_Table_StudentList.addColumn("Name");
		Outer_Table_StudentList.addColumn("Github");
		Outer_Table_StudentList.addColumn("TeamStatus");
		Outer_Table_StudentList.addColumn("MBTI");
		Outer_Table_StudentList.addColumn("Signal");
		Outer_Table_StudentList.setColumnCount(5);
		
		
		for(int j = 0 ; j < i ; j++){
			Outer_Table_StudentList.removeRow(0);
		}
		tableStudentList.setAutoResizeMode(tableStudentList.AUTO_RESIZE_OFF);
		int vColIndex = 0;
		TableColumn col = tableStudentList.getColumnModel().getColumn(vColIndex);
		int width = 120;
		col.setPreferredWidth(width);
		vColIndex = 1;
		col = tableStudentList.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 2;
		col = tableStudentList.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 3;
		col = tableStudentList.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 4;
		col = tableStudentList.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
	}


}