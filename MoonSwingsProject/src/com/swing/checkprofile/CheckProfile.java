package com.swing.checkprofile;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CheckProfile extends JPanel {
	public CheckProfile() {
	}

	private JPanel panelCheckProfile;
	private JPanel ImagePanel_1;
	private JLabel lblCheckProfileId;
	private JLabel lblCheckProfileName;
	private JLabel lblCheckProfileMbti;
	private JLabel lblCheckProfileGithub;
	private JLabel lblCheckProfileAddress;
	private JTextField tfCheckProfileId;
	private JTextField tfCheckProfileName;
	private JTextField tfCheckProfileAddress;
	private JTextField tfCheckProfileMbti;
	private JTextField tfCheckProfileGithub;
	private JLabel lblCheckProfileStrength;
	private JTextField tfCheckProfileStrength;
	private JLabel lblCheckProfileIntroduce;
	private JTextField tfCheckProfileIntroduce;
	private JScrollPane scrollPane_Project;
	private JTable ProjectTable;
	private JLabel lblCheckProfileProject;
	private JLabel lblCheckProfileTeammateReview;
	private final DefaultTableModel Outer_Table_TeammateReviewTable = new DefaultTableModel();
	private final DefaultTableModel Outer_Table_ProjectTable = new DefaultTableModel();
	private JScrollPane scrollPane_TeammateReview;
	private JButton btnEditinCheckProfile;
	private JTable TeammateReviewTable;
	private JLabel lblCheckProfilePhone;
	private JTextField tfCheckProfilePhone;
	private JButton btnImportImage;
	private JButton btnCancel;
	private JButton btnSaveinCheckProfile;
	
	/**
	 * Create the panel.
	 */
	public JPanel getCheckProfile() {
		if (panelCheckProfile == null) {
			panelCheckProfile = new JPanel();
			panelCheckProfile.setBackground(Color.WHITE);
			panelCheckProfile.setForeground(Color.BLACK);
			panelCheckProfile.setBounds(300, 45, 490, 497);
			panelCheckProfile.setLayout(null);
			panelCheckProfile.add(getImagePanel_1());
			panelCheckProfile.add(getLblCheckProfileId());
			panelCheckProfile.add(getLblCheckProfileName());
			panelCheckProfile.add(getLblCheckProfileMbti());
			panelCheckProfile.add(getLblCheckProfileGithub());
			panelCheckProfile.add(getLblCheckProfileAddress());
			panelCheckProfile.add(getTfCheckProfileId());
			panelCheckProfile.add(getTfCheckProfileName());
			panelCheckProfile.add(getTfCheckProfileAddress());
			panelCheckProfile.add(getTfCheckProfileMbti());
			panelCheckProfile.add(getTfCheckProfileGithub());
			panelCheckProfile.add(getLblCheckProfileStrength());
			panelCheckProfile.add(getTextField_4());
			panelCheckProfile.add(getLblCheckProfileIntroduce());
			panelCheckProfile.add(getTextField_5());
			panelCheckProfile.add(getScrollPane_Project());
			panelCheckProfile.add(getLblCheckProfileProject());
			panelCheckProfile.add(getLblCheckProfileTeammateReview());
			panelCheckProfile.add(getScrollPane_TeammateReview());
			panelCheckProfile.add(getBtnEditinCheckProfile());
			panelCheckProfile.add(getLblCheckProfilePhone());
			panelCheckProfile.add(getTfCheckProfilePhone());
			panelCheckProfile.add(getBtnImportImage());
			panelCheckProfile.add(getBtnCancel());
			panelCheckProfile.add(getBtnSaveinCheckProfile());
		}
		return panelCheckProfile;
	}
	
	private JButton getBtnImportImage() {
		if (btnImportImage == null) {
			btnImportImage = new JButton("Import Image");
			btnImportImage.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
			btnImportImage.setForeground(new Color(0, 102, 204));
			btnImportImage.setBounds(30, 152, 102, 29);
			btnImportImage.setVisible(false);
		}
		return btnImportImage;
	}
	
	private JPanel getImagePanel_1() {
		if (ImagePanel_1 == null) {
			ImagePanel_1 = new JPanel();
			ImagePanel_1.setBackground(new Color(245, 245, 245));
			ImagePanel_1.setLayout(null);
			ImagePanel_1.setBounds(30, 10, 102, 136);
		}
		return ImagePanel_1;
	}
	private JLabel getLblCheckProfileId() {
		if (lblCheckProfileId == null) {
			lblCheckProfileId = new JLabel("ID :");
			lblCheckProfileId.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileId.setForeground(Color.GRAY);
			lblCheckProfileId.setBounds(144, 10, 61, 16);
		}
		return lblCheckProfileId;
	}
	
	private JLabel getLblCheckProfileName() {
		if (lblCheckProfileName == null) {
			lblCheckProfileName = new JLabel("Name :");
			lblCheckProfileName.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileName.setForeground(Color.GRAY);
			lblCheckProfileName.setBounds(144, 35, 61, 16);
		}
		return lblCheckProfileName;
	}
	private JLabel getLblCheckProfileMbti() {
		if (lblCheckProfileMbti == null) {
			lblCheckProfileMbti = new JLabel("MBTI :");
			lblCheckProfileMbti.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileMbti.setForeground(Color.GRAY);
			lblCheckProfileMbti.setBounds(144, 60, 47, 16);
			
		}
		return lblCheckProfileMbti;
	}
	private JLabel getLblCheckProfileGithub() {
		if (lblCheckProfileGithub == null) {
			lblCheckProfileGithub = new JLabel("Github :");
			lblCheckProfileGithub.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileGithub.setForeground(Color.GRAY);
			lblCheckProfileGithub.setBounds(144, 85, 61, 16);
		}
		return lblCheckProfileGithub;
	}
	
	private JLabel getLblCheckProfileAddress() {
		if (lblCheckProfileAddress == null) {
			lblCheckProfileAddress = new JLabel("Address :");
			lblCheckProfileAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileAddress.setForeground(Color.GRAY);
			lblCheckProfileAddress.setBounds(144, 110, 61, 16);
		}
		return lblCheckProfileAddress;
	}
	private JTextField getTfCheckProfileId() {
		if (tfCheckProfileId == null) {
			tfCheckProfileId = new JTextField();
			tfCheckProfileId.setForeground(new Color(0, 102, 204));
			tfCheckProfileId.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileId.setBounds(207, 10, 230, 21);
			tfCheckProfileId.setColumns(10);
			tfCheckProfileId.setEditable(false);
		}
		return tfCheckProfileId;
	}
	private JTextField getTfCheckProfileName() {
		if (tfCheckProfileName == null) {
			tfCheckProfileName = new JTextField();
			tfCheckProfileName.setForeground(new Color(0, 102, 204));
			tfCheckProfileName.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileName.setColumns(10);
			tfCheckProfileName.setBounds(207, 35, 230, 21);
			tfCheckProfileName.setEditable(false);
		}
		return tfCheckProfileName;
	}
	private JTextField getTfCheckProfileAddress() {
		if (tfCheckProfileAddress == null) {
			tfCheckProfileAddress = new JTextField();
			tfCheckProfileAddress.setForeground(new Color(0, 102, 204));
			tfCheckProfileAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileAddress.setColumns(10);
			tfCheckProfileAddress.setBounds(207, 110, 230, 21);
			tfCheckProfileAddress.setEditable(false);
		}
		return tfCheckProfileAddress;
	}
	private JTextField getTfCheckProfileMbti() {
		if (tfCheckProfileMbti == null) {
			tfCheckProfileMbti = new JTextField();
			tfCheckProfileMbti.setForeground(new Color(0, 102, 204));
			tfCheckProfileMbti.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileMbti.setColumns(10);
			tfCheckProfileMbti.setBounds(207, 60, 230, 21);
			tfCheckProfileMbti.setEditable(false);
		}
		return tfCheckProfileMbti;
	}
	private JTextField getTfCheckProfileGithub() {
		if (tfCheckProfileGithub == null) {
			tfCheckProfileGithub = new JTextField();
			tfCheckProfileGithub.setForeground(new Color(0, 102, 204));
			tfCheckProfileGithub.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileGithub.setColumns(10);
			tfCheckProfileGithub.setBounds(207, 85, 230, 21);
			tfCheckProfileGithub.setEditable(false);
		}
		return tfCheckProfileGithub;
	}
	private JLabel getLblCheckProfileStrength() {
		if (lblCheckProfileStrength == null) {
			lblCheckProfileStrength = new JLabel("Strength :");
			lblCheckProfileStrength.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileStrength.setForeground(Color.GRAY);
			lblCheckProfileStrength.setBounds(144, 157, 74, 15);
		}
		return lblCheckProfileStrength;
	}
	private JTextField getTextField_4() {
		if (tfCheckProfileStrength == null) {
			tfCheckProfileStrength = new JTextField();
			tfCheckProfileStrength.setForeground(new Color(0, 102, 204));
			tfCheckProfileStrength.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileStrength.setBounds(207, 158, 230, 21);
			tfCheckProfileStrength.setColumns(10);
			tfCheckProfileStrength.setEditable(false);
		}
		return tfCheckProfileStrength;
	}
	private JLabel getLblCheckProfileIntroduce() {
		if (lblCheckProfileIntroduce == null) {
			lblCheckProfileIntroduce = new JLabel("한줄 자기소개 :");
			lblCheckProfileIntroduce.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfileIntroduce.setForeground(Color.GRAY);
			lblCheckProfileIntroduce.setBounds(36, 189, 91, 15);
		}
		return lblCheckProfileIntroduce;
	}
	private JTextField getTextField_5() {
		if (tfCheckProfileIntroduce == null) {
			tfCheckProfileIntroduce = new JTextField();
			tfCheckProfileIntroduce.setForeground(new Color(0, 102, 204));
			tfCheckProfileIntroduce.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfileIntroduce.setColumns(10);
			tfCheckProfileIntroduce.setBounds(126, 184, 311, 21);
			tfCheckProfileIntroduce.setEditable(false);
		}
		return tfCheckProfileIntroduce;
	}
	private JScrollPane getScrollPane_Project() {
		if (scrollPane_Project == null) {
			scrollPane_Project = new JScrollPane();
			scrollPane_Project.setBounds(36, 277, 401, 74);
			scrollPane_Project.setViewportView(getProjectTable());
		}
		return scrollPane_Project;
	}
	private JTable getProjectTable() {
		if (ProjectTable == null) {
			ProjectTable = new JTable();
			ProjectTable.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			ProjectTable.setForeground(new Color(0, 102, 204));
			ProjectTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			ProjectTable.setModel(Outer_Table_ProjectTable); // <--***************************************************
			ProjectTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			ProjectTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
			
		}
		return ProjectTable;
	}

	private JLabel getLblCheckProfileProject() {
		if (lblCheckProfileProject == null) {
			lblCheckProfileProject = new JLabel("Project");
			lblCheckProfileProject.setForeground(Color.GRAY);
			lblCheckProfileProject.setFont(new Font("Dialog", Font.BOLD, 13));
			lblCheckProfileProject.setBounds(36, 255, 67, 21);
		}
		return lblCheckProfileProject;
	}
	private JLabel getLblCheckProfileTeammateReview() {
		if (lblCheckProfileTeammateReview == null) {
			lblCheckProfileTeammateReview = new JLabel("Teammate Review");
			lblCheckProfileTeammateReview.setForeground(Color.GRAY);
			lblCheckProfileTeammateReview.setFont(new Font("Dialog", Font.BOLD, 13));
			lblCheckProfileTeammateReview.setBounds(36, 363, 170, 21);
		}
		return lblCheckProfileTeammateReview;
	}
	private JScrollPane getScrollPane_TeammateReview() {
		if (scrollPane_TeammateReview == null) {
			scrollPane_TeammateReview = new JScrollPane();
			scrollPane_TeammateReview.setBounds(36, 383, 401, 93);
			scrollPane_TeammateReview.setViewportView(getTeammateReviewTable());
		}
		return scrollPane_TeammateReview;
	}
	private JButton getBtnEditinCheckProfile() {
		if (btnEditinCheckProfile == null) {
			btnEditinCheckProfile = new JButton("Edit");
			btnEditinCheckProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					editButtonAction();
				}
			});
			btnEditinCheckProfile.setBackground(Color.WHITE);
			btnEditinCheckProfile.setForeground(new Color(0, 102, 204));
			btnEditinCheckProfile.setOpaque(true);
			btnEditinCheckProfile.setBounds(335, 214, 102, 33);
		}
		return btnEditinCheckProfile;
	}

	private JTable getTeammateReviewTable() {
		if (TeammateReviewTable == null) {
			TeammateReviewTable = new JTable();
			TeammateReviewTable.setForeground(new Color(0, 102, 204));
			TeammateReviewTable.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
			TeammateReviewTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			TeammateReviewTable.setModel(Outer_Table_TeammateReviewTable); // <--***************************************************
			TeammateReviewTable.getTableHeader().setReorderingAllowed(false);  // 컬럼들 이동 불가
			TeammateReviewTable.getTableHeader().setResizingAllowed(false);  // 컬럼 크기 조절 불가
		}
		return TeammateReviewTable;
	}
	private JLabel getLblCheckProfilePhone() {
		if (lblCheckProfilePhone == null) {
			lblCheckProfilePhone = new JLabel("Phone :");
			lblCheckProfilePhone.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblCheckProfilePhone.setForeground(Color.GRAY);
			lblCheckProfilePhone.setBounds(144, 135, 61, 16);
		}
		return lblCheckProfilePhone;
	}
	private JTextField getTfCheckProfilePhone() {
		if (tfCheckProfilePhone == null) {
			tfCheckProfilePhone = new JTextField();
			tfCheckProfilePhone.setForeground(new Color(0, 102, 204));
			tfCheckProfilePhone.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			tfCheckProfilePhone.setColumns(10);
			tfCheckProfilePhone.setBounds(207, 135, 230, 21);
			tfCheckProfilePhone.setEditable(false);
		}
		return tfCheckProfilePhone;
	}
