import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login2 extends JFrame implements ActionListener
{
	Toolkit toolkit;
	  Dimension dim;
	  int w,h;
	JPanel p=new JPanel()
	{
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1450,100,null);
		}
	};
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("right.jpg").getImage(),0,0,1450,600,null);
		}
	};
	
	
	JLabel lbl=new JLabel("UserName");
	JTextField txt=new JTextField(10);
	JLabel lbl1=new JLabel("Password");
	JPasswordField pass = new JPasswordField(10);
	JButton btn=new JButton("Register");
	JButton btn1=new JButton("Login");
	JButton btn2=new JButton("Forgot Password");
	
	Login2()
	{
		super("LIBRARY MANAGMENT OF NIELIT");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		 
		add(p,"North");add(p1,"South");add(p2,"East");
		add(p3,"West");add(p4,"Center");
		p.setPreferredSize(new Dimension(600,100));
		p1.setPreferredSize(new Dimension(600,100));
		p2.setPreferredSize(new Dimension(100,400));
		p3.setPreferredSize(new Dimension(100,400));
		p.setLayout(new FlowLayout(FlowLayout.CENTER,20,0));
		p4.setLayout(null);
	
		lbl.setBounds(400,120,200,30);
		txt.setBounds(600,120,200,30);
		lbl1.setBounds(400,200,200,30);
		pass.setBounds(600,200,200,30);
	      p4.add(lbl);p4.add(txt);
		  p4.add(lbl1);p4.add(pass);
		  p1.add(btn);p1.add(btn1);p1.add(btn2);

		lbl.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		lbl.setForeground(new Color(218,165,32));
		lbl1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
		lbl1.setForeground(new Color(218,165,32));
		btn.setBackground(new Color(100,255,190));
	     btn1.setBackground(new Color(100,255,190));
		 btn2.setBackground(new Color(100,255,190));
		p.setBackground(Color.white);
	    p1.setBackground(new Color(70,130,180));
		p2.setBackground(new Color(70,130,180));
		p3.setBackground(new Color(70,130,180));
		p4.setBackground(Color.white);
		
		setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(w,h);
		setVisible(true);
		btn.addActionListener(this);
		
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
		{
				if (e.getSource()==btn)
					new Register1().setVisible(true);	
				if(e.getSource()==btn1)
					new MyMenu().setVisible(true);
		}		
					
	
	public static void main(String[]args)
	{
		 new Login2();
	}
}