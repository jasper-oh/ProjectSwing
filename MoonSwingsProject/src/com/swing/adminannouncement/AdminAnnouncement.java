package com.swing.adminannouncement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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

import com.swing.login.FindIdPw;

public class AdminAnnouncement extends JPanel {
	
	
	private JPanel panelAnnouncement;
	private JScrollPane scrollPane;
	private final DefaultTableModel Outer_Table_Announcement = new DefaultTableModel();
	private JTable tableAnnouncement;
	private JLabel lblAnnoucementTitle;
	private JLabel lblAnnoucementDate;
	private JSeparator separator;
	private JTextArea txtrAnnouncementContent;
	private JButton btnCreate;
	private JButton btnDelete;
	private JButton btnUpdate;
	
	/**
	 * Create the panel.
	 */
	public JPanel getAnnouncement() {
		if (panelAnnouncement == null) {
			panelAnnouncement = new JPanel();
			panelAnnouncement.setBackground(Color.white);
			panelAnnouncement.setBounds(300, 45, 490, 497);
			panelAnnouncement.setLayout(null);
			panelAnnouncement.add(getScrollPane());
			panelAnnouncement.add(getLblAnnoucementTitle());
			panelAnnouncement.add(getLblAnnoucementDate());
			panelAnnouncement.add(getSeparator());
			panelAnnouncement.add(getTxtrAnnouncementContent());
			panelAnnouncement.add(getBtnCreate());
			panelAnnouncement.add(getBtnDelete());
			panelAnnouncement.add(getBtnUpdate());
		}

		return panelAnnouncement;
	}
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 16, 450, 200);
			scrollPane.setViewportView(gettableAnnouncement());
		}
		return scrollPane;
	}
	private JTable gettableAnnouncement() {
		if (tableAnnouncement == null) {
			tableAnnouncement = new JTable();
			tableAnnouncement.setForeground(new Color(0, 102, 204));
			tableAnnouncement.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tableAnnouncement.getTableHeader().setReorderingAllowed(false);
			tableAnnouncement.setModel(Outer_Table_Announcement); 
		}
		return tableAnnouncement;
	}
	
	public void AdminAnnouncementTable(){
		
	    int i = Outer_Table_Announcement.getRowCount();
	    Outer_Table_Announcement.addColumn("No");
	    Outer_Table_Announcement.addColumn("Date");
	    Outer_Table_Announcement.addColumn("Title");
	    Outer_Table_Announcement.addColumn("Count");
	    Outer_Table_Announcement.setColumnCount(4);
	    
	    for(int j = 0 ; j < i ; j++){
	      Outer_Table_Announcement.removeRow(0);
	    }
	    tableAnnouncement.setAutoResizeMode(tableAnnouncement.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = tableAnnouncement.getColumnModel().getColumn(vColIndex);
	    int width = 30;
	    col.setPreferredWidth(width);
	    
	    vColIndex = 1;
	    col = tableAnnouncement.getColumnModel().getColumn(vColIndex);
	    width = 100;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = tableAnnouncement.getColumnModel().getColumn(vColIndex);
	    width = 250;
	    col.setPreferredWidth(width);
	    vColIndex = 3;
	    col = tableAnnouncement.getColumnModel().getColumn(vColIndex);
	    width = 50;
	    col.setPreferredWidth(width);
		}
	
	private JLabel getLblAnnoucementTitle() {
		if (lblAnnoucementTitle == null) {
			lblAnnoucementTitle = new JLabel("Announcement Title");
			lblAnnoucementTitle.setBounds(30, 233, 295, 38);
			lblAnnoucementTitle.setForeground(new Color(0, 102, 204));
		}
		return lblAnnoucementTitle;
	}
	private JLabel getLblAnnoucementDate() {
		if (lblAnnoucementDate == null) {
			lblAnnoucementDate = new JLabel("2021-04-23");
			lblAnnoucementDate.setBounds(350, 233, 110, 38);
			lblAnnoucementDate.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			lblAnnoucementDate.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAnnoucementDate.setForeground(new Color(153, 153, 153));
		}
		return lblAnnoucementDate;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(20, 267, 450, 12);
			separator.setForeground(new Color(204, 204, 204));
		}
		return separator;
	}
	private JTextArea getTxtrAnnouncementContent() {
		if (txtrAnnouncementContent == null) {
			txtrAnnouncementContent = new JTextArea();
			txtrAnnouncementContent.setBounds(30, 283, 430, 141);
			txtrAnnouncementContent.setRows(20);
			txtrAnnouncementContent.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			txtrAnnouncementContent.setForeground(new Color(0, 102, 204));
			txtrAnnouncementContent.setText("Announcement Content\nhello everyone\ni'm fine thank you and you?");
		}
		return txtrAnnouncementContent;
	}

	private JButton getBtnCreate() {
		if (btnCreate == null) {
			btnCreate = new JButton("Create");
			btnCreate.setForeground(new Color(0, 102, 204));
			btnCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AdminCreateAnnouncement create = new AdminCreateAnnouncement() ;
					create.run();
				}
			});
			btnCreate.setBounds(25, 435, 140, 35);
		}
		return btnCreate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.setForeground(new Color(0, 102, 204));
			btnDelete.setBounds(325, 435, 140, 35);
		}
		return btnDelete;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.setForeground(new Color(0, 102, 204));
			btnUpdate.setBounds(175, 435, 140, 35);
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AdminUpdateAnnouncement update = new AdminUpdateAnnouncement() ;
					update.run();
				}
			});
		}
		return btnUpdate;
	}

}