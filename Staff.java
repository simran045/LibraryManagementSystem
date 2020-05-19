import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;

class Staff extends JFrame
{    
     Toolkit toolkit;
	  Dimension dim;
	  int w,h;
     JComboBox cmb=new JComboBox();
     JComboBox cmb1=new JComboBox();
	 JButton btn1=new JButton();
	 JButton btn2=new JButton();
	 JButton btn3=new JButton();
	 JButton btn4=new JButton();
	 ButtonGroup btnGroup=new ButtonGroup();
     JPanel p=new JPanel();
     JPanel p1=new JPanel();
     JPanel p2=new JPanel()
     {
	 public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("").getImage(),0,0,1450,100,null);
		}
	};
    
     
	  
Staff()
{
	super("STAFF INFO");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		add(p,"East");
		
		 JLabel l1=new JLabel(" Staff Id:");
     JTextField txt1=new JTextField (10);
     JLabel l2=new JLabel(" Staff Name:");
     JTextField txt2=new JTextField (10);
     JLabel l3=new JLabel(" Gender:");
     JRadioButton rd1=new JRadioButton("Male");
	 JRadioButton rd2=new JRadioButton("Female");
     JLabel l5=new JLabel(" Fathers Name:");
     JTextField txt3=new JTextField (10);
     JLabel l6=new JLabel(" Designation:");
     cmb.addItem("Teaching");
     cmb.addItem("Non Teaching");
     JLabel l7=new JLabel(" Qualification:");
     JTextField txt4=new JTextField (10);
     JLabel l8=new JLabel(" Temporary Adrress:");
     JTextArea a1=new JTextArea(40,40);
     JLabel l9=new JLabel(" Permanent Address:");
     JTextArea a2=new JTextArea(40,40);
     JLabel l10=new JLabel(" DOB:");
     JTextField txt5=new JTextField (10);
     JLabel l11=new JLabel(" Phone Number:");
     JTextField txt6=new JTextField (10);
	 JLabel l12=new JLabel(" Email Id:");
     JTextField txt7=new JTextField (10);
     JLabel l13=new JLabel(" Status:");
	 JTextField txt8=new JTextField(20);
	 JLabel l14=new JLabel("Department:");
	 cmb1.addItem("Mechanical");
	 cmb1.addItem("Computer");
	 cmb1.addItem("It");
     JTextArea a3=new JTextArea(30,30);
	 JButton btn1=new JButton("Remove");
	 JButton btn2=new JButton("Browse");
	 JButton btn3=new JButton("Add");
	 JButton btn4=new JButton("Remove");
	    add(p,"East");
		add(p1,"West");
        add(p2,"South");
		btnGroup.add(rd1);
		btnGroup.add(rd2);
		
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		l1.setBounds(1000,200,100,30);
		txt1.setBounds(220,200,100,25);
		l2.setBounds(110,350,200,30);
		txt2.setBounds(350,350,100,30);
		l3.setBounds(150,400,120,30);
		rd1.setBounds(300,400,100,25);
		rd2.setBounds(400,400,100,25);
		l5.setBounds(200,450,150,25);
		txt3.setBounds(350,450,100,25);
		l6.setBounds(250,475,200,30);
		cmb.setBounds(650,475,200,30);
		l7.setBounds(300,500,200,30);
		txt4.setBounds(600,530,100,30);
		l8.setBounds(350,550,100,30);
        a1.setBounds(970,570,200,30);
		l9.setBounds(400,580,200,30);
        a2.setBounds(600,580,200,30);
		l10.setBounds(450,600,200,30);
		txt5.setBounds(700,600,200,30);
		l11.setBounds(500,620,200,30);
		txt6.setBounds(800,620,200,30);
		l12.setBounds(550,630,200,30);
		txt7.setBounds(750,630,200,30);
		l13.setBounds(600,670,200,30);
		txt8.setBounds(820,670,200,25);
		l14.setBounds(850,700,200,30);
		cmb1.setBounds(870,700,200,30);
		a3.setBounds(900,750,300,200);
		btn1.setBounds(800,750,100,25);
		btn2.setBounds(850,800,50,25);
		btn3.setBounds(900,850,50,25);
		btn4.setBounds(950,900,50,25);
		btn1.setBackground(new Color(255,140,0));
		btn2.setBackground(new Color(255,140,0));
		btn3.setBackground(new Color(255,140,0));
		btn4.setBackground(new Color(255,140,0));
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		add(p);
		add(p1);
		add(p2);
		p.add(l1);
		p.add(txt1);
		p.add(l2);
		p.add(txt2);
		p.add(l3);
		p.add(rd1);
		p.add(rd2);
		p.add(l5);
		p.add(txt3);
		p.add(l6);
		p.add(cmb);
		p.add(cmb1);
		p.add(l7);
		p.add(txt4);
		p.add(l8);
		p.add(a1);
		p.add(l9);
		p.add(a2);
		p.add(l9);
		p.add(txt5);
		p.add(l10);
		p.add(txt6);
		p.add(l11);
		p.add(txt7);
		p.add(l12);
		p.add(cmb1);
		p.add(cmb1);
		p.add(txt8);
		p.add(l13);
		//p.add(txt9);
		p.add(l14);
		p2.add(a3);
		p2.add(btn3);
		p2.add(btn4);
		p1.add(btn1);
		p1.add(btn2); 
}
	public static void main(String[]args)
	{
		new Staff();
	}
}
	
		
		
		
		
		
		