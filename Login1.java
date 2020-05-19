import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	JPanel p=new JPanel();
	{
	
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("Penguins.jpg").getImage(),0,0,400,300,null);
		}
	};
	
	}
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("Penguins.jpg").getImage(),0,0,400,300,null);
		}
	};
	
	JLabel lbl=new JLabel("User Id");
	JTextField txt=new JTextField(10);
	JButton btn=new JButton("Submit");
	JButton btn=new JButton("Login");
	JButton btn1=new JButton("Reset Password");
	Login()
	{
		super("Login Page");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
	