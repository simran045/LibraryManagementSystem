import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JTextField.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


 public class ReturnBookT extends JFrame implements MouseListener, FocusListener, ActionListener
 {
    
            JPanel p1=new JPanel();
		    JPanel p5=new JPanel();
		    JPanel p2=new JPanel();
		    JPanel p6=new JPanel();
		    JPanel p7=new JPanel();
			JPanel p8=new JPanel();
		    JPanel panel1=new JPanel();
		   
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
			    g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
			 }
		   };
		   
		    Dimension dim;
		    int w,h;
		    Toolkit toolkit;
            JTable table=new JTable();
			JScrollPane jsp=new JScrollPane(table);
			DefaultTableModel dtm;
			int row;
			Connection con;
			String colHead[];
			PreparedStatement pst; 
     {
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			
		}
		catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
		catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,e);}
	 }			
		    Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
			Border border1;
		  
		   //defining components
		   JLabel l1=new JLabel("Accession Number:");
           JTextField txt1=new JTextField(10);
	       JLabel l2=new JLabel("Book Title:");
	       JTextField txt2=new JTextField(10);
	       JLabel l3=new JLabel("Member ID:");
		   JTextField txt3=new JTextField(50);
		   JLabel l4=new JLabel("Issue date:");
		   JTextField txt4=new JTextField(50);
		   JLabel l5=new JLabel("Due Date:");
		   JTextField txt5=new JTextField(10);
		   JLabel l6=new JLabel("Return Date:");
		   JTextField txt6=new JTextField(10);
		   JLabel l7=new JLabel("Fine(if any):");
		   JTextField txt7=new JTextField(10);
		  
	       // defining buttons
		  JButton btnReturn=new JButton("RETURN");
		  JButton btnExit=new JButton("CLOSE");
		  
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
		   JButton btnSearch=new JButton("...");
		  Color col,col1;
		  JLabel label=new JLabel("RETURN BOOK");
		
        public ReturnBookT()
        {
          super("Return Book");
		  toolkit=Toolkit.getDefaultToolkit();
		  dim=toolkit.getScreenSize();
		  w=(int)dim.getWidth();
		  h=(int)dim.getHeight();
		  
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

		  JLabel l=new JLabel(" Note: Please check book properly!");
		  l.setForeground(Color.red);
		  l.setBounds(180,395,450,30);
		  l.setFont(new Font("Arial", Font.PLAIN,18));
		  p2.add(l);
		  label.setBounds(230,10,200,18);
		  label.setFont(new Font("Arial", Font.BOLD,20));
		  p2.add(label);
          setVisible(true);		  
          setSize(w,h);
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		   p1.setBackground(new Color(100,149,237));
          add(p1);
          p1.setLayout(null);
		  p8.setLayout(null);
		  p8.add(p2);
		  p2.setBounds(700,20,610,450);//650,260,750,550  
		  p2.setBackground(Color.white);
		  p2.setPreferredSize(new Dimension(585,460));
		  p2.setBorder(BorderFactory.createLineBorder(Color.black));
		  p8.setBounds(0,225,w,h-225);//650,260,750,550
		  p8.setBackground(new Color(0,139,139));
		  p8.setPreferredSize(new Dimension(750,550));
		  p1.add(p3);
		  p1.add(p5);
		  p1.add(p8);
		  p2.setLayout(null);
		  p4.setBackground(new Color(255,255,255));
		  p3.setBounds(0,0,w,135);
		  p5.setBounds(0,135,w,90);
		  p5.setBackground(new Color(175,238,238));
		  p5.setLayout(null);
		  p4.setPreferredSize(new Dimension(600,300));
		  p4.setBounds(30,60,600,300);
		  p4.setLayout(null);
		  p8.add(p4);
		  Font btnFont2 =new Font("Arial", Font.PLAIN,14);
		  
          table.setRowHeight(35);
		  table.setPreferredScrollableViewportSize(new Dimension(660,160));
	      table.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());	
		 
		 l1.setBounds(50,60,150,30);
		 txt1.setBounds(220,60,100,30);
		 l2.setBounds(50,110,150,30);
		 txt2.setBounds(220,110,350,30);
		 l3.setBounds(390,60,150,30);
		 txt3.setBounds(490,60,100,30);
		 l4.setBounds(50,160,150,30);
		 txt4.setBounds(220,160,170,30);
		 l5.setBounds(50,210,150,30);
		 txt5.setBounds(220,210,170,30);
		 l6.setBounds(50,250,150,30);
		 txt6.setBounds(220,250,170,30);
		 l7.setBounds(50,300,150,30);
		 txt7.setBounds(220,300,170,30);
	
	     btnSearch.setBounds(350,60,20,30);
		 p2.add(btnSearch);
		 btnSearch.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnSearch.setBorderPainted(false);
	     btnSearch.setContentAreaFilled(false);
	     btnSearch.setFocusPainted(false);
		 
		 btnReturn.setBounds(160,335,120,30);
		 p2.add(btnReturn);
		 btnReturn.setBackground(new Color(135,206,250));
		 btnReturn.setFocusPainted(false);
		 
		 btnExit.setBounds(350,335,120,30);
		 p2.add(btnExit);
		 btnExit.setBackground(new Color(135,206,250));
		 btnExit.setFocusPainted(false);
		  
		 col=btnReturn.getBackground();
		 col1=btnHome.getForeground();
		 border1=txt1.getBorder();
		  
		 p2.add(l1);p2.add(txt1);p2.add(l2);p2.add(txt2);
		 p2.add(l3);p2.add(txt3);p2.add(l4);p2.add(txt4);
		 p2.add(l5);p2.add(txt5);p2.add(l6);p2.add(txt6);
		 p2.add(l7);p2.add(txt7);
		 
		 
	     btnHome.setForeground(Color.black);
	     btnHome.setBounds(370,40,100,25);
	     btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnHome.setBorderPainted(false);
	     btnHome.setContentAreaFilled(false);
	     btnHome.setFocusPainted(false);
		
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
		  p5.add(btnHome);
		  p5.add(la1);
		  p5.add(la2);
		  p5.add(la3);
		  
		 btnBook.setForeground(Color.black);
	     btnBook.setBounds(510,40,170,25);
	     btnBook.setBorder(BorderFactory.createLineBorder(Color.black));
	     //btnBook.setBorderPainted(false);
	     btnBook.setContentAreaFilled(false);
	     btnBook.setFocusPainted(false);
		 btnBook.setFont(btnFont);
		 p5.add(btnBook);
		 panel1.setBounds(505,0,200,100);
		 panel1.setVisible(false);
		 panel1.setBackground(new Color(255,255,255));
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
		// p5.add(btnLogout);
		 
		JButton btnNewButton2 = new JButton("...");
		//perform action listener
		btnNewButton2.addActionListener(new ActionListener() 
		{	
			//performed action
			public void actionPerformed(ActionEvent arg0) 
			{
				//create frame new object  f
				final JFrame f = new JFrame();
				//set text which is collected by date picker i.e. set date 
				txt5.setText(new DatePicker(f).setPickedDate());
			}
		});
		//set button bound
		btnNewButton2.setBounds(450,210,25,30);
		btnNewButton2.setBorderPainted(false);
	    btnNewButton2.setContentAreaFilled(false);
		p2.add(btnNewButton2);
		
		
		  // adding mouse listener to buttons
				
		btnReturn.addMouseListener(this);
		btnReturn.addActionListener(this);
		btnExit.addMouseListener(this);
		btnExit.addActionListener(this);

        btnHome.addMouseListener(this);
		btnBook.addMouseListener(this);
		btnView.addMouseListener(this);
		btnService.addMouseListener(this);
		btnView.addMouseListener(this);
		btnAbout.addMouseListener(this);
		btnLogout.addMouseListener(this);
        btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
		btn4.addMouseListener(this);
		btn5.addMouseListener(this);
		btnSearch.addActionListener(this);
		
		//adding focus listener to textfields
	    txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);
		txt4.addFocusListener(this);
		txt5.addFocusListener(this);
		txt6.addFocusListener(this);
		txt7.addFocusListener(this);
	
   }
   public void actionPerformed(ActionEvent ae)
   {
   
             if(ae.getSource()==btnSearch)
		{
			try
			{

				pst=con.prepareStatement("Select accession,mem_id,title,issue_date,return_date from issue_book where accession=?");
				pst.setString(1,txt1.getText());
				ResultSet rst=pst.executeQuery();
				if(rst.next())
				{
				txt1.setText(rst.getString("accession"));
				txt2.setText(rst.getString("title"));
	            txt3.setText(rst.getString("mem_id"));
				txt4.setText(rst.getString("issue_date"));
				txt6.setText(rst.getString("return_date"));
				}
				else
				JOptionPane.showMessageDialog(null,"Book with this Accession is not issued");
			
			}
				
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}	
	    
		}
   
			if(ae.getSource()==btnReturn)
		   {
		    
			try
			{
				
				pst=con.prepareStatement("insert into return_book values(?,?,?,?,?,?,?)");
			    pst.setString(1,txt1.getText());
				pst.setString(2,txt2.getText());
				pst.setString(3,txt3.getText());
				pst.setString(4,txt4.getText());
				pst.setString(5,txt5.getText());
				pst.setString(6,txt6.getText());
				pst.setString(7,txt7.getText());
				
				if(pst.executeUpdate()>0)
				{
				     
				     //new IssuedBook().setVisible(true);
					JOptionPane.showMessageDialog(null,"Book Returned Successfully");
				}
				
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
		}
	if(ae.getSource()==btnExit)
	{
	this.dispose();
	}
   }
   
   public void focusGained(FocusEvent e)
   {
     if(e.getSource()==txt1)
	{
     //txt1.setBackground(new Color(240,230,140));
	 txt1.setBorder(border);
	} 
	 if(e.getSource()==txt2)
	{
     txt2.setBackground(new Color(240,230,140));	 //(238,232,170)
	}
	 if(e.getSource()==txt3)
	{
     txt3.setBorder(border);   
    }
	if(e.getSource()==txt4)
	{
     txt4.setBackground(new Color(240,230,140)); 
	} 
	if(e.getSource()==txt5)
	{
     txt5.setBorder(border);    
    }
	if(e.getSource()==txt6)
	{
     txt6.setBorder(border);    
    }
	if(e.getSource()==txt7)
	{
     txt7.setBackground(new Color(240,230,140));   
    }
	
   }
   public void focusLost(FocusEvent e)
   {
     if(e.getSource()==txt1)
	{
	  txt1.setBorder(border1);
	} 
	
	 if(e.getSource()==txt3)
	{
	  txt3.setBorder(border1);
	}
	if(e.getSource()==txt5)
	{
	  txt5.setBorder(border1);
    }
	if(e.getSource()==txt6)
	{
	  txt6.setBorder(border1);
    }
   }
  
   public void mouseClicked(MouseEvent e)
   {
       if(e.getSource()==btnReturn)
		{
		btnReturn.setBackground(Color.gray);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(Color.gray);
		}
		if(e.getSource()==btn1)
		{ 
		
		 this.dispose();
         new AddBook().setVisible(true);
		}
		if(e.getSource()==btn2)
		{
		  this.dispose();
		  new BookTable().setVisible(true);
		}
		if(e.getSource()==btn3)
		{
		  this.dispose();
		  new IssueBook().setVisible(true);
		}
		  
		 if(e.getSource()==btn4)
		{
		  this.dispose();
		  new IssueBookTable().setVisible(true);
		  
		}
		if(e.getSource()==btn5)
		{
		  this.dispose();
		  new ReturnBookTable().setVisible(true);
		}
		if(e.getSource()==btnHome)
		{
		  this.dispose();
		  new HomePage().setVisible(true);
		}
		if(e.getSource()==btnService )
		{
		  this.dispose();
		  new Service().setVisible(true);
		}
		if(e.getSource()==btnView )
		{
		  this.dispose();
		  new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btnAbout )
		{
		 this.dispose();
		  new About().setVisible(true);
		}
		if(e.getSource()==btnLogout )
		{
		 this.dispose();
		  new Logout().setVisible(true);
		}
		if(e.getSource()==btnBook)
		{
		  panel1.setVisible(true);
		}
   
   }
   public void mousePressed(MouseEvent e){}
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
		if(e.getSource()==btnReturn)
		{
			btnReturn.setBackground(col);
		}
		if(e.getSource()==btnExit)
		{
			btnExit.setBackground(col);
		}
		
		
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col1);
		}
		if(e.getSource()==btnBook)
		{
			btnBook.setForeground(col1);
		}
		if(e.getSource()==btnService)
		{
		btnService.setForeground(col1);
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(col1);
		}
		if(e.getSource()==btnAbout)
		{
		btnAbout.setForeground(col1);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col1);
		}
		if(e.getSource()==btn1)
		{
		btn1.setForeground(col1);
		}
		if(e.getSource()==btn2)
		{
		btn2.setForeground(col1);
		}
		if(e.getSource()==btn3)
		{
		btn3.setForeground(col1);
		}
		if(e.getSource()==btn5)
		{
		btn5.setForeground(col1);
		}
		if(e.getSource()==btn4)
		{
		btn4.setForeground(col1);
		}
        		
     }
        public static void main(String args[])
        {
              new  ReturnBookT();
				                
        }
}
