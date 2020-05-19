import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
   
public class HomePage extends JFrame implements MouseListener
{
   Toolkit toolkit;
   Dimension dim;
   static int w,h;
   Color col;
   JPanel firstPanel=new JPanel();
   JPanel thirdPanel=new JPanel()
   { 
     public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("national library.jpg").getImage(),0,0,HomePage.w,520,null);
		}
   };
   JPanel secPanel=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,HomePage.w,141,null);
		}
	};
   
   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   
   JButton btnHome=new JButton("HOME");
   JButton btnAbout=new JButton("HELP");
   JButton btnService=new JButton("SERVICES");
   JButton btnView=new JButton("VIEW LIBRARIANS");
   JButton btnContact=new JButton("CONTACT");
   
   //ImageIcon img = new ImageIcon("down.png");
   // ImageIcon img = new ImageIcon(img.getImage().getScaledInstance(30, 10, 100));
   JButton btnSign=new JButton("MEMBER");
   
  
   //btnSign.setHorizontalTextPosition(SwingConstants.LEFT);
   JButton btnLogin=new JButton("LOGIN");
   JButton btnSearch=new JButton("EXIT");
   JButton btn1=new JButton("VIEW MEMBERS");
   JButton btn2=new JButton("REGISTER NEW MEMBER");
   JButton btn3=new JButton("TEACHER REGISTER");
   JButton btn4=new JButton("ADMINISTRATOR SIGNUP");
   
   JButton btn5=new JButton("LIBRARIAN LOGIN");
   
   JButton btn8=new JButton("ADMINISTRATOR LOGIN");
    
   public HomePage() 
   {
       super("Library Management System");
      
	   toolkit=Toolkit.getDefaultToolkit();
	   dim=toolkit.getScreenSize();
	   w=(int)dim.getWidth();
	   h=(int)dim.getHeight();
       setSize(w,h);
	  
       add(firstPanel);
	   firstPanel.setLayout(null);
	   //firstPanel1.setBackground(Color.yellow);

	   firstPanel.add(secPanel,"North");
       secPanel.setLayout(null);
       secPanel.setPreferredSize(new Dimension(w,141));
       secPanel.setBounds(0,0,w,141);
       //secPanel.setBackground(Color.gray);
	   
       firstPanel.add(thirdPanel,"Center");
       thirdPanel.setLayout(null);
       thirdPanel.setPreferredSize(new Dimension(w,520));
       thirdPanel.setBounds(0,235,w,520);
       thirdPanel.setBackground(new Color(100,149,237));
	
	   JLabel l1 = new JLabel("Library ");
	   firstPanel.add(l1);
	   l1.setFont(new Font("Arial", Font.BOLD, 25));
	   l1.setForeground(Color.red);
	   l1.setBounds(25,143,130,30);
	  
	   
	   JLabel l2 = new JLabel("Management ");
	   firstPanel.add(l2);
	   l2.setFont(new Font("Arial", Font.PLAIN, 18));
	   l2.setBounds(25,176,120,25);
	   
	   JLabel l3 = new JLabel("System ");
	   firstPanel.add(l3);
	   l3.setFont(new Font("Arial", Font.PLAIN, 18));
	   l3.setBounds(47,200,90,30);
	  
	   btnHome.setForeground(Color.black);
	   btnHome.setBounds(345,174,100,25);
	   btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnHome.setBorderPainted(false);
	   btnHome.setContentAreaFilled(false);
	   btnHome.setFocusPainted(false);
		
		Font btnFont =new Font("Arial", Font.PLAIN,18);
		Font btnFont1 =new Font("Arial",Font.BOLD,18);
		Font btnFont2 =new Font("Arial", Font.PLAIN,16);

		btnHome.setFont(btnFont);
		firstPanel.add(btnHome);
		
	   btnAbout.setForeground(Color.black);
	   btnAbout.setBounds(478,174,100,25);
	   btnAbout.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnAbout.setBorderPainted(false);
	   btnAbout.setContentAreaFilled(false);
	   btnAbout.setFocusPainted(false);
	  

		btnAbout.setFont(btnFont);
		firstPanel.add(btnAbout);
		
	   btnService.setForeground(Color.black);
	   btnService.setBounds(480,174,150,25);
	   btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnService.setBorderPainted(false);
	   btnService.setContentAreaFilled(false);
	   btnService.setFocusPainted(false);

		btnService.setFont(btnFont);
		//firstPanel.add(btnService);
		
	   btnView.setForeground(Color.black);
	   btnView.setBounds(600,174,180,25);
	   btnView.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnView.setBorderPainted(false);
	   btnView.setContentAreaFilled(false);
	   btnView.setFocusPainted(false);

		btnView.setFont(btnFont);
		firstPanel.add(btnView);
		
	   btnContact.setForeground(Color.black);
	   btnContact.setBounds(820,174,100,25);
	   btnContact.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnContact.setBorderPainted(false);
	   btnContact.setContentAreaFilled(false);
	   btnContact.setFocusPainted(false);
		btnContact.setFont(btnFont);
		firstPanel.add(btnContact);
		  
	   btnSign.setForeground(Color.black);
	   btnSign.setBounds(930,173,145,33);
	   btnSign.setBorder(BorderFactory.createLineBorder(Color.black));
	   //btnSign.setBorderPainted(false);
	   btnSign.setContentAreaFilled(false);
	   btnSign.setFocusPainted(false);
        /*Image img1=new ImageIcon("down.png").getImage().getScaledInstance(30,20,Image.SCALE_DEFAULT);
		btnSign.setIcon(new ImageIcon(img1));*/
	   btnSign.setFont(btnFont1);
	   firstPanel.add(btnSign);
	   
	   thirdPanel.add(panel1);
	   thirdPanel.add(panel2);
	   panel1.setLayout(new GridLayout(2,0));
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
	  // panel1.add(btn3);
	   panel2.add(btn5);
	   panel2.add(btn8);
      
	   panel1.setVisible(false);
	   panel2.setVisible(false);
       panel2.setBounds(1095,1,200,80);
	   panel1.setBounds(930,1,200,80);
	   
	   
	   
	   btnLogin.setForeground(Color.black);
	   btnLogin.setBounds(1095,173,135,33);
	   btnLogin.setBorder(BorderFactory.createLineBorder(Color.black));
	   //btnLogin.setBorderPainted(false);
	   btnLogin.setContentAreaFilled(false);
	   btnLogin.setFocusPainted(false);

		btnLogin.setFont(btnFont1);
		firstPanel.add(btnLogin);
		
	   btnSearch.setForeground(Color.black);
	   btnSearch.setBounds(1240,174,100,30);
	   btnSearch.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btnSearch.setBorderPainted(false);
	   btnSearch.setContentAreaFilled(false);
	   btnSearch.setFocusPainted(false);

		btnSearch.setFont(btnFont);
		firstPanel.add(btnSearch);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	    col=btnHome.getForeground();	  
	    
		btnHome.addMouseListener(this);
		btnAbout.addMouseListener(this);
		btnService.addMouseListener(this);
		btnView.addMouseListener(this);
		btnContact.addMouseListener(this);
		btnSign.addMouseListener(this);
		btnLogin.addMouseListener(this);
		btnSearch.addMouseListener(this);
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
		btn4.addMouseListener(this);
		btn5.addMouseListener(this);
		btn8.addMouseListener(this);
	
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
		  this.dispose();
		  //new HomePage().setVisible(false);
		  new MemberTable().setVisible(true);
		 
		}
		
		if(e.getSource()==btnView)
		{
		  new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btn3)
		{ 
		  this.dispose();
		  new TeacherInfo().setVisible(true);
		}
		if(e.getSource()==btn2)
		{
		    panel1.setVisible(false);
		     this.dispose();
		    new StudentInfo().setVisible(true);
		}
		if(e.getSource()==btnAbout)
		{
		  panel1.setVisible(false);
		  this.dispose();
		  new AboutUs().setVisible(true);
		}
		  
		  if(e.getSource()==btnContact)
		{
		  this.dispose();
		   new ContactUsPage().setVisible(true);
		  
		}
		 if(e.getSource()==btnService)
		{
		  panel1.setVisible(false);
		  new Service().setVisible(true);
		  
		}
		if(e.getSource()==btnSign)
		{
		  panel1.setVisible(true);
		}
		if(e.getSource()==btnLogin )
		{
		  panel2.setVisible(true);
		}
		if(e.getSource()==btn5)
		{
		  panel2.setVisible(false);
		  this.dispose();
		  new Last5().setVisible(true);
		 
		}
		if(e.getSource()==btn8)
		{
		  panel2.setVisible(false);
		  this.dispose();
		  new AdminLogin().setVisible(true);
		 
		}
		if(e.getSource()==btnHome)
		{
		  this.dispose();
		  new HomePage().setVisible(true);
		 
		}
		if(e.getSource()==btnSearch)
		{
		  System.exit(0);
		 
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
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnSign)
		{
		btnSign.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogin)
		{
		btnLogin.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnSearch)
		{
		btnSearch.setForeground(new Color(0,139,139));
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
		if(e.getSource()==btn8)
		{
		btn8.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(new Color(0,139,139));
		}
		
		if(e.getSource()==btn1)
		{
		btn5.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(new Color(0,139,139));
		}if(e.getSource()==btn3)
		{
		btn3.setForeground(new Color(0,139,139));
		}
		
		
	}
	public void mouseExited(MouseEvent e)
	{
		
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col);
		}
		if(e.getSource()==btnAbout)
		{
			btnAbout.setForeground(col);
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(col);
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(col);
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(col);
		}
		if(e.getSource()==btnSign)
		{
		btnSign.setForeground(col);
		}
		if(e.getSource()==btnLogin)
		{
		btnLogin.setForeground(col);
		}
		if(e.getSource()==btnSearch)
		{
		btnSearch.setForeground(col);
		}
		if(e.getSource()==btn1)
		{
		btn1.setForeground(col);
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(col);
		}
		if(e.getSource()==btn3)
		{
		btn3.setForeground(col);
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(col);
		}
		if(e.getSource()==btn8)
		{
		btn8.setForeground(col);
		}
	}
  
   
   
  
   public static void main(String[] args) 
   {
      new HomePage();
   }
}
  