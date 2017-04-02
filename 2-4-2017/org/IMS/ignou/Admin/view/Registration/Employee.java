package org.IMS.ignou.Admin.view.Registration;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import org.IMS.ignou.Admin.Extendme.Reg.Registration;

public class Employee extends Registration
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	JPanel Jobinformationfaculty;
	private JComboBox<String> Batch_start_time1;
	private	JComboBox<String> Batch_start_time2;
private JComboBox<String> Batch_start_time3;
private JComboBox<String> Batch_start_time4;
private JComboBox<String> Batch_start_time5;
private JComboBox<String> Batch_start_time6;
private JComboBox<String> Batch_start_time7;
private JComboBox<String> Batch_start_time8;

private JComboBox<String> Batch_End_time1;
private JComboBox<String> Batch_End_time2;
private JComboBox<String> Batch_End_time3;
private JComboBox<String> Batch_End_time4;
private JComboBox<String> Batch_End_time5;
	private JComboBox<String> Batch_End_time6;
	private JComboBox<String> Batch_End_time7;
	private	JComboBox<String> Batch_End_time8;
	private	JComboBox<String> selectcourse1;
	private	JComboBox<String> selectcourse2;
	private	JComboBox<String> selectcourse3;
	private	JComboBox<String> selectcourse4;
	private	JComboBox<String> selectcourse5;
	private	JComboBox<String> selectcourse6;
	private	JComboBox<String> selectcourse7;
	private	JComboBox<String> selectcourse8;
	private 	JLabel lblBatchTiming;	
	private 	JLabel lblBatchTiming_1;
	private 	JLabel lblBatchTiming_2;
	private 	JLabel lblBatchTiming_4;
	private 	JLabel lblBatchTiming_5;
	private 	JLabel lblBatchTiming_6;
	private JLabel label_5;
	private	JLabel lblBatchTiming_3;
	private JPanel Jobinformationother;
	private JTextField JobNametxtfield;
	private JTextField salarytextField;
	private JComboBox<String> JobEndtimetxtfield;
	private JComboBox<String> jobStarttimetxtfield;
	private JLabel lbljobtiming;
	private JLabel Salartlbl;
	private JLabel jobtypelblNewLabel;
	private JLabel jobtypellblNewLabel;
	private JTextField jobNametxtfield;
	private JLabel jobTiminglblNewLabel;
	private JComboBox<String> jobstarttimingcomboBox;
	private JComboBox<String> jobEndtimingcomboBox;
	private JLabel SalarylblNewLabel;
	private JTextField SalarytextField;
	private ArrayList<String> allcourse;
	private  DefaultComboBoxModel<String> defaultComboBoxModel;
	public DefaultComboBoxModel<String> setcoursecomboboxmodel(ArrayList<String> allcourse)
	{		
		defaultComboBoxModel=new DefaultComboBoxModel<>();	
		defaultComboBoxModel.addElement("Select course");		
		if(allcourse.size()==0)
		{
			defaultComboBoxModel.addElement("No course found");
		}
		else
		{			
			for(String course:allcourse)
		
			{			
				defaultComboBoxModel.addElement(course);
		
			}
		}
	
		return defaultComboBoxModel;
	}
	@SuppressWarnings("deprecation")
	void otheremployee()
	{		
		Jobinformationfaculty.hide();		
		Jobinformationother.show();		
		setBounds(100, 100, 764, 592);
		btnSumbit.setBounds(258, 527, 89, 23);
  		Reset.setBounds(389, 527, 89, 23);
  		setLocationRelativeTo(null);
  		Backgroundimage.setBounds(0, 514, 758, 102);		
	}	
	@SuppressWarnings("deprecation")
	void Faculty()

	{
			Jobinformationother.hide();
			Jobinformationfaculty.show();
			setBounds(100, 100, 764, 720); //frame size changed.
			setLocationRelativeTo(null);
			btnSumbit.setBounds(271, 660, 89, 23);
	  		Reset.setBounds(389, 660, 89, 23);
	  		Backgroundimage.setBounds(0, 648, 758, 67);
	}
	@SuppressWarnings("deprecation")
	public Employee(ArrayList<String> Allcourse)
	{
		
		
		this.allcourse=Allcourse;		
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setForeground(Color.ORANGE);
		setBounds(100, 100, 764, 493);
		setLocationRelativeTo(null);
		setTitle("New Employee Registration");	
		
		Jobinformationfaculty = new JPanel();
		Jobinformationfaculty.setLayout(null);
		Jobinformationfaculty.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Faculty Job Information ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		Jobinformationfaculty.setBackground(Color.ORANGE);
		Jobinformationfaculty.setBounds(0, 463, 758, 186);
		getContentPane().add(Jobinformationfaculty);
		
		
		
		btnSumbit.setBounds(258, 527, 89, 23);
  		Reset.setBounds(389, 527, 89, 23);
  		Backgroundimage.setBounds(0, 514, 758, 102);
  		
  		JComboBox<String> Areyou = new JComboBox<String>();
  		Areyou.addItemListener(new ItemListener() {
  			public void itemStateChanged(ItemEvent arg0) 
  			{ 				
  				if(Areyou.getSelectedItem().equals("Faculty"))
  				{  				
  					Faculty();
  				}
  				else if(Areyou.getSelectedItem().equals("Other"))
  				{
  					otheremployee();
  				}
  				else
  				{
  					setBounds(100, 100, 764, 493);
  					setLocationRelativeTo(null);
  				}
  			}
  		});
  		Areyou.setModel(new DefaultComboBoxModel<String>(new String[] {"Registraton For", "Faculty", "Other"}));
  		Areyou.setBounds(0, 444, 122, 20);
  		getContentPane().add(Areyou);
  		
  		
  		
  			Jobinformationother = new JPanel();
  			Jobinformationother.setBounds(0, 463, 758, 53);
  			getContentPane().add(Jobinformationother);
  			Jobinformationother.setBackground(Color.ORANGE);
  			Jobinformationother.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), "Job information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
  			Jobinformationother.setLayout(null);
  			
  			jobtypellblNewLabel = new JLabel("Job Type *");
  			jobNametxtfield = new JTextField();
  			jobTiminglblNewLabel = new JLabel("Job Timing *");
  			jobEndtimingcomboBox = new JComboBox<String>();
  			jobstarttimingcomboBox = new JComboBox<String>();
  			SalarylblNewLabel = new JLabel("Salary *");
  			SalarytextField = new JTextField();
  			
  			
  			
  			
  
  		
  		
  		
  			lblBatchTiming_2 = new JLabel("Batch timing");
			Batch_start_time3 = new JComboBox<>();
			Batch_End_time3 = new JComboBox<>();
			selectcourse4 = new JComboBox<>();
			lblBatchTiming_4 = new JLabel("Batch timing");
			Batch_start_time4 = new JComboBox<>();
			Batch_End_time4 = new JComboBox<>();
			selectcourse5 = new JComboBox<>();
			lblBatchTiming_5 = new JLabel("Batch timing");
			Batch_start_time5 = new JComboBox<>();
			Batch_End_time5 = new JComboBox<>();
			selectcourse6 = new JComboBox<>();
			lblBatchTiming_6 = new JLabel("Batch timing");
			Batch_start_time6 = new JComboBox<>();
			Batch_End_time6 = new JComboBox<>();
			label_5 = new JLabel("Batch timing *");
			selectcourse7 = new JComboBox<>();
			Batch_start_time7 = new JComboBox<>();			
			Batch_End_time7 = new JComboBox<>();
			lblBatchTiming_3 = new JLabel("Batch timing");
			selectcourse8 = new JComboBox<>();
			Batch_start_time8 = new JComboBox<>();
			Batch_End_time8 = new JComboBox<>();	
			Batch_start_time1 = new JComboBox<>();
			Batch_End_time1 = new JComboBox<>();
			lblBatchTiming = new JLabel("Batch timing");
			selectcourse1 = new JComboBox<>();
			selectcourse2 = new JComboBox<>();
			lblBatchTiming_1 = new JLabel("Batch timing ");
			Batch_start_time2 = new JComboBox<>();
			Batch_End_time2 = new JComboBox<>();
			selectcourse3 = new JComboBox<>();

			JobEndtimetxtfield = new JComboBox<>();
			jobStarttimetxtfield = new JComboBox<>();
			 lbljobtiming = new JLabel("Job Timing *");		
			Salartlbl	= new JLabel("Salary *");	
			JobNametxtfield = new JTextField();
			salarytextField = new JTextField();

			jobtypelblNewLabel = new JLabel("Job Type *");
			
			
	  		jobTiminglblNewLabel.setBounds(290, 28, 66, 14);
			Jobinformationfaculty.add(jobTiminglblNewLabel);
			
			jobtypellblNewLabel.setBounds(10, 28, 60, 14);			
			Jobinformationfaculty.add(jobtypellblNewLabel);			
			jobNametxtfield.setBounds(91, 25, 186, 20);
			Jobinformationfaculty.add(jobNametxtfield);
			jobNametxtfield.setColumns(10);
			jobEndtimingcomboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			jobEndtimingcomboBox.setBounds(452, 25, 60, 20);
			Jobinformationfaculty.add(jobEndtimingcomboBox);
			jobstarttimingcomboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			jobstarttimingcomboBox.setBounds(366, 25, 66, 20);
			Jobinformationfaculty.add(jobstarttimingcomboBox);
			SalarylblNewLabel.setBounds(536, 28, 46, 14);
			Jobinformationfaculty.add(SalarylblNewLabel); 			
			
			SalarytextField.setBounds(605, 25, 123, 20);
			Jobinformationfaculty.add(SalarytextField);
			SalarytextField.setColumns(10);

			lblBatchTiming.setBounds(152, 160, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming);		
			
			selectcourse1.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse1.setBounds(10, 96, 123, 20);
			Jobinformationfaculty.add(selectcourse1);
			
			selectcourse2.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse2.setBounds(10, 124, 123, 20);
			Jobinformationfaculty.add(selectcourse2);
			
			lblBatchTiming_1.setBounds(152, 100, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_1);
			
			Batch_start_time2.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time2.setBounds(239, 126, 57, 20);
			Jobinformationfaculty.add(Batch_start_time2);
			
			Batch_End_time2.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time2.setBounds(318, 124, 57, 20);
			Jobinformationfaculty.add(Batch_End_time2);
			
			selectcourse3.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse3.setBounds(10, 155, 123, 20);
			Jobinformationfaculty.add(selectcourse3);
			
			lblBatchTiming_2.setBounds(152, 131, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_2);
			
			Batch_start_time3.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time3.setBounds(239, 157, 57, 20);
			Jobinformationfaculty.add(Batch_start_time3);
			
			Batch_End_time3.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time3.setBounds(318, 157, 57, 20);
			Jobinformationfaculty.add(Batch_End_time3);
			
			selectcourse4.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse4.setBounds(385, 96, 128, 20);
			Jobinformationfaculty.add(selectcourse4);
			lblBatchTiming_4.setBounds(525, 99, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_4);
		
			Batch_start_time4.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time4.setBounds(612, 96, 57, 20);
			Jobinformationfaculty.add(Batch_start_time4);
			
			Batch_End_time4.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time4.setBounds(691, 96, 57, 20);
			Jobinformationfaculty.add(Batch_End_time4);
			
			selectcourse5.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse5.setBounds(385, 124, 128, 20);
			Jobinformationfaculty.add(selectcourse5);
			

			
			lblBatchTiming_5.setBounds(525, 127, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_5);
			
			Batch_start_time5.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time5.setBounds(612, 124, 57, 20);
			Jobinformationfaculty.add(Batch_start_time5);
			

			
			Batch_End_time5.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time5.setBounds(691, 124, 57, 20);
			Jobinformationfaculty.add(Batch_End_time5);
			

			
			selectcourse6.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse6.setBounds(385, 155, 128, 20);
			Jobinformationfaculty.add(selectcourse6);
			
		 
			lblBatchTiming_6.setBounds(525, 158, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_6);
			

			Batch_start_time6.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time6.setBounds(612, 155, 57, 20);
			Jobinformationfaculty.add(Batch_start_time6);

			
			Batch_End_time6.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time6.setBounds(691, 155, 57, 20);
			Jobinformationfaculty.add(Batch_End_time6);
			

			label_5.setBounds(152, 75, 77, 14);
			Jobinformationfaculty.add(label_5);
			
			selectcourse7.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse7.setBounds(10, 67, 123, 20);
			Jobinformationfaculty.add(selectcourse7);
			

			
			Batch_start_time7.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time7.setBounds(239, 67, 57, 20);
			Jobinformationfaculty.add(Batch_start_time7);
			
			Batch_End_time7.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time7.setBounds(318, 67, 57, 20);
			Jobinformationfaculty.add(Batch_End_time7);
			
		
			lblBatchTiming_3.setBounds(525, 71, 77, 14);
			Jobinformationfaculty.add(lblBatchTiming_3);
			
		
			
			selectcourse8.setModel(setcoursecomboboxmodel(allcourse));
			selectcourse8.setBounds(385, 65, 128, 20);
			Jobinformationfaculty.add(selectcourse8);
			
		
			Batch_start_time8.setModel(new DefaultComboBoxModel<>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_start_time8.setBounds(612, 68, 57, 20);
			Jobinformationfaculty.add(Batch_start_time8);
			
			
			
			Batch_End_time8.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
			Batch_End_time8.setBounds(691, 68, 57, 20);
			Jobinformationfaculty.add(Batch_End_time8);
			
		
				Batch_start_time1.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Batch_start_time1.setBounds(239, 98, 57, 20);
				Jobinformationfaculty.add(Batch_start_time1);
				
				Batch_End_time1.setModel(new DefaultComboBoxModel<>(new String[] {"End","6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Batch_End_time1.setBounds(318, 98, 57, 20);
				Jobinformationfaculty.add(Batch_End_time1);
				
				
				JobNametxtfield.setBounds(95, 24, 166, 20);
				salarytextField.setBounds(640, 24, 86, 20);
				Salartlbl.setBounds(555, 27, 46, 14);
				lbljobtiming.setBounds(283, 27, 60, 14);
				jobStarttimetxtfield.setBounds(367, 24, 69, 20);
				JobEndtimetxtfield.setBounds(456, 24, 69, 20);
				jobtypelblNewLabel.setBounds(10, 27, 60, 14);


				Jobinformationother.add(JobNametxtfield);
				JobNametxtfield.setColumns(10);

				Jobinformationother.add(Salartlbl);
				
				Jobinformationother.add(salarytextField);
				salarytextField.setColumns(10);
				
				Jobinformationother.add(lbljobtiming);
				
				jobStarttimetxtfield.setModel(new DefaultComboBoxModel<String>(new String[] {"Start", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Jobinformationother.add(jobStarttimetxtfield);
				
				JobEndtimetxtfield.setModel(new DefaultComboBoxModel<String>(new String[] {"End", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM"}));
				Jobinformationother.add(JobEndtimetxtfield);		
				Jobinformationother.add(jobtypelblNewLabel);
							
  		Jobinformationfaculty.hide();
  		Jobinformationother.hide();
  		
	}
}
