//import statements
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.plaf.metal.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.sql.*;
import java.awt.event.*;

public class ShowT extends JFrame implements ActionListener
{
  
     // Panels
    JPanel p=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4= new JPanel();
	
     //Buttons	
	JButton btnHome=new JButton("HOME");
    JButton btnExit=new JButton("EXIT");
	JButton btnPrint=new JButton("PRINT");
	JButton btnEdit=new JButton("EDIT");
	JButton btnAbout=new JButton("ABOUT");
	JButton btnLogout=new JButton("LOGOUT");
	JButton btnContact=new JButton("CONTACT");
	JButton btnService=new JButton("SERVICES");
	
	
	String head[]={"Name","Gender","Mobile Number","Nationality","Password"};
	String data[][]={};
	JTable tab=new JTable(data,head);
	JScrollPane jsp=new JScrollPane(tab);
	
	DefaultTableModel dtm;
	int row;
	int w,h;
	Toolkit toolkit;
	Dimension dim;
	public static int rowNum = 0;
	public static int total = 0;
	//database connectivity code
	Connection con;
	String colHead;
	PreparedStatement ps;
	//String data;
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			ps=con.prepareStatement("Select count(*) from User_Details");
			ResultSet rst=ps.executeQuery();
			if(rst.next())
			row=rst.getInt(1);
			ps=con.prepareStatement("Select User_Details.name,User_Details.gender,User_Details.mobile,User_Details.nationality,login1.password from User_Details,login1 where User_Details.name=login1.name");
			rst=ps.executeQuery();
			dtm=new DefaultTableModel(row,5);
			tab.setModel(dtm);
			int r=0;
			while(rst.next())
			{
				for(int j=0;j<5;j++)
					tab.setValueAt(rst.getString(j+1),r,j);
				r++;
			}
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}
		
	}
	
	//class constructor
	ShowT()
	{
		toolkit=Toolkit.getDefaultToolkit();
		dim=toolkit.getScreenSize();
		w=(int)dim.getWidth();
		h=(int)dim.getHeight();
		
		add(p);
		tab.setRowHeight(35);
		 tab.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tab.setPreferredScrollableViewportSize(new Dimension(1300,500));
	    tab.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
		 jsp.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         jsp.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//defining components and their layout
		p.setLayout(null);
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
		tab.setAutoCreateRowSorter(true);//sort with 2 lines
		tab.getRowSorter().toggleSortOrder(0);//to have sorted table
		setSize(w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
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
		
		 btnEdit.setBounds(355,40,100,25);
		 p4.add(btnEdit);
		 btnEdit.setBackground(new Color(135,206,250));
		 btnEdit.setFocusPainted(false);
		 
	     btnPrint.setBounds(595,40,100,25);
		 p4.add(btnPrint);
		 btnPrint.setBackground(new Color(135,206,250));
		 btnPrint.setFocusPainted(false);
	     
		 btnExit.setBounds(760,40,100,25);
		 p4.add(btnExit);
		 btnExit.setBackground(new Color(135,206,250));
		 btnExit.setFocusPainted(false);
		
		
		
		/*tab.addMouseListener(
		new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				int sel_Row=tab.getSelectedRow();
				data=tab.getValueAt(sel_Row,1).toString();
				dispose();
				new JTableDataFetch();
			}
		}
		);*/
	}
public void actionPerformed( ActionEvent e)
{
String srcObj = e.getActionCommand();	
if(srcObj=="EDIT")
	{
		if(total != 0){
			try
			{
				if(tab.getValueAt(tab.getSelectedRow(),tab.getSelectedColumn()) != null)
				{
					JDialog JDEdit = new EDIT_INFORMATION("SELECT * FROM User_Details WHERE password='" + tab.getValueAt(tab.getSelectedRow(),0) + "'");
					JDEdit.show();
				}
			}
			catch(Exception sqlE)
			{
				if(sqlE.getMessage() != null){System.out.println(sqlE.getMessage());}
				else
				{
					JOptionPane.showMessageDialog(null,"Please select a record in the list to modify.","No Record Selected",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		}
	}
}	
	
	public static void main(String []args)
	{
		new ShowT();
	}
}