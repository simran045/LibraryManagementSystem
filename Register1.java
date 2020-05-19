import java.awt.*;
import javax.swing.*;
class Register1 extends JFrame
{
	Toolkit toolkit;
	  Dimension dim;
	JPanel p=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("use.jpg").getImage(),0,0,1450,250,null);
		}
	};
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("file.jpg").getImage(),0,0,1450,800,null);
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
	
	
	Register1()
	{
		super("LIBRARY MANAGMENT OF NIELIT");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		add(p,"North");add(p1,"South");add(p2,"East");
		add(p3,"West");add(p4,"Center");
		p.setPreferredSize(new Dimension(600,100));
		p1.setPreferredSize(new Dimension(600,100));
		p2.setPreferredSize(new Dimension(100,400));
		p3.setPreferredSize(new Dimension(100,400));
		p.setLayout(new FlowLayout(FlowLayout.CENTER,20,0));
		p4.setLayout(null);
	
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

	lbl.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl.setForeground(new Color(218,165,32));
		lbl1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl1.setForeground(new Color(218,165,32));
		lbl2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl2.setForeground(new Color(218,165,32));
		lbl3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl3.setForeground(new Color(218,165,32));
		
		 
		p.setBackground(Color.white);
	    p1.setBackground(new Color(238,232,170));
		p2.setBackground(new Color(238,232,170));
		p3.setBackground(new Color(238,232,170));
		p4.setBackground(Color.white);	
		
	   
		
		
		
		
		btn.setBackground(new Color(205,92,92));
		
		
		/*Add Component*/
		cmb.addItem("IT");cmb.addItem("Networking");cmb.addItem("computer"); cmb1.addItem("Graduate");cmb1.addItem("Post Graduate");
		
		
		
		
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new Register1();
	}
}