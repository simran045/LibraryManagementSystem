import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Logout extends JFrame implements MouseListener
{
	    Toolkit toolkit;
	    Dimension dim;
	    int w,h;
		Color col1;
	    JButton btnHome=new JButton("HOME");
		JButton btnLibrarian=new JButton("CONTACT US");
		JButton btnService=new JButton("SERVICES");
		JButton btnAbout=new JButton("ABOUT US");
		JButton btnContact=new JButton("CONTACT US");
		JPanel p1=new JPanel();
		JPanel p6=new JPanel();
		JPanel p2=new JPanel()
		{
		
           public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("logout3.jpg").getImage(),100,55,400,150,null);
		}
	};
			
		
		JPanel p3=new JPanel()
		{
									 
                    public void paintComponent(Graphics g)
				 {
		                          
			           g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,140,null);
		          }
	    };

	
		JPanel p4=new JPanel()
		{
		     public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("grl3.jpg").getImage(),40,30,460,370,null);
		}
	};
			          JLabel l2=new JLabel("       Logout  Successfully.........   ");
					  

		  
Logout()
	{
		 super("Library Management System Of NIELIT");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		 add(p1);
		 p1.setLayout(null);
		 p1.add(p2);
		 p1.setBackground(new Color(0,139,139));
		 p2.setBounds(640,235,700,600);
		 p2.setBackground(Color.white);
		 p2.setPreferredSize(new Dimension(700,600));
		 p2.setLayout(null);
		 p1.add(p3);
		 p3.setBackground(new Color(255,255,255));
		 p4.setBackground(new Color(255,255,255));
		 p3.setBounds(0,0,1400,141);
		 p3.setLayout(null);
		 p1.add(p4);
		 p1.add(p6);
		 p6.setLayout(null);
		 p6.setBounds(0,138,1400,90);
		 p4.setBounds(20,240,600,400);
		 p6.setBackground(new Color(127,255,212));
		 p4.setLayout(null);
		 l2.setBounds(120,300,450,50);
		 l2.setForeground(new Color(255,69,0));
		 l2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,28));
		 p2.add(l2);
		 col1= btnHome.getForeground();
		 
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
          p6.add(la1);
		  p6.add(la2);
		  p6.add(la3);
		  
		p6.add(btnHome);
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
		p6.add(btnService);
		
		btnLibrarian.setBounds(880,37,180,30);
		btnLibrarian.setForeground(Color.black);
	    btnLibrarian.setBorderPainted(false);
	    btnLibrarian.setContentAreaFilled(false);
	    btnLibrarian.setFocusPainted(false);
		btnLibrarian.setFont(new Font("Arial",Font.PLAIN,18));
		p6.add(btnLibrarian);
		 
		btnAbout.setBounds(1060,37,145,30);
		btnAbout.setForeground(Color.black);
	    btnAbout.setBorderPainted(false);
	    btnAbout.setContentAreaFilled(false);
	    btnAbout.setFocusPainted(false);
		btnAbout.setFont(new Font("Arial",Font.PLAIN,18));
		p6.add(btnAbout);
		
		btnContact.setBounds(1215,37,170,30);
		btnContact.setForeground(Color.black);
		btnContact.setBorderPainted(false);
	    btnContact.setContentAreaFilled(false);
	    btnContact.setFocusPainted(false);
		btnContact.setFont(new Font("Arial",Font.PLAIN,18));
		//p6.add(btnContact);
		 
		btnHome.addMouseListener(this);
		btnLibrarian.addMouseListener(this);
		btnService.addMouseListener(this);
		btnAbout.addMouseListener(this);
		btnContact.addMouseListener(this);
		
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(w,h);
		 setVisible(true); 
	}
	
	public void mousePressed(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{}
	public void mouseClicked(MouseEvent me)
	{
	  if(me.getSource()==btnHome)
	  {
	    this.dispose();
	    new HomePage().setVisible(true);
	  }
	   if(me.getSource()==btnLibrarian)
	  {
	    this.dispose();
	   new ContactUsPage().setVisible(true);
	  }
	  if(me.getSource()==btnService)
	  {
	    this.dispose();
	    new Service().setVisible(true);
	  }
	  if(me.getSource()==btnAbout)
	  {
	    this.dispose();
	    new About().setVisible(true);
	  }
	  if(me.getSource()==btnContact)
	  {
	    this.dispose();
	    new ContactUsPage().setVisible(true);
	  }
	}
	public void mouseEntered(MouseEvent me)
	{
	 if(me.getSource()==btnHome)
	  {
	    btnHome.setForeground(new Color(0,139,139));
	  }
	  if(me.getSource()==btnLibrarian)
	  {
	    btnLibrarian.setForeground(new Color(0,139,139));
	  }
	  if(me.getSource()==btnService)
	  {
	    btnService.setForeground(new Color(0,139,139));
	  }
	  if(me.getSource()==btnAbout)
	  {
	    btnAbout.setForeground(new Color(0,139,139));
	  }
	  if(me.getSource()==btnContact)
	  {
	    btnContact.setForeground(new Color(0,139,139));
	  }
	}
	public void mouseExited(MouseEvent me)
	{
	 if(me.getSource()==btnHome)
	  {
	    btnHome.setForeground(col1);
	  }
	  if(me.getSource()==btnLibrarian)
	  {
	    btnLibrarian.setForeground(col1);
	  }
	  if(me.getSource()==btnService)
	  {
	    btnService.setForeground(col1);
	  }
	  if(me.getSource()==btnAbout)
	  {
	    btnAbout.setForeground(col1);
	  }
	  if(me.getSource()==btnContact)
	  {
	    btnContact.setForeground(col1);
	  }
	}
		public static void main(String[]args)
	{
		new Logout();
	}
}