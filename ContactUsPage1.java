import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class ContactUsPage1 extends JFrame implements  MouseListener 
{   
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

     Dimension d;
     Toolkit t;
     int w,h;
	 Color col1;
	 Border border1;
	 Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	  JPanel p6=new JPanel()
	  {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("button.png").getImage(),0,40,350,85,null);
		}
	};
	 JPanel p2=new JPanel();
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
	
    // defining components
	
    JLabel lbl=new JLabel("Contact Detail Submitted Successfully");
	
	
	JButton btnHome=new JButton("HOME");
	JButton btnService=new JButton("SERVICES");
	JButton btnLibrarian=new JButton("LIBRARIANS");
	JButton btnAbout=new JButton("ABOUT US");
	JButton btnLogout=new JButton("LOGOUT");
	
  
  ContactUsPage1()
  {
	  
		super("LIBRARY MANAGMENT ");
		 
        t=Toolkit.getDefaultToolkit();
	    d=t.getScreenSize();
	    h=(int)d.getHeight();
	    w=(int)d.getWidth(); 
  
        col1=btnHome.getForeground();
		
  
		setVisible(true);
	    setSize(w,h);
	    p1.setBackground(new Color(0,139,139));
	    add(p1);
	    p1.setLayout(null);
	    p2.setBounds(690,250,560,460);
	    p2.setBackground(Color.white);
	    p2.setPreferredSize( new Dimension(600,460));
 
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p2.add(p6);
		p2.setLayout(null);
		p3.setBackground(new Color(255,255,255));
	    p4.setBackground(new Color(255,255,255));

		p3.setBounds(0,0,1400,141);
	    p5.setBounds(0,130,1400,95);
	    p5.setBackground(new Color(175,238,238));
	    p5.setLayout(null);
		 p6.setBackground(Color.yellow);
  
   p6.setLayout(null);
   p6.setBounds(70,65,440,120);
	 
	    p4.setBounds(60,290,600,300);
	    p4.setLayout(null);

		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		lbl.setBounds(120,240,390,30);
		lbl.setFont(new Font("Arial",Font.PLAIN,20));
		
		
		
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
	    
		p5.add(btnHome);
		btnHome.setBounds(580,37,100,30);
		btnHome.setForeground( Color.black);
		btnHome.setBorderPainted(false);
	    btnHome.setContentAreaFilled(false);
	    btnHome.setFocusPainted(false);
		btnHome.setFont(new Font("Arial",Font.PLAIN,18));
		
		btnService.setBounds(700,37,170,30);
		btnService.setForeground(Color.black);
	    btnService.setBorderPainted(false);
	    btnService.setContentAreaFilled(false);
	    btnService.setFocusPainted(false);
		btnService.setFont(new Font("Arial",Font.PLAIN,18));
		p5.add(btnService);
		
		btnLibrarian.setBounds(880,37,145,30);
		btnLibrarian.setForeground(Color.black);
	    btnLibrarian.setBorderPainted(false);
	    btnLibrarian.setContentAreaFilled(false);
	    btnLibrarian.setFocusPainted(false);
		btnLibrarian.setFont(new Font("Arial",Font.PLAIN,18));
		p5.add(btnLibrarian);
		 
		btnAbout.setBounds(1050,37,145,30);
		btnAbout.setForeground(Color.black);
	    btnAbout.setBorderPainted(false);
	    btnAbout.setContentAreaFilled(false);
	    btnAbout.setFocusPainted(false);
		btnAbout.setFont(new Font("Arial",Font.PLAIN,18));
		p5.add(btnAbout);
		
		btnLogout.setBounds(1220,37,140,30);
		btnLogout.setForeground(Color.black);
		btnLogout.setBorderPainted(false);
	    btnLogout.setContentAreaFilled(false);
	    btnLogout.setFocusPainted(false);
		btnLogout.setFont(new Font("Arial",Font.PLAIN,18));
		p5.add(btnLogout);
		
		
		 
		 p2.add(lbl);
		 
		 
		  
		 btnHome.addMouseListener(this);
		 btnService.addMouseListener(this);
		 btnLibrarian.addMouseListener(this);
		 btnAbout.addMouseListener(this);
		 btnLogout.addMouseListener(this);
		
		 setResizable(false);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);

  
  
  
   
	
   }
   public void mouseClicked(MouseEvent e)
   {
       
	 
	
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
	if(e.getSource()==btnLibrarian)
	{
	  // this.dispose();
	  // new Librarian Table().setVisible(true);
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
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(new Color(0,139,139));
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
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(col1);
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(col1);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col1);
		}
        		
     }
	 
       
       
   
  
   
  	
		
	 
  
  public static void main(String []args)
  {
   new ContactUsPage1 ();
  }
}
