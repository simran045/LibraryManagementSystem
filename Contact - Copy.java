import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
class Contact extends JFrame
{
      Toolkit toolkit;
	  Dimension dim;
	  int w,h;
	    
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p5=new JPanel();
		JPanel p3=new JPanel()
		{
           public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("logo1.jpg").getImage(),0,0,1400,140,null);
		}
	};
	
		JPanel p4=new JPanel()
		{
		     public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("p.jpg").getImage(),40,30,460,400,null);
		}
	};
		
		
		JLabel l=new JLabel("               CONTACT US                ");
		 JLabel l1=new JLabel("User Name");
		JTextField txt1=new JTextField(20);
	    JLabel l2=new JLabel("Email");
		JTextField txt2=new JTextField(20);		
	    JLabel l3=new JLabel("Contact No");
		JTextField txt3=new JTextField(20);
		JLabel l4=new JLabel("Our Address");
		JTextField txt4=new JTextField(20);
		JLabel l5=new JLabel("Comment");
		JTextArea a=new JTextArea(40,40);
		JButton btn1=new JButton("HOME");
		JButton btn2=new JButton("SERVICES");
		JButton btn3=new JButton("LIBRARIANS");
		JButton btn4=new JButton("ABOUT US");
		JButton btn5=new JButton("LOGOUT");
		
Contact()
	{
			super("Online Library Management System Of NIELIT");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		 add(p1);
		 p1.setLayout(null);
		 p1.add(p2);
		 p1.setBackground(new Color(0,206,209));
		 p2.setBounds(w/2-80,h/2-170,650,500);
		 p2.setBackground( Color.white);
		 p2.setPreferredSize(new Dimension(600,800));
		 p2.setLayout(null);
		 p1.add(p3);
		 p3.setBackground(new Color(255,255,255));
		 p4.setBackground(new Color(255,255,255));
		 p3.setBounds(0,2,1400,140);
		 p3.setLayout(null);
		 p1.add(p4);
		 //p4.setBounds(0,50,1400,135);
		 p1.add(p5);
		  p5.setBackground(new Color(0,206,209));
		 p5.setBounds(0,145,1400,30);
		 p5.setLayout(null);
		 p4.setBounds(10,200,600,400);
		 p4.setLayout(null);
		 l.setBounds(130,0,600,90);
		 l.setFont(new Font("Algerian",Font.BOLD,25));
		 
		 l1.setBounds(60,80,200,30);
		 l1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		 txt1.setBounds(60,120,200,30);
		 l2.setBounds(350,80,200,30);
		 l2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		 txt2.setBounds(350,120,200,30);
		 l3.setBounds(60,200,200,30);
		 l3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		 txt3.setBounds(60,250,200,30);
		 l4.setBounds(350,200,200,40);
		 l4.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		 txt4.setBounds(350,250,200,30);
		 l5.setBounds(60,300,200,30);
		 l5.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		 a.setBounds(60,350,450,120);
		 
		 
		  btn1.setBounds(200,5,120,20);
		  btn1.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		  btn1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		  btn1.setBackground(new Color(0,206,209));
		  btn2.setBounds(350,5,160,20);
		  btn2.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		  btn2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		  btn2.setBackground(new Color(0,206,209));
		  btn3.setBounds(520,5,160,20);
		  btn3.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		  btn3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		  btn3.setBackground(new Color(0,206,209));
		  btn4.setBounds(690,5,160,20);
		  btn4.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		  btn4.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		  btn4.setBackground(new Color(0,206,209));
		  btn5.setBounds(870,5,160,20);
		  btn5.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		  btn5.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,15));
		  btn5.setBackground(new Color(0,206,209));
		 


		
				 p2.add(l);p2.add(l1);p2.add(txt1);p2.add(l2);
		 p2.add(txt2);p2.add(l3);p2.add(txt3);p2.add(l4);
		 p2.add(txt4);p2.add(l5);p2.add(a);
		 
		 p5.add(btn1);p5.add(btn2);p5.add(btn3);p5.add(btn4);
		 p5.add(btn5);
		        setResizable(false);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
		 		setSize(w,h);
		        setVisible(true); 
		
	}
		public static void main(String[]args)
	{
		new Contact();
	}
}
	
	