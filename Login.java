import java.awt.*;
import javax.swing.*;
class Login extends JFrame
{
	Toolkit toolkit;
	  Dimension dim;
    JPanel p=new JPanel();
    JPanel p1=new JPanel();
	
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	
	JLabel lbl=new JLabel("LIBRARY MANAGMENT SYSTEM");
	
	JLabel lbl1=new JLabel("UserName");
	JTextField txt=new JTextField(10);
	JLabel lbl2=new JLabel("Password");
	JPasswordField pass = new JPasswordField(10);
	JButton btn=new JButton("Login");
	JButton btn1=new JButton("Reset Password");
	Login()
	{
		super("Login Page");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 int w =(int)dim.getWidth();
		 int h=(int)dim.getHeight();
		
		add(p1,"Center");
		p.setLayout(new FlowLayout(FlowLayout.CENTER,20,0));
		p4.setLayout(new GridLayout(3,2,10,10));
		p.add(lbl);p4.add(btn);p4.add(btn1);p4.add(lbl1);p4.add(lbl2);
		lbl.setFont(new Font("ALGERIAN",Font.BOLD,30));
		lbl1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		lbl2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		btn.setBackground(new Color(100,255,190));
	    btn1.setBackground(new Color(100,255,190));
		p.setBackground(Color.white);
		p1.setBackground(Color.blue);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.blue);
		
		
		p4.setBackground(Color.white);
		
		
		p.add(lbl);
		p4.add(lbl1);
		p4.add(txt); 
		p4.add(lbl2);
		p4.add(pass);
		p4.add(btn);
		p4.add(btn1);
		setSize(w,h);
		setVisible(true);
		
		toolkit=Toolkit.getDefaultToolkit();
	  dim=toolkit.getScreenSize();
	   h=(int)dim.getHeight();
	   w=(int)dim.getWidth();
	}
	public static void main(String[]args)
	{
		 new Login();
	}
}