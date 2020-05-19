import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.*;
import java.sql.*;
import java.util.ArrayList;

public class LastUpdate extends  JFrame  implements ActionListener, MouseListener ,FocusListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 Color col1,col2;
	 
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
	 
	  JLabel lbl=new JLabel("UPDATE PROFILE");
          
	  JLabel lbl1=new JLabel("Librarian-ID:");
	  JTextField txt1=new JTextField(50);		  
	  JLabel lbl2=new JLabel("Librarian Name:");
	  JTextField txt2=new JTextField(10);
	  JLabel lbl3=new JLabel("Password:");
	  JPasswordField pass = new JPasswordField(100);
	  JLabel lbl4=new JLabel("Re-Enter Password:");
	  JPasswordField passc = new JPasswordField(100);
	  JLabel lbl5=new JLabel("Date-Of-Birth:");
	  JTextField txt5=new JTextField(20);
	  JLabel lbl6=new JLabel("Contact Number:");
	  JTextField txt6=new JTextField(13);
	  JLabel lbl7=new JLabel("Gender:");
	  JComboBox genC=new JComboBox();
	  JLabel lbl8 = new JLabel("Address:");
	  JTextArea area=new JTextArea(200,80);
	  JScrollPane jsp=new JScrollPane(area);
	  
	  JLabel l = new JLabel("Security Questions:");

	  JButton btn=new JButton("UPDATE");
	  JButton btn0=new JButton("..");
	  JButton btnBack=new JButton("CLOSE");
	  JButton btnReset=new JButton("RESET");
	  JButton btnHome=new JButton("HOME");
	  JButton btnService=new JButton("SERVICES");
	  JButton btnView=new JButton("LIBRARIANS");
	  JButton btnAbout=new JButton("HELP");
	  JButton btnContact=new JButton("CONTACT US");
	  JButton btnLogout=new JButton("LOGOUT");
	
      JComboBox cbQues1 = new JComboBox();
	  JLabel l1= new JLabel("Question #");
	  JLabel t1= new JLabel("Answer :");
	  JTextField tx1=new JTextField(300);
	  
	  JComboBox cbQues2 = new JComboBox();
	  JLabel l2= new JLabel("Question #2");
	  JLabel t2= new JLabel("Answer :");
	  JTextField tx2=new JTextField(300);
	  
	  JComboBox cbQues3 = new JComboBox();
	  JLabel l3= new JLabel("Question #3");
	  JLabel t3= new JLabel("Answer :");
	  JTextField tx3=new JTextField(300);
	
  
     LastUpdate()
     {
	  
		super("Update Librarian Details");
		 
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
		
	    lbl.setBounds(480,5,600,26);
	    lbl.setFont(new Font("Arial",Font.BOLD,20));
			
	    lbl1.setBounds(40,85,150,25);
	    lbl1.setFont(new Font("Arial",Font.PLAIN,18));
	    txt1.setBounds(260,85,170,25);
		btn0.setBounds(450,85,20,25);
		
		l.setBounds(590,210,200,25);
	    l.setFont(new Font("Arial",Font.PLAIN,18));
		l1.setBounds(590,240,200,25);
	    l1.setFont(new Font("Arial",Font.PLAIN,18));
		cbQues1.setBounds(700,240,530,25);
	    cbQues1.setFont(new Font("Arial",Font.PLAIN,15));
		cbQues1.addItem("In what city or town were you born?");
		cbQues1.addItem("In what city or town was your first job?");
		cbQues1.addItem("In what city or town did your mother and father meet?");
		cbQues1.addItem("In what city did you meet your spouse/significant other?");
		cbQues1.addItem("What high school you attended?");
		cbQues1.addItem("What is the name of your favourite childhood friend?");
		cbQues1.addItem("What is the name of your favourite pet?");
		cbQues1.addItem("What is the name of your first school?");
		cbQues1.addItem("What is your father's middle name?");
		cbQues1.addItem("What is your favourite color?");
		cbQues1.addItem("What is your favourite movie?");
		t1.setBounds(590,285,200,25);
	    t1.setFont(new Font("Arial",Font.PLAIN,18));
		tx1.setBounds(700,285,530,25);
	    tx1.setFont(new Font("Arial",Font.PLAIN,18));
				
	    lbl2.setBounds(40,130,150,25);
		lbl2.setFont(new Font("Arial",Font.PLAIN,18));
	    txt2.setBounds(260,130,170,25);
		lbl3.setBounds(40,168,150,25);
		lbl3.setFont(new Font("Arial",Font.PLAIN,18));
	    pass.setBounds(260,168,170,25);
		lbl4.setBounds(40,210,180,25);
		lbl4.setFont(new Font("Arial",Font.PLAIN,18));
	    passc.setBounds(260,210,170,25);
		lbl5.setBounds(40,250,150,25);
		lbl5.setFont(new Font("Arial",Font.PLAIN,18));
	    txt5.setBounds(260,250,170,25);
		lbl6.setBounds(40,295,140,25);
		lbl6.setFont(new Font("Arial",Font.PLAIN,18));
		txt6.setBounds(260,295,170,25);
		lbl7.setBounds(590,85,150,25);
		lbl7.setFont(new Font("Arial",Font.PLAIN,18));
		genC.addItem("Male");
	    genC.addItem("Female");
	    genC.setBounds(700,85,220,25);
		lbl8.setBounds(590,130,140,25);
		lbl8.setFont(new Font("Arial",Font.PLAIN,18));
		jsp.setBounds(700,130,220,60);
		
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

		btnBack.setBounds(680,390,130,30);
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
         // p5.add(btnHome);		
		
		btnService.setBounds(580,37,120,25);
		btnService.setForeground(Color.black);
	    btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	    btnService.setBorderPainted(false);
	    btnService.setContentAreaFilled(false);
	    btnService.setFocusPainted(false);
		btnService.setFont(btnFont);
		//p5.add(btnService);
		 
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
	    btnContact.setBounds(1050,37,130,25);
	    btnContact.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnContact.setBorderPainted(false);
	    btnContact.setContentAreaFilled(false);
	    btnContact.setFocusPainted(false);
		 btnContact.setFont(btnFont);
		 p5.add(btnContact);
	   
		btnLogout.setBounds(1230,37,90,30);
		btnLogout.setForeground(Color.black);
	    btnLogout.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnLogout.setBorderPainted(false);
	    btnLogout.setContentAreaFilled(false);
	    btnLogout.setFocusPainted(false);
		 btnLogout.setFont(btnFont); 
		p5.add(btnLogout);
		
		btn0.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	    btn0.setBorderPainted(false);
	    btn0.setContentAreaFilled(false);
	    btn0.setFocusPainted(false);
		
       p2.add(lbl);
	   p2.add(l);
	   p2.add(l1);
	   p2.add(t1);
	   p2.add(tx1);
	   p2.add(cbQues1);
	   p2.add(l2);
	   p2.add(t2);
	   p2.add(tx2);
	   p2.add(cbQues2);
	   p2.add(l3);
	   p2.add(t3);
	   p2.add(tx3);
	   p2.add(cbQues3);
	   p2.add(lbl1);
	   p2.add(txt1);
	   p2.add(btn0);
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

	   col2=txt1.getBackground();
		 
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
	   btn0.addActionListener(this);
	   btnBack.addActionListener(this);
	   btnReset.addActionListener(this);
	   
	   btnHome.addActionListener(this);
	   
	   txt1.addFocusListener(this);
       txt2.addFocusListener(this);
	   pass.addFocusListener(this);
	   passc.addFocusListener(this);
	   txt5.addFocusListener(this);
	   txt6.addFocusListener(this);
	   genC.addFocusListener(this);
	   area.addFocusListener(this);
	   
  txt2.addKeyListener(new KeyAdapter() {
                  public void keyTyped(KeyEvent e) {
                  if(txt2.getText().length()>=25)
                        e.consume();
                  }
            });
  area.addKeyListener(new KeyAdapter() {
                  public void keyTyped(KeyEvent e) {
                  if(area.getText().length()>50)
                        e.consume();
                  }
            });
   txt6.addKeyListener(new KeyAdapter() {
                  public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!((c >= '0') && (c <= '9') ||
                             (c == KeyEvent.VK_BACK_SPACE) ||
                             (c == KeyEvent.VK_DELETE))) {
                              // getToolkit().beep();
                              e.consume();
                        }
                        if(txt6.getText().length()>9) 
                              e.consume();
                  }
            });
		
	  btn.setEnabled(false);
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
	 if(e.getSource()==pass)
	{
     pass.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==passc)
	{
     passc.setBackground(new Color(240,230,140));
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
	if(e.getSource()==area)
	{
     area.setBackground(new Color(128,128,128)); 
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
		this.dispose();
		new HomePage().setVisible(true);
		}
		if(e.getSource()==btnView)
		{
		this.dispose();
		new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btnService)
		{
		 this.dispose();
		new Service().setVisible(true);
		}
		if(e.getSource()==btnContact)
		{
		 this.dispose();
         new ContactUsPage().setVisible(true);
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
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(new Color(0,139,139));
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
     if(ae.getSource()== btn0)
	 {
	   
			try
			{
				pst=con.prepareStatement("Select * from lib_registration1 where Lib_id=?");
				pst.setString(1,txt1.getText());
				ResultSet rst=pst.executeQuery();
				if(rst.next())
				{
					txt1.setText(rst.getString("Lib_id"));
					txt2.setText(rst.getString("Lib_name"));
					pass.setText(rst.getString("Lib_pass"));
					passc.setText(rst.getString("Lib_passc"));
					txt5.setText(rst.getString("Lib_dob"));
					txt6.setText(rst.getString("Lib_contact"));
					genC.setSelectedItem(rst.getString("Lib_gender"));
					area.setText(rst.getString("Lib_address"));
					cbQues1.setSelectedItem(rst.getString("Lib_ques1"));
					tx1.setText(rst.getString("Lib_ans1"));
					btn.setEnabled(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Librarian With this ID Not Found");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
	  
     if(ae.getSource()== btn)
	 {
	    char[] p = pass.getPassword();
        String str1 = new String(p);
		char[] p1 = passc.getPassword();
        String str2 = new String(p1);
	  try
		  {
				pst=con.prepareStatement("update lib_registration1 set Lib_name=?,Lib_pass=?, Lib_passc=?,Lib_dob=?,Lib_contact=?,Lib_gender=?, Lib_address=?,Lib_ques1=?,Lib_ans1=? where Lib_id=?");
			    pst.setString(1,txt2.getText());
				pst.setString(2,str1);
				pst.setString(3,str2);
				pst.setString(4,txt5.getText());
				pst.setString(5,txt6.getText());
				pst.setString(6,genC.getSelectedItem().toString());
				pst.setString(7,area.getText());
				pst.setString(8,cbQues1.getSelectedItem().toString());
				pst.setString(9,tx1.getText());
				pst.setString(10,txt1.getText());
			    //txt1.setEditable(false);
			    if(txt2.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Name","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(str1.isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter password","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(str2.isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"confirm password field is empty","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt5.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Date-Of-Birth","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt6.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Phone number ","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(genC.getSelectedItem().equals("------------------------------------------------------"))
				{
				       JOptionPane.showMessageDialog(this,"please select gender","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(area.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter address","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(cbQues1.getSelectedItem().equals("---------------------------Questions----------------------------"))
				{
				       JOptionPane.showMessageDialog(this,"please enter login-id","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(tx1.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter your answer","Not Updated",JOptionPane.WARNING_MESSAGE);
			    }
				else if(!(str1.equals(str2)))
				 { 
				 JOptionPane.showMessageDialog(this," please re-enter your Password ! ","Not Updated",JOptionPane.WARNING_MESSAGE);
				 }
					  else 
				    {
					  pst.executeUpdate(); 
                      JOptionPane.showMessageDialog(this,"Successfully updated...","success",JOptionPane.INFORMATION_MESSAGE);
				    }
				  }
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
		}
		if(ae.getSource()==btnReset)
		{
		            txt1.setBackground(col2);
			        txt1.setText("");
					txt2.setText("");
					pass.setText("");
					passc.setText("");
					txt5.setText("");
					txt6.setText("");
					genC.setSelectedIndex(0);
					area.setText("");
					cbQues1.setSelectedIndex(0);
					tx1.setText("");
			 
	
		}
		           		
		if(ae.getSource()==btnBack)
		{
		  this.dispose();
		}
		if(ae.getSource()==btnHome)
		{
		  this.dispose();
		  new HomePage().setVisible(true);
		}
		
   }
  
  
  public static void main(String []args)
  {
   System.setProperty("java.library.path", "PathToYourLibrary");
   new LastUpdate();
   
  }
}
