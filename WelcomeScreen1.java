import java.awt.*;
import javax.swing.*;
class WelcomeScreen extends JFrame
{
	Toolkit toolkit;
	  Dimension dim;
	
	
	JPanel p=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("khan.jpg").getImage(),0,0,WelcomeScreen.w,WelcomeScreen.h,null);
		}
	};


	JPanel p1=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("khan.jpg").getImage(),0,0,900,400,null);
		}
	};
	


	
	
	
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("nani.jpg").getImage(),0,0,WelcomeScreen.w,WelcomeScreen.h,null);
		}
	};
	
	
		
	
	
	
	
	
	JLabel lbl=new JLabel("LIBRARY MANAGMENT SYSTEM");
	
	
	JComboBox cmb=new JComboBox();
	
	JRadioButton rd1=new JRadioButton("Admin");
	JRadioButton rd2=new JRadioButton("Member");
	JButton btn=new JButton("Ok");
	
	ButtonGroup btnGroup=new ButtonGroup();
	
	
	static int w,h;
	JLabel lblAdminPic=new JLabel();
	JLabel lblUserPic=new JLabel();
	WelcomeScreen()
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
		rd1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		rd1.setForeground(new Color(219,112,147));
	    rd2.setFont(new Font("ALGERIAN",Font.BOLD,25));
		rd2.setForeground(new Color(219,112,147));
		
		btnGroup.add(rd1);
		btnGroup.add(rd2);
		
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		
		p1.setLayout(null);
		lbl.setBounds(40,40,520,40);
		rd1.setBounds(90,90,700,90);
		rd2.setBounds(130,130,700,130);
		p1.add(lbl);
		p1.add(rd1);
		p1.add(rd2);
		p1.add(btn);
		p1.add(lblAdminPic);
		p1.add(lblUserPic);
		Image img=new ImageIcon("admiin.jpg").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		Image img1=new ImageIcon("download.jpg").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		lblAdminPic.setIcon(new ImageIcon(img));
		lblUserPic.setIcon(new ImageIcon(img1));
				btn.setBackground(new Color(100,255,190));
	
		setSize(w,h);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new WelcomeScreen();
	}
}
	