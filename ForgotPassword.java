import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.*;
import java.sql.*;
import java.util.ArrayList;

public class ForgotPassword extends JFrame implements ActionListener, MouseListener ,FocusListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 Color col1;
	 
   JPanel p2=new JPanel();
   JPanel p8=new JPanel();
   JPanel p3=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,135,null);
		}
	};
	
   JPanel p4=new JPanel()
  {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};
	
	
	 	Connection con;
		String colHead[];
		PreparedStatement pst,p;
		ResultSet i;  
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
          
	  JTextField txt=new JTextField(50);	  
	  JLabel lbl1=new JLabel(" Enter Login-ID:");
	  JTextField txt1=new JTextField(50);
      JLabel lbl2=new JLabel("New Password:");
	  JPasswordField txt2=new JPasswordField(50);
	  JLabel lbl3=new JLabel("Re-Enter New Password:");
	  JPasswordField txt3=new JPasswordField(50);
	  JLabel l = new JLabel("Security Questions:");
      JComboBox cbQues1 = new JComboBox();
	  JLabel l1= new JLabel("Question #1");
	  JLabel t1= new JLabel("Answer :");
	  JTextField tx1=new JTextField(300);
	  JTextField text=new JTextField(300);
	  JTextField text1=new JTextField(50);
	  JTextField text2=new JTextField(50);
	  JButton btn=new JButton("SUBMIT");
	  JButton btnExit=new JButton("EXIT");
	  JButton btnReset=new JButton("RESET");
	  JButton btnHome=new JButton("HOME");
	  JButton btnService=new JButton("SERVICES");
	  JButton btnView=new JButton("VIEW LIBRARIAN");
	  JButton btnSign=new JButton("SIGN UP");
	  JButton btnLogin=new JButton("LOGIN");
	  
	  
      ForgotPassword()
     {
	  
		super("Reset Password");
		txt.setVisible(false);
		text.setVisible(false);
		text2.setVisible(false);
		text1.setVisible(false);
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
		p8.setBounds(0,250,w,h-250);
		p1.add(p8);
		p8.setLayout(null);
		p8.setBackground(new Color(0,139,139));
		p2.setBounds(60,6,560,460);
	    p2.setBorder( BorderFactory.createTitledBorder("FORGOT PASSWORD"));
		p2.setBackground(Color.white);
		p2.setPreferredSize( new Dimension(1240,470));
		p8.add(p2);
		p1.add(p3);
		p8.add(p4);
		p1.add(p5);
		p2.setLayout(null);
		p3.setBackground(new Color(255,255,255));
		p4.setBackground(new Color(255,255,255));
		p3.setBounds(0,0,w,125);
		p5.setBounds(0,125,w,90);
		p5.setBackground(new Color(175,238,238));
		p5.setLayout(null);
		p4.setBounds(730,30,600,300);
		p4.setLayout(null);
		
	
	    lbl1.setBounds(90,50,120,25);
	    lbl1.setFont(new Font("Arial",Font.PLAIN,16));
		txt1.setBounds(250,50,170,27);	
	    lbl2.setBounds(90,155,150,25);
		lbl2.setVisible(false);
	    lbl2.setFont(new Font("Arial",Font.PLAIN,18));
	    txt2.setBounds(310,155,170,27);
		text.setBounds(420,155,100,20);
		txt2.setVisible(false);
		lbl3.setBounds(90,200,220,25);
		lbl3.setVisible(false);
	    lbl3.setFont(new Font("Arial",Font.PLAIN,18));
		txt3.setBounds(310,200,170,27);
		txt3.setVisible(false);
		
		l.setBounds(90,235,200,25);
	    l.setFont(new Font("Arial",Font.PLAIN,18));
		l.setVisible(false);
		l1.setBounds(90,270,200,25);
	    l1.setFont(new Font("Arial",Font.PLAIN,18));
		l1.setVisible(false);
		cbQues1.setBounds(210,270,330,20);
	    cbQues1.setFont(new Font("Arial",Font.PLAIN,12));
		cbQues1.setVisible(false);
		cbQues1.addItem("In what city did you meet your spouse/significant other?");
		cbQues1.addItem("In what city or town was your first job?");
		cbQues1.addItem("In what city or town did your mother and father meet?");
		cbQues1.addItem("In what city or town were you born?");
		cbQues1.addItem("What high school you attended?");
		cbQues1.addItem("What is the name of your favourite childhood friend?");
		cbQues1.addItem("What is the name of your favourite pet?");
		cbQues1.addItem("What is the name of your first school?");
		cbQues1.addItem("What is your father's middle name?");
		cbQues1.addItem("What is your favourite color?");
		cbQues1.addItem("What is your favourite movie?");
		t1.setBounds(90,310,200,25);
		t1.setVisible(false);
	    t1.setFont(new Font("Arial",Font.PLAIN,18));
		tx1.setBounds(210,310,330,25);
		tx1.setVisible(false);
	    tx1.setFont(new Font("Arial",Font.PLAIN,18));
		txt.setBounds(420,50,100,20);
		JLabel la1 = new JLabel("Library ");
	     la1.setFont(new Font("Arial", Font.BOLD, 20));
	     la1.setForeground(Color.red);
	     la1.setBounds(25,8,100,30);
		 text1.setBounds(420,155,450,20);
         text2.setBounds(420,200,450,20);		 
	   
	     JLabel la2 = new JLabel("Management ");
	     la2.setFont(new Font("Arial", Font.BOLD, 18));
	     la2.setBounds(25,44,120,20);
	   
	     JLabel la3 = new JLabel("System ");
	     la3.setFont(new Font("Arial", Font.BOLD, 18));
	     la3.setBounds(47,63,90,30);
		 p5.add(la1);
		 p5.add(la2);
		 p5.add(la3);
	
		btn.setBounds(200,95,150,30);
		btn.setBackground(new Color(0,139,139));
		btn.setFont(new Font("ARIAL",Font.PLAIN,20));
		btn.setFocusPainted(false);
	    btn.setBorderPainted(false);
		btnReset.setBounds(90,390,150,30);
		btnReset.setBackground(new Color(0,139,139));
		btnReset.setFont(new Font("ARIAL",Font.PLAIN,20));
		btnReset.setFocusPainted(false);
		btnReset.setVisible(false);
		btnExit.setBounds(300,390,140,30);
		btnExit.setBackground(new Color(0,139,139));
		btnExit.setFont(new Font("ARIAL",Font.PLAIN,20));
		btnExit.setFocusPainted(false);
		btnExit.setVisible(false);
		btnHome.setForeground(Color.black);
	    btnHome.setBounds(470,37,100,25);
	    btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	    btnHome.setBorderPainted(false);
	    btnHome.setContentAreaFilled(false);
	    btnHome.setFocusPainted(false);
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
         p5.add(btnHome);		
		
		btnService.setBounds(670,37,120,30);
		btnService.setForeground(Color.black);
	    btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	    btnService.setBorderPainted(false);
	    btnService.setContentAreaFilled(false);
	    btnService.setFocusPainted(false);
		btnService.setFont(btnFont);
		p5.add(btnService);
		 
		btnView.setForeground(Color.black);
	    btnView.setBounds(870,37,170,25);
	    btnView.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	    btnView.setBorderPainted(false);
	    btnView.setContentAreaFilled(false);
	    btnView.setFocusPainted(false);
		btnView.setFont(btnFont);
		p5.add(btnView);
	
		btnSign.setForeground(Color.black);
	    btnSign.setBounds(1100,37,100,25);
	    btnSign.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnSign.setBorderPainted(false);
	    btnSign.setContentAreaFilled(false);
	    btnSign.setFocusPainted(false);
		btnSign.setFont(btnFont);
		p5.add(btnSign);
		 
		btnLogin.setBounds(1250,37,90,30);
		btnLogin.setForeground(Color.black);
	    btnLogin.setBorder(BorderFactory.createLineBorder(Color.black));
	    btnLogin.setBorderPainted(false);
	    btnLogin.setContentAreaFilled(false);
	    btnLogin.setFocusPainted(false);
		btnLogin.setFont(btnFont); 
		p5.add(btnLogin);
	   p2.add(l1);
	   p2.add(txt);
	   p2.add(t1);
	   p2.add(text1);
	   p2.add(text2);
	   p2.add(tx1);
	   p2.add(cbQues1);
	   p2.add(lbl1);
	   p2.add(txt1);
	   p2.add(lbl2);
	   p2.add(txt2);
	   p2.add(lbl3);
	   p2.add(txt3);
	   p2.add(btn);
	   p2.add(btnExit);
	   p2.add(btnReset);
	   
		 
	   setResizable(false);
	   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 
	   btnExit.addMouseListener(this);
	   btnHome.addMouseListener(this);
	   btnService.addMouseListener(this);
	   btnView.addMouseListener(this);
	   btnSign.addMouseListener(this);
	   btnLogin.addMouseListener(this);
	   btn.addActionListener(this);
	   btnReset.addActionListener(this);
	   btnExit.addActionListener(this);
	   btnHome.addActionListener(this);
	   txt1.addFocusListener(this);
       txt2.addFocusListener(this);
	   txt3.addFocusListener(this);
	   
  
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
	 if(e.getSource()==txt3)
	{
     txt3.setBackground(new Color(240,230,140));   
    }
}
    
   public void focusLost(FocusEvent e)
   {}

  
   public void actionPerformed( ActionEvent ae)
   {
    char[] p = txt2.getPassword();
	String str1 = new String(p);
	char[] p1 = txt3.getPassword();
	String str2 = new String(p1);
		
    if(ae.getSource()== btn)
	 {
	    boolean result=false;
	  try
		  {
				pst=con.prepareStatement("select Lib_ques1, Lib_ans1  from lib_registration1  where Lib_id=?");
			    pst.setString(1,txt1.getText());
				ResultSet rst=pst.executeQuery();
				if(rst.next())
				{
				  result=true;
				  String ques=rst.getString("Lib_ques1");
				  txt.setText(ques);
				  String ans=rst.getString("Lib_ans1");
				  text1.setText(ans);
				  lbl2.setVisible(true);
				  txt2.setVisible(true);
				  lbl3.setVisible(true);
				  txt3.setVisible(true);
				  l.setVisible(true);
				  l1.setVisible(true);
				  cbQues1.setVisible(true);
				  t1.setVisible(true);
				  tx1.setVisible(true);
				  btnReset.setVisible(true);
				  btnExit.setVisible(true);
				
			}
			else
				{
					JOptionPane.showMessageDialog(null,"Login-ID not Found");
					txt1.setText("");
				}
			
		}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
		}
		if(ae.getSource()==btnReset)
		{
		    try
			{
			     
				 pst=con.prepareStatement("insert into forgot_pass values(?,?,?,?,?) ");
                 pst.setString(1,txt1.getText());				
				 pst.setString(2,str1);
				 pst.setString(3,str2);
				 pst.setString(4,cbQues1.getSelectedItem().toString());
				 text.setText(cbQues1.getSelectedItem().toString());
				 pst.setString(5,tx1.getText());
				 text2.setText(tx1.getText());
			     if(!(str1.equals(str2)))
				 { 
				  JOptionPane.showMessageDialog(this," your password don't match ! ","Password not changed",JOptionPane.WARNING_MESSAGE);   
				 }
			    else if(str1.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please Enter Password");
				}
				else if(str2.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please Enter Confirm-Password");
				}
				else if(cbQues1.getSelectedItem().equals("---------------------------Questions----------------------------"))
				{
					JOptionPane.showMessageDialog(null, "Please Choose Security Questions");
				}
				else if(tx1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter your answer");
				}
				else if(txt.getText().equals(text.getText()) && text1.getText().equals(text2.getText()))
                {			
				   pst.executeUpdate();
				     //new IssuedBook().setVisible(true);
					 if(pst.executeUpdate() > 0  )
				   {
				     pst=con.prepareStatement("UPDATE lib_registration1 SET Lib_pass = ' ' WHERE lib_id =?");
					 pst.executeUpdate();
					JOptionPane.showMessageDialog(this,"Password Sucessfully Updated","success",JOptionPane.INFORMATION_MESSAGE);
			        txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					cbQues1.setSelectedIndex(0);
					tx1.setText("");
				   }
				}
				   else
				   {
				    JOptionPane.showMessageDialog(this," question OR answer asked at register time don't match ! ","Password not changed",JOptionPane.WARNING_MESSAGE);
				   }
				
            }
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		           		
		if(ae.getSource()==btnExit)
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
	
	 public void mouseClicked(MouseEvent e)
   {
       
	  if(e.getSource()==btnReset)
	{
	  btnReset.setBackground(Color.gray);
	  //this.dispose();
	   //new Success().setVisible(true);
	}
	  if(e.getSource()==btnHome)
	{
	   this.dispose();
	   new HomePage().setVisible(true);
	}
	if(e.getSource()==btnService)
	{
	   this.dispose();
	   new Service().setVisible(true);
	}
	if(e.getSource()==btnView)
	{
	  this.dispose();
	  new LibrarianTable().setVisible(true);
	}
	if(e.getSource()==btnSign)
	{
	   //panel1.setVisible(true);
	}
	if(e.getSource()==btnLogin)
	{
	   //panel2.setVisible(true);
	}
   
   }
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
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
		if(e.getSource()==btnSign)
		{
		btnSign.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogin)
		{
		btnLogin.setForeground(new Color(0,139,139));
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
		if(e.getSource()==btnSign)
		{
		btnSign.setForeground(col1);
		}
		if(e.getSource()==btnLogin)
		{
		btnLogin.setForeground(col1);
		}
        		
     }
  
  public static void main(String []args)
  {
   new ForgotPassword();
  }
}
