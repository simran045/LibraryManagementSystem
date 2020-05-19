import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.sql.*;
import java.awt.event.*;
import java.awt.print.*;


class BookTable extends JFrame  implements MouseListener, ActionListener
{
  
	int w,h;
	Toolkit toolkit;
	Dimension dim;
	JPanel p=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JLabel l1=new JLabel("Total Books :");
	JLabel l2=new JLabel();
	JLabel l=new JLabel("BOOK DETAILS");
	JButton btnHome=new JButton("HOME");
    JButton btnExit=new JButton("EXIT");
	JButton btnPrint=new JButton("PRINT");
	JButton btnAbout=new JButton("HELP");
	JButton btnLogout=new JButton("LOGOUT");
	JButton btnContact=new JButton("CONTACT");
	JButton btnService=new JButton("SERVICES");
	
	Connection con;
	PreparedStatement pst;
	static String data;
	JTable tab=new JTable();
	String[] columns={"Accession No","Book title","Author","Edition","Publisher","Pages","Quantity"};
    JScrollPane jsp=new JScrollPane(tab);
	{
		try
		{
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			  pst=con.prepareStatement("SELECT accession,bk_title,bk_author,bk_edition,publisher,bk_pages,quantity FROM book_info");
			  ResultSet rst = pst.executeQuery();
			  DefaultTableModel model=(DefaultTableModel)tab.getModel();
	           model.setColumnIdentifiers(columns);
			  ResultSetMetaData rsmd=rst.getMetaData();
			  int colNo=rsmd.getColumnCount();
			  while(rst.next())
			  {
				 Object[] objects=new Object[colNo];
				 for(int i=0;i<colNo;i++)
				 {
				 objects[i]=rst.getObject(i+1);
			     }
              model.addRow(objects);				 
			   }
			  tab.setModel(model);
	    }
		    catch(SQLException e){}
		    catch(ClassNotFoundException e){}
	}
	 Color col1,col2;
	 BookTable()
	{
	
	    
		super("Book Details");
	
	    toolkit=Toolkit.getDefaultToolkit();
		dim=toolkit.getScreenSize();
		w=(int)dim.getWidth();
		h=(int)dim.getHeight();
	    col1=btnHome.getForeground();
	    col2=btnPrint.getBackground();
	   // jsp.setCorner(ScrollPaneConstants.UPPER_LEFT_CORNER, tab.getTableHeader());
	
	    add(p);
		tab.setRowHeight(35);
		tab.setPreferredScrollableViewportSize(new Dimension(1300,500));
	    tab.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
        p.setLayout(null);
		p3.setBackground(new Color(255,255,255));
		p3.setPreferredSize(new Dimension(1450,70));
		p3.setBounds(0,90,1450,70);
		p.add(p3);
		p3.setLayout(null);
		l.setFont(new Font("Arial",Font.BOLD,20));
		l.setBounds(560,10,400,30);
		p3.add(l);
		p2.setBackground(new Color(0,139,139));
		p1.setPreferredSize(new Dimension(1450,90));
		p1.setBounds(0,0,1450,90);
	    p.add(p1,"North");
		p2.setPreferredSize(new Dimension(1350,460));
		p2.setBounds(0,165,1350,460);
		p.add(p2);
		p1.setBackground(Color.lightGray);
		p2.add(jsp);
		p.add(p4,"South");
		p4.setBounds(0,625,w,100);
		p4.setPreferredSize(new Dimension(w,100));
		p4.setBackground(new Color(0,139,139));
		p4.setLayout(null);
		//sort with 2 linestab.setAutoCreateRowSorter(true);
		//to have sorted table tab.getRowSorter().toggleSortOrder(0);

		setSize(w,h);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		 JLabel la1 = new JLabel("Library ");
	     la1.setFont(new Font("Arial", Font.BOLD, 20));
	     la1.setForeground(Color.red);
	     la1.setBounds(25,8,100,30);
		
	     JLabel la2 = new JLabel("Management ");
	     la2.setFont(new Font("Arial", Font.BOLD, 18));
	     la2.setBounds(25,44,120,20);
	   
	     JLabel la3 = new JLabel("System ");
	     la3.setFont(new Font("Arial", Font.BOLD, 18));
	     la3.setBounds(47,63,90,30);
		 
		 p1.add(la1);
		 p1.add(la2);
		 p1.add(la3);
		
		
		 btnHome.setForeground(Color.black);
	     btnHome.setBounds(560,30,100,25);
	     btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnHome.setBorderPainted(false);
	     btnHome.setContentAreaFilled(false);
	     btnHome.setFocusPainted(false);
		
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
		 p1.setLayout(null);
		 p1.add(btnHome);
		  
		  
		 btnAbout.setForeground(Color.black);
	     btnAbout.setBounds(700,30,100,25);
	     btnAbout.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnAbout.setBorderPainted(false);
	     btnAbout.setContentAreaFilled(false);
	     btnAbout.setFocusPainted(false);
	  
		 btnAbout.setFont(btnFont);
		 p1.add(btnAbout);
		 
		 
		 btnService.setForeground(Color.black);
	     btnService.setBounds(845,30,100,25);
	     btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnService.setBorderPainted(false);
	     btnService.setContentAreaFilled(false);
	     btnService.setFocusPainted(false);
	  
		 btnService.setFont(btnFont);
		 p1.add(btnService);
		  
		 btnContact.setForeground(Color.black);
	     btnContact.setBounds(990,30,170,25);
	     btnContact.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnContact.setBorderPainted(false);
	     btnContact.setContentAreaFilled(false);
	     btnContact.setFocusPainted(false);
	   
		 btnContact.setFont(btnFont);
		 p1.add(btnContact);
		 

		 btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1200,30,100,25);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
	   
