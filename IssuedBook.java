import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class IssuedBook extends JFrame implements MouseListener
{
      Toolkit toolkit;
	  Dimension dim;
	  int w,h;
	   Color col1; 
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p8=new JPanel();
		
			
		//JPanel p5=new JPanel();
		JPanel p6=new JPanel()
		{
		
           public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("book2.png").getImage(),0,0,590,240,null);
		}
	};
		JPanel p3=new JPanel()
		{
									 
                    public void paintComponent(Graphics g)
				 {
		                          
			           g.drawImage(new ImageIcon("nielit.jpg").getImage(),0,0,1400,140,null);
		          }
	    };

	
		JPanel p4=new JPanel()
		{
		     public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("grl1.png").getImage(),40,30,460,400,null);
		}
	};
			          JLabel l2=new JLabel("     Book Issued  Successfully.........   ");
					  
   JButton btnHome=new JButton("HOME");
   JButton btnLibrarian=new JButton("LIBRARIANS");
   JButton btnService=new JButton("SERVICE");
   JButton btnAbout=new JButton("ABOUT");
   JButton btnBook=new JButton("BOOK SECTION");
   JButton btnLogout=new JButton("LOGOUT");
   JButton btnR=new JButton(" GET RECEIPT");
          
          
		  
IssuedBook()
	{
			super(" Library Management System");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		 add(p1);
		 p1.setLayout(null);
		 p1.add(p2);
		 p1.setBackground(new Color(0,206,209));
		 p2.setBounds(w/2-70,h/2-130,630,470);
		 p2.setBackground(new Color(255,255,255));
		 p2.setPreferredSize(new Dimension(600,700));
		 p2.setLayout(null);
		 p1.add(p3);
		 p3.setBackground(new Color(255,255,255));
		 p4.setBackground(new Color(255,255,255));
		  p1.add(p6);
		 p8.setLayout(null);
		 p8.setBounds(0,141,1400,90);
		 p8.setBackground(new Color(127,255,212));
		 p3.setBounds(0,2,1400,140);
		 p3.setLayout(null);
		 p1.add(p4);
		 p1.add(p8);
		 p2.add(p6);
		 p2.add(btnR);
		 p6.setLayout(null);
		 p6.setBounds(70,70,500,300);
		 btnR.setBounds(240,420,150,25);
		 
		 p4.setBounds(10,220,600,400);
		 p4.setLayout(null);
		 l2.setBounds(100,350,450,50);
		 l2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,28));
		 l2.setForeground(new Color(255,0,0));
		 
	
		  p2.add(l2);
		  setResizable(false);
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  setSize(w,h);
		  setVisible(true);
		  
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
          p8.add(la1);
		  p8.add(la2);
		  p8.add(la3);
		  
		btnR.setForeground( Color.black);
		btnR.setBackground(new Color(135,206,250));
	    //btnR.setContentAreaFilled(false);
	    btnR.setFocusPainted(false);
		btnR.setFont(new Font("Arial",Font.PLAIN,16)); 
		  
		p8.add(btnHome);
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
		p8.add(btnService);
		
		btnLibrarian.setBounds(880,37,145,30);
		btnLibrarian.setForeground(Color.black);
	    btnLibrarian.setBorderPainted(false);
	    btnLibrarian.setContentAreaFilled(false);
	    btnLibrarian.setFocusPainted(false);
		btnLibrarian.setFont(new Font("Arial",Font.PLAIN,18));
		p8.add(btnLibrarian);
		 
		btnAbout.setBounds(1050,37,145,30);
		btnAbout.setForeground(Color.black);
	    btnAbout.setBorderPainted(false);
	    btnAbout.setContentAreaFilled(false);
	    btnAbout.setFocusPainted(false);
		btnAbout.setFont(new Font("Arial",Font.PLAIN,18));
		p8.add(btnAbout);
		
		btnLogout.setBounds(1215,37,170,30);
		btnLogout.setForeground(Color.black);
		btnLogout.setBorderPainted(false);
	    btnLogout.setContentAreaFilled(false);
	    btnLogout.setFocusPainted(false);
		btnLogout.setFont(new Font("Arial",Font.PLAIN,18));
		//p8.add(btnLogout);
		
		btnBook.setBounds(1215,37,170,30);
		btnBook.setForeground(Color.black);
		btnBook.setBorder(BorderFactory.createLineBorder(Color.black));
		//btnBook.setBorderPainted(false);
	    btnBook.setContentAreaFilled(false);
	    btnBook.setFocusPainted(false);
		btnBook.setFont(new Font("Arial",Font.PLAIN,18));
		//p8.add(btnLogout);
		 
		btnHome.addMouseListener(this);
		btnLibrarian.addMouseListener(this);
		btnService.addMouseListener(this);
		btnAbout.addMouseListener(this);
		btnLogout.addMouseListener(this);
		btnBook.addMouseListener(this);
		btnR.addMouseListener(this);
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
	    new LibrarianTable().setVisible(true);
	  }
	  if(me.getSource()==btnService)
	  {
	    this.dispose();
	    new Service().setVisible(true);
	  }
	  if(me.getSource()==btnAbout)
	  {
	    this.dispose();
	    new AboutUs().setVisible(true);
	  }
	  if(me.getSource()==btnLogout)
	  {
	    this.dispose();
	    new Logout().setVisible(true);
	  }
	  if(me.getSource()==btnR)
	  {
	    new IssueReceipt().setVisible(true);
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
	  if(me.getSource()==btnBook)
	  {
	    btnBook.setForeground(new Color(0,139,139));
	  }
	  if(me.getSource()==btnLogout)
	  {
	    btnLogout.setForeground(new Color(0,139,139));
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
	  if(me.getSource()==btnBook)
	  {
	    btnBook.setForeground(col1);
	  }
	  if(me.getSource()==btnLogout)
	  {
	    btnLogout.setForeground(col1);
	  }
	}
	
		public static void main(String[]args)
	{
		new IssuedBook();
	}
}