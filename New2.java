import java.awt.*;
import javax.swing.*;
class Register5 extends JFrame
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
	
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("myyy2.jpg").getImage(),0,0,WelcomeScreen.w,WelcomeScreen.h,null);
		}
	};
	
	
		JLabel lbl=new JLabel(" Username");
	JTextField txt=new JTextField(10);
	JLabel lbl1=new JLabel("Password");
	JPasswordField pass = new JPasswordField(10);
	
	JLabel lbl2=new JLabel("course");
	
	JComboBox cmb=new JComboBox();
	JLabel lbl3=new JLabel("session");
	
	
	
	
	
	JComboBox cmb1=new JComboBox();
	JButton btn=new JButton("Register");
	static int w,h;
	
	
	Register5()
	{
		super("LIBRARY MANAGMENT OF NIELIT");
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
		lbl.setBounds(20,30,150,30);
		txt.setBounds(120,30,150,30);
		lbl1.setBounds(20,70,150,30);
		pass.setBounds(120,70,150,30);
		lbl2.setBounds(20,110,150,30);
		cmb.setBounds(120,110,200,30);
		lbl3.setBounds(20,150,150,30);
		cmb1.setBounds(120,150,150,30);
	      p4.add(lbl);p4.add(txt);
		  p4.add(lbl1);p4.add(pass);
		  p4.add(lbl2);p4.add(cmb);
		  p4.add(lbl3);p4.add(cmb1);
p1.add(btn);
		
		
		
		
		
	}
	public static void main(String[]args)
	{
		new Register5();
	}
}
		
		
	
		