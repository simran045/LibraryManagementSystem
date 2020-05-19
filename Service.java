import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class Service extends JFrame implements ActionListener,MouseListener
{
    
   
		   
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p8=new JPanel();
	 JPanel p5=new JPanel();
	 JPanel p6=new JPanel()
    {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("lib1.jpg").getImage(),0,0,400,275,null);
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
			g.drawImage(new ImageIcon("national library.jpg").getImage(),40,30,460,270,null);
		}
	};
	 
  JLabel lbl=new JLabel("SERVICES ");
  JLabel lbl1=new JLabel("         Library managment is a software made to help library work and managment much  "); 
  JLabel lbl2=new JLabel("         smoother easier and digital by keeping human efforts at manual level purpose. ");                        
  JLabel lbl3=new JLabel("         Library Managment is  composed of different work modules which are used to    ");
  JLabel lbl4=new JLabel("         perform all library. Task on daily,weekly,monthly,quaterly and yearly.The     ");       
  JLabel lbl5=new JLabel("         purpose of this system is to make library functionally more independent       ");       	 
  JLabel lbl6=new JLabel("         of human being by making system simply understandable and easily accessible. ");       	 
  
  JButton btnHome=new JButton("HOME");
  JButton btnLibrarian=new JButton("LIBRARIANS");
  
  
  JButton btnContact=new JButton("CONTACTS");
  
  JButton btnLogout=new JButton("LOGOUT");
                                                                                                               
  
   Color col,col1;
  
  Service()
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
  p2.setBounds(610,15,670,480);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(580,460));
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
   panel1.setBackground(new Color(255,255,255));
   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,130,1400,90);
   p5.setBackground(new Color(175,238,238));
  p6.setBackground(Color.yellow);
   p5.setLayout(null);
   p6.setLayout(null);
   p6.setBounds(70,5,600,500);
 
  p4.setBounds(20,20,460,280);
  p4.setLayout(null);
  
		
		col=btnHome.getForeground();
		
		 
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
		  lbl.setBounds(240,220,600,150);
  lbl.setFont(new Font("Algerian",Font.BOLD,25));
  lbl1.setBounds(20,270,680,150);
  lbl1.setFont(new Font("Arial",Font.PLAIN,15));
  lbl2.setBounds(20,290,680,150);
  lbl2.setFont(new Font("Arial",Font.PLAIN,15));
   lbl3.setBounds(20,310,680,150);
  lbl3.setFont(new Font("Arial",Font.PLAIN,15));
   lbl4.setBounds(20,330,680,150);
   lbl4.setFont(new Font("Arial",Font.PLAIN,15));
   lbl5.setBounds(20,350,680,150);
  lbl5.setFont(new Font("Arial",Font.PLAIN,15));
   lbl6.setBounds(20,370,680,150);
  lbl6.setFont(new Font("Arial",Font.PLAIN,15));


		 p5.add(la1);
		 p5.add(la2);
		 p5.add(la3);
		 
	     btnHome.setForeground(Color.black);
	     btnHome.setBounds(750,40,100,25);
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
		 
		p2.add(lbl);
		 p2.add(lbl1);
   p2.add(lbl2);
   p2.add(lbl3);
   p2.add(lbl4);
   p2.add(lbl5);
   p2.add(lbl6);
  
 
 
		 btnLibrarian.setForeground(Color.black);
	     btnLibrarian.setBounds(890,40,140,25);
	     btnLibrarian.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnLibrarian.setBorderPainted(false);
	     btnLibrarian.setContentAreaFilled(false);
	     btnLibrarian.setFocusPainted(false);
	  
		 btnLibrarian.setFont(btnFont);
		 p5.add(btnLibrarian);
		 
		 
		 
		
	   
	  
	 
	    
		 btnContact.setForeground(Color.black);
	     btnContact.setBounds(1020,40,180,25);
	     btnContact.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnContact.setBorderPainted(false);
	     btnContact.setContentAreaFilled(false);
	     btnContact.setFocusPainted(false);
	  
		 btnContact.setFont(btnFont);
		 p5.add(btnContact);
		
	     btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1190,40,130,25);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
	   
		 btnLogout.setFont(btnFont);
		 p5.add(btnLogout);	  
		  setResizable(false);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  setVisible(true);

  
          btnHome.addActionListener(this);
		  btnLibrarian.addActionListener(this); 
		  btnContact.addActionListener(this);
		  btnLogout.addActionListener(this);
		  btnHome.addMouseListener(this);
		  btnLibrarian.addMouseListener(this); 
		  btnContact.addMouseListener(this);
		  btnLogout.addMouseListener(this);
		  
  }
  
   public void actionPerformed(ActionEvent e)
   {
 
		if(e.getSource()==btnHome)
		{
		 this.dispose();
		  new HomePage().setVisible(true);
		}
		if(e.getSource()==btnLibrarian )
		{
		 this.dispose();
		  new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btnContact)
		{
		 this.dispose();
		  new ContactUsPage().setVisible(true);
		}
		if(e.getSource()==btnLogout )
		{
		  this.dispose();
		  new Logout().setVisible(true);
		}
    
   }
   public void mouseClicked(MouseEvent e){}
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}  
   public void mouseEntered(MouseEvent e)
  {
		if(e.getSource()==btnHome)
		{
		  btnHome.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLibrarian )
		{
		  btnLibrarian.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnContact)
		{
		  btnContact.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogout )
		{
		   btnLogout.setForeground(new Color(0,139,139));
		}
    
   }
    public void mouseExited(MouseEvent e)
  {
		if(e.getSource()==btnHome)
		{
		  btnHome.setForeground(col);
		}
		if(e.getSource()==btnLibrarian )
		{
		  btnLibrarian.setForeground(col);
		}
		if(e.getSource()==btnContact)
		{
		  btnContact.setForeground(col);
		}
		if(e.getSource()==btnLogout )
		{
		   btnLogout.setForeground(col);
		}
    
   }
  
  public static void main(String []args)
  {
   new Service();
  }
}
