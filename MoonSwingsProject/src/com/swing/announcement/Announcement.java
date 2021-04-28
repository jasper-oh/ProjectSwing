package com.swing.announcement;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Announcement extends JPanel {
	private final DefaultTableModel Outer_Table_Announcement = new DefaultTableModel();
	private JScrollPane scrollPane;
	private JTable tableAnnoucement;
	private JLabel lblAnnoucementTitle;
	private JLabel lblAnnoucementDate;
	private JSeparator separator;
	private JTextArea txtrAnnouncementContent;
	private JPanel panelAnnouncement;
	/**
	 * Create the panel.
	 */
	public JPanel getAnnouncement() {
		if (panelAnnouncement == null) {
			panelAnnouncement = new JPanel();
			panelAnnouncement.setBackground(new Color(255, 255, 255));
			panelAnnouncement.setBounds(300, 45, 490, 479);
			panelAnnouncement.setLayout(null);
			panelAnnouncement.add(getScrollPane());
			panelAnnouncement.add(getLblAnnoucementTitle());
			panelAnnouncement.add(getLblAnnoucementDate());
			panelAnnouncement.add(getSeparator());
			panelAnnouncement.add(getTxtrAnnouncementContent());
		}

		return panelAnnouncement;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 6, 450, 200);
			scrollPane.setViewportView(gettableAnnoucement());
		}
		return scrollPane;
	}
	private JTable gettableAnnoucement() {
		if (tableAnnoucement == null) {
			tableAnnoucement = new JTable();
			tableAnnoucement.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableAnnoucement.getTableHeader().setReorderingAllowed(false);
			tableAnnoucement.setModel(Outer_Table_Announcement); 
		}
		return tableAnnoucement;
	}
	
	public void AnnouncementTable(){
		
	    int i = Outer_Table_Announcement.getRowCount();
	    Outer_Table_Announcement.addColumn("No");
	    Outer_Table_Announcement.addColumn("Date");
	    Outer_Table_Announcement.addColumn("Title");
	    Outer_Table_Announcement.addColumn("Count");
	    Outer_Table_Announcement.setColumnCount(4);
	    
	    for(int j = 0 ; j < i ; j++){
	      Outer_Table_Announcement.removeRow(0);
	    }
	    tableAnnoucement.setAutoResizeMode(tableAnnoucement.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    int width = 30;
	    col.setPreferredWidth(width);
	    
	    vColIndex = 1;
	    col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    width = 100;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    width = 290;
	    col.setPreferredWidth(width);
	    vColIndex = 3;
	    col = tableAnnoucement.getColumnModel().getColumn(vColIndex);
	    width = 50;
	    col.setPreferredWidth(width);
		}
	
	private JLabel getLblAnnoucementTitle() {
		if (lblAnnoucementTitle == null) {
			lblAnnoucementTitle = new JLabel("Announcement Title");
			lblAnnoucementTitle.setBounds(30, 266, 295, 38);
			lblAnnoucementTitle.setForeground(new Color(51, 102, 153));
		}
		return lblAnnoucementTitle;
	}
	private JLabel getLblAnnoucementDate() {
		if (lblAnnoucementDate == null) {
			lblAnnoucementDate = new JLabel("2021-04-23");
			lblAnnoucementDate.setBounds(350, 266, 110, 38);
			lblAnnoucementDate.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			lblAnnoucementDate.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAnnoucementDate.setForeground(new Color(153, 153, 153));
		}
		return lblAnnoucementDate;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(20, 298, 450, 12);
			separator.setForeground(new Color(204, 204, 204));
		}
		return separator;
	}
	private JTextArea getTxtrAnnouncementContent() {
		if (txtrAnnouncementContent == null) {
			txtrAnnouncementContent = new JTextArea();
			txtrAnnouncementContent.setBounds(30, 316, 430, 162);
			txtrAnnouncementContent.setRows(20);
			txtrAnnouncementContent.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			txtrAnnouncementContent.setForeground(new Color(51, 102, 153));
			txtrAnnouncementContent.setText("Announcement Content\nhello everyone\ni'm fine thank you and you?");
		}
		return txtrAnnouncementContent;
	}

}
