import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.print.*;
class Food extends JFrame implements ActionListener
{
	
	Connection con;
	PreparedStatement pst;
	ResultSet rst;
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
		}
		catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
		catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,e);}
	}	
	JPanel p=new JPanel();
	/*{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("logo.png").getImage(),0,0,200,100,null);
		}
	};*/
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("food.jpg").getImage(),0,0,400,300,null);
		}
	};
	
	JLabel lbl=new JLabel("User Name");
	//JTextField txt=new JTextField(10);
	
	JLabel lbl2=new JLabel();
	JLabel lbl3=new JLabel("Password");
	JLabel lbl4=new JLabel();
	JLabel lbl5=new JLabel("Drinks");
	JLabel lbl6=new JLabel();
	JLabel lbl7=new JLabel("Menu");
	JLabel lbl8=new JLabel();
    JLabel lbl9=new JLabel();
	JButton btn=new JButton("print");	
	JButton btn1=new JButton("exit");
	Food()
	{
		String p=JOptionPane.showInputDialog(null,"Enter Your Password");
		try{
				String drink="",category="";
				pst=con.prepareStatement("Select * from myfood where pass=?");
				pst.setString(1,p);
				rst=pst.executeQuery();
				if(rst.next())
				{
					lbl2.setText(rst.getString("id"));
					lbl4.setText(rst.getString("pass"));
					lbl6.setText(rst.getString("drinks"));
					lbl8.setText(rst.getString("menu"));
					lbl9.setText(rst.getString("category"));
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Data Not Found");
					return;
				}
		}
		catch(SQLException e){}
		//add(p,"North");
		add(p1,"South");
		add(p2,"East");
		add(p3,"West");
		add(p4,"Center");
		
		//p.setPreferredSize(new Dimension(600,100));
		p1.setPreferredSize(new Dimension(600,100));
		p2.setPreferredSize(new Dimension(100,400));
		p3.setPreferredSize(new Dimension(100,400));
		
		//p.setLayout(new FlowLayout(FlowLayout.CENTER,30,0));
		p4.setLayout(null);
	
		lbl.setBounds(20,10,150,30);
		lbl2.setBounds(120,10,150,30);
		lbl3.setBounds(20,60,150,30);
		lbl4.setBounds(120,60,150,30);
		lbl5.setBounds(20,100,150,30);
		lbl6.setBounds(120,100,150,30);
		lbl7.setBounds(20,180,150,30);
		lbl8.setBounds(120,180,150,30);
		lbl9.setBounds(20,230,150,30);
		
		
		
		
	
		
		p4.add(lbl);p4.add(lbl2);
		p4.add(lbl3);p4.add(lbl4);
		p4.add(lbl5);        
		p4.add(lbl6);   
		p1.add(btn);p1.add(btn1);
		p4.add(lbl7);p4.add(lbl8);
		lbl2.setOpaque(true);
		lbl4.setOpaque(true);
		lbl6.setOpaque(true);
		lbl8.setOpaque(true);
		
		lbl.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl.setForeground(new Color(218,165,32));
		lbl2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl2.setForeground(new Color(218,165,32));
		lbl3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl3.setForeground(new Color(218,165,32));
		lbl4.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl4.setForeground(new Color(218,165,32));
		lbl5.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl5.setForeground(new Color(218,165,32));
		lbl6.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl6.setForeground(new Color(218,165,32));
		lbl9.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl9.setForeground(new Color(218,165,32));
		btn.setBackground(new Color(100,255,190));
	    btn1.setBackground(new Color(100,255,190));
		//p.setBackground(Color.white);
	    p1.setBackground(new Color(225,228,181));
		p2.setBackground(new Color(225,228,181));
		p3.setBackground(new Color(225,228,181));
		
		
		
		
		
		 
		p4.add(lbl9);
	
		
		lbl9.setOpaque(true);

		
		
		
		setSize(600,500);
		setVisible(true);
		
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ee)
	{
		PrinterJob pjob=PrinterJob.getPrinterJob();
		PageFormat preformat = pjob.defaultPage();
		preformat.setOrientation(PageFormat.LANDSCAPE);
		PageFormat postformat =pjob.pageDialog(preformat);
		if(preformat!=postformat)
		{
			pjob.setPrintable(new Printer(p4),postformat);
			if(pjob.printDialog())
			{
				try
				{
					pjob.print();
				}
				catch(PrinterException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[]args)
	{
		new Food();
	}
}