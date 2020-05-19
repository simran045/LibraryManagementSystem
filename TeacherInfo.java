import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.*;
import java.sql.*;
import java.util.ArrayList;

public class TeacherInfo extends JFrame implements ActionListener, MouseListener ,FocusListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 Color col1;
	 
   JPanel p2=new JPanel();
   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   JPanel p8=new JPanel();
   JPanel p3=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,135,null);
		}
	};
	
   JPanel p4=new JPanel();
  /* {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};*/
	
	
	 	Connection con;
		String colHead[];
		PreparedStatement pst;
		  
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}	
	}  
     //defining components
	 
	  JLabel lbl=new JLabel("REGISTER NEW MEMBER");
          
	  JLabel lbl1=new JLabel("Teacher-ID:");
	  JTextField txt1=new JTextField(50);		  
	  JLabel lbl2=new JLabel("Teacher Name:");
	  JTextField txt2=new JTextField(10);
	   JLabel lbl3=new JLabel("Department:");
	  JComboBox pass = new JComboBox();
	  JLabel lbl4=new JLabel("Designation:");
	  JTextField passc = new JTextField(100);
	  JLabel lbl5=new JLabel("Date-Of-Birth:");
	  JTextField txt5=new JTextField(20);
	  JLabel lbl6=new JLabel("Contact Number:");
	  JTextField txt6=new JTextField(13);
	  JLabel lbl7=new JLabel("Gender:");
	  JComboBox genC=new JComboBox();
	  JLabel lbl8 = new JLabel("Address:");
	  JTextArea area=new JTextArea(200,80);
	  JScrollPane jsp=new JScrollPane(area);
	  JLabel lbl9=new JLabel("Aadhar Number:");
	  JTextField txt9=new JTextField(15);
	  JLabel lbl10=new JLabel("Status:");
	  JComboBox statC=new JComboBox();
	  JComboBox cbQues1 = new JComboBox();
	  JLabel l1= new JLabel("Question #1");
	  JLabel t1= new JLabel("Answer :");
	  JTextField tx1=new JTextField(300);
	  JLabel l = new JLabel("Security Questions:");


	  JButton btn=new JButton("SUBMIT");
	  JButton btnForgot=new JButton("Forgot Pasword?");
	  JButton btnLogin1=new JButton("Login Here");
	  JButton btnBack=new JButton("CLOSE");
	  JButton btnReset=new JButton("RESET");
	  JButton btnHome=new JButton("HOME");
	  JButton btnService=new JButton("SERVICES");
	  JButton btnView=new JButton("LIBRARIANS");
	  JButton btnAbout=new JButton("ABOUT US");
	  JButton btnContact=new JButton("CONTACT US");
	  JButton btnLogout=new JButton("LOGOUT");
	  
   JButton btn1=new JButton("LIBRARIAN SIGNUP");
    JButton btn2=new JButton("STUDENT SIGNUP");
   JButton btn3=new JButton("TEACHER SIGNUP");
   JButton btn4=new JButton("ADMINISTRATOR SIGNUP");
   
   JButton btn5=new JButton("LIBRARIAN LOGIN");
   JButton btn6=new JButton("STUDENT LOGIN");
   JButton btn7=new JButton("TEACHER LOGIN");
   JButton btn8=new JButton("ADMINISTRATOR LOGIN");
	
  
      TeacherInfo()
     {
	  
		super("LIBRARY MANAGMENT SYSTEM ");
		 
        t=Toolkit.getDefaultToolkit();
        d=t.getScreenSize();
        h=(int)d.getHeight();
        w=(int)d.getWidth(); 
  
        col1 = btnHome.getForeground();
  
		setVisible(true);
		setSize(w,h);
		
		p1.setBackground(new Color(0,139,139));
		add(p1);
		p1.setLayout(null);
		p2.setBounds(70,10,1247,465);
		p8.setBounds(0,220,w,h-220);
		p8.setBackground(new Color(0,139,139));
		p1.add(p8);
		p8.setLayout(null);
	    p2.setBorder(BorderFactory.createLineBorder(Color.black));
		p2.setBackground(Color.white);
		p2.setPreferredSize( new Dimension(1240,470));
		p8.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p2.setLayout(null);
		p3.setBackground(new Color(255,255,255));
		//p4.setBackground(new Color(255,255,255));
		p3.setBounds(0,0,w,125);
		p5.setBounds(0,125,w,90);
		p5.setBackground(new Color(175,238,238));
		p5.setLayout(null);
		//p4.setBounds(20,200,600,300);
		p4.setLayout(null);
		
	    lbl.setBounds(430,10,600,26);
	    lbl.setFont(new Font("Arial",Font.BOLD,20));
			
	    lbl1.setBounds(40,85,150,25);
	    lbl1.setFont(new Font("Arial",Font.PLAIN,18));
	    txt1.setBounds(260,85,170,25);
	    lbl2.setBounds(40,130,150,25);
		lbl2.setFont(new Font("Arial",Font.PLAIN,18));
	    txt2.setBounds(260,130,170,25);
		lbl3.setBounds(40,175,150,25);
		lbl3.setFont(new Font("Arial",Font.PLAIN,18));
		pass.addItem("-------------Select-------------");
		pass.addItem("IT");
	    pass.addItem("CSE");
	    pass.addItem("ELECTRONICS");
	    pass.setBounds(260,175,170,25);
		lbl4.setBounds(40,220,180,25);
		lbl4.setFont(new Font("Arial",Font.PLAIN,18));
	    passc.setBounds(260,220,170,25);
		lbl5.setBounds(40,260,150,25);
		lbl5.setFont(new Font("Arial",Font.PLAIN,18));
	    txt5.setBounds(260,260,170,25);
		lbl6.setBounds(40,305,140,25);
		lbl6.setFont(new Font("Arial",Font.PLAIN,18));
		txt6.setBounds(260,305,170,25);
		lbl7.setBounds(590,250,200,25);
		lbl7.setFont(new Font("Arial",Font.PLAIN,18));
		genC.addItem("---------------------Select------------------");
		genC.addItem("Male");
	    genC.addItem("Female");
	    genC.setBounds(730,250,220,25);
		lbl8.setBounds(590,85,140,25);
		lbl8.setFont(new Font("Arial",Font.PLAIN,18));
		jsp.setBounds(730,85,230,75);
		lbl10.setBounds(590,305,200,25);
		lbl10.setFont(new Font("Arial",Font.PLAIN,18));
		statC.addItem("---------------------Select------------------");
		statC.addItem("Active");
	    statC.addItem("Inactive");
	    statC.setBounds(730,305,220,25);
		lbl9.setBounds(590,195,140,25);
		lbl9.setFont(new Font("Arial",Font.PLAIN,18));
		txt9.setBounds(730,195,220,25);
		
		JLabel la1 = new JLabel("Library ");
	     la1.setFont(new Font("Arial", Font.BOLD, 20));
	     la1.setForeground(Color.red);
	     la1.setBounds(25,8,100,30);
		 
	   
	     JLabel la2 = new JLabel("Management ");
	     la2.setFont(new Font("Arial", Font.BOLD, 18));
	     la2.setBounds(25,44,120,20);
	   
	     JLabel la3 = new JLabel("System ");
	     la3.setFont(new Font("Arial", Font.BOLD, 18));
	     la3.setBounds(47,63,90,30);
		 p5.add(la1);
		 p5.add(la2);
		 p5.add(la3);
	
		btn.setBounds(320,390,120,30);
		btn.setBackground(new Color(135,206,250));
		btn.setFont(new Font("ARIAL",Font.PLAIN,20));
		btn.setFocusPainted(false);
		
		btnReset.setBounds(500,390,100,30);
		btnReset.setBackground(new Color(135,206,250));
		btnReset.setFont(new Font("ARIAL",Font.PLAIN,20));
		btnReset.setFocusPainted(false);
		
		btnBack.setBounds(650,390,120,30);
		btnBack.setBackground(new Color(135,206,250));
		btnBack.setFont(new Font("ARIAL",Font.PLAIN,20));
		btnBack.setFocusPainted(false);
		
		btnHome.setForeground(Color.black);
	    btnHome.setBounds(470,37,80,25);
	    btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	    btnHome.setBorderPainted(false);
	    btnHome.setContentAreaFilled(false);
	    btnHome.setFocusPainted(false);
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
          p5.add(btnHome);		
		
		btnService.setBounds(580,37,120,25);
		btnService.setForeground(Color.black);
	    btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	    btnService.setBorderPainted(false);
	    btnService.setContentAreaFilled(false);
	    btnService.setFocusPainted(false);
		btnService.setFont(btnFont);
		p5.add(btnService);
		 
		btnView.setForeground(Color.black);
	    btnView.setBounds(720,37,170,25);
	    btnView.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	    btnView.setBorderPainted(false);
	    btnView.setContentAreaFilled(false);
	    btnView.setFocusPainted(false);
		 btnView.setFont(btnFont);
		 p5.add(btnView);
	
		btnAbout.setForeground(Color.black);
	    btnAbout.setBounds(900,37,100,25);
	    btnAbout.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnAbout.setBorderPainted(false);
	    btnAbout.setContentAreaFilled(false);
	    btnAbout.setFocusPainted(false);
		 btnAbout.setFont(btnFont);
		 p5.add(btnAbout);
		 
		 btnContact.setForeground(Color.black);
	    btnContact.setBounds(1060,37,130,25);
	    btnContact.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnContact.setBorderPainted(false);
	    btnContact.setContentAreaFilled(false);
	    btnContact.setFocusPainted(false);
		 btnContact.setFont(btnFont);
		 p5.add(btnContact);
	   
		btnLogout.setBounds(1250,37,90,30);
		btnLogout.setForeground(Color.black);
	    btnLogout.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnLogout.setBorderPainted(false);
	    btnLogout.setContentAreaFilled(false);
	    btnLogout.setFocusPainted(false);
		 btnLogout.setFont(btnFont); 
		p5.add(btnLogout);
		
       p2.add(lbl);
	   p2.add(lbl9);
	   p2.add(txt9);
	   p2.add(lbl10);
	   p2.add(statC);
	   p2.add(lbl1);
	   p2.add(txt1);
	   p2.add(lbl2);
	   p2.add(txt2);
	   p2.add(lbl3);
	   p2.add(pass);
	   p2.add(lbl4);
	   p2.add(passc);
	   p2.add(lbl5);
	   p2.add(txt5);
	   p2.add(lbl6);
	   p2.add(txt6);
	   p2.add(lbl7);
	   p2.add(genC);
	   p2.add(lbl8);
	   p2.add(jsp);
	   p2.add(btn);
	   p2.add(btnBack);
	   p2.add(btnReset);
	   
		 
	   setResizable(false);
	   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 
	   btnBack.addMouseListener(this);
	   btnHome.addMouseListener(this);
	   btnService.addMouseListener(this);
	   btnView.addMouseListener(this);
	   btnAbout.addMouseListener(this);
	   btnLogout.addMouseListener(this);
	   btnContact.addMouseListener(this);
	   
	   btn.addActionListener(this);
	   btnReset.addActionListener(this);
	   btnBack.addActionListener(this);
	   btnHome.addActionListener(this);
	   
	   txt1.addFocusListener(this);
       txt2.addFocusListener(this);
	   txt5.addFocusListener(this);
	   txt6.addFocusListener(this);
	   genC.addFocusListener(this);
	   area.addFocusListener(this);
	  
	  
  }
  
  
       public void focusGained(FocusEvent e)
   {
     if(e.getSource()==txt1)
	{
     txt1.setBackground(new Color(240,230,140));
	} 
	 if(e.getSource()==txt2)
	{
     txt2.setBackground(new Color(240,230,140));	 //(238,232,170)
	}
	if(e.getSource()==txt5)
	{
     txt5.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt6)
	{
     txt6.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==genC)
	{
     genC.setBackground(new Color(240,230,140));   
    }
    
   }
   public void focusLost(FocusEvent e)
   {}
  
   public void mouseClicked(MouseEvent e)
   {
		if(e.getSource()==btnBack)
		{
		btnBack.setBackground(Color.gray);
		}
		if(e.getSource()==btn)
		{
		btn.setBackground(Color.gray);
		}
		if(e.getSource()==btnHome)
		{
		new HomePage().setVisible(true);
		}
		if(e.getSource()==btnService)
		{
		new Service().setVisible(true);
		}
		if(e.getSource()==btnContact)
		{
		 this.dispose();
		 new ContactUsPage().setVisible(true);
		}
		if(e.getSource()==btnView)
		{ 
		 this.dispose();
		 new LibrarianTable().setVisible(true);
		 }
		if(e.getSource()==btnAbout)
		{
		 this.dispose();
		 new AboutUs().setVisible(true);
		}
		if(e.getSource()==btnLogout)
		{
		 this.dispose();
		 new Logout().setVisible(true);
		}
	
   }
  
   public void mouseEntered(MouseEvent e)
   {
    if(e.getSource()==btnHome)
		{
		btnHome.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(0,139,139));
		}
		
   } 
   public void mouseExited(MouseEvent e)
   {
     if(e.getSource()==btnHome)
		{
		btnHome.setForeground(col1);
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(col1);
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(col1);
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(col1);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col1);
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(col1);
		}
   } 
   public void mouseReleased(MouseEvent e)
   {}   
   public void mousePressed(MouseEvent e)
   {}
  
   public void actionPerformed( ActionEvent ae)
   {
     if(ae.getSource()== btn)
	 {
	    
	  try
		  {
				pst=con.prepareStatement("insert into teacher_info values(?,?,?,?,?,?,?,?,?,?)");
			    pst.setString(1,txt1.getText());
				pst.setString(2,txt2.getText());
				pst.setString(3,txt5.getText());
				pst.setString(4,txt6.getText());
				pst.setString(5,genC.getSelectedItem().toString());
				pst.setString(6,area.getText());
				pst.setString(7,txt9.getText());
				pst.setString(8,statC.getSelectedItem().toString());
				pst.setString(9,cbQues1.getSelectedItem().toString());
				pst.setString(10,tx1.getText());
			    
				if(txt1.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Member-id","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt2.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Name","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt5.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Date-Of-Birth","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt6.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Phone number ","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(genC.getSelectedItem().equals("---Select---"))
				{
				       JOptionPane.showMessageDialog(this,"please select gender","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(statC.getSelectedItem().equals("---Select---"))
				{
				       JOptionPane.showMessageDialog(this,"please select gender","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(area.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter address","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(pass.getSelectedItem().equals("------Select------"))
				{
				       JOptionPane.showMessageDialog(this,"please select Department","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }

			    else 
				    {
					  pst.executeUpdate(); 
                      JOptionPane.showMessageDialog(this,"Member Successfully registered...","success",JOptionPane.INFORMATION_MESSAGE);
				    }
		}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
		}
		if(ae.getSource()==btnReset)
		{
			        txt1.setText("");
					txt2.setText("");
					txt5.setText("");
					txt6.setText("");
					genC.setSelectedIndex(0);
					area.setText("");
					
	
		}
		           		
		if(ae.getSource()==btnBack)
		{
		  this.dispose();
		  new HomePage().setVisible(true);
		}
		if(ae.getSource()==btnHome)
		{
		  this.dispose();
		  new HomePage().setVisible(true);
		}
   }
  
  
  public static void main(String []args)
  {
   new TeacherInfo();
  }
}
