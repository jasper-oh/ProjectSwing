package com.swing.findteammate;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FindTeammate extends JPanel {

	private JPanel panelFindTeammate;
	private JScrollPane scrollPane_FindTeammate;
	private JTable TableFindTeammate;
	private final DefaultTableModel Outer_Table_FindTeammate = new DefaultTableModel();
	private JLabel lblFindTeammateYouPickedBy;
	private JScrollPane scrollPane_YouPickedBy;
	private JTable tableYouPickedBy;
	private JTable TeammateReviewTable;
	private final DefaultTableModel Outer_Table_YouPickedBy = new DefaultTableModel();
	private JButton btnSearch;
	private JTextField textFieldSearch;
	private JComboBox searchComboBox;
	
	/**
	 * Create the panel.
	 */
	public JPanel getFindTeammate() {
		if (panelFindTeammate == null) {
			panelFindTeammate = new JPanel();
			panelFindTeammate.setBackground(Color.WHITE);
			panelFindTeammate.setBounds(300, 35, 490, 507);
			panelFindTeammate.setLayout(null);
			panelFindTeammate.add(getScrollPane_FindTeammate());
			panelFindTeammate.add(getLblFindTeammateYouPickedBy());
			panelFindTeammate.add(getScrollPane_YouPickedBy());
			panelFindTeammate.add(getSearchComboBox());
			panelFindTeammate.add(getTextFieldSearch());
			panelFindTeammate.add(getBtnSearch());

		}
		return panelFindTeammate;
	}


	private JScrollPane getScrollPane_FindTeammate() {
		if (scrollPane_FindTeammate == null) {
			scrollPane_FindTeammate = new JScrollPane();
			scrollPane_FindTeammate.setBounds(25, 55, 430, 200);
			scrollPane_FindTeammate.setViewportView(getTableFindTeammate());
		}
		return scrollPane_FindTeammate;
	}
	private JTable getTableFindTeammate() {
		if (TableFindTeammate == null) {
			TableFindTeammate = new JTable();
			TableFindTeammate.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TableFindTeammate.setModel(Outer_Table_FindTeammate); // <--***************************************************
			TableFindTeammate.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			TableFindTeammate.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
		}
		return TableFindTeammate;
	}

	public void FindTeammateTableFindTeammate(){
		int i = Outer_Table_FindTeammate.getRowCount();
		Outer_Table_FindTeammate.addColumn("Name");
		Outer_Table_FindTeammate.addColumn("Github");
		Outer_Table_FindTeammate.addColumn("TeamStatus");
		Outer_Table_FindTeammate.addColumn("MBTI");
		Outer_Table_FindTeammate.setColumnCount(4);
		for(int j = 0 ; j < i ; j++){
			Outer_Table_YouPickedBy.removeRow(0);
		}
		tableYouPickedBy.setAutoResizeMode(TeammateReviewTable.AUTO_RESIZE_OFF);
		int vColIndex = 0;
		TableColumn col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		int width = 120;
		col.setPreferredWidth(width);
		vColIndex = 1;
		col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 2;
		col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		vColIndex = 3;
		col = TableFindTeammate.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
}
//	*** End Find Teammate Table
	
//	You Picked By Table
	private JLabel getLblFindTeammateYouPickedBy() {
		if (lblFindTeammateYouPickedBy == null) {
			lblFindTeammateYouPickedBy = new JLabel("You Picked By");
			lblFindTeammateYouPickedBy.setForeground(Color.GRAY);
			lblFindTeammateYouPickedBy.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			lblFindTeammateYouPickedBy.setBounds(25, 295, 308, 36);
		}
		return lblFindTeammateYouPickedBy;
	}
	private JScrollPane getScrollPane_YouPickedBy() {
		if (scrollPane_YouPickedBy == null) {
			scrollPane_YouPickedBy = new JScrollPane();
			scrollPane_YouPickedBy.setBounds(25, 340, 430, 120);
			scrollPane_YouPickedBy.setViewportView(getTableYouPickedBy());
		}
		return scrollPane_YouPickedBy;
	}
	private JTable getTableYouPickedBy() {
		if (tableYouPickedBy == null) {
			tableYouPickedBy = new JTable();
			tableYouPickedBy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableYouPickedBy.setModel(Outer_Table_YouPickedBy); // <--***************************************************
			tableYouPickedBy.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			tableYouPickedBy.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
		}
		return tableYouPickedBy;
	}
	public void FindTeammateTableYouPickedBy(){
			int i = Outer_Table_FindTeammate.getRowCount();
			Outer_Table_YouPickedBy.addColumn("Name");
			Outer_Table_YouPickedBy.addColumn("Github");
			Outer_Table_YouPickedBy.addColumn("TeamStatus");
			Outer_Table_YouPickedBy.addColumn("MBTI");
			Outer_Table_YouPickedBy.setColumnCount(4);
			for(int j = 0 ; j < i ; j++){
				Outer_Table_YouPickedBy.removeRow(0);
			}
			tableYouPickedBy.setAutoResizeMode(TeammateReviewTable.AUTO_RESIZE_OFF);
			int vColIndex = 0;
			TableColumn col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			int width = 120;
			col.setPreferredWidth(width);
			vColIndex = 1;
			col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			width = 120;
			col.setPreferredWidth(width);
			vColIndex = 2;
			col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			width = 120;
			col.setPreferredWidth(width);
			vColIndex = 3;
			col = tableYouPickedBy.getColumnModel().getColumn(vColIndex);
			width = 120;
			col.setPreferredWidth(width);
	}
	
	private JComboBox getSearchComboBox() {
		if (searchComboBox == null) {
			searchComboBox = new JComboBox();
			searchComboBox.setModel(new DefaultComboBoxModel(new String[] {"Name", "GitHub Id", "MBTI", "Team Status"}));
			searchComboBox.setForeground(Color.GRAY);
			searchComboBox.setBounds(25, 21, 107, 27);
		}
		return searchComboBox;
	}
	
	private JTextField getTextFieldSearch() {
		if (textFieldSearch == null) {
			textFieldSearch = new JTextField();
			textFieldSearch.setForeground(new Color(0, 102, 204));
			textFieldSearch.setBounds(138, 20, 238, 30);
			textFieldSearch.setColumns(10);
		}
		return textFieldSearch;
	}
	
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch= new JButton("Search");
			btnSearch.setForeground(new Color(0, 102, 204));
			btnSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			btnSearch.setBounds(378, 20, 77, 29);
		}
		return btnSearch;
	}

}
