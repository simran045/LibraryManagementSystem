import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class AdminLogin extends JFrame implements MouseListener , FocusListener , ActionListener
{
  
    	    Connection con;
			ResultSet rst;
			PreparedStatement pst;
		  
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
		}
		catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
		catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,e);}
	}	
   
    Dimension d;
    Toolkit t;
    int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 JPanel p6=new JPanel()
	 {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("play.jpg").getImage(),20,30,160,230,null);
		}
	};
	 
	 
   JPanel p2=new JPanel();
   JPanel p8=new JPanel();
   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
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
			g.drawImage(new ImageIcon("young.jpg").getImage(),40,30,460,270,null);
		}
	};
	Color col1;
    Border border1;
	Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
	
  JLabel lbl=new JLabel("ADMINISTRATOR LOGIN ");
  JLabel lbl1=new JLabel("Administrator Name");
  JTextField txt=new JTextField(20);
  JLabel lbl2=new JLabel("Password ");
  JPasswordField pass = new JPasswordField(50);
	
  JButton btnSubmit=new JButton("SUBMIT");
 /* JButton btnForgot=new JButton("Forgot Pasword?");
  JButton btn=new JButton("SignUp Here");*/
  JButton btnHome=new JButton("HOME");
  JButton btnService=new JButton("SERVICES");
  JButton btnLibrarian=new JButton("VIEW LIBRARIANS");
  JButton btnSign=new JButton("SIGN UP");
  JButton btnLogin=new JButton("LOGIN");
  
   JButton btn1=new JButton("LIBRARIAN SIGNUP");
   JButton btn2=new JButton("STUDENT SIGNUP");
   JButton btn3=new JButton("TEACHER SIGNUP");
   
   JButton btn5=new JButton("LIBRARIAN LOGIN");
   JButton btn8=new JButton("ADMINISTRATOR LOGIN");
	

  
  AdminLogin()
  {
	  
  super("Administrator Login ");
		 
  t=Toolkit.getDefaultToolkit();
  d=t.getScreenSize();
  h=(int)d.getHeight();
  w=(int)d.getWidth(); 
  
  setVisible(true);
  setSize(w,h);
  col1=btnHome.getForeground();
  border1=txt.getBorder();
  p1.setBackground(new Color(0,139,139));
  add(p1);
  p1.setLayout(null);
  p5.setBounds(0,226,w,h-236);
  p5.setBackground(new Color(0,139,139));
  p2.setBounds(120,30,580,475);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(580,475));
  p2.setBorder(BorderFactory.createLineBorder(Color.black));
  p1.add(p5);
  p5.add(p2);
  p1.add(p3);
  p2.add(p6);
  p5.add(p4);
  p1.add(p8);
  p2.setLayout(null);
  p3.setBackground(Color.white);
  p4.setBackground(new Color(255,255,255));
  p3.setBounds(0,0,1400,141);
  p6.setBackground(Color.yellow);
  p5.setLayout(null);
  p6.setLayout(null);
  p8.setLayout(null);
  p8.setBackground(new Color(127,255,212));
  p6.setBounds(40,80,190,218);
  p8.setBounds(0,134,1400,90);
  p4.setBounds(760,40,600,300);
  p4.setLayout(null);
  p8.setLayout(null);
  
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

  
  lbl.setBounds(180,20,600,18);
  lbl.setFont(new Font("Arial",Font.BOLD,20));
  lbl1.setBounds(300,100,190,18);
  lbl1.setFont(new Font("Arial",Font.PLAIN,18));
  txt.setBounds(300,135,180,25);
  lbl2.setBounds(300,220,140,18);
  lbl2.setFont(new Font("Arial",Font.PLAIN,18));
  pass.setBounds(300,260,180,25);
		
    btnSubmit.setBounds(50,350,500,30);
    btnSubmit.setBackground(new Color(0,139,139));
	btnSubmit.setFont(new Font("Arial",Font.PLAIN,18));
	btnSubmit.setFocusPainted(false);
	/*btnForgot.setBorderPainted(false);
	btnForgot.setContentAreaFilled(false);
	btnForgot.setFocusPainted(false);
	btnForgot.setBounds(30,420,180,30);
	btnForgot.setBackground(new Color(127,255,212));
    btnForgot.setFont(new Font("Arial",Font.PLAIN,15));
	btn.setBounds(400,420,140,30);
	btn.setBackground(new Color(127,255,212));
	btn.setBorderPainted(false);
	btn.setContentAreaFilled(false);
	btn.setFocusPainted(false);
	btn.setFont(new Font("Arial",Font.PLAIN,15));*/
	
	p8.add(btnHome);
	btnHome.setBounds(500,37,100,30);
	btnHome.setForeground( Color.black);
	btnHome.setBorderPainted(false);
	btnHome.setContentAreaFilled(false);
	btnHome.setFocusPainted(false);
	btnHome.setFont(new Font("Arial",Font.PLAIN,18));
	
	p8.add(la1);
	p8.add(la2);
	p8.add(la3);
	
	btnService.setBounds(620,37,170,30);
	btnService.setForeground(Color.black);
	btnService.setBorderPainted(false);
	btnService.setContentAreaFilled(false);
	btnService.setFocusPainted(false);
	btnService.setFont(new Font("Arial",Font.PLAIN,18));
	p8.add(btnService);
	
	btnLibrarian.setBounds(780,37,200,30);
	btnLibrarian.setForeground(Color.black);
	btnLibrarian.setBorderPainted(false);
	btnLibrarian.setContentAreaFilled(false);
	btnLibrarian.setFocusPainted(false);
	btnLibrarian.setFont(new Font("Arial",Font.PLAIN,18));
	p8.add(btnLibrarian);
	 
	btnSign.setBounds(990,37,145,30);
	btnSign.setForeground(Color.black);
	btnSign.setBorder(BorderFactory.createLineBorder(Color.black));
   //btnSign.setBorderPainted(false);
	btnSign.setContentAreaFilled(false);
	btnSign.setFocusPainted(false);
	btnSign.setFont(new Font("Arial",Font.PLAIN,18));
	p8.add(btnSign);
	Font btnFont2 =new Font("Arial", Font.PLAIN,16);

	   p5.add(panel1);
	   p5.add(panel2);
	   panel1.setLayout(new GridLayout(3,0));
	   panel2.setLayout(new GridLayout(2,0));
	  
	   btn1.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn1.setBorderPainted(false);
	   btn1.setContentAreaFilled(false);
	   btn1.setFocusPainted(false);
	   btn1.setFont(btnFont2);
	  
	   btn2.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn2.setBorderPainted(false);
	   btn2.setContentAreaFilled(false);
	   btn2.setFocusPainted(false);
	   btn2.setFont(btnFont2);
	   
	   btn3.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn3.setBorderPainted(false);
	   btn3.setContentAreaFilled(false);
	   btn3.setFocusPainted(false);
	   btn3.setFont(btnFont2);
	  
	   
	   btn5.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn5.setBorderPainted(false);
	   btn5.setContentAreaFilled(false);
	   btn5.setFocusPainted(false);
	   btn5.setFont(btnFont2);
	  
	   btn8.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn8.setBorderPainted(false);
	   btn8.setContentAreaFilled(false);
	   btn8.setFocusPainted(false);
	   btn8.setFont(btnFont2);
	   
	   panel1.add(btn1);
	   panel1.add(btn2);
	   panel1.add(btn3);
	   panel2.add(btn5);
	   panel2.add(btn8);
      
	   panel1.setVisible(false);
	   panel2.setVisible(false);
       panel2.setBounds(1145,1,200,100);
	   panel1.setBounds(970,1,200,100);
	
	btnLogin.setBounds(1170,37,140,30);
	btnLogin.setForeground(Color.black);
	btnLogin.setBorder(BorderFactory.createLineBorder(Color.black));
   //btnLogin.setBorderPainted(false);
	btnLogin.setContentAreaFilled(false);
	btnLogin.setFocusPainted(false);
	btnLogin.setFont(new Font("Arial",Font.PLAIN,18));
	p8.add(btnLogin);
	
	p2.add(lbl);
	p2.add(lbl1);
	p2.add(txt);
	p2.add(lbl2);
	p2.add(pass);
	p2.add(btnSubmit);
	/*p2.add(btnForgot);
	p2.add(btn);*/
	
	btnHome.addMouseListener(this);
	btnService.addMouseListener(this);
	btnLibrarian.addMouseListener(this);
	btnSign.addMouseListener(this);
	btnLogin.addMouseListener(this);
	btn1.addMouseListener(this);
	btn2.addMouseListener(this);
	btn3.addMouseListener(this);
	btn5.addMouseListener(this);
	btn8.addMouseListener(this);
	txt.addFocusListener(this);
	pass.addFocusListener(this);
	btnSubmit.addActionListener(this);
		  
  setResizable(false);
  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  setVisible(true);

  }
  
  public void focusGained(FocusEvent e)
   {
	 if(e.getSource()==txt)
	{
     txt.setBorder(border);
	}
	 if(e.getSource()==pass)
	{
     pass.setBorder(border);   
    }
	
   }
   public void focusLost(FocusEvent e)
   {
    if(e.getSource()==txt)
	{
	 txt.setBorder(border1);
     txt.setBackground(new Color(240,230,140));
	} 
	 if(e.getSource()==pass)
	{
     pass.setBorder(border1);   
    }
	
   }
   
  public void mouseClicked(MouseEvent e)
   {
      if(e.getSource()==btnSign)
		{
		  panel1.setVisible(true);
		 // panel1.setVisible(false); 
		}
		
		if(e.getSource()==btn1)
		{
		  panel1.setVisible(false);
		  //new HomePage().setVisible(false);
		  new Last().setVisible(true);
		 
		}
		if(e.getSource()==btn5)
		{
		  panel1.setVisible(false);
		  //new HomePage().setVisible(false);
		  new Last5().setVisible(true);
		 
		}
		if(e.getSource()==btnLibrarian)
		{
		    panel1.setVisible(false);
			this.dispose();
		    new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btn3)
		{
		  panel1.setVisible(false);
		  this.dispose();
		  new TeacherInfo().setVisible(true);
		}
		if(e.getSource()==btn2)
		{
		  panel1.setVisible(false);
		  this.dispose();
		  new StudentInfo().setVisible(true);
		}
		if(e.getSource()==btn5)
		{
		  panel1.setVisible(false);
		  this.dispose();
		  new Last5().setVisible(true);
		}
		  
		 if(e.getSource()==btnService)
		{
		  panel1.setVisible(false);
		  this.dispose();
		  new Service().setVisible(true);
		  
		}
		if(e.getSource()==btn8)
		{
		  panel1.setVisible(false);
		  this.dispose();
		  new AdminLogin().setVisible(true);
		}
		if(e.getSource()==btnLogin )
		{
		  panel2.setVisible(true);
		}
		if(e.getSource()==btnHome)
		{
		 this.dispose();
		  new HomePage().setVisible(true);
		}
		
   }
    public void mousePressed(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{
		 if(e.getSource()==btnSign)
		{
			panel1.setVisible(false);
		}
		if(e.getSource()==btnLogin)
		{
			panel2.setVisible(false);
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
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnSign)
		{
		btnSign.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogin)
		{
		btnLogin.setForeground(new Color(0,139,139));
		}
		
		if(e.getSource()==btn1)
		{
		btn1.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(new Color(0,139,139));
		}if(e.getSource()==btn3)
		{
		btn3.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn8)
		{
		btn8.setForeground(new Color(0,139,139));
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
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(col1);
		}
		if(e.getSource()==btnSign)
		{
		btnSign.setForeground(col1);
		}
		if(e.getSource()==btnLogin)
		{
		btnLogin.setForeground(col1);
		}
		if(e.getSource()==btn1)
		{
		btn1.setForeground(col1);
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(col1);
		}
		if(e.getSource()==btn3)
		{
		btn3.setForeground(col1);
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(col1);
		}
		if(e.getSource()==btn8)
		{
		btn8.setForeground(col1);
		}
		
	}
   public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==btnSubmit)
	     showData();
    }
 
    public void showData()
    {
        JFrame f1 = new JFrame();
        JLabel l, l0;
 
        String str1 = txt.getText();
        char[] p = pass.getPassword();
        String str2 = new String(p);
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
            PreparedStatement ps = con.prepareStatement("select admin_name,password from admin_login where admin_name=? and password=?");
            ps.setString(1, str1);
            ps.setString(2, str2);
			if(str1.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Please Enter Name");
			}
			else if(str2.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Please Enter Password");
			}
             else
			 {
			   ResultSet rs = ps.executeQuery();

               if(rs.next())
                {
			    JOptionPane.showMessageDialog(null, "Login Sucessfull");
				this.dispose();
                new AdminZone().setVisible(true);
 
                } 
				else 
            {
                JOptionPane.showMessageDialog(null,
                   "Incorrect Name or  password..Try Again with correct detail");
				   //txt.setText("");
				  // txt1.setText("");
                   //pass.setText("");
            }
			}
        }
        
		catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
		catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,e);}
    }
    

  public static void main(String []args)
  {
   new AdminLogin();
  }
}
