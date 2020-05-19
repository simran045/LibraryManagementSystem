import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.*;
import java.sql.*;
import java.util.ArrayList;

public class Books extends JFrame implements  MouseListener ,FocusListener , ActionListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 Color col1,col;
	 
   JPanel p2=new JPanel();
   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   JPanel p8=new JPanel();
   JPanel p3=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,135,null);
		}
	};
	
   JPanel p4=new JPanel();
  /* {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};*/
	    Border border1;
	    Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
	    JButton b= new JButton("..");
	 	Connection con;
		String colHead[];
		PreparedStatement pst;
		ResultSet rst;
		  
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}	
	}  
     //defining components
	 
	      JLabel lbl=new JLabel("BOOK DETAILS");
          JLabel l1=new JLabel("Accession Number:");
	      JLabel l2=new JLabel("Book Title:");
		  JLabel l3=new JLabel("Author(s:)");
		  JLabel l4=new JLabel("Edition/Year:");
		  JLabel l5=new JLabel("Publisher:");
		  JLabel l6=new JLabel("Place of Publisher:");
		  JLabel l7=new JLabel("Entry Date :");
		  JLabel l8=new JLabel("Price:");
		  JLabel l9=new JLabel("Pages");
		  JLabel l10=new JLabel("ISBN Number:");
		  JLabel l11=new JLabel("Subject:");
		  JLabel l12=new JLabel("Quantity :");
		  JLabel l13=new JLabel("Language:");
		 
		  JTextField t1=new JTextField(100);
		  JTextField t2=new JTextField(100);
		  JTextField t3=new JTextField(100);
		  JTextField t4=new JTextField(100);
		  JTextField t5=new JTextField(100);
		  JTextField t6=new JTextField(100);
		  JTextField t7=new JTextField(100);
		  JTextField  t8=new JTextField(100);
		  JTextField  t9=new JTextField(100);
		  JComboBox  cb=new JComboBox(); 
		  JTextField  t10=new JTextField(100);
		  JTextField  t11=new JTextField(100);
		  JTextField t12=new JTextField(100);

	       
	  	   JButton btnHome=new JButton("HOME");
           JButton btnLibrarian=new JButton("LIBRARIANS");
           JButton btnViewP=new JButton("SERVICES");
           JButton btnEditP=new JButton("ABOUT US");
           JButton btnBook=new JButton("BOOK SECTION");
           JButton btnLogout=new JButton("LOGOUT");
		   JButton btnAdd=new JButton("ADD");
		   JButton btnEdit=new JButton("UPDATE");
		   JButton btnExit=new JButton("CLOSE");
		   JButton btn1=new JButton("ADD BOOK");
		   JButton btn2=new JButton("VIEW BOOKS");
		   JButton btn3=new JButton("ISSUE BOOK");
		   JButton btn4=new JButton("VIEW ISSUED BOOK");
		   JButton btn5=new JButton("RETURN BOOK");
		   
      Books()
     {
	  
		super("Add/Update Book");
		 
        t=Toolkit.getDefaultToolkit();
        d=t.getScreenSize();
        h=(int)d.getHeight();
        w=(int)d.getWidth(); 
  
        col1 = btnHome.getForeground();
  
		setVisible(true);
		setSize(w,h);
		
		p1.setBackground(new Color(0,139,139));
		add(p1);
		p1.setLayout(null);
		p2.setBounds(70,10,1247,465);
		p8.setBounds(0,220,w,h-220);
		p8.setBackground(new Color(0,139,139));
		p1.add(p8);
		p8.setLayout(null);
	    p2.setBorder(BorderFactory.createLineBorder(Color.black));
		p2.setBackground(Color.white);
		p2.setPreferredSize( new Dimension(1240,470));
		p8.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p2.setLayout(null);
		p3.setBackground(new Color(255,255,255));
		p3.setBounds(0,0,w,125);
		p5.setBounds(0,125,w,90);
		p5.setBackground(new Color(175,238,238));
		p5.setLayout(null);
		p4.setLayout(null);
		
	    lbl.setBounds(590,25,600,26);
	    lbl.setFont(new Font("Arial",Font.BOLD,20));
			
	    l1.setBounds(40,85,150,25);
	    t1.setBounds(260,85,170,25);
		b.setBounds(480,85,15,25);
	    l2.setBounds(40,130,150,25);
	    t2.setBounds(260,130,170,25);
		l3.setBounds(40,168,150,25);
	    t3.setBounds(260,168,170,25);
		l4.setBounds(40,210,150,25);
	    t4.setBounds(260,210,170,25);
		l5.setBounds(40,250,170,25);
		t5.setBounds(260,250,170,25);
        l6.setBounds(40,283,150,30);
		t6.setBounds(260,283,170,25);
		l7.setBounds(750,85,150,30);
		t7.setBounds(890,85,170,25);
        l8.setBounds(40,325,150,30);
		t8.setBounds(260,325,170,25);
		l9.setBounds(750,130,150,30);
		t9.setBounds(890,130,170,25);
		l10.setBounds(750,168,150,30);
		t10.setBounds(890,168,170,25);
		l11.setBounds(750,220,150,30);
		 cb.addItem("Computer");
		 cb.addItem("it");
		 cb.addItem("Electronic"); 
		cb.setBounds(890,220,170,25);
		l12.setBounds(750,270,150,30);
		t11.setBounds(890,270,170,25);
		l13.setBounds(750,320,150,30);
		t12.setBounds(890,320,170,25);

		 border1=t1.getBorder();
	
		
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
		 p5.add(la1);
		 p5.add(la2);
		 p5.add(la3);
	
		 btnAdd.setBounds(350,390,120,30);
		 p2.add(btnAdd);
		 btnAdd.setBackground(new Color(135,206,250));
		 btnAdd.setFocusPainted(false);
		 
		 btnEdit.setBounds(528,390,120,30);
		 p2.add(btnEdit);
		 btnEdit.setBackground(new Color(135,206,250));
		 btnEdit.setFocusPainted(false);
		 btnExit.setBounds(700,390,120,30);
		 p2.add(btnExit);
		 btnExit.setBackground(new Color(135,206,250));
		 btnExit.setFocusPainted(false);
		 col=btnAdd.getBackground();
		 col1=btnHome.getForeground();
		 btnHome.setForeground(Color.black);
	     btnHome.setBounds(370,40,100,25);
	     btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnHome.setBorderPainted(false);
	     btnHome.setContentAreaFilled(false);
	     btnHome.setFocusPainted(false);
		 Font btnFont =new Font("Arial", Font.PLAIN,18);
		 btnHome.setFont(btnFont);
		  p5.add(btnHome);
	     btnLibrarian.setForeground(Color.black);
	     btnLibrarian.setBounds(660,40,150,25);
	     btnLibrarian.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnLibrarian.setBorderPainted(false);
	     btnLibrarian.setContentAreaFilled(false);
	     btnLibrarian.setFocusPainted(false);
		 btnLibrarian.setFont(btnFont);
		 p5.add(btnLibrarian);
	     btnViewP.setForeground(Color.black);
	     btnViewP.setBounds(490,40,150,25);
	     btnViewP.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnViewP.setBorderPainted(false);
	     btnViewP.setContentAreaFilled(false);
	     btnViewP.setFocusPainted(false);
	  
		 btnViewP.setFont(btnFont);
		 p5.add(btnViewP);
		
	     btnEditP.setForeground(Color.black);
	     btnEditP.setBounds(830,40,180,25);
	     btnEditP.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnEditP.setBorderPainted(false);
	     btnEditP.setContentAreaFilled(false);
	     btnEditP.setFocusPainted(false);
	  
		 btnEditP.setFont(btnFont);
		 p5.add(btnEditP);
		
	     btnBook.setForeground(Color.black);
	     btnBook.setBounds(1040,40,170,25);
	     btnBook.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnBook.setBorderPainted(false);
	     btnBook.setContentAreaFilled(false);
	     btnBook.setFocusPainted(false);
	   
		 btnBook.setFont(btnFont);
		 p5.add(btnBook);
		
	     btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1240,40,130,30);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     //btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
	   
		 btnLogout.setFont(btnFont);
		 p5.add(btnLogout);

		 
		 Font btnFont2 =new Font("Arial", Font.PLAIN,16);

	    p8.add(panel1);
	   panel1.setLayout(new GridLayout(5,0));
	   panel1.setBackground(new Color(255,255,255));
	  
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
	   
	   btn5.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn5.setBorderPainted(false);
	   btn5.setContentAreaFilled(false);
	   btn5.setFocusPainted(false);
	   btn5.setFont(btnFont2);
	 
	  
	   btn4.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   btn4.setBorderPainted(false);
	   btn4.setContentAreaFilled(false);
	   btn4.setFocusPainted(false);
	   btn4.setFont(btnFont2);
	   
	   b.setBorderPainted(false);
	   b.setContentAreaFilled(false);
	   
	   panel1.add(btn1);
	   panel1.add(btn2);
	   panel1.add(btn3);
	   panel2.add(btn5);
      
	   panel1.setVisible(false);
	   panel2.setVisible(false);
	   panel1.setBounds(1040,0,200,100);
	
		
       p2.add(lbl);
	   p2.add(l1);
	   p2.add(t1);
	   p2.add(b);
	   p2.add(l2);
	   p2.add(t2);
	   p2.add(l3);
	   p2.add(t3);
	   p2.add(l4);
	   p2.add(t4);
	   p2.add(l5);
	   p2.add(t5);
	   p2.add(l6);
	   p2.add(t6);
	   p2.add(l7);
	   p2.add(t7);
	   p2.add(l8);
	   p2.add(t8);
	   p2.add(l9);
	   p2.add(t9);
	   p2.add(l10);
	   p2.add(t10);
	   p2.add(l11);
	   p2.add(cb);
	   p2.add(l12);
	   p2.add(t11);
	   p2.add(l13);
	   p2.add(t12);
	   btnEdit.setEnabled(false);
	  
		 
	   setResizable(false);
	   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 
        btnHome.addMouseListener(this);
		btnLibrarian.addMouseListener(this);
		btnViewP.addMouseListener(this);
		btnEditP.addMouseListener(this);
		btnBook.addMouseListener(this);
		btnLogout.addMouseListener(this);
		b.addMouseListener(this);
		
		
		btnAdd.addActionListener(this);
		btnEdit.addActionListener(this);
		btnExit.addActionListener(this);
		b.addActionListener(this);

		
		//adding focus listener to textfields
	    t1.addFocusListener(this);
		t2.addFocusListener(this);
		t3.addFocusListener(this);
		t4.addFocusListener(this);
		t5.addFocusListener(this);
		t6.addFocusListener(this);
		t7.addFocusListener(this);
		t8.addFocusListener(this);
		t9.addFocusListener(this);
		t10.addFocusListener(this);
		t11.addFocusListener(this);
		t12.addFocusListener(this);
	  
  }
  
  
     public void focusGained(FocusEvent e)
   {
	 if(e.getSource()==t2)
	{
     t2.setBorder(border);	 //(238,232,170)
	}
	if(e.getSource()==t1)
	{
     t1.setBorder(border);
	} 
	if(e.getSource()==t3)
	{
     t3.setBorder(border);
	} 
	if(e.getSource()==t4)
	{
     t4.setBorder(border);   
    }
	if(e.getSource()==t5)
	{
     t5.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==t6)
	{
     t6.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==t7)
	{
     t7.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==t8)
	{
     t8.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==t9)
	{
     t9.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==t10)
	{
     t10.setBorder(border);   
    }
	if(e.getSource()==t11)
	{
     t11.setBackground(new Color(240,230,140));   
    }
}
   public void focusLost(FocusEvent e)
   
   {
    if(e.getSource()==t1)
	{
	 t1.setBorder(border1);
     t1.setBackground(new Color(240,230,140));
	}
	if(e.getSource()==t4)
	{
     t4.setBorder(border1);   
    }
	if(e.getSource()==t5)
	{
     t5.setBorder(border1);   
    }
	if(e.getSource()==t12)
	{
     t12.setBorder(border1);   
    }
	if(e.getSource()==t11)
	{
     t11.setBorder(border1);   
    }
	if(e.getSource()==t6)
	{
     t6.setBorder(border1);   
    }
	if(e.getSource()==t7)
	{
     t7.setBorder(border1);
	} 
	if(e.getSource()==t8)
	{
     t8.setBorder(border1);
	} 
	if(e.getSource()==t10)
	{
     t10.setBorder(border1);   
    }
	
   }
  
   public void mouseClicked(MouseEvent e)
   {
       
		if(e.getSource()==btnAdd)
		{
		btnAdd.setBackground(Color.gray);
		}
		if(e.getSource()==btnEdit)
		{
		btnEdit.setBackground(Color.gray);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(Color.gray);
		} 
   
   }
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
   public void mouseEntered(MouseEvent e)
	{
		
		if(e.getSource()==btnHome)
		{
		btnHome.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnViewP)
		{
		btnViewP.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnEditP)
		{
		btnEditP.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(new Color(0,139,139));
		}
	}
	public void mouseExited(MouseEvent e)
	{
		if(e.getSource()==btnAdd)
		{
			btnAdd.setBackground(col);
		}
		if(e.getSource()==btnEdit)
		{
		btnEdit.setBackground(col);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(col);
		}
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col1);
		}
		if(e.getSource()==btnLibrarian)
		{
			btnLibrarian.setForeground(col1);
		}
		if(e.getSource()==btnViewP)
		{
		btnViewP.setForeground(col1);
		}
		if(e.getSource()==btnEditP)
		{
		btnEditP.setForeground(col1);
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(col1);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col1);
		}
	}
  
   public void actionPerformed(ActionEvent e)
	{
	          if(e.getSource()== b)
	      {		 
			 btnAdd.setEnabled(false);
			try
			{
				pst=con.prepareStatement("Select * from book_info where accession=?");
				pst.setString(1,t1.getText());
				ResultSet rst=pst.executeQuery();
				if(rst.next())
				{
				
                t1.setText(rst.getString("accession"));
				t2.setText(rst.getString("bk_title"));
				t3.setText(rst.getString("bk_author"));
				t4.setText(rst.getString("bk_edition"));
				t5.setText(rst.getString("publisher"));
				t6.setText(rst.getString("publisher_place"));
				t7.setText(rst.getString("entry_date"));
				t8.setText(rst.getString("bk_price"));
				t9.setText(rst.getString("bk_pages"));    
			    cb.setSelectedItem(rst.getString("subject"));
				t10.setText(rst.getString("bk_isbn"));
				t11.setText(rst.getString("quantity"));
				t12.setText(rst.getString("language"));
				btnEdit.setEnabled(true);
					
				}
				else
				{
				    btnEdit.setEnabled(false);
					JOptionPane.showMessageDialog(null,"Book With this Accession Number Not Found");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
	
		if(e.getSource()==btnAdd)
		{
			try
			{

				
				pst=con.prepareStatement("insert into book_info values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1,t1.getText());
				pst.setString(2,t2.getText());
				pst.setString(3,t3.getText());
				pst.setString(4,t4.getText());
				pst.setString(5,t5.getText());
				pst.setString(6,t6.getText());
				pst.setString(7,t7.getText());
				pst.setString(8,t8.getText());
				pst.setString(9,t9.getText());
				pst.setString(10,cb.getSelectedItem().toString());
				pst.setString(11,t10.getText());
				pst.setString(12,t11.getText());
				pst.setString(13,t12.getText());
				
				if(t1.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Accession Number","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(t2.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Name of Book","registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(t3.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Author Name","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(t4.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter author name","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(t7.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"Entry date field is empty","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(t11.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter quantity of Books ","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(cb.getSelectedItem().equals("------------------Subject------------------------------"))
				{
				       JOptionPane.showMessageDialog(this,"please select subject","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(pst.executeUpdate()>0)
				{
				     //new AddedBook().setVisible(true);
					JOptionPane.showMessageDialog(null,"Book Saved Successfully");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					//t10.setText("");
					//t11.setText("");
					//t12.setText("");
					t8.setText("");
					t9.setText("");
					t10.setText("");
					cb.setSelectedIndex(0);
					t11.setText("");
					t12.setText("");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
		}
		else if(e.getSource()==btnEdit)
		{
			try
			{	
				pst=con.prepareStatement("update book_info set bk_title=?,bk_author=?, bk_edition=?,publisher=?,publisher_place=?,entry_date=?, bk_price=?,bk_pages=?,subject=?,bk_isbn=?,quantity=?,language=? where accession=?");
	            pst.setString(1,t2.getText());
				pst.setString(2,t3.getText());
				pst.setString(3,t4.getText());
				pst.setString(4,t5.getText());
				pst.setString(5,t6.getText());
				pst.setString(6,t7.getText());
				pst.setString(7,t8.getText());
				pst.setString(8,t9.getText());
				pst.setString(9,t10.getText());
				pst.setString(10,cb.getSelectedItem().toString());
				pst.setString(11,t11.getText());
				pst.setString(12,t12.getText());
				pst.setString(13,t1.getText());
				
				if(pst.executeUpdate()>0)
				{
					JOptionPane.showMessageDialog(null,"Book Updated");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
					t9.setText("");
					t10.setText("");
					cb.setSelectedIndex(0);
					t11.setText("");
					t12.setText("");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		
         else if(e.getSource()==btnExit)
		{
		  this.dispose();
	    }
  }
  public static void main(String []args)
  {
   new Books();
  }
}
