package org.IMS.ignou.Admin.view.Registration;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import org.IMS.ignou.Admin.Extendme.Reg.Registration;

public class Student extends Registration 
{	
	private JTextField TotalFees;
	private JTextField Sumbitted_fees;
	private JTextField Reamaining_fees;
	private JComboBox Course;
	private JComboBox Faculty;
	private JComboBox Start_Day_course;
	private JComboBox Start_Month_course;
	private JComboBox Start_year_course;
	private JComboBox End_Day_course;
	private JComboBox End_month_course;
	private JComboBox End_Year_course;
	private JComboBox Batch_start_time;
	private JComboBox Batch_End_time;
	public Boolean courseinformationvalidiation()
	{
	/*
		if(Course.getSelectedItem().equals("Select Course"))
		{
			JOptionPane.showMessageDialog(this, "Select Course Which you want to applied.");
			return false;
		}
		if(Faculty.getSelectedItem().equals("Select Faculty"))
		{
			JOptionPane.showMessageDialog(this, "Select Faculty ");
			return false;
		}
	*/
		if(Start_Day_course.getSelectedItem().equals("Day"))
		{		
			JOptionPane.showMessageDialog(this, "Select Start Day ");
			return false;
		}
		if(Start_Month_course.getSelectedItem().equals("Month"))
		{		
			JOptionPane.showMessageDialog(this, "Select Start Month ");
			return false;
		}
		if(Start_year_course.getSelectedItem().equals("Year"))
		{		
			JOptionPane.showMessageDialog(this, "Select Start Year ");
			return false;
		}
		if(End_Day_course.getSelectedItem().equals("Day"))
		{		
			JOptionPane.showMessageDialog(this, "Select End Day ");
			return false;
		}
		if(End_month_course.getSelectedItem().equals("Month"))
		{		
			JOptionPane.showMessageDialog(this, "Select End Month ");
			return false;
		}
		if(End_Year_course.getSelectedItem().equals("Year"))
		{		
			JOptionPane.showMessageDialog(this, "Select End Year ");
			return false;
		}
		if(Batch_start_time.getSelectedItem().equals("Start"))
		{		
			JOptionPane.showMessageDialog(this, "Select Batch Start Time ");
			return false;
		}
		
		if(Batch_End_time.getSelectedItem().equals("End"))
		{		
			JOptionPane.showMessageDialog(this, "Select Batch End Time ");
			return false;
		}
		if(Sumbitted_fees.getText().equals(""))
		{		
			JOptionPane.showMessageDialog(this, "Submit Fess  ");
			return false;
		}
		return true;
	}

public Boolean validation()
{		
	if(super.validation())
	{
						if(courseinformationvalidiation())
						{
							System.out.println("Data stored Admission no : "+(System.currentTimeMillis()+Daydob.getSelectedIndex()));
							return true;
						}	
	}
						return false;
}
	public Student() 
	{
		
		
		setTitle("New Student Registration");	
		Yeardob.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		Monthsdob.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		Daydob.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Course Information ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 443, 758, 79);
		getContentPane().add(panel);
		
		Course = new JComboBox();
		Course.setModel(new DefaultComboBoxModel(new String[] {"Select Course"}));
		Course.setBounds(20, 23, 98, 20);
		panel.add(Course);
		
		
		Faculty = new JComboBox();
		Faculty.setModel(new DefaultComboBoxModel(new String[] {"Select Faculty"}));
		Faculty.setBounds(20, 46, 98, 20);
		panel.add(Faculty);
		
		Start_Day_course = new JComboBox();
		Start_Day_course.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Start_Day_course.setBounds(202, 23, 44, 20);
		panel.add(Start_Day_course);
		
		Start_Month_course = new JComboBox();
		Start_Month_course.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		Start_Month_course.setBounds(251, 23, 55, 20);
		panel.add(Start_Month_course);
		
		Start_year_course = new JComboBox();
		Start_year_course.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		Start_year_course.setBounds(311, 23, 55, 20);
		panel.add(Start_year_course);
		
		
		
		End_Day_course = new JComboBox();
		End_Day_course.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		End_Day_course.setBounds(449, 23, 44, 20);
		panel.add(End_Day_course);
		
		End_month_course = new JComboBox();
		End_month_course.setModel(new DefaultComboBoxModel(new String[] {"Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		End_month_course.setBounds(498, 23, 55, 20);
		panel.add(End_month_course);
		
		End_Year_course = new JComboBox();
		End_Year_course.setModel(new DefaultComboBoxModel(new String[] {"Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100"}));
		End_Year_course.setBounds(563, 23, 55, 20);
		panel.add(End_Year_course);
		
		Batch_start_time = new JComboBox();
		Batch_start_time.setModel(new DefaultComboBoxModel(new String[] {"Start","6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
		Batch_start_time.setBounds(227, 46, 55, 20);
		panel.add(Batch_start_time);
		
		Batch_End_time = new JComboBox();
		Batch_End_time.setModel(new DefaultComboBoxModel(new String[] {"End","6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
		Batch_End_time.setBounds(376, 46, 52, 20);
		panel.add(Batch_End_time);
		
		TotalFees = new JTextField();
		TotalFees.setEditable(false);
		TotalFees.setColumns(10);
		TotalFees.setBounds(680, 23, 68, 20);
		panel.add(TotalFees);
		
		JLabel label = new JLabel("Total Fess");
		label.setBounds(628, 25, 55, 17);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Submitted Fess *");
		label_1.setBounds(438, 49, 82, 14);
		panel.add(label_1);
		
		Sumbitted_fees = new JTextField();
		Sumbitted_fees.setText("");
		Sumbitted_fees.setColumns(10);
		Sumbitted_fees.setBounds(530, 46, 68, 20);
		panel.add(Sumbitted_fees);
		
		JLabel label_2 = new JLabel("Remaing Fess");
		label_2.setBounds(608, 49, 71, 14);
		panel.add(label_2);
		
		Reamaining_fees = new JTextField();
		Reamaining_fees.setEditable(false);
		Reamaining_fees.setColumns(10);
		Reamaining_fees.setBounds(677, 46, 71, 20);
		panel.add(Reamaining_fees);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(10, 26, 6, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setBounds(10, 49, 6, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Batch Start Time *");
		label_5.setBounds(128, 49, 92, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Starting  Date *");
		label_6.setBounds(125, 26, 82, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Complete  Date *");
		label_7.setBounds(367, 26, 83, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Batch End Time *");
		label_8.setBounds(289, 49, 92, 14);
		panel.add(label_8);
	}
}
