import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.print.*;
class IssueReceipt extends JFrame implements ActionListener
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
	JPanel p4=new JPanel();
	
	JLabel l=new JLabel("National Institute of Electronics and Technology ");
	JLabel l1=new JLabel("Librarian");
	JLabel lbl=new JLabel("Accession Number:");
	JLabel lbl2=new JLabel();
	JLabel lbl3=new JLabel("Book Title:");
	JLabel lbl4=new JLabel();
	JLabel lbl5=new JLabel("Member ID:");
	JLabel lbl6=new JLabel();
	JLabel lbl7=new JLabel("Subject:");
	JLabel lbl8=new JLabel();
	JLabel lbl9=new JLabel("Issue Date:");
    JLabel lbl10=new JLabel();
    JLabel lbl11=new JLabel("Return Date:");
    JLabel lbl12=new JLabel();
	JButton btn=new JButton("print");	
	JButton btn1=new JButton("exit");
	IssueReceipt()
	{
	     super("Issue Receipt");
		String p=JOptionPane.showInputDialog(null,"Enter Member ID:");
		try{
				pst=con.prepareStatement("Select * from issue_book where mem_id=?");
				pst.setString(1,p);
				rst=pst.executeQuery();
				if(rst.next())
				{
					lbl2.setText(rst.getString("accession"));
					lbl4.setText(rst.getString("title"));
					lbl6.setText(rst.getString("mem_id"));
					lbl8.setText(rst.getString("subject"));
					lbl10.setText(rst.getString("issue_date"));
					lbl12.setText(rst.getString("return_date"));
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
	    l.setBounds(65,10,500,30);
		lbl.setBounds(20,60,150,30);
		lbl2.setBounds(162,60,150,30);
		lbl3.setBounds(20,100,150,30);
		lbl4.setBounds(162,100,250,30);
		lbl5.setBounds(20,140,150,30);
		lbl6.setBounds(162,140,150,30);
		lbl7.setBounds(20,175,150,30);
		lbl8.setBounds(162,175,150,30);
		lbl9.setBounds(20,215,150,30);
		lbl10.setBounds(162,215,150,30);
		lbl11.setBounds(20,260,150,30);
		lbl12.setBounds(162,260,150,30);
		l1.setBounds(300,310,120,30);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	
		p4.add(l);p4.add(l1);
		p4.add(lbl);p4.add(lbl2);
		p4.add(lbl3);p4.add(lbl4);
		p4.add(lbl5); p4.add(lbl9);   p4.add(lbl11);     p4.add(lbl12);  
		p4.add(lbl6);  p4.add(lbl10);  
		p1.add(btn);p1.add(btn1);
		p4.add(lbl7);p4.add(lbl8);
		lbl2.setOpaque(true);
		lbl4.setOpaque(true);
		lbl6.setOpaque(true);
		lbl8.setOpaque(true);
	
		//p.setBackground(Color.white);
	    p1.setBackground(new Color(225,228,181));
		p2.setBackground(new Color(225,228,181));
		p3.setBackground(new Color(225,228,181));
		lbl9.setOpaque(true);
        btn.setBackground(new Color(135,206,250));
		btn1.setBackground(new Color(135,206,250));
		setSize(600,500);
		setVisible(true);
		btn.addActionListener(this);
		btn1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ee)
	{
	 if(ee.getSource()==btn)
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
	if(ee.getSource()==btn1)
	{
	this.dispose();
	}
  }
	public static void main(String[]args)
	{
		new IssueReceipt();
	}
}