//	CheckProfile Table
	public void CheckProfileTableProject(){
	    int i = Outer_Table_ProjectTable.getRowCount();
	    Outer_Table_ProjectTable.addColumn("Project Name");
	    Outer_Table_ProjectTable.addColumn("TeaName");
	    Outer_Table_ProjectTable.addColumn("결과물-Git Address");
	    Outer_Table_ProjectTable.setColumnCount(3);
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_ProjectTable.removeRow(0);
	    }
	    ProjectTable.setAutoResizeMode(ProjectTable.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = ProjectTable.getColumnModel().getColumn(vColIndex);
	    int width = 50;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = ProjectTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = ProjectTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    
	}
	@SuppressWarnings("static-access")
	public void CheckProfileTableReview(){
	    int i = Outer_Table_TeammateReviewTable.getRowCount();
	    Outer_Table_TeammateReviewTable.addColumn("Signal Name");
	    Outer_Table_TeammateReviewTable.addColumn("Project Name");
	    Outer_Table_TeammateReviewTable.addColumn("Review");
	    Outer_Table_TeammateReviewTable.setColumnCount(3);
	    for(int j = 0 ; j < i ; j++){
	    	Outer_Table_TeammateReviewTable.removeRow(0);
	    }
	    TeammateReviewTable.setAutoResizeMode(TeammateReviewTable.AUTO_RESIZE_OFF);
	    int vColIndex = 0;
	    TableColumn col = TeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    int width = 50;
	    col.setPreferredWidth(width);
	    vColIndex = 1;
	    col = TeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);
	    vColIndex = 2;
	    col = TeammateReviewTable.getColumnModel().getColumn(vColIndex);
	    width = 200;
	    col.setPreferredWidth(width);

	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");	
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cancelButtonAction();
				}
			});
			btnCancel.setOpaque(true);
			btnCancel.setForeground(new Color(0, 102, 204));
			btnCancel.setBackground(Color.WHITE);
			btnCancel.setBounds(221, 214, 102, 33);
			btnCancel.setVisible(false);
		}
		return btnCancel;
	}
	private JButton getBtnSaveinCheckProfile() {
		if (btnSaveinCheckProfile == null) {
			btnSaveinCheckProfile = new JButton("Edit");
			btnSaveinCheckProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					saveButtonAction();
				}
			});
			btnSaveinCheckProfile.setBackground(Color.WHITE);
			btnSaveinCheckProfile.setForeground(new Color(0, 102, 204));
			btnSaveinCheckProfile.setOpaque(true);
			btnSaveinCheckProfile.setBounds(335, 214, 102, 33);
		}
		return btnSaveinCheckProfile;
	}
	
	private void editButtonAction() {
		btnCancel.setVisible(true);
		btnImportImage.setVisible(true);
		btnSaveinCheckProfile.setVisible(true);
		btnEditinCheckProfile.setVisible(false);
		
		
	}
	private void cancelButtonAction() {
		btnCancel.setVisible(false);
		btnImportImage.setVisible(false);
		btnEditinCheckProfile.setVisible(true);
		btnSaveinCheckProfile.setVisible(false);
		
	}
	private void saveButtonAction() {
		btnCancel.setVisible(false);
		btnImportImage.setVisible(false);
		btnEditinCheckProfile.setVisible(true);
		btnSaveinCheckProfile.setVisible(false);
	}

}
