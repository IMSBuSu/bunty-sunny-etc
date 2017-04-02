package org.IMS.ignou.Admin.view.signup_screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.IMS.ignou.Admin.Extendme.Reg.Registration;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField Enter_First_name;
	private JTextField Enter_Middle_name;
	private JTextField Enter_Last_name;
	private JTextField Enter_country_name;
	private JTextField Enter_email_id;
	private JTextField Contact_number;
	private JTextField textField;
	private JTextField txtConfirmPassword;
	private JTextField State;
	private JTextField City;
	private JTextField Pincode;
	private JTextField District;
	private JTextField Brith_Place;
	private JTextField Institute_name;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Signup()
	{
		setTitle("Sign Up");
		try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) 
		{			
	    	try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} 
	    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException	| UnsupportedLookAndFeelException e) 
	    	{
	    			//theme are not supported.
			}	    	
		}		
		setResizable(false);
		setBounds(100, 100, 800, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 0));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Enter_First_name = new JTextField();
		Enter_First_name.setText("First Name");
		Enter_First_name.setBounds(10, 21, 138, 20);
		contentPane.add(Enter_First_name);
		Enter_First_name.setColumns(10);
		
		Enter_Middle_name = new JTextField();
		Enter_Middle_name.setText("Middle Name");
		Enter_Middle_name.setColumns(10);
		Enter_Middle_name.setBounds(172, 21, 138, 20);
		contentPane.add(Enter_Middle_name);
		
		Enter_Last_name = new JTextField();
		Enter_Last_name.setText("Last Name");
		Enter_Last_name.setColumns(10);
		Enter_Last_name.setBounds(336, 21, 138, 20);
		contentPane.add(Enter_Last_name);
		
		JLabel Upload_Image = new JLabel("");
		Upload_Image.setIcon(new ImageIcon(Registration.class.getResource("upload_image.png")));
		Upload_Image.setBounds(671, 11, 113, 125);
		contentPane.add(Upload_Image);
		
		JComboBox Select_country = new JComboBox();
		Select_country.setModel(new DefaultComboBoxModel(new String[] {"Country", "Indian", "Others"}));
		Select_country.setToolTipText("Country");
		Select_country.setBounds(553, 220, 85, 20);
		contentPane.add(Select_country);
		
		Enter_country_name = new JTextField();
		Enter_country_name.setText("Country");
		Enter_country_name.setEnabled(false);
		Enter_country_name.setBounds(553, 251, 118, 20);
		contentPane.add(Enter_country_name);
		Enter_country_name.setColumns(10);
		
		Enter_email_id = new JTextField();
		Enter_email_id.setText("Email Id");
		Enter_email_id.setBounds(543, 386, 177, 20);
		contentPane.add(Enter_email_id);
		Enter_email_id.setColumns(10);
		
		JComboBox<String> Day = new JComboBox<String>();
		Day.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Day.setToolTipText("Day");
		Day.setBounds(127, 368, 44, 20);
		contentPane.add(Day);
		
		JComboBox<String> Month = new JComboBox<String>();
		Month.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		Month.setToolTipText("Month");
		Month.setBounds(255, 386, 55, 20);
		contentPane.add(Month);
		
		JComboBox<String> Year = new JComboBox<String>();
		Year.setModel(new DefaultComboBoxModel(new String[] {"Year", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		Year.setToolTipText("Year");
		Year.setBounds(41, 351, 55, 20);
		contentPane.add(Year);
		
		Contact_number = new JTextField();
		Contact_number.setToolTipText("Contact Number");
		Contact_number.setText("Contact Number");
		Contact_number.setColumns(10);
		Contact_number.setBounds(633, 351, 108, 20);
		contentPane.add(Contact_number);
		
		JComboBox Gender = new JComboBox();
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Gender", "Male", "Female", "Others"}));
		Gender.setToolTipText("Gender");
		Gender.setBounds(710, 251, 74, 20);
		contentPane.add(Gender);
		
		textField = new JTextField();
		textField.setToolTipText("Password");
		textField.setText("Password");
		textField.setColumns(10);
		textField.setBounds(323, 282, 170, 20);
		contentPane.add(textField);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setToolTipText("Confirm Password ");
		txtConfirmPassword.setText("Confirm Password ");
		txtConfirmPassword.setColumns(10);
		txtConfirmPassword.setBounds(528, 282, 158, 20);
		contentPane.add(txtConfirmPassword);
		
		JTextArea User_Address = new JTextArea();
		User_Address.setText("Address");
		User_Address.setBounds(10, 226, 279, 77);
		contentPane.add(User_Address);
		
		State = new JTextField();
		State.setText("State");
		State.setBounds(330, 226, 86, 20);
		contentPane.add(State);
		State.setColumns(10);
		
		City = new JTextField();
		City.setText("City");
		City.setColumns(10);
		City.setBounds(330, 251, 86, 20);
		contentPane.add(City);
		
		Pincode = new JTextField();
		Pincode.setText("Pincode");
		Pincode.setColumns(10);
		Pincode.setBounds(428, 220, 86, 20);
		contentPane.add(Pincode);
		
		District = new JTextField();
		District.setText("District");
		District.setColumns(10);
		District.setBounds(428, 251, 86, 20);
		contentPane.add(District);
		
		Brith_Place = new JTextField();
		Brith_Place.setToolTipText("Brith Place");
		Brith_Place.setText("Brith Place");
		Brith_Place.setColumns(10);
		Brith_Place.setBounds(129, 335, 108, 20);
		contentPane.add(Brith_Place);
		
		Institute_name = new JTextField();
		Institute_name.setToolTipText("Institute name");
		Institute_name.setText("Institute name");
		Institute_name.setColumns(10);
		Institute_name.setBounds(676, 220, 108, 20);
		contentPane.add(Institute_name);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Signup.class.getResource("Signup_button.jpeg")));
		btnNewButton.setBounds(347, 364, 146, 42);
		contentPane.add(btnNewButton);
		
		JRadioButton Terms_Codition = new JRadioButton("Yes. I have read \"IMS\" terms and conditions , and I accept It.");
		Terms_Codition.setBackground(new Color(255, 165, 0));
		Terms_Codition.setBounds(265, 319, 321, 23);
		contentPane.add(Terms_Codition);
		
		textField_1 = new JTextField();
		textField_1.setText("First Name");
		textField_1.setColumns(10);
		textField_1.setBounds(10, 54, 138, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Middle Name");
		textField_2.setColumns(10);
		textField_2.setBounds(172, 54, 138, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Last Name");
		textField_3.setColumns(10);
		textField_3.setBounds(336, 54, 138, 20);
		contentPane.add(textField_3);
		setLocationRelativeTo(null);

	}
}
