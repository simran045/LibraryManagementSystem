import java.awt.*;
import javax.swing.*;

public class Zone1 extends JFrame
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 JPanel p6=new JPanel() {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("good.jpg").getImage(),40,30,460,270,null);
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
			g.drawImage(new ImageIcon("young.jpg").getImage(),40,30,460,270,null);
		}
	};
	
  JLabel lbl=new JLabel("Welcome   Nandani Singh   [012] ");
  JLabel lbl1=new JLabel("Welcome   TO    Student  Zone ");
  
  
	JButton btn2=new JButton("Home");
	JButton btn3=new JButton("About Us");
	JButton btn4=new JButton("Login");
	

  
  Zone1()
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
  p2.setBounds(w/2-80,h/2-170,650,500);
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
    p6.setBackground(Color.yellow);
   p5.setLayout(null);
   p6.setLayout(null);
   p6.setBounds(40,80,500,330);
 
  p4.setBounds(20,200,600,300);
  p4.setLayout(null);
  lbl.setBounds(30,0,600,90);
  lbl.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		
		lbl1.setBounds(80,395,600,90);
		lbl1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,35));
		
		btn2.setBounds(200,95,90,30);
		btn2.setBackground(new Color(0,139,139));
		btn2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		btn3.setBounds(390,95,120,30);
		btn3.setBackground(new Color(0,139,139));
		btn3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		btn4.setBounds(600,95,95,30);
		btn4.setBackground(new Color(0,139,139));
		btn4.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		
   p2.add(lbl);
   p2.add(lbl1);
  
		 
		  p5.add(btn2);
		 p5.add(btn3);
		 p5.add(btn4);
		 
		  
		  setResizable(false);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setVisible(true);

  
  }
  public static void main(String []args)
  {
   new Zone1();
  }
}
