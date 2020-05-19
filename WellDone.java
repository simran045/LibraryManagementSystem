import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class WellDone extends JFrame implements ActionListener
{
	Toolkit toolkit;
	  Dimension dim;
	static int w,h;
	
	/*JPanel p=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("geta.png").getImage(),0,0,p.getWidth(),p.getHeight(),null);
		}
	};*/


	JPanel p1=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("geta.png").getImage(),0,0,p1.getWidth(),p1.getHeight(),null);
		}
	};
	


	
	
	
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("myyy2.jpg").getImage(),0,0,WellDone.w,WellDone.h,null);
		}
	};
	
	
		
	
	
	
	
	
	JLabel lbl=new JLabel("LIBRARY MANAGMENT SYSTEM");
	
	
	JComboBox cmb=new JComboBox();
	
	JRadioButton rd1=new JRadioButton("Admin");
	JRadioButton rd2=new JRadioButton("Member");
	JButton btn=new JButton("Ok");
	
	ButtonGroup btnGroup=new ButtonGroup();
	
	
	
	JLabel lblAdminPic=new JLabel();
	JLabel lblUserPic=new JLabel();
	WellDone()
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
		
		
	
		lbl.setFont(new Font("ALGERIAN",Font.BOLD,35));
		
		lbl.setForeground(new Color(34,139,34));
		rd1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		rd1.setForeground(new Color(25,25,112));
	    rd2.setFont(new Font("ALGERIAN",Font.BOLD,25));
		rd2.setForeground(new Color(25,25,112));
	
		btnGroup.add(rd1);
		btnGroup.add(rd2);
		
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		
		p1.setLayout(null);
		lbl.setBounds(40,20,580,40);
		rd1.setBounds(90,90,150,50);
		rd2.setBounds(400,90,150,50);
		lblAdminPic.setBounds(40,90,50,50);
		lblUserPic.setBounds(350,90,50,50);
		p1.add(lbl);
		p1.add(rd1);
		p1.add(rd2);
		btn.setBounds(250,350,150,30);
		p1.add(btn);
		p1.add(lblAdminPic);
		p1.add(lblUserPic);
		Image img=new ImageIcon("play.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		Image img1=new ImageIcon("student.png").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
		lblAdminPic.setIcon(new ImageIcon(img));
		lblUserPic.setIcon(new ImageIcon(img1));
				btn.setBackground(new Color(255,140,0));
	
		setSize(w,h);
		setVisible(true);
		
	btn.addActionListener(this);
	}
	// linking of form with jradiobtn
     public void actionPerformed(ActionEvent e)
		{
				if (e.getSource()==btn)
				{
					if(rd2.isSelected())
					{
						
					new Login2().setVisible(true);
				    //WellDone.dispose();
		
					}		
					
				}	
		}
	
	public static void main(String[]args)
	{
		new WellDone();
	}
}
	