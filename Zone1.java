import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class AdminZone extends JFrame implements MouseListener
{
    Connection con;
	PreparedStatement pst;
	ResultSet rst;
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
		}
		catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
		catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,e);}
	}	
    Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
    Border border1;
		   
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p8=new JPanel();
	 JPanel p5=new JPanel();
	 JPanel p6=new JPanel() {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("mars.jpg").getImage(),40,30,460,270,null);
		}
	};
	 
	 
	 
   JPanel p2=new JPanel();
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
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};
	
  JButton btnHome=new JButton("HOME");
  JButton btnLibrarian=new JButton("LIBRARIANS");
  JButton btnBook=new JButton("BOOKS");
  JButton btnFeedback=new JButton("FEEDBACKS");
  JButton btnContact=new JButton("CONTACTS");
  JButton btnAction=new JButton("ACTION");
  JButton btnLogout=new JButton("LOGOUT");
  
   JButton btn1=new JButton("ADD LIBRARIAN");
   JButton btn2=new JButton("REMOVE LIBRARIAN");
   JButton btn3=new JButton("ADD BOOKS");
   JButton btn4=new JButton("REMOVE BOOKS");
   JButton btn5=new JButton("ISSUED BOOKS");
   Color col,col1;
  
  AdminZone()
  {
	  
  super("LIBRARY MANAGMENT ");
  col1=btnHome.getForeground();	 
  t=Toolkit.getDefaultToolkit();
  d=t.getScreenSize();
  h=(int)d.getHeight();
  w=(int)d.getWidth(); 
  Font btnFont2 =new Font("Arial", Font.PLAIN,14);
  setVisible(true);
  setSize(w,h);
  p1.setBackground(new Color(0,139,139));
  add(p1);
  p1.setLayout(null);
  p2.setBounds(610,5,650,480);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(560,480));
  p8.setBounds(0,225,w,h-225);
  p8.setBackground(new Color(0,139,139));
 // p8.setPreferredSize( new Dimension(600,500));
  p1.add(p8);
  p8.setLayout(null);
  p8.add(p2);
  p1.add(p3);
  p2.add(p6);
  p8.add(p4);
  p1.add(p5);
  p2.setLayout(null);
   p3.setBackground(new Color(255,255,255));
   p4.setBackground(new Color(255,255,255));

   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,130,1400,90);
   p5.setBackground(new Color(127,255,212));
   p6.setBackground(Color.yellow);
   p5.setLayout(null);
   p6.setLayout(null);
   p6.setBounds(40,80,500,330);
 
  p4.setBounds(20,20,460,280);
  p4.setLayout(null);
  
		
		btn2.setBounds(200,95,90,30);
		btn2.setBackground(new Color(0,139,139));
		btn2.setFont(new Font("Arial",Font.PLAIN,15));
		btn3.setBounds(390,95,120,30);
		btn3.setBackground(new Color(0,139,139));
		btn3.setFont(new Font("Arial",Font.PLAIN,15));
		btn4.setBounds(600,95,95,30);
		btn4.setBackground(new Color(0,139,139));
		btn4.setFont(new Font("Arial",Font.PLAIN,15));
		 
		 p5.add(btn2);
		 p5.add(btn3);
		 p5.add(btn4);
		 
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
		 
	     btnHome.setForeground(Color.black);
	     btnHome.setBounds(340,40,100,25);
	     btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnHome.setBorderPainted(false);
	     btnHome.setContentAreaFilled(false);
	     btnHome.setFocusPainted(false);
		
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
		  p5.add(btnHome);
		  p5.add(la1);
		  p5.add(la2);
		  p5.add(la3);
		  
		 btnLibrarian.setForeground(Color.black);
	     btnLibrarian.setBounds(490,40,140,25);
	     btnLibrarian.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnLibrarian.setBorderPainted(false);
	     btnLibrarian.setContentAreaFilled(false);
	     btnLibrarian.setFocusPainted(false);
	  
		 btnLibrarian.setFont(btnFont);
		 p5.add(btnLibrarian);
		 
		 btnBook.setForeground(Color.black);
	     btnBook.setBounds(625,40,90,25);
	     btnBook.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnBook.setBorderPainted(false);
	     btnBook.setContentAreaFilled(false);
	     btnBook.setFocusPainted(false);
	  
		 btnBook.setFont(btnFont);
		 p5.add(btnBook);
		 
		 btnFeedback.setForeground(Color.black);
	     btnFeedback.setBounds(750,40,180,25);
	     btnFeedback.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnFeedback.setBorderPainted(false);
	     btnFeedback.setContentAreaFilled(false);
	     btnFeedback.setFocusPainted(false);
	  
		 btnFeedback.setFont(btnFont);
		 p5.add(btnFeedback);
		  
		 btnAction.setForeground(Color.black);
	     btnAction.setBounds(950,40,170,25);
	     btnAction.setBorder(BorderFactory.createLineBorder(Color.black));
         //btnBook.setBorderPainted(false);
	     btnAction.setContentAreaFilled(false);
	     btnAction.setFocusPainted(false);
		 btnAction.setFont(btnFont);
		 p5.add(btnAction);
		 panel1.setBounds(1050,0,200,100);
		 panel1.setVisible(false);
		 p8.add(panel1);
	     panel1.setLayout(new GridLayout(5,0));
	   
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
	   
	   btn4.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn4.setBorderPainted(false);
	   btn4.setContentAreaFilled(false);
	   btn4.setFocusPainted(false);
	   btn4.setFont(btnFont2);
	   
	   btn5.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn5.setBorderPainted(false);
	   btn5.setContentAreaFilled(false);
	   btn5.setFocusPainted(false);
	   btn5.setFont(btnFont2);
	  
	   panel1.add(btn1);
	   panel1.add(btn2);
	   panel1.add(btn3);
	   panel1.add(btn4);
	   panel1.add(btn5);
	    
		 btnContact.setForeground(Color.black);
	     btnContact.setBounds(1130,40,180,25);
	     btnContact.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnContact.setBorderPainted(false);
	     btnContact.setContentAreaFilled(false);
	     btnContact.setFocusPainted(false);
	  
		 btnContact.setFont(btnFont);
		 p5.add(btnContact);
		
	     btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1220,40,130,25);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
	   
		 btnLogout.setFont(btnFont);
		 p5.add(btnLogout);	  
		  setResizable(false);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  setVisible(true);

  
          btnHome.addMouseListener(this);
		  btnLibrarian.addMouseListener(this);
		  btnBook.addMouseListener(this);
		  btnFeedback.addMouseListener(this);
		   btnAction.addMouseListener(this);
		  btnContact.addMouseListener(this);
		  btnLogout.addMouseListener(this);
		  btn1.addMouseListener(this);
		  btn2.addMouseListener(this);
		  btn3.addMouseListener(this);
		  btn4.addMouseListener(this);
		  btn5.addMouseListener(this);
  }
  
   public void mouseClicked(MouseEvent e)
   {
 
		if(e.getSource()==btnBook)
		{
		 panel1.setVisible(true);
		}
		if(e.getSource()==btn1)
		{ 
         new AddBook().setVisible(true);
		}
		if(e.getSource()==btn2)
		{
		  new BookTable().setVisible(true);
		}
		if(e.getSource()==btn3)
		{
		  new IssueBook().setVisible(true);
		}
		  
		 if(e.getSource()==btn4)
		{
		  new IssueBookTable().setVisible(true);
		  
		}
		if(e.getSource()==btn5)
		{
		  this.dispose();
		  new ReturnBookT().setVisible(true);
		}
		if(e.getSource()==btnHome)
		{
		  new HomePage().setVisible(true);
		}
		if(e.getSource()==btnLibrarian )
		{
		  new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btnBook )
		{
		  //new ViewProfile().setVisible(true);
		}
		if(e.getSource()==btnFeedback )
		{
		  new LastUpdate().setVisible(true);
		}
		if(e.getSource()==btnLogout )
		{
		  new Logout().setVisible(true);
		}
    
   }
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e)
   {
    if(e.getSource()==btnBook)
	{
	  panel1.setVisible(false);
	}
   }
   public void mouseEntered(MouseEvent e)
	{
		if(e.getSource()==btnHome)
		{
		btnHome.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnFeedback)
		{
		btnFeedback.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(65,130,155));
		}
	}
	public void mouseExited(MouseEvent e)
	{	
		
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col1);
		}
		if(e.getSource()==btnBook)
		{
			btnBook.setForeground(col1);
		}
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(col1);
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(col1);
		}
		if(e.getSource()==btnFeedback)
		{
		btnFeedback.setForeground(col1);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col1);
		}
        		
     }
  
  
  
  
  
  public static void main(String []args)
  {
   new AdminZone();
  }
}
