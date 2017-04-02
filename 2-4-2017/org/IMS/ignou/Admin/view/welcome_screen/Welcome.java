package org.IMS.ignou.Admin.view.welcome_screen;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome extends JFrame {

	private JLabel label;	
	private JPanel contentPane;
	public Welcome() 
	{
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		setTitle("IMS[Institute Managment System] Version 1.0");
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 568);
		setFocusable(true);
		setLocationRelativeTo(null);	//screen open on center.
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		JMenu mnNew = new JMenu("Student");
		mnNew.setIcon(new ImageIcon(Welcome.class.getResource("Student.png")));
		menuBar.add(mnNew);
		
		JMenu mnWithoutDemo = new JMenu("Registration");
		mnNew.add(mnWithoutDemo);
		
		JMenuItem menuItem_18 = new JMenuItem("New Student registration");  // It should ask for  Trial id.
		mnWithoutDemo.add(menuItem_18);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Demo[Trial]");
		mnWithoutDemo.add(mntmNewMenuItem_1);
		
		JMenu mnTrial = new JMenu("Record");
		mnNew.add(mnTrial);
		
		JMenuItem menuItem_15 = new JMenuItem("View Record");
		mnTrial.add(menuItem_15);
		
		JMenuItem menuItem_16 = new JMenuItem("Delete Record");
		mnTrial.add(menuItem_16);
		
		JMenuItem menuItem_17 = new JMenuItem("Update Record");
		mnTrial.add(menuItem_17);
		
		JMenu mnStaffMember = new JMenu("Staff Member");
		mnStaffMember.setIcon(new ImageIcon(Welcome.class.getResource("staff.jpg")));
		menuBar.add(mnStaffMember);
		
		JMenuItem mntmNewFacultyRegistration = new JMenuItem("New Staff  registration");
		mnStaffMember.add(mntmNewFacultyRegistration);
		
		JMenuItem menuItem_1 = new JMenuItem("Update Record");
		mnStaffMember.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Delete Record");
		mnStaffMember.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("View Record");
		mnStaffMember.add(menuItem_3);
		
		JMenu mnOrganization = new JMenu("Organization");
		mnOrganization.setIcon(new ImageIcon(Welcome.class.getResource("oRGANIZATION.jpg")));
		
		menuBar.add(mnOrganization);
		
		JMenu mnFees = new JMenu("Fees");
		mnOrganization.add(mnFees);
		
		JMenuItem mntmUpdate = new JMenuItem("Sumbit now");
		mnFees.add(mntmUpdate);
		
		JMenu mnPendingStatus = new JMenu("Check Status");
		mnFees.add(mnPendingStatus);
		
		JMenuItem menuItem_10 = new JMenuItem("All Student");
		mnPendingStatus.add(menuItem_10);
		
		JMenuItem menuItem_7 = new JMenuItem("By Student Id");
		mnPendingStatus.add(menuItem_7);
		
		JMenu mnSalary = new JMenu("Salary");
		mnOrganization.add(mnSalary);
		
		JMenuItem mntmPayNow = new JMenuItem("Entry Of Payment");
		mnSalary.add(mntmPayNow);
		
		JMenu mnCheckStatus = new JMenu("Check Status");
		mnSalary.add(mnCheckStatus);
		
		JMenuItem mntmAllFaculty = new JMenuItem("All Faculty");
		mnCheckStatus.add(mntmAllFaculty);
		
		JMenuItem mntmByFacultyId = new JMenuItem("By Faculty Id");
		mnCheckStatus.add(mntmByFacultyId);
		
		JMenu mnBooks = new JMenu("Library");
		mnOrganization.add(mnBooks);
		
		JMenuItem mntmAddNewBook = new JMenuItem("Add new Book");
		mnBooks.add(mntmAddNewBook);
		
		JMenuItem mntmUpdateExistingBooks = new JMenuItem("Update Existing Book");
		mnBooks.add(mntmUpdateExistingBooks);
		
		JMenuItem mntmDeleteExistingBooks = new JMenuItem("Delete Existing Book");
		mnBooks.add(mntmDeleteExistingBooks);
		
		JMenuItem mntmViewExistingBooks = new JMenuItem("View  Existing Book");
		mnBooks.add(mntmViewExistingBooks);
		
		JMenu mnCourse = new JMenu("Course");
		mnOrganization.add(mnCourse);
		
		JMenuItem menuItem = new JMenuItem("Add new Course");
		mnCourse.add(menuItem);
		
		JMenuItem menuItem_4 = new JMenuItem("Update Existing Course");
		mnCourse.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Delete Existing Course");
		mnCourse.add(menuItem_5);
		
		JMenuItem mntmViewExistingCourse = new JMenuItem("View  Existing Course");
		mnCourse.add(mntmViewExistingCourse);
		
		JMenu mnInventory = new JMenu("Inventory");
		mnOrganization.add(mnInventory);
		
		JMenuItem mntmAddNewGoods = new JMenuItem("Add new Goods");
		mnInventory.add(mntmAddNewGoods);
		
		JMenuItem mntmUpdateExistingGoods = new JMenuItem("Update Existing Goods");
		mnInventory.add(mntmUpdateExistingGoods);
		
		JMenuItem mntmDeleteExistingGoods = new JMenuItem("Delete Existing Goods");
		mnInventory.add(mntmDeleteExistingGoods);
		
		JMenuItem mntmViewExistingGoods = new JMenuItem("View  Existing goods");
		mnInventory.add(mntmViewExistingGoods);
		
		JMenu mnEmail = new JMenu("Send Message");
		mnOrganization.add(mnEmail);
		
		JMenu mnNewMenu_2 = new JMenu("Email");
		mnEmail.add(mnNewMenu_2);
		
		JMenu menu = new JMenu("Student ");
		mnNewMenu_2.add(menu);
		
		JMenuItem menuItem_11 = new JMenuItem("All Student");
		menu.add(menuItem_11);
		
		JMenuItem menuItem_12 = new JMenuItem("By Student Id");
		menu.add(menuItem_12);
		
		JMenu menu_1 = new JMenu("Faculty");
		mnNewMenu_2.add(menu_1);
		
		JMenuItem menuItem_13 = new JMenuItem("By Faculty Id");
		menu_1.add(menuItem_13);
		
		JMenuItem menuItem_14 = new JMenuItem("All Faculty");
		menu_1.add(menuItem_14);
		
		JMenu mnAverage = new JMenu("Percentage");
		mnOrganization.add(mnAverage);
		
		JMenuItem mntmExpenditureVsProfit = new JMenuItem("Expenditure VS Profit ");
		mnAverage.add(mntmExpenditureVsProfit);
		
		JMenuItem mntmStudentFeedback = new JMenuItem("Student Feedback");
		mnAverage.add(mntmStudentFeedback);
		
		JMenuItem mntmStaffMemberFeedback = new JMenuItem("Staff Member Feedback");
		mnAverage.add(mntmStaffMemberFeedback);
		
		JMenu mnAttendence = new JMenu("Entry(Attendence)");
		mnAttendence.setIcon(new ImageIcon(Welcome.class.getResource("Entry.jpg")));
		menuBar.add(mnAttendence);
		
		JMenu mnNewMenu = new JMenu("Add");
		mnAttendence.add(mnNewMenu);
		
		JMenuItem menuItem_6 = new JMenuItem("Student");
		mnNewMenu.add(menuItem_6);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Staff Member");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("View");
		mnAttendence.add(mnNewMenu_1);
		
		JMenuItem menuItem_8 = new JMenuItem("Student");
		mnNewMenu_1.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("Staff Member");
		mnNewMenu_1.add(menuItem_9);
		
		JMenu mnAdminProfile = new JMenu("Admin Profile");
		mnAdminProfile.setIcon(new ImageIcon(Welcome.class.getResource("login_icon.png")));
		menuBar.add(mnAdminProfile);
		
		JMenuItem mntmV = new JMenuItem("View Details");
		mnAdminProfile.add(mntmV);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password");
		mnAdminProfile.add(mntmChangePassword);
		
		JMenuItem menuItem_23 = new JMenuItem("Update Details");
		mnAdminProfile.add(menuItem_23);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnAdminProfile.add(mntmLogout);
		
		JMenuItem mntmLogOff = new JMenuItem("Log off");
		mnAdminProfile.add(mntmLogOff);
		
		JMenu mnRegistration = new JMenu("Registration");
		mnRegistration.setIcon(new ImageIcon(Welcome.class.getResource("register.png")));
		menuBar.add(mnRegistration);
		
		JMenuItem mntmNewRegistration = new JMenuItem("New Registration");
		mnRegistration.add(mntmNewRegistration);
		
		JMenuItem mntmRevenue = new JMenuItem("View Details");
		mnRegistration.add(mntmRevenue);
		
		JMenu mnBackup = new JMenu("Backup");
		mnBackup.setIcon(new ImageIcon(Welcome.class.getResource("settings.png")));
		menuBar.add(mnBackup);
		
		JMenuItem mntmStart = new JMenuItem("Start new backup");
		mnBackup.add(mntmStart);
		
		JMenuItem mntmUpload = new JMenuItem("Upload Last backup");
		mnBackup.add(mntmUpload);
		
		JMenu mnAbout = new JMenu("Help");
		mnAbout.setIcon(new ImageIcon(Welcome.class.getResource("HELP.png")));
		menuBar.add(mnAbout);
		
		JMenuItem mntmContactUs = new JMenuItem("Contact us");
		mnAbout.add(mntmContactUs);
		
		JMenuItem mntmHowToUse = new JMenuItem("About");
		mnAbout.add(mntmHowToUse);
		
		JMenuItem mntmHowToUse_1 = new JMenuItem("How to use ?");
		mnAbout.add(mntmHowToUse_1);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);	
		contentPane.setLayout(null);
		
		label = new JLabel("");				
		label.setIcon(new ImageIcon(Welcome.class.getResource("edu2.gif")));
		label.setBounds(0, 0, 952, 477);
		contentPane.add(label);
	
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
