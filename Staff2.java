import java.awt.*;
import javax.swing.*;

public class Staff2 extends JFrame
{
  
  Dimension d;
  Toolkit t;
  int w,h;
    
 
     
     JPanel p1=new JPanel();
     JPanel p2=new JPanel();
	 
	JLabel l1=new JLabel(" Staff Id:");
     JTextField txt1=new JTextField (10);
     JLabel l2=new JLabel(" Staff Name:");
     JTextField txt2=new JTextField (10);
     JLabel l3=new JLabel(" Gender:");
    
     JLabel l5=new JLabel(" Fathers Name:");
     JTextField txt3=new JTextField (10);
     JLabel l6=new JLabel(" Designation:");
    
     JLabel l7=new JLabel(" Qualification:");
     JTextField txt4=new JTextField (10);
     JLabel l8=new JLabel(" Temporary Adrress:");
     JTextArea a1=new JTextArea(40,40);
     JLabel l9=new JLabel(" Permanent Address:");
     JTextArea a2=new JTextArea(40,40);
     JLabel l10=new JLabel(" DOB:");
     JTextField txt5=new JTextField (10);
     JLabel l11=new JLabel(" Phone Number:");
     JTextField txt6=new JTextField (10);
	 JLabel l12=new JLabel(" Email Id:");
     JTextField txt7=new JTextField (10);
     JLabel l13=new JLabel(" Status:");
	 JTextField txt8=new JTextField(20);
	 JLabel l14=new JLabel("Department:");
	 
     JTextArea a3=new JTextArea(30,30);
	 JButton btn1=new JButton("Remove");
	 JButton btn2=new JButton("Browse");
	 JButton btn3=new JButton("Add");
	 JButton btn4=new JButton("Remove");
	 
  
  Staff2()
  {
  t=Toolkit.getDefaultToolkit();
  d=t.getScreenSize();
  h=(int)d.getHeight();
  w=(int)d.getWidth(); 
  
  
  
  setVisible(true);
  setSize(w,h);
  p1.setBackground(Color.pink);
  add(p1);
  p1.setLayout(null);
  p2.setBounds(w/2-300,h/2-250,600,500);
  p2.setBackground(Color.yellow);
  p2.setPreferredSize( new Dimension(600,500));
  
		
		l1.setBounds(80,30,100,30);
		txt1.setBounds(140,30,100,30);
		l2.setBounds(110,350,200,30);
		txt2.setBounds(350,350,100,30);
		l3.setBounds(150,400,120,30);
				
		
		l5.setBounds(200,450,150,25);
		txt3.setBounds(350,450,100,25);
		l6.setBounds(250,475,200,30);
		
		l7.setBounds(300,500,200,30);
		txt4.setBounds(600,530,100,30);
		l8.setBounds(350,550,100,30);
        a1.setBounds(970,570,200,30);
		l9.setBounds(400,580,200,30);
        a2.setBounds(600,580,200,30);
		l10.setBounds(450,600,200,30);
		txt5.setBounds(700,600,200,30);
		l11.setBounds(500,620,200,30);
		txt6.setBounds(800,620,200,30);
		l12.setBounds(550,630,200,30);
		txt7.setBounds(750,630,200,30);
		l13.setBounds(600,670,200,30);
		txt8.setBounds(820,670,200,25);
		l14.setBounds(850,700,200,30);
		
		a3.setBounds(900,750,300,200);
		btn1.setBounds(800,750,100,25);
		btn2.setBounds(850,800,50,25);
		btn3.setBounds(900,850,50,25);
		btn4.setBounds(950,900,50,25);
		btn1.setBackground(new Color(255,140,0));
		btn2.setBackground(new Color(255,140,0));
		btn3.setBackground(new Color(255,140,0));
		btn4.setBackground(new Color(255,140,0));
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
  
  p1.add(p2);
  p2.setLayout(null);
  
		add(p1);
		add(p2);
		p2.add(l1);
		p2.add(txt1);
		p2.add(l2);
		p2.add(txt2);
		p2.add(l3);
		
	
		p2.add(l5);
		p2.add(txt3);
		p2.add(l6);
	
	
		p2.add(l7);
		p2.add(txt4);
				p2.add(l8);
		p2.add(a1);
		p2.add(l9);
		p2.add(a2);
		p2.add(l9);
		p2.add(txt5);
		p2.add(l10);
		p2.add(txt6);
		p2.add(l11);
		p2.add(txt7);
		p2.add(l12);
		
		
		p2.add(txt8);
		p2.add(l13);
		//p.add(txt9);
		p2.add(l14);
		p2.add(a3);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn1);
		p1.add(btn2);
  
  
  
  }
  public static void main(String []args)
  {
   new Staff2();
  }
}
