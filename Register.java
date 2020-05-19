import java.awt.*;
import javax.swing.*;
class Register extends JFrame
{
	Toolkit toolkit;
	  Dimension dim;
	JPanel p=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("ooo.jpg").getImage(),0,0,WelcomeScreen.w,WelcomeScreen.h,null);
		}
	};
	


	JPanel p1=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("ooo.jpg").getImage(),0,0,900,400,null);
			}
	};
	JLabel lbl=new JLabel("LIBRARY MANAGMENT SYSTEM");


	
	
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("myyy2.jpg").getImage(),0,0,WelcomeScreen.w,WelcomeScreen.h,null);
			}
	};
	
	
		
	
	
	
	
	
	JLabel lbl1=new JLabel("UserName");
	JTextField txt=new JTextField(10);
	JLabel lbl2=new JLabel("Password");
		JPasswordField pass = new JPasswordField(10);
	JLabel lbl3=new JLabel("Course");
		JTextField txt1=new JTextField(10);
	JLabel lbl4=new JLabel("Session");
		JTextField txt2=new JTextField(10);
		static int w,h;
	
	JButton btn=new JButton("Register");
	Register()
	{
		super("Online Library Management System Of NIELIT");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		add(p4,"Center");
		p4.setLayout(null);
		p1.setBounds(w/2-300,h/2-200,600,400);
		p4.add(p1);
				lbl.setFont(new Font("ALGERIAN",Font.BOLD,30));
		
		lbl.setForeground(new Color(219,112,147));
		
		
		p1.setLayout(null);
		lbl1.setBounds(40,40,520,40);
		txt.setBounds(60,40,520,40);
		lbl2.setBounds(40,40,520,40);
		pass.setBounds(60,40,520,40);
		lbl3.setBounds(60,40,520,40);
		txt1.setBounds(40,40,520,40);
		lbl4.setBounds(60,40,520,40);
		txt2.setBounds(40,40,520,40);
		
		
		
		p1.add(lbl1);
		p1.add(txt);
		p1.add(lbl2);
		p1.add(pass);
		p1.add(lbl3);
		p1.add(txt1);
		p1.add(lbl4);
		p1.add(txt2);
		
		
		
		p1.add(btn);
		
		
	
		setSize(w,h);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new Register();
	}
}
		
	
	