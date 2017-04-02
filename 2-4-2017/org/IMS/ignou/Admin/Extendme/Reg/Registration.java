package org.IMS.ignou.Admin.Extendme.Reg;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
		
	private JPanel contentPane;
	private String Student_image="upload_image.png";
	protected JTextField Student_First_Name;
	protected JTextField Student_Middle_Name;
	protected JTextField Student_Last_Name;
	protected JTextField Father_First_Name;
	protected JTextField Father_Middle_Name;
	protected JTextField Father_Last_Name;
	protected JComboBox<String> Gender;
	protected JLabel lblLastName_1;
	private JLabel label_1;
	private JLabel lblDateOfBirth;
	protected JLabel Backgroundimage; 
	protected JComboBox<String> Daydob;  //it is protected i want to access access that variable outside the packge without createing object.
	protected JComboBox<String> Monthsdob;
	protected JComboBox<String> Yeardob;
	protected JTextField contact_number;
	protected JComboBox<String> Maritial_status;
	protected JTextField email_id;
	protected JTextField City;
	protected JTextField State;
	protected JComboBox comboBoxQualification12th;
	protected	JComboBox comboBoxQualificationdiploma;
	protected	JComboBox comboBoxQualificationcertification; 
	private JLabel lblState;
	protected JTextField ZipCode;
	protected JComboBox country;
	protected JTextArea Address;
	protected JComboBox comboBoxQualification10th;
	private JScrollPane scrollPane;
	private JPanel Contact_information;
	private JPanel Qualification_Information;
	protected JComboBox<String> comboBoxQualificationUnder_graduate;
	protected JComboBox<String> comboBoxQualificationPost_graducation;
	protected JComboBox<String> comboBoxQualificationOther;
	protected JTextField Year10th;
	protected JTextField Year12th;
	protected JTextField Yeardiploma;
	protected JTextField Yearcertification;
	protected JTextField YearUnder_graduate;
	protected JTextField Year_post_graduation;
	protected JTextField Year_other;
	protected JTextField Instituation_name_10th;
	protected JTextField Instituation_name_12th;
	protected JTextField Instituation_name_Diploma;
	protected JTextField Instituation_name_Certification;
	protected JTextField Instituation_name_Under_graduate;
	protected JTextField Instituation_name_Post_graduate;
	protected JTextField Instituation_name_other;
	protected JTextField Percentage10th;
	protected JTextField Percentage12th;
	protected JTextField PercentageDiploma;
	protected JTextField Percentagecertification;
	protected JTextField PercentageUndergraduate;
	protected JTextField Percentagepost_graduation;
	protected JTextField Percentageother;
	protected JComboBox<String> Grade10th;
	protected JComboBox<String> Grade12th;
	protected JComboBox<String> Gradediploma;
	protected JComboBox<String> GradeCertificate;
	protected JComboBox<String> GradeUnder_graduate;
	protected JComboBox<String> GradePost_graduate;
	protected JComboBox<String> Gradeother;
	protected JTextField Diploma_course_name;
	protected JTextField Certificatation_course_name;
	protected JTextField underGraduation_course_name;
	protected JTextField PostGraduation_course_name;
	protected JTextField Other_course_name;
	protected JComboBox<String> stream12th;
	protected JButton btnSumbit;
	protected JButton Reset;
	private JLabel image;
	protected JComboBox<String> Category;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
public void imagevalidation()
{
	JFileChooser fc = new JFileChooser();
	fc.setDialogTitle("Select Image");
	fc.showOpenDialog(null);	
	if(fc.getSelectedFile()!=null)
	{					
		Student_image=fc.getSelectedFile().toString();				
		ImageIcon icon=new ImageIcon(Student_image);
		if((icon.getIconHeight()<=image.getWidth()) && (icon.getIconWidth()<=image.getWidth()))
		{	
			
				image.setIcon(new ImageIcon(Student_image));
				image.setText("");
		
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Image Too large. Your image Size : Height "+icon.getIconHeight()+" Width "+icon.getIconWidth()+"  But Required  Maximum Width : "+" 100 "+" Hight : "+"100");
		}
	}
	else
	{
		image.setIcon(new ImageIcon(Registration.class.getResource("upload_image.png")));					
		JOptionPane.showMessageDialog(this, "Image not Selected");
	}
	
}
public Boolean personalInformationvalidation()

{

	
		if(Student_First_Name.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Student First Name Can not be blank");
			return false;
		}
		
		if(Father_First_Name.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Father's First Name Can not be blank");
			return false;
		}		
		
		if(Daydob.getSelectedItem().equals("Day"))		
		{
		
			JOptionPane.showMessageDialog(this, "Birth Day Can not be blank");
			return false;
		}
		if(Monthsdob.getSelectedItem().equals("Month"))
		{
			JOptionPane.showMessageDialog(this, "Birth Month Can not be blank");
			return false;
		}
		if(Yeardob.getSelectedItem().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "Birth Year Can not be blank");
			return false;
		}
		if(Gender.getSelectedItem().equals("Select Gender"))
		{
			JOptionPane.showMessageDialog(this, "Gender Can not be blank");
			return false;
		}
		if(Category.getSelectedItem().equals("Category"))
		{
			JOptionPane.showMessageDialog(this, "Category Can not be blank");
			return false;
		}
		
		
		if(Maritial_status.getSelectedItem().equals("Maritial Status"))
		{
			JOptionPane.showMessageDialog(this, "Maritial status Can not be blank");
			return false;
		}
		return true;
}
public Boolean ContactInformationvalidation()
{
	if(Address.getText().equals("Address"))
	{
		JOptionPane.showMessageDialog(this, "Address can not be blank");
		return false;
	}
	if(City.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this, "City can not be blank");
		return false;
	}
	if(State.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this, "State can not be blank");
		return false;
	}
	if(country.getSelectedItem().equals("Country"))
	{
		JOptionPane.showMessageDialog(this, "Country can not be blank");
		return false;
	}
	if(ZipCode.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this, "ZipCode can not be blank");
		return false;
	}
	if(contact_number.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this, "Contact number can not be blank");
		return false;
	}
	if(email_id.getText().equals("Email Id"))
	{
		JOptionPane.showMessageDialog(this, "Email Id can not be blank");
		return false;
	}
	return true;
}
public boolean qualificationinformationvalidation()
{
	if(!comboBoxQualification10th.getSelectedItem().equals("Select"))
	{
		if(Year10th.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "10th year cannot be balnk");
			return false;
		}
		if(Instituation_name_10th.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "10th Institute Name cannot be balnk");
			return false;
		}
		if(Percentage10th.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "10th Percentage cannot be balnk");
			return false;
		}
	}
	if(!comboBoxQualification12th.getSelectedItem().equals("Select"))
	{
		if(Year12th.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "12th year cannot be balnk");
			return false;
		}
		if(Instituation_name_12th.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "12th Institute Name cannot be balnk");
			return false;
		}
		if(Percentage12th.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "12th Percentage cannot be balnk");
			return false;
		}
		if(stream12th.getSelectedItem().equals("Select Stream"))
		{
			JOptionPane.showMessageDialog(this, "12th  Stream  cannot be balnk");
			return false;
		}
	}
	if(!comboBoxQualificationdiploma.getSelectedItem().equals("Select"))
	{
		if(Yeardiploma.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "Diploma year cannot be balnk");
			return false;
		}
		if(Instituation_name_Diploma.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "Diploma Institute Name cannot be balnk");
			return false;
		}
		if(PercentageDiploma.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "Diploma Percentage cannot be balnk");
			return false;
		}
		if(Diploma_course_name.getText().equals("Course Name"))
		{
			JOptionPane.showMessageDialog(this, "Diploma  Course Name cannot be balnk");
			return false;
		}
		
	}
	
	if(!comboBoxQualificationcertification.getSelectedItem().equals("Select"))
	{
		if(Yearcertification.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "Certification year cannot be balnk");
			return false;
		}
		if(Instituation_name_Certification.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "Certification Institute Name cannot be balnk");
			return false;
		}
		if(Percentagecertification.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "Certification Percentage cannot be balnk");
			return false;
		}
		if(Certificatation_course_name.getText().equals("Course Name"))
		{
			JOptionPane.showMessageDialog(this, "Certification  Course Name cannot be balnk");
			return false;
		}
		
	}
	
	if(!comboBoxQualificationUnder_graduate.getSelectedItem().equals("Select"))
	{
		if(YearUnder_graduate.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "Under graduate year cannot be balnk");
			return false;
		}
		if(Instituation_name_Under_graduate.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "Under graduate Institute Name cannot be balnk");
			return false;
		}
		if(PercentageUndergraduate.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "Under graduate Percentage cannot be balnk");
			return false;
		}
		if(underGraduation_course_name.getText().equals("Course Name"))
		{
			JOptionPane.showMessageDialog(this, "Under graduate  Course Name cannot be balnk");
			return false;
		}		
	}
	
	if(!comboBoxQualificationPost_graducation.getSelectedItem().equals("Select"))
	{
		if(Year_post_graduation.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "Post graduate year cannot be balnk");
			return false;
		}
		if(Instituation_name_Post_graduate.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "Post graduate Institute Name cannot be balnk");
			return false;
		}
		if(Percentagepost_graduation.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "Post graduate Percentage cannot be balnk");
			return false;
		}
		if(PostGraduation_course_name.getText().equals("Course Name"))
		{
			JOptionPane.showMessageDialog(this, "Post graduate  Course Name cannot be balnk");
			return false;
		}		
	}
	if(!comboBoxQualificationOther.getSelectedItem().equals("Select"))
	{
		if(Year_other.getText().equals("Year"))
		{
			JOptionPane.showMessageDialog(this, "Other  year cannot be balnk");
			return false;
		}
		if(Instituation_name_other.getText().equals("Instituation Name"))
		{
			JOptionPane.showMessageDialog(this, "Other  Institute Name cannot be balnk");
			return false;
		}
		if(Percentageother.getText().equals("%"))
		{
			JOptionPane.showMessageDialog(this, "Other  Percentage cannot be balnk");
			return false;
		}
		if(Other_course_name.getText().equals("Course Name"))
		{
			JOptionPane.showMessageDialog(this, "Other   Course Name cannot be balnk");
			return false;
		}		
	}
	return true;
}

