package com.swing.adminstudentlist;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class AdminStudentList extends JPanel {
	
	/**
	 * Create the panel.
	 */
	
//	Panel for StrudentList
	private JPanel panelStudentList;
	private JScrollPane scrollPane_StudentList;
	private JTable tableStudentList;
	private final DefaultTableModel Outer_Table_StrudentList = new DefaultTableModel();
	
	public JPanel getStudentList() {
		if (panelStudentList == null) {
			panelStudentList = new JPanel();
			panelStudentList.setBounds(300, 35, 490, 507);
			panelStudentList.setLayout(null);
			panelStudentList.add(getScrollPane_StudentList());

		}
		return panelStudentList;
	}
	
	private JScrollPane getScrollPane_StudentList() {
		if (scrollPane_StudentList == null) {
			scrollPane_StudentList = new JScrollPane();
			scrollPane_StudentList.setBounds(12, 10, 452, 487);
			scrollPane_StudentList.setViewportView(getTableStudentList());
		}
		return scrollPane_StudentList;
	}
	private JTable getTableStudentList() {
		if (tableStudentList == null) {
			tableStudentList = new JTable();
			tableStudentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableStudentList.setModel(Outer_Table_StrudentList); // <--***************************************************
			tableStudentList.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			tableStudentList.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
		}
		return tableStudentList;
	}
	
	@SuppressWarnings("static-access")
	public void SLStudentListTable(){
		int i = Outer_Table_StrudentList.getRowCount();
		Outer_Table_StrudentList.addColumn("Name");
		Outer_Table_StrudentList.addColumn("Github");
		Outer_Table_StrudentList.addColumn("TeamStatus");
		Outer_Table_StrudentList.addColumn("MBTI");
		Outer_Table_StrudentList.addColumn("Signal");
		Outer_Table_StrudentList.setColumnCount(5);
		for(int j = 0 ; j < i ; j++){
			Outer_Table_StrudentList.removeRow(0);
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