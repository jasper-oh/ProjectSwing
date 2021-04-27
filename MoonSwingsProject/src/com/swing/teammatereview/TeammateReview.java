package com.swing.teammatereview;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TeammateReview extends JPanel {
	
	private JPanel panelTeamReview;
	private JScrollPane scrollPane_Project_1;
	private JLabel lblTeamReviewProject;
	private JLabel lblTeamReviewTeammateReview;
	private JScrollPane scrollPane_TeammateReview_1;
	private JButton btnTeamReviewSubmit;
	private JTable TRProjectTable;
	private JTable TRTeammateReviewTable;
	private final DefaultTableModel Outer_Table_TeammateReviewTable = new DefaultTableModel();
	private final DefaultTableModel Outer_Table_ProjectTable = new DefaultTableModel();
	/**
	 * Create the panel.
	 */
	
	public JPanel getTeamReview() {
		if (panelTeamReview == null) {
			panelTeamReview = new JPanel();
			panelTeamReview.setBackground(Color.WHITE);
			panelTeamReview.setBounds(300, 45, 490, 497);
			panelTeamReview.setLayout(null);
			panelTeamReview.add(getScrollPane_Project_1());
			panelTeamReview.add(getLblTeamReviewProject());
			panelTeamReview.add(getLblTeamReviewTeammateReview());
			panelTeamReview.add(getScrollPane_TeammateReview_1());
			panelTeamReview.add(getBtnTeamReviewSubmit());
		}
		return panelTeamReview;
	}
	private JScrollPane getScrollPane_Project_1() {
		if (scrollPane_Project_1 == null) {
			scrollPane_Project_1 = new JScrollPane();
			scrollPane_Project_1.setBounds(33, 53, 415, 150);
			scrollPane_Project_1.setViewportView(getTRProjectTable());
		}
		return scrollPane_Project_1;
	}
	private JLabel getLblTeamReviewProject() {
		if (lblTeamReviewProject == null) {
			lblTeamReviewProject = new JLabel("Project");
			lblTeamReviewProject.setForeground(Color.GRAY);
			lblTeamReviewProject.setFont(new Font("굴림", Font.BOLD, 18));
			lblTeamReviewProject.setBounds(33, 20, 67, 21);
		}
		return lblTeamReviewProject;
	}
	private JLabel getLblTeamReviewTeammateReview() {
		if (lblTeamReviewTeammateReview == null) {
			lblTeamReviewTeammateReview = new JLabel("Teammate Review");
			lblTeamReviewTeammateReview.setForeground(Color.GRAY);
			lblTeamReviewTeammateReview.setFont(new Font("굴림", Font.BOLD, 18));
			lblTeamReviewTeammateReview.setBounds(33, 232, 170, 21);
		}
		return lblTeamReviewTeammateReview;
	}
	private JScrollPane getScrollPane_TeammateReview_1() {
		if (scrollPane_TeammateReview_1 == null) {
			scrollPane_TeammateReview_1 = new JScrollPane();
			scrollPane_TeammateReview_1.setBounds(33, 265, 415, 160);
			scrollPane_TeammateReview_1.setViewportView(getTRTeammateReviewTable());
		}
		return scrollPane_TeammateReview_1;
	}
	private JButton getBtnTeamReviewSubmit() {
		if (btnTeamReviewSubmit == null) {
			btnTeamReviewSubmit = new JButton("Submit");
			btnTeamReviewSubmit.setForeground(new Color(0, 102, 204));
			btnTeamReviewSubmit.setBounds(351, 451, 97, 23);
		}
		return btnTeamReviewSubmit;
	}
	private JTable getTRProjectTable() {
		if (TRProjectTable == null) {
			TRProjectTable = new JTable();
			TRProjectTable.setForeground(new Color(0, 102, 204));
			TRProjectTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TRProjectTable.setModel(Outer_Table_ProjectTable); // <--***************************************************
			TRProjectTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TRProjectTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TRProjectTable;
	}
	private JTable getTRTeammateReviewTable() {
		if (TRTeammateReviewTable == null) {
			TRTeammateReviewTable = new JTable();
			TRTeammateReviewTable.setForeground(new Color(0, 102, 204));
			TRTeammateReviewTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TRTeammateReviewTable.setModel(Outer_Table_TeammateReviewTable); // <--***************************************************
			TRTeammateReviewTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TRTeammateReviewTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TRTeammateReviewTable;
	}
	public void teammateReviewTableProject(){
	    int i = Outer_Table_ProjectTable.getRowCount();
	    Outer_Table_ProjectTable.addColumn("Project Name");
	    Outer_Table_ProjectTable.addColumn("TeamName");
	    Outer_Table_ProjectTable.addColumn("결과물-Git Address");
	    Outer_Table_ProjectTable.setColumnCount(3);
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_ProjectTable.removeRow(0);
	    }
	    TRProjectTable.setAutoResizeMode(TRProjectTable.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = TRProjectTable.getColumnModel().getColumn(vColIndex);
	    int width = 100;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = TRProjectTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = TRProjectTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    
	}
	@SuppressWarnings("static-access")
	public void teammateReviewTableReview(){
	    int i = Outer_Table_TeammateReviewTable.getRowCount();
	    Outer_Table_TeammateReviewTable.addColumn("Teammate Name");
	    Outer_Table_TeammateReviewTable.addColumn("Project Name");
	    Outer_Table_TeammateReviewTable.addColumn("Review");
	    Outer_Table_TeammateReviewTable.setColumnCount(3);
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_TeammateReviewTable.removeRow(0);
	    }
	    TRTeammateReviewTable.setAutoResizeMode(TRTeammateReviewTable.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = TRTeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    int width = 100;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = TRTeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = TRTeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);

	}

}