public Boolean validation()
{
	if(personalInformationvalidation())
	{
		if(ContactInformationvalidation())
		{
				if(qualificationinformationvalidation())
				{
					return true;
				}
		}
	}
	return false;
}

public Registration()
{
	setResizable(false);
		setForeground(Color.RED);
		setBackground(Color.RED);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration.class.getResource("filling-student-form.jpg")));				
	    try
	    {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //set look and feel depend os.
		} 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
	    	try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} 
	    	catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
						    	//theme not supported	
			}	    
	    	
		}
		setBounds(100, 100, 764, 617);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Personal_information = new JPanel();
		Personal_information.setBackground(Color.ORANGE);
		Personal_information.setForeground(Color.WHITE);
		Personal_information.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		Personal_information.setLayout(null);
		Personal_information.setBounds(0, 0, 758, 131);
		contentPane.add(Personal_information);
		

		
		JLabel lblFirstName = new JLabel("First Name    *");
		lblFirstName.setBounds(10, 18, 80, 14);
		Personal_information.add(lblFirstName);
		
	
		
		Student_First_Name = new JTextField();
		Student_First_Name.setBounds(109, 15, 86, 20);
		Personal_information.add(Student_First_Name);
		Student_First_Name.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setBounds(213, 18, 80, 14);
		Personal_information.add(lblMiddleName);
		
		Student_Middle_Name = new JTextField();
		Student_Middle_Name.setBounds(282, 15, 86, 20);
		Personal_information.add(Student_Middle_Name);
		Student_Middle_Name.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(388, 18, 80, 14);
		Personal_information.add(lblLastName);
		
		Student_Last_Name = new JTextField();
		Student_Last_Name.setBounds(455, 15, 112, 20);
		Personal_information.add(Student_Last_Name);
		Student_Last_Name.setColumns(10);
		
				
		
				JLabel lblFathersFirstName = new JLabel("Father's First Name  *");
				lblFathersFirstName.setBounds(10, 49, 110, 14);
				Personal_information.add(lblFathersFirstName);
				
				
				Father_First_Name = new JTextField();
				Father_First_Name.setBounds(119, 46, 97, 20);
				Personal_information.add(Father_First_Name);
				Father_First_Name.setColumns(10);
				
				Father_Middle_Name = new JTextField();
				Father_Middle_Name.setBounds(292, 46, 86, 20);
				Personal_information.add(Father_Middle_Name);
				Father_Middle_Name.setColumns(10);
				
				Father_Last_Name = new JTextField();
				Father_Last_Name.setBounds(455, 46, 112, 20);
				Personal_information.add(Father_Last_Name);
				Father_Last_Name.setColumns(10);
				
				lblLastName_1 = new JLabel("Middle Name");
				lblLastName_1.setBounds(223, 49, 70, 14);
				Personal_information.add(lblLastName_1);
				
				label_1 = new JLabel("Last Name");
				label_1.setBounds(388, 49, 70, 14);
				Personal_information.add(label_1);
				
				Gender = new JComboBox<String>();
				Gender.setBounds(282, 77, 95, 20);
				Personal_information.add(Gender);
				Gender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Others"}));
				
				lblDateOfBirth = new JLabel("Date Of Birth  *");
				lblDateOfBirth.setBounds(10, 80, 80, 14);
				Personal_information.add(lblDateOfBirth);
				
				Daydob = new JComboBox();
				Daydob.setBounds(88, 77, 44, 20);
				Personal_information.add(Daydob);
				Daydob.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
				
				
				Monthsdob = new JComboBox();
				Monthsdob.setBounds(142, 77, 55, 20);
				Personal_information.add(Monthsdob);
				Monthsdob.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
				
				Yeardob = new JComboBox();
				Yeardob.setBounds(207, 77, 55, 20);
				Personal_information.add(Yeardob);
				Yeardob.setModel(new DefaultComboBoxModel(new String[] {"Year", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
				
				 Category = new JComboBox<String>();
				Category.setBounds(398, 77, 80, 20);
				Personal_information.add(Category);
				Category.setToolTipText("Catetory");
				Category.setModel(new DefaultComboBoxModel<String>(new String[] {"Category", "General", "OBC", "SC", "ST"}));
				
				
				Maritial_status = new JComboBox<String>();
				Maritial_status.setFont(new Font("Tahoma", Font.PLAIN, 11));
				Maritial_status.setBounds(498, 77, 95, 20);
				Personal_information.add(Maritial_status);
				Maritial_status.setModel(new DefaultComboBoxModel<String>(new String[] {"Maritial Status", "Married", "Unmarried"}));
				Maritial_status.setToolTipText("Maritial Status");
								 
								 		
				image = new JLabel("");
				image.setLabelFor(Personal_information);
				
				image.setBounds(637, 18, 111, 105);
								 		Personal_information.add(image);
								 		image.setIcon(new ImageIcon(Registration.class.getResource("upload_image.png")));
								 		
								 		
								 		image.setBackground(Color.CYAN);
								 		
								 		lblNewLabel = new JLabel("*");
								 		lblNewLabel.setBounds(272, 80, 21, 14);
								 		Personal_information.add(lblNewLabel);
								 		
								 		label = new JLabel("*");
								 		label.setBounds(385, 80, 21, 14);
								 		Personal_information.add(label);
								 		
								 		label_2 = new JLabel("*");
								 		label_2.setBounds(488, 80, 15, 14);
								 		Personal_information.add(label_2);
								 		image.addMouseListener(new MouseAdapter() {
								 			@Override
								 			public void mouseClicked(MouseEvent arg0) {
								 						imagevalidation();
								 			}
								 		});
								 				 
								 				 Contact_information = new JPanel();
								 				 Contact_information.setBackground(Color.ORANGE);
								 				 Contact_information.setLayout(null);
								 				 Contact_information.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Contact Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
								 				 Contact_information.setBounds(0, 129, 758, 131);
								 				 contentPane.add(Contact_information);
								 				 
								 				 
								 				 
								 				 Address = new JTextArea();
								 				
								 				 Address.addMouseListener(new MouseAdapter() {
								 				 
								 				 	@Override
								 				 	public void mouseExited(MouseEvent e) {
								 				 		if(Address.getText().equals(""))
								 				 		{
								 				 			Address.setText("Address");
								 				 		}
								 				 	}
								 				 	@Override
								 				 	public void mouseEntered(MouseEvent e) {
								 				 		if(Address.getText().equals("Address"))
								 				 		{
								 				 		Address.setText("");
								 				 		}
								 				 	}
								 				 });
								 				 Address.setText("Address");
								 				 Address.setBounds(14, 164, 313, 85);
								 				 
								 				 
								 				  scrollPane = new JScrollPane();
								 				  scrollPane.setBounds(29, 22, 365, 77);
								 				  Contact_information.add(scrollPane);
								 				  scrollPane.setViewportView(Address);
								 				  
								 				  JLabel lblCity = new JLabel("City *");
								 				  lblCity.setBounds(404, 28, 30, 14);
								 				  Contact_information.add(lblCity);
								 				  
								 				  City = new JTextField();
								 				  City.setBounds(444, 22, 86, 20);
								 				  Contact_information.add(City);
								 				  City.setToolTipText("City");
								 				  City.setColumns(10);
								 				  
								 				  lblState = new JLabel("State *");
								 				  lblState.setBounds(404, 56, 40, 14);
								 				  Contact_information.add(lblState);
								 				  lblState.setToolTipText("");
								 				  
								 				  State = new JTextField();
								 				  State.setBounds(454, 50, 76, 20);
								 				  Contact_information.add(State);
								 				  State.setToolTipText("State");
								 				  State.setColumns(10);
								 				  
								 				  		 country = new JComboBox();
								 				  		country.setBounds(659, 81, 86, 20);
								 				  		Contact_information.add(country);
								 				  		
								 				  		country.setModel(new DefaultComboBoxModel(new String[] {"Country", "Indian", "Others"}));
								 				  		
								 				  		JLabel lblZipcode = new JLabel("Zipcode *");
								 				  		lblZipcode.setBounds(540, 25, 46, 14);
								 				  		Contact_information.add(lblZipcode);
								 				  		
								 				  		ZipCode = new JTextField();
								 				  		ZipCode.setBounds(596, 22, 70, 20);
								 				  		Contact_information.add(ZipCode);
								 				  		ZipCode.addMouseListener(new MouseAdapter() {
								 				  			@Override
								 				  			public void mouseClicked(MouseEvent arg0) {
								 				  				ZipCode.setText("");				
								 				  			}
								 				  			
								 				  			@Override
								 				  			public void mouseReleased(MouseEvent arg0) {
								 				  				if(ZipCode.equals(""))
								 				  				{
								 				  					ZipCode.setText("Zip Code");
								 				  				}
								 				  			}
								 				  		});
								 				  		ZipCode.setColumns(10);
								 				  		
								 				  		email_id = new JTextField();
								 				  		email_id.addMouseListener(new MouseAdapter() {
								 				  		 	@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(email_id.getText().equals(""))
										 				 		{
										 				 			email_id.setText("Email Id");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(email_id.getText().equals("Email Id"))
										 				 		{
										 				 			email_id.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		email_id.setBounds(404, 81, 182, 20);
								 				  		Contact_information.add(email_id);
								 				  		email_id.setText("Email Id");
								 				  		email_id.setColumns(10);
								 				  		
								 				  		
								 				  		JLabel lblContact_number = new JLabel("Contact Number *");
								 				  		lblContact_number.setBounds(540, 56, 89, 14);
								 				  		Contact_information.add(lblContact_number);
								 				  		
								 				  		contact_number = new JTextField();
								 				  		contact_number.setBounds(639, 53, 106, 20);
								 				  		Contact_information.add(contact_number);
								 				  		contact_number.setToolTipText("Contact Number");
								 				  		contact_number.setColumns(10);
								 				  		
								 				  		JLabel lblcounty = new JLabel("Country *");
								 				  		lblcounty.setBounds(596, 82, 53, 14);
								 				  		Contact_information.add(lblcounty);
								 				  		
								 				  		label_3 = new JLabel("*");
								 				  		label_3.setBounds(10, 28, 6, 14);
								 				  		Contact_information.add(label_3);
								 				  		
								 				  		Qualification_Information = new JPanel();
								 				  		Qualification_Information.setLayout(null);
								 				  		Qualification_Information.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Qualification Information ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
								 				  		Qualification_Information.setBackground(Color.ORANGE);
								 				  		Qualification_Information.setBounds(0, 258, 758, 187);
								 				  		contentPane.add(Qualification_Information);
								 				  		
								 				  		comboBoxQualification10th = new JComboBox();
								 				  		comboBoxQualification10th.addItemListener(new ItemListener() {
								 				  			public void itemStateChanged(ItemEvent e) {
								 				  				if(comboBoxQualification10th.getSelectedItem().equals("10th"))
								 				  				{
								 				  						Year10th.setEnabled(true);
								 				  						Instituation_name_10th.setEnabled(true);
								 				  						Percentage10th.setEnabled(true);
								 				  						Grade10th.setEnabled(true);
								 				  						
								 				  						
								 				  				}
								 				  				else
								 				  				{
								 				  					Year10th.setEnabled(false);
							 				  						Instituation_name_10th.setEnabled(false);
							 				  						Percentage10th.setEnabled(false);
							 				  						Grade10th.setEnabled(false);
								 				  				}
								 				  				
								 				  			}
								 				  		});
								 				  	
								 				  	
								 				  		comboBoxQualification10th.setModel(new DefaultComboBoxModel(new String[] {"Select", "10th"}));
								 				  		comboBoxQualification10th.setBounds(10, 21, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualification10th);
								 				  		
								 				  		comboBoxQualification12th = new JComboBox();
								 				  		comboBoxQualification12th.addItemListener(new ItemListener() {
								 				  			public void itemStateChanged(ItemEvent arg0) {
								 				  				if(comboBoxQualification12th.getSelectedItem().equals("12th"))
								 				  				{
								 				  						Year12th.setEnabled(true);
								 				  						Instituation_name_12th.setEnabled(true);
								 				  						Percentage12th.setEnabled(true);
								 				  						Grade12th.setEnabled(true);
								 				  						stream12th.setEnabled(true);
								 				  						
								 				  				}
								 				  				else
								 				  				{
								 				  					Year12th.setEnabled(false);
								 				  					Instituation_name_12th.setEnabled(false);
								 				  					Percentage12th.setEnabled(false);
							 				  						Grade12th.setEnabled(false);
							 				  						stream12th.setEnabled(false);

								 				  				}
								 				  				
								 				  			}
								 				  		});
								 				  		comboBoxQualification12th.setModel(new DefaultComboBoxModel(new String[] {"Select", "12th"}));
								 				  		comboBoxQualification12th.setBounds(10, 43, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualification12th);
								 				  		
								 				  		 comboBoxQualificationdiploma = new JComboBox();
								 				  		 comboBoxQualificationdiploma.addItemListener(new ItemListener() {
								 				  		 	public void itemStateChanged(ItemEvent arg0) {
								 				  		 	if(comboBoxQualificationdiploma.getSelectedItem().equals("Diploma"))
							 				  				{
								 				  		 		
								 				  		 		
								 				  		 	Yeardiploma.setEnabled(true);
								 				  		 Instituation_name_Diploma.setEnabled(true);
								 				  		PercentageDiploma.setEnabled(true);
								 				  		Gradediploma.setEnabled(true);
								 				  		Diploma_course_name.setEnabled(true);
							 				  						
							 				  				}
							 				  				else
							 				  				{Yeardiploma.setEnabled(false);
									 				  		 Instituation_name_Diploma.setEnabled(false);
										 				  		PercentageDiploma.setEnabled(false);
										 				  		Gradediploma.setEnabled(false);
										 				  		Diploma_course_name.setEnabled(false);
							 				  				}
							 				  				
								 				  		 	}
								 				  		 });
								 				  		comboBoxQualificationdiploma.setModel(new DefaultComboBoxModel(new String[] {"Select", "Diploma"}));
								 				  		comboBoxQualificationdiploma.setBounds(10, 65, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualificationdiploma);
								 				  		
								 				  		 comboBoxQualificationcertification = new JComboBox();
								 				  		 comboBoxQualificationcertification.addItemListener(new ItemListener() {
								 				  		 	public void itemStateChanged(ItemEvent e) {
								 				  		  	if(comboBoxQualificationcertification.getSelectedItem().equals("Certification"))
							 				  				{
								 				  		 		
								 				  		 	Yearcertification.setEnabled(true);
								 				  		 Instituation_name_Certification.setEnabled(true);
								 				  		Percentagecertification.setEnabled(true);
								 				  		GradeCertificate.setEnabled(true);
								 				  		Certificatation_course_name.setEnabled(true);
							 				  						
							 				  				}
							 				  				else
							 				  				{
							 				  					Yearcertification.setEnabled(false);
										 				  		 Instituation_name_Certification.setEnabled(false);
										 				  		Percentagecertification.setEnabled(false);
										 				  		GradeCertificate.setEnabled(false);
										 				  		Certificatation_course_name.setEnabled(false);
							 				  					
							 				  					
							 				  				}
								 				  		 	}
								 				  		 });
								 				  		comboBoxQualificationcertification.setModel(new DefaultComboBoxModel(new String[] {"Select", "Certification"}));
								 				  		comboBoxQualificationcertification.setBounds(10, 87, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualificationcertification);
								 				  		
								 				  		comboBoxQualificationUnder_graduate = new JComboBox();
								 				  		comboBoxQualificationUnder_graduate.addItemListener(new ItemListener() {
								 				  			public void itemStateChanged(ItemEvent e) {
								 				  				
								 				  			 	if(comboBoxQualificationUnder_graduate.getSelectedItem().equals("Under Graduation"))
								 				  				{
									 				  		 		
									 				  		 	YearUnder_graduate.setEnabled(true);
									 				  		 	Instituation_name_Under_graduate.setEnabled(true);
									 				  		 	PercentageUndergraduate.setEnabled(true);
									 				  		 	GradeUnder_graduate.setEnabled(true);
									 				  		 underGraduation_course_name.setEnabled(true);
								 				  						
								 				  				}
								 				  				else
								 				  				{
									 				  		 		
										 				  		 	YearUnder_graduate.setEnabled(false);
										 				  		 	Instituation_name_Under_graduate.setEnabled(false);
										 				  		 	PercentageUndergraduate.setEnabled(false);
										 				  		 	GradeUnder_graduate.setEnabled(false);
										 				  		 underGraduation_course_name.setEnabled(false);
									 				  										 				  					
								 				  				}
								 				  				
								 				  				
								 				  			}
								 				  		});
								 				  		comboBoxQualificationUnder_graduate.setModel(new DefaultComboBoxModel(new String[] {"Select", "Under Graduation"}));
								 				  		comboBoxQualificationUnder_graduate.setBounds(10, 108, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualificationUnder_graduate);
								 				  		
								 				  		comboBoxQualificationPost_graducation = new JComboBox();
								 				  		comboBoxQualificationPost_graducation.addItemListener(new ItemListener() {
								 				  			public void itemStateChanged(ItemEvent e) {
								 				  				
								 				  				if(comboBoxQualificationPost_graducation.getSelectedItem().equals("Post Graducation"))
								 				  				{
									 				  		 		
									 				  		 	Year_post_graduation.setEnabled(true);
									 				  		 	Instituation_name_Post_graduate.setEnabled(true);
									 				  		 	Percentagepost_graduation.setEnabled(true);
									 				  		 	GradePost_graduate.setEnabled(true);
									 				  		 PostGraduation_course_name.setEnabled(true);
								 				  						
								 				  				}
								 				  				else
								 				  				{

									 				  		 		
										 				  		 	Year_post_graduation.setEnabled(false);
										 				  		 	Instituation_name_Post_graduate.setEnabled(false);
										 				  		 	Percentagepost_graduation.setEnabled(false);
										 				  		 	GradePost_graduate.setEnabled(false);
										 				  		 PostGraduation_course_name.setEnabled(false);
									 				  						
										 				  		 										 				  										 				  					
								 				  				}
								 				  				
								 				  				
								 				  				
								 				  				
								 				  			}
								 				  		});
								 				  		comboBoxQualificationPost_graducation.setModel(new DefaultComboBoxModel(new String[] {"Select", "Post Graducation"}));
								 				  		comboBoxQualificationPost_graducation.setBounds(10, 130, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualificationPost_graducation);
								 				  		
								 				  		comboBoxQualificationOther = new JComboBox();
								 				  		comboBoxQualificationOther.addItemListener(new ItemListener() {
								 				  			public void itemStateChanged(ItemEvent e) {
								 				  				
								 				  				
								 				  				
								 				  				if(comboBoxQualificationOther.getSelectedItem().equals("Other"))
								 				  				{
									 				  		 		
									 				  		 	Year_other.setEnabled(true);
									 				  		 	Instituation_name_other.setEnabled(true);
									 				  		 	Percentageother.setEnabled(true);
									 				  		 	Gradeother.setEnabled(true);
									 				  		 	Other_course_name.setEnabled(true);
								 				  						
								 				  				}
								 				  				else
								 				  				{

								 				  					Year_other.setEnabled(false);
										 				  		 	Instituation_name_other.setEnabled(false);
										 				  		 	Percentageother.setEnabled(false);
										 				  		 	Gradeother.setEnabled(false);
										 				  		 	Other_course_name.setEnabled(false);
									 				  													 				  										 				  					
								 				  				}
								 				  				
								 				  				
								 				  				
								 				  				
								 				  				
								 				  			}
								 				  		});
								 				  		comboBoxQualificationOther.setModel(new DefaultComboBoxModel(new String[] {"Select", "Other"}));
								 				  		comboBoxQualificationOther.setBounds(10, 152, 110, 20);
								 				  		Qualification_Information.add(comboBoxQualificationOther);
								 				  		
								 				  		Year10th = new JTextField();
								 				  		Year10th.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Year10th.getText().equals("Year")){
								 				  				Year10th.setText("");
								 				  				}
								 				  			}
								 				  		});
								 				  		Year10th.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Year10th.getText().equals(""))
										 				 		{
										 				 			Year10th.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Year10th.getText().equals("Year"))
										 				 		{
										 				 			Year10th.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Year10th.setEnabled(false);
								 				  		
								 				  		Year10th.setText("Year");
								 				  		Year10th.setBounds(138, 21, 55, 20);
								 				  		Qualification_Information.add(Year10th);
								 				  		Year10th.setColumns(10);
								 				  		
								 				  		Year12th = new JTextField();
								 				  		Year12th.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Year12th.getText().equals(""))
										 				 		{
										 				 			Year12th.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Year12th.getText().equals("Year"))
										 				 		{
										 				 			Year12th.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Year12th.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Year12th.getText().equals("Year"))
										 				 		{
								 				  					Year12th.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Year12th.setEnabled(false);
								 				  		Year12th.setText("Year");
								 				  		Year12th.setColumns(10);
								 				  		Year12th.setBounds(138, 43, 55, 20);
								 				  		Qualification_Information.add(Year12th);
								 				  		
								 				  		Yeardiploma = new JTextField();
								 				  		Yeardiploma.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Yeardiploma.getText().equals(""))
										 				 		{
										 				 			Yeardiploma.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Yeardiploma.getText().equals("Year"))
										 				 		{
										 				 			Yeardiploma.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Yeardiploma.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Yeardiploma.getText().equals("Year"))
										 				 		{
								 				  					Yeardiploma.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Yeardiploma.setEnabled(false);
								 				  		Yeardiploma.setText("Year");
								 				  		Yeardiploma.setColumns(10);
								 				  		Yeardiploma.setBounds(138, 65, 55, 20);
								 				  		Qualification_Information.add(Yeardiploma);
								 				  		
								 				  		Yearcertification = new JTextField();
								 				  		Yearcertification.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Yearcertification.getText().equals(""))
										 				 		{
										 				 			Yearcertification.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Yearcertification.getText().equals("Year"))
										 				 		{
										 				 			Yearcertification.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Yearcertification.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Yearcertification.getText().equals("Year"))
										 				 		{
								 				  					Yearcertification.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Yearcertification.setEnabled(false);
								 				  		Yearcertification.setText("Year");
								 				  		Yearcertification.setColumns(10);
								 				  		Yearcertification.setBounds(138, 87, 55, 20);
								 				  		Qualification_Information.add(Yearcertification);
								 				  		
								 				  		YearUnder_graduate = new JTextField();
								 				  		YearUnder_graduate.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(YearUnder_graduate.getText().equals(""))
										 				 		{
										 				 			YearUnder_graduate.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(YearUnder_graduate.getText().equals("Year"))
										 				 		{
										 				 			YearUnder_graduate.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		YearUnder_graduate.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(YearUnder_graduate.getText().equals("Year"))
										 				 		{
								 				  					YearUnder_graduate.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		YearUnder_graduate.setEnabled(false);
								 				  		YearUnder_graduate.setText("Year");
								 				  		YearUnder_graduate.setColumns(10);
								 				  		YearUnder_graduate.setBounds(138, 108, 55, 20);
								 				  		Qualification_Information.add(YearUnder_graduate);
								 				  		
								 				  		Year_post_graduation = new JTextField();
								 				  		Year_post_graduation.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Year_post_graduation.getText().equals(""))
										 				 		{
										 				 			Year_post_graduation.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Year_post_graduation.getText().equals("Year"))
										 				 		{
										 				 			Year_post_graduation.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Year_post_graduation.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Year_post_graduation.getText().equals("Year"))
										 				 		{
								 				  					Year_post_graduation.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Year_post_graduation.setEnabled(false);
								 				  		Year_post_graduation.setText("Year");
								 				  		Year_post_graduation.setColumns(10);
								 				  		Year_post_graduation.setBounds(138, 130, 55, 20);
								 				  		Qualification_Information.add(Year_post_graduation);
								 				  		
								 				  		Year_other = new JTextField();
								 				  		Year_other.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Year_other.getText().equals(""))
										 				 		{
										 				 			Year_other.setText("Year");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Year_other.getText().equals("Year"))
										 				 		{
										 				 			Year_other.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Year_other.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Year_other.getText().equals("Year"))
										 				 		{
								 				  					Year_other.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Year_other.setEnabled(false);
								 				  		Year_other.setText("Year");
								 				  		Year_other.setColumns(10);
								 				  		Year_other.setBounds(138, 152, 55, 20);
								 				  		Qualification_Information.add(Year_other);
								 				  		
								 				  		Instituation_name_10th = new JTextField();
								 				  		Instituation_name_10th.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Instituation_name_10th.getText().equals("Instituation Name")){
								 				  					Instituation_name_10th.setText("");
									 				  				}
								 				  			}
								 				  		});
								 				  		Instituation_name_10th.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Instituation_name_10th.getText().equals(""))
										 				 		{
										 				 			Instituation_name_10th.setText("Instituation Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Instituation_name_10th.getText().equals("Instituation Name"))
										 				 		{
										 				 			Instituation_name_10th.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Instituation_name_10th.setEnabled(false);
								 				  		Instituation_name_10th.setText("Instituation Name");
								 				  		Instituation_name_10th.setColumns(10);
								 				  		Instituation_name_10th.setBounds(217, 21, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_10th);
								 				  		
								 				  		Instituation_name_12th = new JTextField();
								 				  		Instituation_name_12th.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Instituation_name_12th.getText().equals(""))
										 				 		{
										 				 			Instituation_name_12th.setText("Instituation Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Instituation_name_12th.getText().equals("Instituation Name"))
										 				 		{
										 				 			Instituation_name_12th.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Instituation_name_12th.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Instituation_name_12th.getText().equals("Instituation Name"))
										 				 		{
								 				  					Instituation_name_12th.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Instituation_name_12th.setEnabled(false);
								 				  		Instituation_name_12th.setText("Instituation Name");
								 				  		Instituation_name_12th.setColumns(10);
								 				  		Instituation_name_12th.setBounds(217, 43, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_12th);
								 				  		
								 				  		Instituation_name_Diploma = new JTextField();
								 				  		Instituation_name_Diploma.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Instituation_name_Diploma.getText().equals("Instituation Name"))
									 				 		{
								 				  					Instituation_name_Diploma.setText("");
									 				 		}
								 				  			}
								 				  		});
								 				  		Instituation_name_Diploma.addMouseListener(new MouseAdapter() {
								 				  			
								 				  				@Override
											 				 	public void mouseExited(MouseEvent e) {
											 				 		if(Instituation_name_Diploma.getText().equals(""))
											 				 		{
											 				 			Instituation_name_Diploma.setText("Instituation Name");
											 				 		}
											 				 	}
											 				 	@Override
											 				 	public void mouseEntered(MouseEvent e) {
											 				 		if(Instituation_name_Diploma.getText().equals("Instituation Name"))
											 				 		{
											 				 			Instituation_name_Diploma.setText("");
											 				 		}
											 				 	
											 				 	}
								 				  		});
								 				  		Instituation_name_Diploma.setEnabled(false);
								 				  		Instituation_name_Diploma.setText("Instituation Name");
								 				  		Instituation_name_Diploma.setColumns(10);
								 				  		Instituation_name_Diploma.setBounds(217, 65, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_Diploma);
								 				  		
								 				  		Instituation_name_Certification = new JTextField();
								 				  		Instituation_name_Certification.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				
								 				  				if(Instituation_name_Certification.getText().equals("Instituation Name"))
										 				 		{
								 				  					Instituation_name_Certification.setText("");
										 				 		}
								 				  				
								 				  			}
								 				  		});
								 				  		Instituation_name_Certification.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Instituation_name_Certification.getText().equals(""))
										 				 		{
										 				 			Instituation_name_Certification.setText("Instituation Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Instituation_name_Certification.getText().equals("Instituation Name"))
										 				 		{
										 				 			Instituation_name_Certification.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Instituation_name_Certification.setEnabled(false);
								 				  		Instituation_name_Certification.setText("Instituation Name");
								 				  		Instituation_name_Certification.setColumns(10);
								 				  		Instituation_name_Certification.setBounds(217, 87, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_Certification);
								 				  		
								 				  		Instituation_name_Under_graduate = new JTextField();
								 				  		Instituation_name_Under_graduate.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Instituation_name_Under_graduate.getText().equals("Instituation Name"))
										 				 		{
								 				  					Instituation_name_Under_graduate.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Instituation_name_Under_graduate.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Instituation_name_Under_graduate.getText().equals(""))
										 				 		{
										 				 			Instituation_name_Under_graduate.setText("Instituation Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Instituation_name_Under_graduate.getText().equals("Instituation Name"))
										 				 		{
										 				 			Instituation_name_Under_graduate.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Instituation_name_Under_graduate.setEnabled(false);
								 				  		Instituation_name_Under_graduate.setText("Instituation Name");
								 				  		Instituation_name_Under_graduate.setColumns(10);
								 				  		Instituation_name_Under_graduate.setBounds(217, 108, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_Under_graduate);
								 				  		
								 				  		Instituation_name_Post_graduate = new JTextField();
								 				  		Instituation_name_Post_graduate.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Instituation_name_Post_graduate.getText().equals("Instituation Name"))
										 				 		{
								 				  					Instituation_name_Post_graduate.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Instituation_name_Post_graduate.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Instituation_name_Post_graduate.getText().equals(""))
										 				 		{
										 				 			Instituation_name_Post_graduate.setText("Instituation Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Instituation_name_Post_graduate.getText().equals("Instituation Name"))
										 				 		{
										 				 			Instituation_name_Post_graduate.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Instituation_name_Post_graduate.setEnabled(false);
								 				  		Instituation_name_Post_graduate.setText("Instituation Name");
								 				  		Instituation_name_Post_graduate.setColumns(10);
								 				  		Instituation_name_Post_graduate.setBounds(217, 130, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_Post_graduate);
								 				  		
								 				  		Instituation_name_other = new JTextField();
								 				  		Instituation_name_other.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				
								 				  				if(Instituation_name_other.getText().equals("Instituation Name"))
										 				 		{
								 				  					Instituation_name_other.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Instituation_name_other.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Instituation_name_other.getText().equals(""))
										 				 		{
										 				 			Instituation_name_other.setText("Instituation Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Instituation_name_other.getText().equals("Instituation Name"))
										 				 		{
										 				 			Instituation_name_other.setText("");
										 				 		}
										 				 	
										 				 	}
								 				  		});
								 				  		Instituation_name_other.setEnabled(false);
								 				  		Instituation_name_other.setText("Instituation Name");
								 				  		Instituation_name_other.setColumns(10);
								 				  		Instituation_name_other.setBounds(217, 152, 252, 20);
								 				  		Qualification_Information.add(Instituation_name_other);
								 				  		
								 				  		Percentage10th = new JTextField();
								 				  		Percentage10th.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Percentage10th.getText().equals("%"))
										 				 		{
										 				 			Percentage10th.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Percentage10th.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Percentage10th.getText().equals(""))
										 				 		{
										 				 			Percentage10th.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Percentage10th.getText().equals("%"))
										 				 		{
										 				 			Percentage10th.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Percentage10th.setEnabled(false);
								 				  		Percentage10th.setText("%");
								 				  		Percentage10th.setBounds(491, 21, 36, 20);
								 				  		Qualification_Information.add(Percentage10th);
								 				  		Percentage10th.setColumns(10);
								 				  		
								 				  		Percentage12th = new JTextField();
								 				  		Percentage12th.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Percentage12th.getText().equals(""))
										 				 		{
										 				 			Percentage12th.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Percentage12th.getText().equals("%"))
										 				 		{
										 				 			Percentage12th.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Percentage12th.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Percentage12th.getText().equals("%"))
										 				 		{
								 				  					Percentage12th.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Percentage12th.setEnabled(false);
								 				  		Percentage12th.setText("%");
								 				  		Percentage12th.setColumns(10);
								 				  		Percentage12th.setBounds(491, 43, 36, 20);
								 				  		Qualification_Information.add(Percentage12th);
								 				  		
								 				  		PercentageDiploma = new JTextField();
								 				  		PercentageDiploma.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(PercentageDiploma.getText().equals(""))
										 				 		{
										 				 			PercentageDiploma.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(PercentageDiploma.getText().equals("%"))
										 				 		{
										 				 			PercentageDiploma.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		PercentageDiploma.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(PercentageDiploma.getText().equals("%"))
										 				 		{
								 				  					PercentageDiploma.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		PercentageDiploma.setEnabled(false);
								 				  		PercentageDiploma.setText("%");
								 				  		PercentageDiploma.setColumns(10);
								 				  		PercentageDiploma.setBounds(491, 65, 36, 20);
								 				  		Qualification_Information.add(PercentageDiploma);
								 				  		
								 				  		Percentagecertification = new JTextField();
								 				  		Percentagecertification.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Percentagecertification.getText().equals(""))
										 				 		{
										 				 			Percentagecertification.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Percentagecertification.getText().equals("%"))
										 				 		{
										 				 			Percentagecertification.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Percentagecertification.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Percentagecertification.getText().equals("%"))
										 				 		{
								 				  					Percentagecertification.setText("");
										 				 		}
								 				  				
								 				  			}
								 				  		});
								 				  		Percentagecertification.setToolTipText("");
								 				  		Percentagecertification.setEnabled(false);
								 				  		Percentagecertification.setText("%");
								 				  		Percentagecertification.setColumns(10);
								 				  		Percentagecertification.setBounds(491, 87, 36, 20);
								 				  		Qualification_Information.add(Percentagecertification);
								 				  		
								 				  		PercentageUndergraduate = new JTextField();
								 				  		PercentageUndergraduate.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(PercentageUndergraduate.getText().equals(""))
										 				 		{
										 				 			PercentageUndergraduate.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(PercentageUndergraduate.getText().equals("%"))
										 				 		{
										 				 			PercentageUndergraduate.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		PercentageUndergraduate.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(PercentageUndergraduate.getText().equals("%"))
										 				 		{
								 				  					PercentageUndergraduate.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		PercentageUndergraduate.setEnabled(false);
								 				  		PercentageUndergraduate.setText("%");
								 				  		PercentageUndergraduate.setColumns(10);
								 				  		PercentageUndergraduate.setBounds(491, 108, 36, 20);
								 				  		Qualification_Information.add(PercentageUndergraduate);
								 				  		
								 				  		Percentagepost_graduation = new JTextField();
								 				  		Percentagepost_graduation.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Percentagepost_graduation.getText().equals(""))
										 				 		{
										 				 			Percentagepost_graduation.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Percentagepost_graduation.getText().equals("%"))
										 				 		{
										 				 			Percentagepost_graduation.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Percentagepost_graduation.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Percentagepost_graduation.getText().equals("%"))
										 				 		{
								 				  					Percentagepost_graduation.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Percentagepost_graduation.setEnabled(false);
								 				  		Percentagepost_graduation.setText("%");
								 				  		Percentagepost_graduation.setColumns(10);
								 				  		Percentagepost_graduation.setBounds(491, 130, 36, 20);
								 				  		Qualification_Information.add(Percentagepost_graduation);
								 				  		
								 				  		Percentageother = new JTextField();
								 				  		Percentageother.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Percentageother.getText().equals(""))
										 				 		{
										 				 			Percentageother.setText("%");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Percentageother.getText().equals("%"))
										 				 		{
										 				 			Percentageother.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Percentageother.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Percentageother.getText().equals("%"))
										 				 		{
								 				  					Percentageother.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Percentageother.setEnabled(false);
								 				  		Percentageother.setText("%");
								 				  		Percentageother.setColumns(10);
								 				  		Percentageother.setBounds(491, 152, 36, 20);
								 				  		Qualification_Information.add(Percentageother);
								 				  		
								 				  		Grade10th = new JComboBox();
								 				  	
								 				  		
								 				  		Grade10th.setEnabled(false);
								 				  		Grade10th.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		Grade10th.setBounds(537, 21, 88, 20);
								 				  		Qualification_Information.add(Grade10th);
								 				  		
								 				  		Grade12th = new JComboBox();
								 				  		Grade12th.setEnabled(false);
								 				  		Grade12th.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		Grade12th.setBounds(537, 43, 88, 20);
								 				  		Qualification_Information.add(Grade12th);
								 				  		
								 				  		Gradediploma = new JComboBox();
								 				  		Gradediploma.setEnabled(false);
								 				  		Gradediploma.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		Gradediploma.setBounds(537, 65, 88, 20);
								 				  		Qualification_Information.add(Gradediploma);
								 				  		
								 				  		GradeCertificate = new JComboBox();
								 				  		GradeCertificate.setEnabled(false);
								 				  		GradeCertificate.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		GradeCertificate.setBounds(537, 87, 88, 20);
								 				  		Qualification_Information.add(GradeCertificate);
								 				  		
								 				  		GradeUnder_graduate = new JComboBox();
								 				  		GradeUnder_graduate.setEnabled(false);
								 				  		GradeUnder_graduate.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		GradeUnder_graduate.setBounds(537, 108, 88, 20);
								 				  		Qualification_Information.add(GradeUnder_graduate);
								 				  		
								 				  		GradePost_graduate = new JComboBox();
								 				  		GradePost_graduate.setEnabled(false);
								 				  		GradePost_graduate.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		GradePost_graduate.setBounds(537, 130, 88, 20);
								 				  		Qualification_Information.add(GradePost_graduate);
								 				  		
								 				  		Gradeother = new JComboBox();
								 				  		Gradeother.setEnabled(false);
								 				  		Gradeother.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "A", "B", "C", "D", "E", "F", "G", "H"}));
								 				  		Gradeother.setBounds(537, 152, 88, 20);
								 				  		Qualification_Information.add(Gradeother);
								 				  		
								 				  		Diploma_course_name = new JTextField();
								 				  		Diploma_course_name.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Diploma_course_name.getText().equals(""))
										 				 		{
										 				 			Diploma_course_name.setText("Course Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Diploma_course_name.getText().equals("Course Name"))
										 				 		{
										 				 			Diploma_course_name.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Diploma_course_name.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Diploma_course_name.getText().equals("Course Name"))
										 				 		{
								 				  					Diploma_course_name.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Diploma_course_name.setEnabled(false);
								 				  		Diploma_course_name.setText("Course Name");
								 				  		Diploma_course_name.setColumns(10);
								 				  		Diploma_course_name.setBounds(647, 65, 90, 20);
								 				  		Qualification_Information.add(Diploma_course_name);
								 				  		
								 				  		Certificatation_course_name = new JTextField();
								 				  		Certificatation_course_name.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Certificatation_course_name.getText().equals(""))
										 				 		{
										 				 			Certificatation_course_name.setText("Course Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Certificatation_course_name.getText().equals("Course Name"))
										 				 		{
										 				 			Certificatation_course_name.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Certificatation_course_name.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Certificatation_course_name.getText().equals("Course Name"))
										 				 		{
								 				  					Certificatation_course_name.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Certificatation_course_name.setEnabled(false);
								 				  		Certificatation_course_name.setText("Course Name");
								 				  		Certificatation_course_name.setColumns(10);
								 				  		Certificatation_course_name.setBounds(647, 87, 90, 20);
								 				  		Qualification_Information.add(Certificatation_course_name);
								 				  		
								 				  		underGraduation_course_name = new JTextField();
								 				  		underGraduation_course_name.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(underGraduation_course_name.getText().equals(""))
										 				 		{
										 				 			underGraduation_course_name.setText("Course Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(underGraduation_course_name.getText().equals("Course Name"))
										 				 		{
										 				 			underGraduation_course_name.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		underGraduation_course_name.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(underGraduation_course_name.getText().equals("Course Name"))
										 				 		{
								 				  					underGraduation_course_name.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		underGraduation_course_name.setEnabled(false);
								 				  		underGraduation_course_name.setText("Course Name");
								 				  		underGraduation_course_name.setColumns(10);
								 				  		underGraduation_course_name.setBounds(647, 108, 90, 20);
								 				  		Qualification_Information.add(underGraduation_course_name);
								 				  		
								 				  		PostGraduation_course_name = new JTextField();
								 				  		PostGraduation_course_name.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(PostGraduation_course_name.getText().equals(""))
										 				 		{
										 				 			PostGraduation_course_name.setText("Course Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(PostGraduation_course_name.getText().equals("Course Name"))
										 				 		{
										 				 			PostGraduation_course_name.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		PostGraduation_course_name.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(PostGraduation_course_name.getText().equals("Course Name"))
										 				 		{
								 				  					PostGraduation_course_name.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		PostGraduation_course_name.setEnabled(false);
								 				  		PostGraduation_course_name.setText("Course Name");
								 				  		PostGraduation_course_name.setColumns(10);
								 				  		PostGraduation_course_name.setBounds(647, 130, 90, 20);
								 				  		Qualification_Information.add(PostGraduation_course_name);
								 				  		
								 				  		Other_course_name = new JTextField();
								 				  		Other_course_name.addMouseListener(new MouseAdapter() {
								 				  			@Override
										 				 	public void mouseExited(MouseEvent e) {
										 				 		if(Other_course_name.getText().equals(""))
										 				 		{
										 				 			Other_course_name.setText("Course Name");
										 				 		}
										 				 	}
										 				 	@Override
										 				 	public void mouseEntered(MouseEvent e) {
										 				 		if(Other_course_name.getText().equals("Course Name"))
										 				 		{
										 				 			Other_course_name.setText("");
										 				 		}
										 				 	}
								 				  		});
								 				  		Other_course_name.addKeyListener(new KeyAdapter() {
								 				  			@Override
								 				  			public void keyTyped(KeyEvent arg0) {
								 				  				if(Other_course_name.getText().equals("Course Name"))
										 				 		{
								 				  					Other_course_name.setText("");
										 				 		}
								 				  			}
								 				  		});
								 				  		Other_course_name.setEnabled(false);
								 				  		Other_course_name.setText("Course Name");
								 				  		Other_course_name.setColumns(10);
								 				  		Other_course_name.setBounds(647, 152, 90, 20);
								 				  		Qualification_Information.add(Other_course_name);
								 				  		
								 				  		stream12th = new JComboBox();
								 				  		stream12th.setEnabled(false);
								 				  		stream12th.setModel(new DefaultComboBoxModel(new String[] {"Select Stream", "Science", "Commerce", "Art", "Other"}));
								 				  		stream12th.setBounds(647, 43, 90, 20);
								 				  		Qualification_Information.add(stream12th);
								 				  		
								 				  		label_4 = new JLabel("*");
								 				  		label_4.setBounds(124, 24, 6, 14);
								 				  		Qualification_Information.add(label_4);
								 				  		
								 				  		label_5 = new JLabel("*");
								 				  		label_5.setBounds(124, 46, 6, 14);
								 				  		Qualification_Information.add(label_5);
								 				  		
								 				  		label_6 = new JLabel("*");
								 				  		label_6.setBounds(124, 68, 6, 14);
								 				  		Qualification_Information.add(label_6);
								 				  		
								 				  		label_7 = new JLabel("*");
								 				  		label_7.setBounds(124, 90, 6, 14);
								 				  		Qualification_Information.add(label_7);
								 				  		
								 				  		label_8 = new JLabel("*");
								 				  		label_8.setBounds(124, 111, 6, 14);
								 				  		Qualification_Information.add(label_8);
								 				  		
								 				  		label_9 = new JLabel("*");
								 				  		label_9.setBounds(124, 133, 6, 14);
								 				  		Qualification_Information.add(label_9);
								 				  		
								 				  		label_10 = new JLabel("*");
								 				  		label_10.setBounds(124, 155, 6, 14);
								 				  		Qualification_Information.add(label_10);
								 				  		
								 				  		label_11 = new JLabel("*");
								 				  		label_11.setBounds(203, 27, 6, 14);
								 				  		Qualification_Information.add(label_11);
								 				  		
								 				  		label_12 = new JLabel("*");
								 				  		label_12.setBounds(203, 49, 6, 14);
								 				  		Qualification_Information.add(label_12);
								 				  		
								 				  		label_13 = new JLabel("*");
								 				  		label_13.setBounds(203, 71, 6, 14);
								 				  		Qualification_Information.add(label_13);
								 				  		
								 				  		label_14 = new JLabel("*");
								 				  		label_14.setBounds(203, 93, 6, 14);
								 				  		Qualification_Information.add(label_14);
								 				  		
								 				  		label_15 = new JLabel("*");
								 				  		label_15.setBounds(203, 114, 6, 14);
								 				  		Qualification_Information.add(label_15);
								 				  		
								 				  		label_16 = new JLabel("*");
								 				  		label_16.setBounds(203, 136, 6, 14);
								 				  		Qualification_Information.add(label_16);
								 				  		
								 				  		label_17 = new JLabel("*");
								 				  		label_17.setBounds(203, 158, 6, 14);
								 				  		Qualification_Information.add(label_17);
								 				  		
								 				  		label_18 = new JLabel("*");
								 				  		label_18.setBounds(474, 27, 6, 14);
								 				  		Qualification_Information.add(label_18);
								 				  		
								 				  		label_19 = new JLabel("*");
								 				  		label_19.setBounds(474, 49, 6, 14);
								 				  		Qualification_Information.add(label_19);
								 				  		
								 				  		label_20 = new JLabel("*");
								 				  		label_20.setBounds(474, 71, 6, 14);
								 				  		Qualification_Information.add(label_20);
								 				  		
								 				  		label_21 = new JLabel("*");
								 				  		label_21.setBounds(474, 93, 6, 14);
								 				  		Qualification_Information.add(label_21);
								 				  		
								 				  		label_22 = new JLabel("*");
								 				  		label_22.setBounds(474, 114, 6, 14);
								 				  		Qualification_Information.add(label_22);
								 				  		
								 				  		label_23 = new JLabel("*");
								 				  		label_23.setBounds(474, 136, 6, 14);
								 				  		Qualification_Information.add(label_23);
								 				  		
								 				  		label_24 = new JLabel("*");
								 				  		label_24.setBounds(474, 158, 6, 14);
								 				  		Qualification_Information.add(label_24);
								 				  		
								 				  		label_26 = new JLabel("*");
								 				  		label_26.setBounds(631, 68, 6, 14);
								 				  		Qualification_Information.add(label_26);
								 				  		
								 				  		label_27 = new JLabel("*");
								 				  		label_27.setBounds(631, 46, 6, 14);
								 				  		Qualification_Information.add(label_27);
								 				  		
								 				  		label_28 = new JLabel("*");
								 				  		label_28.setBounds(631, 90, 6, 14);
								 				  		Qualification_Information.add(label_28);
								 				  		
								 				  		label_29 = new JLabel("*");
								 				  		label_29.setBounds(631, 111, 6, 14);
								 				  		Qualification_Information.add(label_29);
								 				  		
								 				  		label_30 = new JLabel("*");
								 				  		label_30.setBounds(631, 133, 6, 14);
								 				  		Qualification_Information.add(label_30);
								 				  		
								 				  		label_31 = new JLabel("*");
								 				  		label_31.setBounds(631, 155, 6, 14);
								 				  		Qualification_Information.add(label_31);
								 				  		
								 				  		btnSumbit = new JButton("Sumbit");
								 				  		btnSumbit.addActionListener(new ActionListener() {
								 				  			public void actionPerformed(ActionEvent arg0) {
								 				  				validation();
								 				  			}
								 				  		});
								 				  		btnSumbit.setBounds(279, 542, 89, 23);
								 				  		contentPane.add(btnSumbit);
								 				  		
								 				  		Reset = new JButton("Reset");
								 				  		Reset.setBounds(397, 542, 89, 23);
								 				  		contentPane.add(Reset);
								 				  		
								 				  				
								 				  				
								 				  				Backgroundimage = new JLabel("Image");
								 				  				Backgroundimage.setBounds(0, 520, 758, 68);
								 				  				contentPane.add(Backgroundimage);
								 				  				Backgroundimage.setIcon(new ImageIcon(Registration.class.getResource("filling-student-form.jpg")));
				Daydob.addItem("Day");
			
////		
		

	}
}
