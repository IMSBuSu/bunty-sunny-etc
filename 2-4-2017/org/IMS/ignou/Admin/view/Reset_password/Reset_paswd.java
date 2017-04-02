package org.IMS.ignou.Admin.view.Reset_password;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.IMS.ignou.Admin.view.Login_screen.Login;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
/*
 * Note Reset_passwd class help admin to reset it's password.
 * Reset_passwd class take input:
 * 1) First name
 * 2) Email id
 * 3) contact no
 * 4) Last Name
 * 5) Date of Birth
 * then it match the data in database
 * if record match in database 
 * then it send verfication code to admin registered email addresss.
 * then admin need to input verfication code.
 * if verfication code match 
 * then admin can enter it's new password.
 * 
 */
public class Reset_paswd extends JFrame 
{
	private JPanel contentPane;
	private JTextField email_id;
	private JTextField Contact_number;
	private JTextField New_password;
	private JTextField confirm_New_password;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	private JTextField Verfication_code;
	private JTextField First_name;
	private JTextField Last_name;
	private JComboBox<String> Day; 
	private JComboBox<String> Month;
	private JComboBox<String> Year;
	public void login()
	{
		this.setVisible(false);
		Login login=new Login();
		login.setVisible(true);

	}
	boolean verify_User()
	{	
						
		First_name.setVisible(false);
		Last_name.setVisible(false);
		email_id.setVisible(false);
		Day.setVisible(false);
		Month.setVisible(false);
		Year.setVisible(false);
		Contact_number.setVisible(false);		
		return true;
	}
	boolean verfiy_email()
	{
		
		
		Verfication_code = new JTextField();
		Verfication_code.setEnabled(true);
		Verfication_code.setToolTipText("Verification  Code");
		Verfication_code.setText("Enter Verfication code");
		Verfication_code.setColumns(10);
	Verfication_code.setBounds(501, 170, 180, 20);
		contentPane.add(Verfication_code);
		
		JOptionPane.showMessageDialog(null, "Enter Verificaion code");
		
		return true;
	}
	boolean  changepassword()
	{
	
		Verfication_code.setVisible(false);
		New_password = new JTextField();
		New_password.setEnabled(true);
		New_password.setToolTipText("New password");
		New_password.setText("New password");
		New_password.setColumns(10);
		New_password.setBounds(502, 147, 180, 20);
		contentPane.add(New_password);
		confirm_New_password = new JTextField();
		confirm_New_password.setEnabled(true);
		confirm_New_password.setToolTipText("Confirm new password");
		confirm_New_password.setText("Confirm new password");
		confirm_New_password.setColumns(10);
		confirm_New_password.setBounds(501, 176, 180, 20);
		contentPane.add(confirm_New_password);
					
		return true;
	}
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Reset_paswd() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(Reset_paswd.class.getResource("Reset_Usernme_paswd.jpeg")));
		setResizable(false);
		setTitle("Change Password");
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		setBounds(100, 100, 736, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		email_id = new JTextField();
		email_id.setText("Email Id");
		email_id.setColumns(10);
		email_id.setBounds(502, 93, 181, 20);
		contentPane.add(email_id);
		
		
		Day = new JComboBox<String>();
		Day.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Day.setToolTipText("Day");
		Day.setBounds(502, 124, 44, 20);
		contentPane.add(Day);
		
		Month = new JComboBox<String>();
		Month.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		Month.setToolTipText("Month");
		Month.setBounds(556, 124, 55, 20);
		contentPane.add(Month);
		
		Year = new JComboBox<String>();
		Year.setModel(new DefaultComboBoxModel(new String[] {"Year", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		Year.setToolTipText("Year");
		Year.setBounds(628, 124, 55, 20);
		contentPane.add(Year);
		
		Contact_number = new JTextField();
		Contact_number.setToolTipText("Contact Number");
		Contact_number.setText("Contact Number");
		Contact_number.setColumns(10);
		Contact_number.setBounds(503, 155, 180, 20);
		contentPane.add(Contact_number);
		
		
		
		JButton Verfiy = new JButton("Verify");
		Verfiy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(verify_User())
				{														
					if(verfiy_email())
					{						
						if(changepassword())
						{
							JOptionPane.showMessageDialog(null, "Password Change Successfully....");							
						}
					}
				}
			}
		});
		Verfiy.setBounds(478, 205, 98, 23);
		contentPane.add(Verfiy);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					login();
			}
		});
		btnLogin.setBounds(601, 205, 119, 23);
		contentPane.add(btnLogin);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Reset_paswd.class.getResource("Reset_Usernme_paswd.jpeg")));
		lblNewLabel.setBounds(-13, 0, 460, 271);
		contentPane.add(lblNewLabel);
		
		First_name = new JTextField();
		First_name.setToolTipText("First Name");
		First_name.setText("First Name");
		First_name.setBounds(502, 31, 180, 20);
		contentPane.add(First_name);
		First_name.setColumns(10);
		
		Last_name = new JTextField();
		Last_name.setToolTipText("Last Name");
		Last_name.setText("Last Name");
		Last_name.setColumns(10);
		Last_name.setBounds(502, 62, 180, 20);
		contentPane.add(Last_name);
		
	}
}
