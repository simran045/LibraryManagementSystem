import java.awt.*;
import javax.swing.*;

public class Update extends JFrame
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
	
  JLabel lbl=new JLabel("Librarian  Profile  Update Form ");
  JLabel lbl1=new JLabel("Librarian -ID ");
  
  JTextField txt=new JTextField(20);
  
	JLabel lbl2=new JLabel("Librarian Name ");
	JTextField txt1=new JTextField(20);
	JLabel lbl3=new JLabel("E-mail Id ");
	JTextField txt2=new JTextField(20);
	JLabel lbl4=new JLabel(" password ");
  
	JPasswordField pass = new JPasswordField(10);
	JLabel lbl5=new JLabel("Contact ");
	JTextField txt3=new JTextField(20);
	JLabel lbl6=new JLabel("D.O.B ");
	JTextField txt4=new JTextField(20);
	JLabel lbl7=new JLabel("Gender");
	JTextField txt5=new JTextField(20);

	JLabel lbl8=new JLabel("Address ");
	

	JTextField txt6=new JTextField(20);

	JButton btn=new JButton("UPDATE");
	
	JButton btn2=new JButton("Home");
	JButton btn3=new JButton("About Us");
	JButton btn4=new JButton("Login");
	

  
  Update()
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
  p1.add(p4);
  p1.add(p5);
  p2.setLayout(null);
   p3.setBackground(new Color(255,255,255));
   p4.setBackground(new Color(255,255,255));

   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,50,1400,135);
   p5.setBackground(new Color(127,255,212));
    
   p5.setLayout(null);
 
  p4.setBounds(20,200,600,300);
  p4.setLayout(null);
  lbl.setBounds(80,0,600,90);
  lbl.setFont(new Font("Algerian",Font.BOLD,25));
		
		lbl1.setBounds(60,80,140,20);
		lbl1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt.setBounds(60,120,140,20);
		lbl2.setBounds(450,80,170,20);
		lbl2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt1.setBounds(450,120,140,20);
		lbl3.setBounds(60,160,140,20);
		lbl3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt2.setBounds(60,190,140,20);
		lbl4.setBounds(450,160,140,20);
		lbl4.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		pass.setBounds(450,190,140,20);
		
		lbl5.setBounds(60,230,140,20);
		lbl5.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt3.setBounds(60,270,140,20);
		lbl6.setBounds(450,230,140,20);
		lbl6.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt4.setBounds(450,270,140,20);
		lbl7.setBounds(60,290,140,20);
		lbl7.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt5.setBounds(60,330,140,20);
		lbl8.setBounds(450,290,140,20);
		lbl8.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		txt6.setBounds(450,330,140,20);

		
	
		btn.setBounds(60,410,500,30);
		btn.setBackground(new Color(0,139,139));
		btn.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		
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
   p2.add(lbl1);p2.add(txt);
   p2.add(lbl2);p2.add(txt1);
   p2.add(lbl3);p2.add(txt2);
   p2.add(lbl4);p2.add(pass);
		  p2.add(lbl5);p2.add(txt3);
		  p2.add(lbl6);p2.add(txt4);
		  p2.add(lbl7);p2.add(txt5);
		  p2.add(lbl8);p2.add(txt6);
		  p2.add(btn);
		  
		  
		  p5.add(btn2);
		 p5.add(btn3);
		 p5.add(btn4);
		 
		  
		  setResizable(false);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setVisible(true);

  
  }
  public static void main(String []args)
  {
   new Update();
  }
}
