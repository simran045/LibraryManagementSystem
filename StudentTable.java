import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.sql.*;
import java.awt.event.*;


class StudentTable extends JFrame implements MouseListener
{

    JPanel p=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JLabel l=new JLabel(" STUDENT DETAILS");
	JButton btnHome=new JButton("HOME");
    JButton btnExit=new JButton("EXIT");
	JButton btnPrint=new JButton("PRINT");
	JButton btnAbout=new JButton("ABOUT");
	JButton btnLogout=new JButton("LOGOUT");
	JButton btnContact=new JButton("CONTACT");
	JButton btnService=new JButton("SERVICES");
	 
	JTable tab=new JTable();
	JScrollPane jsp=new JScrollPane(tab);
	DefaultTableModel dtm;
	int row,col;
	int w,h;
	Color col2,col1;
	Toolkit toolkit;
	Dimension dim;
	Connection con;
	String colHead[];
	PreparedStatement ps;
	static String data;
	/*{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			ps=con.prepareStatement("Select count(*) from issueBook");
			ResultSet rst=ps.executeQuery();
			if(rst.next())
			row=rst.getInt(1);
			ps=con.prepareStatement("Select * from issueBook");
			rst=ps.executeQuery();
			ResultSetMetaData rsmt=rst.getMetaData();
			col=rsmt.getColumnCount();
			colHead=new String[col];
			for(int k=0;k<col;k++)
			{
				colHead[k]=rsmt.getColumnName(k+1);
			}
			dtm=new DefaultTableModel(row,col);
			tab.setModel(dtm);
			int r=0;
			while(rst.next())
			{
				for(int j=0;j<col;j++)
					tab.setValueAt(rst.getString(j+1),r,j);
				r++;
			}
			TableColumnModel tcm=tab.getColumnModel();
			for(int k=0;k<col;k++)
			{
				tcm.getColumn(k).setHeaderValue(colHead[k]);
			}
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}
		
	}*/
	 StudentTable()
	{
	    super("Library Management System");
		toolkit=Toolkit.getDefaultToolkit();
		dim=toolkit.getScreenSize();
		w=(int)dim.getWidth();
		h=(int)dim.getHeight();
	    add(p);
		tab.setRowHeight(35);
		tab.setPreferredScrollableViewportSize(new Dimension(1300,500));
	    tab.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
		l.setFont(new Font("Arial",Font.PLAIN,20));
		l.setBounds(600,25,400,30);
		p.setLayout(null);
		p3.setLayout(null);
		p3.add(l);
		p3.setPreferredSize(new Dimension(1450,70));
		p3.setBounds(0,90,1450,70);
		p.add(p3);
		p3.setLayout(null);
		p2.setBackground(Color.lightGray);
		p1.setPreferredSize(new Dimension(1450,90));
		p1.setBounds(0,0,1450,90);
	    p.add(p1,"North");
		p2.setPreferredSize(new Dimension(1450,560));
		p2.setBounds(0,165,1450,560);
		p.add(p2);
		p1.setBackground(Color.lightGray);
		p2.add(jsp);
		p4.setPreferredSize(new Dimension(1450,100));
		p4.setBounds(0,726,1450,100);
		p.add(p4);
		p4.setLayout(null);
		//sort with 2 linestab.setAutoCreateRowSorter(true);
		//to have sorted table tab.getRowSorter().toggleSortOrder(0);

		setSize(w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		 col2=btnPrint.getBackground();
		 col1=btnHome.getForeground();
		 btnHome.setForeground(Color.black);
	     btnHome.setBounds(660,30,100,25);
	     btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnHome.setBorderPainted(false);
	     btnHome.setContentAreaFilled(false);
	     btnHome.setFocusPainted(false);
		
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
		 p1.setLayout(null);
		 p1.add(btnHome);
		  
		  
		 btnAbout.setForeground(Color.black);
	     btnAbout.setBounds(800,30,100,25);
	     btnAbout.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnAbout.setBorderPainted(false);
	     btnAbout.setContentAreaFilled(false);
	     btnAbout.setFocusPainted(false);
	  
		 btnAbout.setFont(btnFont);
		 p1.add(btnAbout);
		 
		 
		 btnService.setForeground(Color.black);
	     btnService.setBounds(945,30,100,25);
	     btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnService.setBorderPainted(false);
	     btnService.setContentAreaFilled(false);
	     btnService.setFocusPainted(false);
	  
		 btnService.setFont(btnFont);
		 p1.add(btnService);
		  
		 btnContact.setForeground(Color.black);
	     btnContact.setBounds(1090,30,170,25);
	     btnContact.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnContact.setBorderPainted(false);
	     btnContact.setContentAreaFilled(false);
	     btnContact.setFocusPainted(false);
	   
		 btnContact.setFont(btnFont);
		 p1.add(btnContact);
		 

		 btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1300,30,100,25);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
	   
		 btnLogout.setFont(btnFont);
		 p1.add(btnLogout);
		
	     btnPrint.setBounds(595,40,100,30);
		 p4.add(btnPrint);
		 btnPrint.setBackground(new Color(135,206,250));
		 btnPrint.setFocusPainted(false);
	     
		 btnExit.setBounds(760,40,100,30);
		 p4.add(btnExit);
		 btnExit.setBackground(new Color(135,206,250));
		 btnExit.setFocusPainted(false);
		 
		 btnHome.addMouseListener(this);
		 btnAbout.addMouseListener(this);
		 btnService.addMouseListener(this);
		 btnContact.addMouseListener(this);
		 btnLogout.addMouseListener(this);
		 btnPrint.addMouseListener(this);
		 btnExit.addMouseListener(this);
		 
	     
	}
	
	
	public void mouseClicked(MouseEvent e)
   {
       if(e.getSource()==btnPrint)
		{
		btnPrint.setBackground(Color.gray);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(Color.gray);
		}
   
   }
   public void mousePressed(MouseEvent e)
   {
      if(e.getSource()==btnPrint)
		{
			btnPrint.setBackground(col2);
		}
		if(e.getSource()==btnExit)
		{
			btnExit.setBackground(col2);
		}
	
   }
   public void mouseReleased(MouseEvent e){}
   public void mouseEntered(MouseEvent e)
	{
		if(e.getSource()==btnHome)
		{
		btnHome.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(65,130,155));
		}
	}
	public void mouseExited(MouseEvent e)
	{
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col1);
		}
		if(e.getSource()==btnAbout)
		{
			btnAbout.setForeground(col1);
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(col1);
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(col1);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col1);
		}
        		
     }
	
	
	public static void main(String []args)
	{
		new StudentTable();
	}
}
