import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class FeedBackDone extends JFrame  implements ActionListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 
	 
	 
   JPanel p2=new JPanel();
   JPanel p6=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("banner.jpg").getImage(),0,0,430,155,null);
		}
	};
	
   
   JPanel p3=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,105,null);
		}
	};
	
   JPanel p4=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};
	
  
 JLabel lbl=new JLabel("Feedback Detail Submitted Successfully");
		
	
	
	JButton btn2=new JButton("HOME");
	JButton btn3=new JButton("SERVICES");
	JButton btn4=new JButton(" VIEW LIBRARIAN");
	JButton btn5=new JButton("ABOUT US");
	JButton btn6=new JButton(" LOGOUT");
	

  
  FeedBackDone()
  {
	  
		super("LIBRARY MANAGMENT ");
		 
  t=Toolkit.getDefaultToolkit();
  d=t.getScreenSize();
  h=(int)d.getHeight();
  w=(int)d.getWidth(); 
  
  
  
  setVisible(true);
  setSize(w,h);
  p1.setBackground(new Color(0,139,139));
  add(p1);
  p1.setLayout(null);
  p2.setBounds(w/2-80,h/2-120,550,300);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(600,500));
 
  p1.add(p2);
  p1.add(p3);
  p2.add(p6);
 
  p1.add(p4);
  p1.add(p5);
  p2.setLayout(null);
   p3.setBackground(new Color(255,255,255));
   p4.setBackground(new Color(255,255,255));

   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,50,1400,135);
   p5.setBackground(new Color(127,255,212));
   
   p6.setLayout(null);
   p6.setBounds(60,30,450,215);
   p6.setBackground(new Color(127,255,212));
   
   p5.setLayout(null);
   
  p4.setBounds(20,200,600,300);
  p4.setLayout(null);
  JLabel l1 = new JLabel("Library ");
	   l1.setFont(new Font("Arial", Font.BOLD, 25));
	   l1.setForeground(Color.red);
	   l1.setBounds(30,50,130,30);
	  
	
	
	   JLabel l2 = new JLabel("Management ");
	   l2.setFont(new Font("Arial", Font.BOLD, 18));
	   l2.setBounds(35,80,120,25);
	   
	   JLabel l3 = new JLabel("System ");
	   l3.setFont(new Font("Arial", Font.BOLD, 18));
	   l3.setBounds(47,100,90,30);
 

 
       lbl.setFont(new Font("Arial",Font.PLAIN,20));
		lbl.setBounds(115,240,390,30);
		
		
		
		
		
		
		
		
		

		
	
		
		
		btn2.setBounds(200,95,90,30);
		btn2.setForeground(Color.black);
	    
	    btn2.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn2.setBorderPainted(false);
	    btn2.setContentAreaFilled(false);
	    btn2.setFocusPainted(false);
		btn2.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn2);
		
		
		
		btn3.setBounds(390,95,120,30);
		btn3.setForeground(Color.black);
	    
	    btn3.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn3.setBorderPainted(false);
	    btn3.setContentAreaFilled(false);
	    btn3.setFocusPainted(false);
		btn3.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn3);
		btn4.setBounds(550,95,195,30);
		btn4.setForeground(Color.black);
	    
	    btn4.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn4.setBorderPainted(false);
	    btn4.setContentAreaFilled(false);
	    btn4.setFocusPainted(false);
		btn4.setFont(new Font("Arial",Font.PLAIN,20));
		 p5.add(btn4);
		btn5.setBounds(750,95,140,30);
		btn5.setForeground(Color.black);
	    
	    btn5.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn5.setBorderPainted(false);
	    btn5.setContentAreaFilled(false);
	    btn5.setFocusPainted(false);
		btn5.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn5);
		btn6.setBounds(900,95,140,30);
		btn6.setForeground(Color.black);
	    
	    btn6.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn6.setBorderPainted(false);
	    btn6.setContentAreaFilled(false);
	    btn6.setFocusPainted(false);
		btn6.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn6);
		
		
		
		
		
		btn3.setBackground(new Color(0,139,139));

		btn4.setBackground(new Color(0,139,139));
		
		
		
  
  
   
		  p2.add(lbl);
		 
		   p5.add(l1);
		 p5.add(l2);
		 p5.add(l3);
		 
		  
		  setResizable(false);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setVisible(true);
		  
		  
		   btn2.addActionListener(this);
		  btn3.addActionListener(this);
		   btn4.addActionListener(this);
		  btn5.addActionListener(this);
		   btn6.addActionListener(this);
		

  
  }
   public void actionPerformed(ActionEvent a)
  {
	 
	   if(a.getSource()==btn2)
	  {
		  new HomePage().setVisible(true);
	  }
	   if(a.getSource()==btn3)
	  {
		  new Service().setVisible(true);
	  }
	   if(a.getSource()==btn4)
	  {
		  new LibrarianTable().setVisible(true);
	  }
	  if(a.getSource()==btn5)
	  {
		  new AboutUs().setVisible(true);
	  }
	  if(a.getSource()==btn6)
	  {
		  new Logout().setVisible(true);
	  }
  
  } 
  
  public static void main(String []args)
  {
   new FeedBackDone();
  }
}
