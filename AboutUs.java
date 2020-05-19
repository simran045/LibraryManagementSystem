import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class AboutUs extends JFrame implements MouseListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 
	
	 
   JPanel p2=new JPanel();
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
			g.drawImage(new ImageIcon("national library.jpg").getImage(),0,0,1400,550,null);
		}
	};
   
  JLabel lbl=new JLabel("HELP ");
  JLabel lbl1=new JLabel("Search for a Book -"); 
  JLabel lbl2=new JLabel("1.On the Librarian Homepage, go to Book Section and click on it.  ");                        
  JLabel lbl3=new JLabel("2.Click on ADD BOOK then a window will appear. There Click on Search button.");
  JLabel lbl4=new JLabel("3.A search window will appear where you can search for books.");       
  JLabel lbl5=new JLabel("View Return Book Information -"); 
  JLabel lbl6=new JLabel("Delete a Librarian/Book - ");       
  JLabel lbl7=new JLabel("1.On the Admim Homepage, go to Actions and click on it.");
  JLabel lbl8=new JLabel("2.Click on Remove Libraran to delete non-existing librarian. ");
  JLabel lbl9=new JLabel("3.Similarly Click on Remove Book to delete non-existing book. ");    
    JButton btn5=new JButton("Login Here");
	JButton btn2=new JButton("HOME");
	JButton btn3=new JButton("SERVICES");
	JButton btn4=new JButton(" LIBRARIAN");
	JButton btn6=new JButton("CONTACT US");
	JButton btn7=new JButton("LOGOUT");
  Color col;
  
  AboutUs()
  {
	  
		super("Help Window");
		 
		t=Toolkit.getDefaultToolkit();			
		d=t.getScreenSize();
	    h=(int)d.getHeight();
	    w=(int)d.getWidth(); 
  
         lbl1.setForeground(Color.red);
		 lbl6.setForeground(Color.red);
  
  setVisible(true);
  setSize(w,h);
  p1.setBackground(new Color(0,139,139));
  add(p1);
  p1.setLayout(null);
  p2.setBounds(730,250,550,350);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(550,350));
  
   
  p4.setBackground(Color.yellow);
  p4.setPreferredSize( new Dimension(600,500));
   p4.setBounds(20,200,620,480);
  p4.setLayout(null);
 
  p1.add(p2);
  p1.add(p3);
 
  p1.add(p4);
  p1.add(p5);
 
  p2.setLayout(null);
   p3.setBackground(new Color(255,255,255));
   

   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,50,1400,135);
  p5.setBackground(new Color(175,238,238));
  
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
    
   p5.setLayout(null);
   
 
 
  lbl.setBounds(220,20,170,20);
  lbl.setFont(new Font("Arial",Font.BOLD,25));
  lbl1.setBounds(10,10,540,150);
  lbl1.setFont(new Font("Arial",Font.PLAIN,15));
   lbl2.setBounds(10,40,540,150);
  lbl2.setFont(new Font("Arial",Font.PLAIN,15));
   lbl3.setBounds(10,70,540,150);
   lbl3.setFont(new Font("Arial",Font.PLAIN,15));
   lbl4.setBounds(10,100,540,150);
  lbl4.setFont(new Font("Arial",Font.PLAIN,15));
   lbl5.setBounds(10,130,540,150);
  lbl5.setFont(new Font("Arial",Font.PLAIN,15));
   lbl6.setBounds(10,160,540,150);
  lbl6.setFont(new Font("Arial",Font.PLAIN,15));
   lbl7.setBounds(10,190,540,150);
  lbl7.setFont(new Font("Arial",Font.PLAIN,15));
  lbl8.setBounds(10,220,540,150);
  lbl8.setFont(new Font("Arial",Font.PLAIN,15));
  lbl9.setBounds(10,250,540,150);
  lbl9.setFont(new Font("Arial",Font.PLAIN,15));
	
		btn2.setBounds(560,77,90,30);
		
		btn2.setForeground(Color.black);
	    
	    btn2.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn2.setBorderPainted(false);
	    btn2.setContentAreaFilled(false);
	    btn2.setFocusPainted(false);
		btn2.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn2);
		btn3.setBounds(695,77,120,30);
		
		btn3.setForeground(Color.black);
	    
	    btn3.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn3.setBorderPainted(false);
	    btn3.setContentAreaFilled(false);
	    btn3.setFocusPainted(false);
		btn3.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn3);
		btn4.setBounds(850,77,145,30);
		
		btn4.setForeground(Color.black);
	    
	    btn4.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn4.setBorderPainted(false);
	    btn4.setContentAreaFilled(false);
	    btn4.setFocusPainted(false);
		btn4.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn4);
		btn6.setBounds(1020,77,140,30);
		
		btn6.setForeground(Color.black);
	    
	    btn6.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn6.setBorderPainted(false);
	    btn6.setContentAreaFilled(false);
	    btn6.setFocusPainted(false);
		btn6.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn6);
		
		btn7.setBounds(1210,77,100,30);
		
		btn7.setForeground(Color.black);
	    
	    btn7.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn7.setBorderPainted(false);
	    btn7.setContentAreaFilled(false);
	    btn7.setFocusPainted(false);
		btn7.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn7);
   p2.add(lbl);
    p2.add(lbl1);
   p2.add(lbl2);
   p2.add(lbl3);
   p2.add(lbl4);
   p2.add(lbl5);
   p2.add(lbl6);
   p2.add(lbl7);
      p2.add(lbl8);
	   p2.add(lbl9);
   
  
		 
		
		  
		 col=btn2.getForeground();
		 p5.add(l1);
		 p5.add(l2);
		 p5.add(l3);
		 
		  
		  setResizable(false);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  setVisible(true);
		   
		  btn2.addMouseListener(this);
		  btn3.addMouseListener(this);
		  btn4.addMouseListener(this);
		  btn6.addMouseListener(this);
		  btn7.addMouseListener(this);

  
  }
  
        public void mouseClicked(MouseEvent e)
    {
		
		if(e.getSource()==btn2)
		{
		  this.dispose();
		  new HomePage().setVisible(true);
		 
		}
		if(e.getSource()==btn3)
		{
		  this.dispose();
		  new Service().setVisible(true);
		 
		}	
		
		if(e.getSource()==btn4)
		{
		  this.dispose();
		  new LibrarianTable().setVisible(true);
		}
		  
		  if(e.getSource()==btn6)
		{
		  this.dispose();
		  new ContactUsPage().setVisible(true);
		}
		  
		  if(e.getSource()==btn7)
		{
		  this.dispose();
		  new Logout().setVisible(true);
		 
		}
		
   }
   
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
   public void mouseEntered(MouseEvent e)
   {	
		if(e.getSource()==btn2)
		{
		  btn2.setForeground(new Color(0,139,139));
		 
		}
		if(e.getSource()==btn3)
		{
		  btn3.setForeground(new Color(0,139,139));
		 
		}	
		
		if(e.getSource()==btn4)
		{
		  btn4.setForeground(new Color(0,139,139));
		}
		  
		  if(e.getSource()==btn6)
		{
         btn6.setForeground(new Color(0,139,139));
		}
		  
		  if(e.getSource()==btn7)
		{
		  btn7.setForeground(new Color(0,139,139));
		 
		}
   }
   public void mouseExited(MouseEvent e)
   {
        if(e.getSource()==btn2)
       {
		  btn2.setForeground(col);
		 
		}
		if(e.getSource()==btn3)
		{
		  btn3.setForeground(col);
		 
		}	
		
		if(e.getSource()==btn4)
		{
		  btn4.setForeground(col);
		}
		  
		  if(e.getSource()==btn6)
		{
         btn6.setForeground(col);
		}
		  
		  if(e.getSource()==btn7)
		{
		  btn7.setForeground(col);
		 
		}
   }
 
  public static void main(String []args)
  {
   new AboutUs();
  }
}