		 btnLogout.setFont(btnFont);
		 p1.add(btnLogout);
		
	     btnPrint.setBounds(595,40,100,25);
		 p4.add(btnPrint);
		 btnPrint.setBackground(new Color(135,206,250));
		 btnPrint.setFocusPainted(false);
	     
		 btnExit.setBounds(760,40,100,25);
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
		 btnPrint.addActionListener(this);
		 
		  l1.setBounds(1050,15,190,25);
		  l2.setBounds(1250,15,30,25);
		  p4.add(l1);p4.add(l2);
		  l1.setFont(new Font("Arial", Font.BOLD,20));
		  l1.setForeground(Color.white);
		  l2.setForeground(Color.white);
		  l2.setFont(new Font("Arial", Font.BOLD,20));
	      int nor=tab.getRowCount();
		  l2.setText(String.valueOf(nor));
	     
	}
	public void actionPerformed(ActionEvent ee)
	{
	PrinterJob pjob=PrinterJob.getPrinterJob();
	PageFormat preformat=pjob.defaultPage();
	preformat.setOrientation(PageFormat.LANDSCAPE);
	PageFormat  postformat=pjob.pageDialog(preformat);
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
	
	public void mouseClicked(MouseEvent e)
   {
       if(e.getSource()==btnPrint)
		{
		btnPrint.setBackground(Color.gray);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(Color.gray);
		this.dispose();
		}
	  if(e.getSource()==btnHome)
	  {
	    this.dispose();
	    new HomePage().setVisible(true);
	  }
	   if(e.getSource()==btnLogout)
	  {
	    this.dispose();
	    new Logout().setVisible(true);
	  }
	  if(e.getSource()==btnService)
	  {
	    this.dispose();
	    new Service().setVisible(true);
	  }
	  if(e.getSource()==btnAbout)
	  {
	    this.dispose();
	    new About().setVisible(true);
	  }
	  if(e.getSource()==btnContact)
	  {
	    this.dispose();
	    new ContactUsPage().setVisible(true);
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
		btnHome.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnContact)
		{
		btnContact.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(0,139,139));
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
		new BookTable();
	}
}
