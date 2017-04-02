package org.IMS.ignou.Admin.view.Login_screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import org.IMS.ignou.Admin.view.Reset_password.Reset_paswd;
import org.IMS.ignou.Admin.view.signup_screen.Signup;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Note : this class load when application start.
 * 
 * Login class to login(view).
 *   When user enter userid and password 
  -- then Login class check the username and password from database
  -- if userid and password are wrong then user need to enter details again(userid and password).
  -- if details are correct then welcome screen object create or welcome screen  load. 
 *
 * it also help user to reset it is password.
 * it take username(email id) and password as input.
 * then check in database
 * if userid and password confirm then welcome screen open.
 * then admin can manage it's institute.
 * 
 * 
 * Members : 
 * 1) it contain five Data member
 * 2) it contain 5 Member function + 1 contructor.
 * 
 * Name of Data member: -
 *   1) contentPane(jpanel) add all components eg.button,textfield,labels.
 *   2) UserId  is a text field which is used to take username as a input from user. 
 *   3) UserPassword is a password field which is used to take password as a input from user.
 *   4) user_id_can_not_blank is label which visible when username are not entered and user click login button.
 *   5) Passwd_can_not_be_blank is label which visible when password are not entered and user click login button.
 * 
 * Name of Member functionL-
 *   1)  resetuid_paswd() is function which execute when user click on forgot userid or password button. and  it create object of Reset_paswd(view) class.
 *   2)  cannotbeblank(String, String)  is function it take userid and password as a argument it execute when login button click. 
 *   									it check if UserId or UserPassword are blank then it set  the label "user_id_can_not_blank" or "Passwd_can_not_be_blank".
 *   									if UserPassword or UserId are not blank then it set value  "" or "". it return true or false.
 *   
 *   3)  Login_check() is function check it call cannotbeblank(String, String) function. it also call checkuid_upswd(String userid,String password).
 *   4)  Login()  // Contructor
 *   5)
 *   6) checkuid_upswd() is function which compare uid and password from Database.
 *   7) singup() is function which open signup screen and close current login screen.
 * 
 */


public class Login extends JFrame 
{
	private JPanel contentPane;
	
	private JTextField UserId;
	private JTextField UserPassword;
	private JLabel user_id_can_not_blank;
	private JLabel Passwd_can_not_be_blank;
	private JButton btnNewButton;
	public void singup()
	{
		this.setVisible(false);
		Signup signup=new Signup();
		signup.setVisible(true);
	}
	public void resetuid_paswd()
	{
		this.setVisible(false);  //closeing login view.
		Reset_paswd paswd=new Reset_paswd(); //opening reset password view.
		paswd.setVisible(true);
	}
	public boolean cannotbeblank(String userid,String password)
	{
		int Anyproblem=0;
		if(userid.equals("Enter User id"))
		{			
			user_id_can_not_blank.setText("  *  User id can not be blank");									
			user_id_can_not_blank.setForeground(Color.red);
			Anyproblem=1;
		}
		else  
		{
			user_id_can_not_blank.setText("");
			user_id_can_not_blank.setForeground(Color.white);
			
		}
		if(password.equals("Enter User Password"))
		{
			Passwd_can_not_be_blank.setText(" *  Password can not be blank ");
			Passwd_can_not_be_blank.setForeground(Color.red);	
			Anyproblem=1;
		}
		else
		{
			Passwd_can_not_be_blank.setText("");
			Passwd_can_not_be_blank.setForeground(Color.white);
		}
		if(Anyproblem==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void checkuid_upswd(String userid,String password)
	{
		
		
		System.out.println("underprocess.");
	}
	public void Login_check()
	{
		if(cannotbeblank(UserId.getText(), UserPassword.getText()))
		{
			checkuid_upswd(UserId.getText(), UserPassword.getText());
		}		
	}
	public Login() 
	{
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
				// TODO Auto-generated catch block
		    	JOptionPane.showMessageDialog(null, "GUI of IMS Are not Compatable with your opeating system");		
			}	    	    	
	    }

		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("login_image.jpg")));
		setResizable(false);
		setTitle("Login");
		
		setBounds(380, 200, 748, 322);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); // now button can set in anywhere
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("login_image.jpg")));
		lblNewLabel.setBounds(0, 0, 479, 295);
		contentPane.add(lblNewLabel);
		
		UserId = new JTextField();
		UserId.setFont(UIManager.getFont("CheckBoxMenuItem.font"));
		UserId.setToolTipText("Enter User id");
		UserId.setText("Enter User id");
		UserId.setBounds(499, 65, 223, 25);
		contentPane.add(UserId);
		UserId.setColumns(10);

		UserId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
								if(UserId.getText().equals("Enter User id"))					
									{
									UserId.setText("");				
									}
			}
		});
		UserId.addMouseMotionListener(new MouseMotionAdapter() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
						if(UserId.getText().equals("Enter User id"))
					
				{					UserId.setText("");				
				}
			}
		});
		
		UserId.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				if(UserId.getText().equals(""))
				{										
					UserId.setText("Enter User id");				
				}
			}
		});
		
		UserPassword = new JTextField();
		UserPassword.setToolTipText("Enter User Password");
		UserPassword.setText("Enter User Password");
		UserPassword.setColumns(10);
		UserPassword.setBounds(499, 24, 223, 25);
		contentPane.add(UserPassword);
		UserPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				if(UserPassword.getText().equals("Enter User Password"))
					
		{					UserPassword.setText("");				
		}

			}
		});

		UserPassword.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				if(UserPassword.getText().equals("Enter User Password"))
					
				{				
					UserPassword.setText("");				
				}
			}
		
		});
		UserPassword.addMouseListener(new MouseAdapter() {			
				@Override
				public void mouseExited(MouseEvent e) {
					if(UserPassword.getText().equals(""))
					{										
						UserPassword.setText("Enter User Password");				
					}
				}			
		});
	
		UserPassword.setToolTipText("Enter User Password");
		UserPassword.setText("Enter User Password");
		UserPassword.setColumns(10);
		UserPassword.setBounds(499, 126, 223, 25);
		contentPane.add(UserPassword);
		
		JButton Login_btn = new JButton("Login");
		Login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_check();
			}

					});
		Login_btn.setToolTipText("Login");
		Login_btn.setBounds(508, 189, 80, 23);
		contentPane.add(Login_btn);
		
		JButton Forgot_uid_passwd = new JButton("Forgot User Password");
		Forgot_uid_passwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetuid_paswd();
			}
		});
		Forgot_uid_passwd.setToolTipText("Forgot User Password");
		Forgot_uid_passwd.setBounds(525, 234, 170, 23);
		contentPane.add(Forgot_uid_passwd);
		
		user_id_can_not_blank = new JLabel("");
		user_id_can_not_blank.setForeground(Color.RED);
		user_id_can_not_blank.setBackground(Color.RED);
		user_id_can_not_blank.setBounds(489, 101, 224, 14);
		contentPane.add(user_id_can_not_blank);
		
		Passwd_can_not_be_blank = new JLabel("");
		Passwd_can_not_be_blank.setForeground(Color.RED);
		Passwd_can_not_be_blank.setBackground(Color.RED);
		Passwd_can_not_be_blank.setBounds(498, 164, 224, 14);
		contentPane.add(Passwd_can_not_be_blank);
		
		btnNewButton = new JButton("SignUp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
					singup();
					}
		});
		btnNewButton.setBounds(618, 189, 89, 23);
		contentPane.add(btnNewButton);
	}
}
