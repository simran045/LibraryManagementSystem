import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JTextField.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.sql.*;


 public class SearchBook extends JFrame implements  ItemListener, MouseListener,FocusListener,ActionListener
 {
    
	       Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
           Border border1;
           JPanel p1=new JPanel();
		   JPanel p5=new JPanel();
		   JPanel p2=new JPanel();
		   JPanel p6=new JPanel();
		   JPanel p8=new JPanel();
           JPanel panel1=new JPanel();
		   JPanel panel2=new JPanel();
		   
		   JPanel p3=new JPanel()
		   {
		     public void paintComponent(Graphics g)
			 {
			    g.drawImage(new ImageIcon("nielit.jpg").getImage(),0,0,w,135,null);
			 }
		   };
		   
		     JPanel p4=new JPanel()
			 {
		     public void paintComponent(Graphics g)
			 {
			    g.drawImage(new ImageIcon("grl2.jpg").getImage(),40,30,460,270,null);
			 }
		   };
		   
    Dimension dim;
    Toolkit toolkit;
		   
		   
    JTable table=new JTable();
	JScrollPane jsp=new JScrollPane(table);
	//DefaultTableModel dtm;
	int row,col;
	int w,h;
	Connection con;
	PreparedStatement ps;
	static String data;
		
		     // defining buttons
		   JButton btnSearch=new JButton("SEARCH");
		   JButton btnBack=new JButton("BACK");
		   JButton btnHome=new JButton("HOME");
           JButton btnBook=new JButton("BOOK SECTION");
		   JButton btnService=new JButton("SERVICES");
           JButton btnView=new JButton("VIEW LIBRARIANS");
           JButton btnAbout=new JButton("ABOUT US");
           JButton btnLogout=new JButton("LOGOUT");
		   JButton btn1=new JButton("ADD BOOK");
		   JButton btn2=new JButton("VIEW BOOKS");
		   JButton btn3=new JButton("ISSUE BOOK");
		   JButton btn4=new JButton("VIEW ISSUED BOOK");
		   JButton btn5=new JButton("RETURN BOOK");
		   JLabel label=new JLabel("SEARCH BOOK");
          
		   //defining components
		   
		   String[] item={"Accession number","title","publisher"}; 
           JComboBox cb=new JComboBox(item);
	       JLabel l2=new JLabel();
	       JTextField txt1=new JTextField(50);
		   JTextField txt2=new JTextField(50);
		   JTextField txt3=new JTextField(50);
		   JTextField txt4=new JTextField(50);
		   Color col1,col2;
		
        public SearchBook()
        {
          super("Library Management System");
		  toolkit=Toolkit.getDefaultToolkit();
		  dim=toolkit.getScreenSize();
		  w=(int)dim.getWidth();
		  h=(int)dim.getHeight();
		  
          setVisible(true);		  
          setSize(w,h);
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  p1.setBackground(new Color(100,149,237));
          add(p1);
          p1.setLayout(null);
		  p2.setBounds(690,10,560,440);
		  p2.setBackground(Color.white);
		  p8.setBounds(0,230,w,h-239);
		  p8.setBackground(new Color(0,139,139));
		  p8.setLayout(null);
		  p2.setPreferredSize(new Dimension(560,500));
		  p2.setBorder(BorderFactory.createLineBorder(Color.black));
		  p4.setPreferredSize(new Dimension(600,300));
		  p4.setBounds(20,50,600,300);
		  p1.add(p8);
		  p8.add(p4);
		  p8.add(p2);
		  p1.add(p3);
		  p1.add(p5);
		  p2.setLayout(null);
		  JLabel l1=new JLabel("Search Option:");
		  l1.setBounds(70,40,150,30);
		  l1.setVisible(true);
		   //cb.addItem("Accession Number");
		   //cb.addItem("Book Title");
		   //cb.addItem("Publisher");
		  // cb.addItem("Category");
		  cb.setBounds(250,40,200,30);
		  l2.setBounds(70,90,150,30);
		  txt1.setBounds(250,90,200,30);
		  txt1.setVisible(false);
		  txt2.setBounds(250,90,200,30);
		  txt2.setVisible(false);
		  txt3.setBounds(250,90,200,30);
		  txt3.setVisible(false);
		  txt4.setBounds(250,90,200,30);
		  txt4.setVisible(false);
		  
		  p3.setBackground(new Color(255,255,255));
		 // p4.setBackground(new Color(255,255,255));
		  
		  p3.setBounds(0,0,w,139);
		  p5.setBounds(0,135,w,100);
		  p5.setBackground(new Color(175,238,238));
		  p5.setLayout(null);
		  Font btnFont2 =new Font("Arial", Font.PLAIN,14);
		  col1=btnSearch.getBackground();
		  col2=btnHome.getForeground();
		  border1=txt2.getBorder();
		  l2.setVisible(false);
		  p2.add(l1);p2.add(cb);
		  p2.add(l2);p2.add(txt1);p2.add(txt2);p2.add(txt3);p2.add(txt4);
   
		  // adding panel p6 to p2 for jtable
		  p6.setPreferredSize(new Dimension(560,333));
		  p6.setBounds(0,200,560,333);
		  p2.add(p6);
		  p6.add(jsp);
		  p6.setBorder(BorderFactory.createLineBorder(Color.black));
          table.setRowHeight(35);
		  table.setPreferredScrollableViewportSize(new Dimension(530,260));
	      table.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());		  
		 
		 table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		 jsp.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         jsp.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		 
		 //adding buttons to panel
		 btnSearch.setBounds(200,135,100,30);
		 p2.add(btnSearch);
		 btnSearch.setBackground(new Color(135,206,250));
		 btnSearch.setFocusPainted(false);
		 
		 btnBack.setBounds(380,135,80,30);
		 p2.add(btnBack);
		 btnBack.setBackground(new Color(135,206,250));
		 btnBack.setFocusPainted(false);
		 
	     btnHome.setForeground(Color.black);
	     btnHome.setBounds(370,40,100,25);
	     btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnHome.setBorderPainted(false);
	     btnHome.setContentAreaFilled(false);
	     btnHome.setFocusPainted(false);
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
		  p5.add(btnHome);
		  
		  
		 btnBook.setForeground(Color.black);
	     btnBook.setBounds(510,40,170,25);
	     btnBook.setBorder(BorderFactory.createLineBorder(Color.black));
	     //btnBook.setBorderPainted(false);
	     btnBook.setContentAreaFilled(false);
	     btnBook.setFocusPainted(false);
		 btnBook.setFont(btnFont);
		 p5.add(btnBook);
		 
		 panel1.setBounds(510,0,200,100);
		 panel1.setVisible(false);
		 p8.add(panel1);
	     panel1.setLayout(new GridLayout(5,0));
	   
		btn1.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn1.setBorderPainted(false);
	   btn1.setContentAreaFilled(false);
	   btn1.setFocusPainted(false);
	   btn1.setFont(btnFont2);
	  
	   btn2.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn2.setBorderPainted(false);
	   btn2.setContentAreaFilled(false);
	   btn2.setFocusPainted(false);
	   btn2.setFont(btnFont2);
	   
	   btn3.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn3.setBorderPainted(false);
	   btn3.setContentAreaFilled(false);
	   btn3.setFocusPainted(false);
	   btn3.setFont(btnFont2);
	   
	   btn4.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn4.setBorderPainted(false);
	   btn4.setContentAreaFilled(false);
	   btn4.setFocusPainted(false);
	   btn4.setFont(btnFont2);
	   
	   btn5.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn5.setBorderPainted(false);
	   btn5.setContentAreaFilled(false);
	   btn5.setFocusPainted(false);
	   btn5.setFont(btnFont2);
	  panel1.setBackground(new Color(255,255,255));
	   panel1.add(btn1);
	   panel1.add(btn2);
	   panel1.add(btn3);
	   panel1.add(btn4);
	   panel1.add(btn5);
		 
		 btnService.setForeground(Color.black);
	     btnService.setBounds(705,40,100,25);
	     btnService.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnService.setBorderPainted(false);
	     btnService.setContentAreaFilled(false);
	     btnService.setFocusPainted(false);
		 btnService.setFont(btnFont);
		 p5.add(btnService);
		
	     btnView.setForeground(Color.black);
	     btnView.setBounds(850,40,190,25);
	     btnView.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnView.setBorderPainted(false);
	     btnView.setContentAreaFilled(false);
	     btnView.setFocusPainted(false);
		 btnView.setFont(btnFont);
		 p5.add(btnView);
		
	     btnAbout.setForeground(Color.black);
	     btnAbout.setBounds(1040,40,180,25);
	     btnAbout.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnAbout.setBorderPainted(false);
	     btnAbout.setContentAreaFilled(false);
	     btnAbout.setFocusPainted(false);
		 btnAbout.setFont(btnFont);
		 p5.add(btnAbout);
		
	     btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1220,40,130,25);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
		 btnLogout.setFont(btnFont);
		 p5.add(btnLogout);
				
		  // adding mouse listener to buttons
		btnSearch.addActionListener(this);
		btnBack.addActionListener(this);

        btnHome.addMouseListener(this);
		btnBook.addMouseListener(this);
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
		btn4.addMouseListener(this);
		btn5.addMouseListener(this);
		btnView.addMouseListener(this);
		btnService.addMouseListener(this);
		btnView.addMouseListener(this);
		btnAbout.addMouseListener(this);
		btnLogout.addMouseListener(this);
        cb.addItemListener(this);
		txt2.addFocusListener(this);
		
	
	
   }  
        public void itemStateChanged(ItemEvent ie)
	{

		  String getItem=(String)cb.getSelectedItem();
		  if(getItem.equals(item[0]))
		  {
		      l2.setText("Enter Accession Number :");
              l2.setVisible(true);
			  txt1.setVisible(true);
			  
		   }
          else if(getItem.equals(item[1]))
		  {
		      l2.setText("Enter Book Title :");
              l2.setVisible(true);
			  txt2.setVisible(true);
			  txt1.setVisible(false);
			  txt3.setVisible(false);
			  
		  }
		  else if(getItem.equals(item[2]))
		  {
		      l2.setText("Enter Publisher Name:");
              l2.setVisible(true);
			  txt1.setVisible(false);
			  txt2.setVisible(false);
			  txt3.setVisible(true);
		  }
	
		}
		
	    public void actionPerformed(ActionEvent ae)
	  {
          if(ae.getSource()==btnSearch)
		  {
		  
		    try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			String[] columns= {"Accession","Book Title","Author","Entry date"};
			ps=con.prepareStatement("Select accession,bk_title,bk_author,entry_date from book_info where accession=? or bk_title=? or publisher=? or subject=?");
			ps.setString(1,txt1.getText());
			ps.setString(2,txt2.getText());
			ps.setString(3,txt3.getText());
			ps.setString(4,txt4.getText());
			ResultSet rs=ps.executeQuery();
			  DefaultTableModel model=(DefaultTableModel)table.getModel();
	           model.setColumnIdentifiers(columns);
			  ResultSetMetaData rsmd=rs.getMetaData();
			  int colNo=rsmd.getColumnCount();
			  while(rs.next())
			  {
				 Object[] objects=new Object[colNo];
				 for(int i=0;i<colNo;i++)
				 {
				 objects[i]=rs.getObject(i+1);
			     }
              model.addRow(objects);				 
			   }
			  table.setModel(model);
	    }
		    catch(SQLException e){}
		    catch(ClassNotFoundException e){}
		
	 }
	 if(ae.getSource()==btnBack)
	 {
	 DefaultTableModel model=(DefaultTableModel)table.getModel();
	 int rows=model.getRowCount();
	if (rows>0){
	for(int j=0; j<rows; j++){
	model.removeRow(0);
	}
	}
	}
			 
		
  }	
   public void focusGained(FocusEvent e)
   {
     
	 if(e.getSource()==txt2)
	{
     txt2.setBorder(border);
	}
	
   }
   public void focusLost(FocusEvent e)
   {
      if(e.getSource()==txt2)
	 {
       txt2.setBorder(border1);
	 }
   
   }
  
   public void mouseClicked(MouseEvent me)
   
   {
    if(me.getSource()==btnBook)
	{
	 panel1.setVisible(true);
	}
	if(me.getSource()==btnHome)
	{
	 this.dispose();
	 new HomePage().setVisible(true);
	}
	if(me.getSource()==btnView)
	{
	 new LibrarianTable().setVisible(true);
	}
	if(me.getSource()==btnService)
	{
	 new Service().setVisible(true);
	}
	if(me.getSource()==btnAbout)
	{
	 new About().setVisible(true);
	}
	if(me.getSource()==btnLogout)
	{
	 this.dispose();
	 new Logout().setVisible(true);
	}
	 if(me.getSource()==btn1)
	{
	 
	 new AddBook().setVisible(true);
	}
	if(me.getSource()==btn2)
	{
	 new BookTable().setVisible(true);
	}
	if(me.getSource()==btn3)
	{
	 new IssueBook().setVisible(true);
	}
	if(me.getSource()==btn4)
	{
	 new ReturnBookT().setVisible(true);
	}
	if(me.getSource()==btn5)
	{
	 new ReturnBookTable().setVisible(true);
	}
   }
   public void mousePressed(MouseEvent me)
   {
        if(me.getSource()==btnSearch)
        {
		btnSearch.setBackground(Color.gray);
		}
		if(me.getSource()==btnBack)
		{
		btnBack.setBackground(Color.gray);
		}
   }
   public void mouseReleased(MouseEvent e)
   {
    if(e.getSource()==btnBook)
	{
	 panel1.setVisible(false);
	}
   }
   public void mouseEntered(MouseEvent e)
	{
		
		if(e.getSource()==btnHome)
		{
		btnHome.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn1)
		{
		btn1.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn3)
		{
		btn3.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btn4)
		{
		btn4.setForeground(new Color(0,139,139));
		}
	}
	public void mouseExited(MouseEvent e)
	{
		if(e.getSource()==btnSearch)
		{
		btnSearch.setBackground(col1);
		}
		if(e.getSource()==btnBack)
		{
		btnBack.setBackground(col1);
		}
		
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col2);
		}
		if(e.getSource()==btnBook)
		{
			btnBook.setForeground(col2);
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(col2);
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(col2);
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(col2);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col2);
		}
		if(e.getSource()==btn1)
		{
		btn1.setForeground(col2);
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(col2);
		}
		if(e.getSource()==btn3)
		{
		btn3.setForeground(col2);
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(col2);
		}
		if(e.getSource()==btn4)
		{
		btn4.setForeground(col2);
		}
        		
     }
        public static void main(String args[])
        {
              new  SearchBook();
				                
        }
}
