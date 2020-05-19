import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.*;
import java.sql.*;
import java.util.ArrayList;

public class Book1 extends JFrame implements  MouseListener ,FocusListener , ActionListener
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
	 
	      JLabel lbl=new JLabel("ADD BOOK");
	  
          JLabel l1=new JLabel("Accession Number:");
	      JLabel l2=new JLabel("Book Title:");
		  JTextField txt2=new JTextField(10);
		  JLabel l3=new JLabel("Author(s:)");
		  JTextField txt3=new JTextField(100);
		  JLabel l5=new JLabel("Edition/Year:");
		  JTextField txt5=new JTextField(10);
		  JLabel l6=new JLabel("Publisher:");
		  JTextField txt6=new JTextField(10);
		  JLabel l7=new JLabel("Place of Publisher:");
		  JTextField txt7=new JTextField(10);
		  JLabel l8=new JLabel("Language:");
		  JTextField txt8=new JTextField(10);
		  JLabel l14=new JLabel("Entry Date :");
		  JTextField txt13=new JTextField("dd-mmm-yyyy");
		  JLabel l15=new JLabel("Price :");
		  JComboBox  cb=new JComboBox(); 
		  JLabel  l18=new JLabel("ISBN Number :");
		  JLabel  l16=new JLabel("Pages :");
		  JTextField  txt14=new JTextField(10);
		  JTextField  txt15=new JTextField(10);
		  JLabel l17=new JLabel("Subject :");
		  JTextField  txt16=new JTextField(15);
		  JLabel l19=new JLabel("Quantity :");
		  JTextField  txt17=new JTextField(10);
		  JTextField txt1=new JTextField(10);

	       
	  	   JButton btnHome=new JButton("HOME");
           JButton btnLibrarian=new JButton("LIBRARIANS");
           JButton btnViewP=new JButton("SERVICES");
           JButton btnEditP=new JButton("ABOUT US");
           JButton btnBook=new JButton("BOOK SECTION");
           JButton btnLogout=new JButton("LOGOUT");
		   JButton btnAdd=new JButton("ADD");
		   JButton btnEdit=new JButton("UPDATE");
		   JButton btnSearch=new JButton("SEARCH");
		   JButton btnExit=new JButton("CLOSE");
		   JButton btnDel=new JButton("DELETE");
		   JButton btnNext=new JButton("NEXT");
		   JButton btnPrev=new JButton("PREVIOUS");
		   JButton btn1=new JButton("ADD BOOK");
		   JButton btn2=new JButton("VIEW BOOKS");
		   JButton btn3=new JButton("ISSUE BOOK");
		   JButton btn4=new JButton("VIEW ISSUED BOOK");
		   JButton btn5=new JButton("RETURN BOOK");
		   
      Book1()
     {
	  
		super("LIBRARY MANAGMENT SYSTEM ");
		 
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
	    txt1.setBounds(260,85,170,25);
		b.setBounds(480,85,15,25);
	    l2.setBounds(40,130,150,25);
	    txt2.setBounds(260,130,170,25);
		l3.setBounds(40,168,150,25);
	    txt3.setBounds(260,168,170,25);
		l5.setBounds(40,210,150,25);
	    txt5.setBounds(260,210,170,25);
		l6.setBounds(40,250,170,25);
		txt6.setBounds(260,250,170,25);
        l7.setBounds(40,283,150,30);
		txt7.setBounds(260,283,170,25);
		l8.setBounds(750,85,150,30);
		txt8.setBounds(890,85,170,25);
        l18.setBounds(750,130,150,30);
		txt17.setBounds(890,130,170,25);
		l15.setBounds(750,168,150,30);
		txt14.setBounds(890,168,170,25);
		l16.setBounds(750,220,150,30);
		txt15.setBounds(890,220,170,25);
		l17.setBounds(750,270,150,30);
		 cb.addItem("Computer");
		 cb.addItem("it");
		 cb.addItem("Electronic"); 
		cb.setBounds(890,270,170,25);
		l19.setBounds(750,320,150,30);
		txt16.setBounds(890,320,170,25);
		l14.setBounds(40,325,150,30);
		txt13.setBounds(260,325,170,25);

		 border1=txt1.getBorder();
	
		
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
	
		btnPrev.setBounds(70,390,120,30);
		 p2.add(btnPrev);
		 btnPrev.setBackground(new Color(135,206,250));
		 btnPrev.setFocusPainted(false);
		 
		 btnAdd.setBounds(230,390,120,30);
		 p2.add(btnAdd);
		 btnAdd.setBackground(new Color(135,206,250));
		 btnAdd.setFocusPainted(false);
		 
		 btnEdit.setBounds(385,390,120,30);
		 p2.add(btnEdit);
		 btnEdit.setBackground(new Color(135,206,250));
		 btnEdit.setFocusPainted(false);
		 
		 btnSearch.setBounds(540,390,120,30);
		 p2.add(btnSearch);
		 btnSearch.setBackground(new Color(135,206,250));
		 btnSearch.setFocusPainted(false);
		 
		 btnExit.setBounds(700,390,120,30);
		 p2.add(btnExit);
		 btnExit.setBackground(new Color(135,206,250));
		 btnExit.setFocusPainted(false);
		 
		 btnDel.setBounds(870,390,120,30);
		 p2.add(btnDel);
		 btnDel.setBackground(new Color(135,206,250));
		 btnDel.setFocusPainted(false);
		  
		 btnNext.setBounds(1040,390,120,30);
		 p2.add(btnNext);
		 btnNext.setBackground(new Color(135,206,250));
         btnNext.setFocusPainted(false);		 
		  
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

		 btnDel.setEnabled(false);
		
       p2.add(lbl);
	   p2.add(l1);
	   p2.add(txt1);
	   p2.add(b);
	   p2.add(l2);
	   p2.add(txt2);
	   p2.add(l3);
	   p2.add(txt3);
	   p2.add(l5);
	   p2.add(txt5);
	   p2.add(l6);
	   p2.add(txt6);
	   p2.add(l7);
	   p2.add(txt7);
	   p2.add(l8);
	   p2.add(txt8);
	   p2.add(l14);
	   p2.add(txt13);
	   p2.add(l15);
	   p2.add(txt14);
	   p2.add(l16);
	   p2.add(txt15);
	   p2.add(l17);
	   p2.add(cb);
	   p2.add(l18);
	   p2.add(txt16);
	   p2.add(l19);
	   p2.add(txt17);
	   
		 
	   setResizable(false);
	   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 
        btnHome.addMouseListener(this);
		btnLibrarian.addMouseListener(this);
		btnViewP.addMouseListener(this);
		btnEditP.addMouseListener(this);
		btnBook.addMouseListener(this);
		btnLogout.addMouseListener(this);
		
		btnNext.addActionListener(this);
		btnPrev.addActionListener(this);
		btnAdd.addActionListener(this);
		btnEdit.addActionListener(this);
		btnSearch.addActionListener(this);
		btnExit.addActionListener(this);
		btnDel.addActionListener(this);
		b.addActionListener(this);

		
		//adding focus listener to textfields
	    txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);
		txt5.addFocusListener(this);
		txt6.addFocusListener(this);
		txt7.addFocusListener(this);
		txt8.addFocusListener(this);
		txt13.addFocusListener(this);
		txt14.addFocusListener(this);
		txt15.addFocusListener(this);
		txt16.addFocusListener(this);
		txt17.addFocusListener(this);
	  
  }
  
  
     public void focusGained(FocusEvent e)
   {
	 if(e.getSource()==txt2)
	{
     txt2.setBorder(border);	 //(238,232,170)
	}
	if(e.getSource()==txt1)
	{
     txt1.setBorder(border);
	} 
	if(e.getSource()==txt3)
	{
     txt3.setBorder(border);
	} 
	if(e.getSource()==txt5)
	{
     txt5.setBorder(border);   
    }
	if(e.getSource()==txt6)
	{
     txt6.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt7)
	{
     txt7.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt13)
	{
     txt13.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt14)
	{
     txt14.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt15)
	{
     txt15.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt16)
	{
     txt16.setBorder(border);   
    }
	if(e.getSource()==txt17)
	{
     txt17.setBackground(new Color(240,230,140));   
    }
}
   public void focusLost(FocusEvent e)
   
   {
    if(e.getSource()==txt1)
	{
	 txt1.setBorder(border1);
     txt1.setBackground(new Color(240,230,140));
	}
	if(e.getSource()==txt5)
	{
     txt5.setBorder(border1);   
    }
	if(e.getSource()==txt13)
	{
     txt13.setBorder(border1);   
    }
	if(e.getSource()==txt14)
	{
     txt14.setBorder(border1);   
    }
	if(e.getSource()==txt15)
	{
     txt15.setBorder(border1);   
    }
	if(e.getSource()==txt16)
	{
     txt16.setBorder(border1);   
    }
	if(e.getSource()==txt2)
	{
     txt2.setBorder(border1);
	} 
	if(e.getSource()==txt3)
	{
     txt3.setBorder(border1);
	} 
	if(e.getSource()==txt5)
	{
     txt5.setBorder(border1);   
    }
	
   }
  
   public void mouseClicked(MouseEvent e)
   {
       
	  if(e.getSource()==btnPrev)
		{
		btnPrev.setBackground(Color.gray);
		}
		if(e.getSource()==btnAdd)
		{
		btnAdd.setBackground(Color.gray);
		}
		if(e.getSource()==btnEdit)
		{
		btnEdit.setBackground(Color.gray);
		}
		if(e.getSource()==btnSearch)
		{
		btnSearch.setBackground(Color.gray);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(Color.gray);
		}
		if(e.getSource()==btnDel)
		{
		btnDel.setBackground(Color.gray);
		}
		if(e.getSource()==btnNext)
		{
		btnNext.setBackground(Color.gray);
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
		if(e.getSource()==btnPrev)
		{
			btnPrev.setBackground(col);
		}
		if(e.getSource()==btnAdd)
		{
			btnAdd.setBackground(col);
		}
		if(e.getSource()==btnEdit)
		{
		btnEdit.setBackground(col);
		}
		if(e.getSource()==btnSearch)
		{
		btnSearch.setBackground(col);
		}
		if(e.getSource()==btnExit)
		{
		btnExit.setBackground(col);
		}
		if(e.getSource()==btnDel)
		{
		btnDel.setBackground(col);
		}
		if(e.getSource()==btnNext)
		{
		btnNext.setBackground(col);
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
	   
			try
			{
				pst=con.prepareStatement("Select * from book_info where accession=?");
				pst.setString(1,txt1.getText());
				ResultSet rst=pst.executeQuery();
				if(rst.next())
				{
                txt1.setText(rst.getString("accession"));
				txt2.setText(rst.getString("bk_title"));
				txt3.setText(rst.getString("bk_author"));
				txt5.setText(rst.getString("bk_edition"));
				txt6.setText(rst.getString("publisher"));
				txt7.setText(rst.getString("publisher_place"));
				txt8.setText(rst.getString("entry_date"));
				txt13.setText(rst.getString("bk_price"));
				txt14.setText(rst.getString("bk_price"));
				txt15.setText(rst.getString("bk_pages"));
			    cb.setSelectedItem(rst.getString("subject"));
				txt16.setText(rst.getString("bk_isbn"));
				txt17.setText(rst.getString("language"));
					
				}
				else
				{
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
				pst.setString(1,txt1.getText());
				pst.setString(2,txt2.getText());
				pst.setString(3,txt3.getText());
				pst.setString(4,txt5.getText());
				pst.setString(5,txt6.getText());
				pst.setString(6,txt7.getText());
				pst.setString(7,txt8.getText());
				pst.setString(8,txt13.getText());
				pst.setString(9,txt14.getText());
				pst.setString(10,cb.getSelectedItem().toString());
				pst.setString(11,txt15.getText());
				pst.setString(12, txt16.getText());
				pst.setString(13,txt17.getText());
				
				if(txt1.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Accession Number","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt2.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Name of Book","registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt3.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter Author Name","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt5.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter author name","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt13.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"Entry date field is empty","Registration Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(txt17.getText().isEmpty())
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
					JOptionPane.showMessageDialog(null,"Data Saved Successfully");
					txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					txt5.setText("");
					txt6.setText("");
					txt7.setText("");
					txt8.setText("");
					//txt10.setText("");
					//txt11.setText("");
					//txt12.setText("");
					txt13.setText("");
					txt14.setText("");
					txt15.setText("");
					cb.setSelectedIndex(0);
					txt16.setText("");
					txt17.setText("");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
		}
		else if(e.getSource()==btnEdit)
		{
			try
			{	
				pst=con.prepareStatement("update book_info set bk_title=?,bk_author=?, bk_edition=?,publisher=?,publisher_place=?,entry_date=?, bk_price=?,bk_pages=?,subject=?,bk_isbn=?,quantity=?,language=? where accession=?");
	            pst.setString(1,txt2.getText());
				pst.setString(2,txt3.getText());
				pst.setString(3,txt5.getText());
				pst.setString(4,txt6.getText());
				pst.setString(5,txt7.getText());
				pst.setString(6,txt8.getText());
				pst.setString(7,txt13.getText());
				pst.setString(8,txt14.getText());
				pst.setString(9,txt15.getText());
				pst.setString(10,cb.getSelectedItem().toString());
				pst.setString(11,txt16.getText());
				pst.setString(12,txt17.getText());
				pst.setString(13,txt1.getText());
				
				if(pst.executeUpdate()>0)
				{
					JOptionPane.showMessageDialog(null,"Data Updated");
					txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					txt5.setText("");
					txt6.setText("");
					txt7.setText("");
					txt8.setText("");
					txt13.setText("");
					txt14.setText("");
					txt15.setText("");
					cb.setSelectedIndex(0);
					txt16.setText("");
					txt17.setText("");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		else if(e.getSource()==btnPrev)
		{
				int a = Integer.parseInt(txt1.getText());
				a--;
				try
				{
				    pst=con.prepareStatement("select * from book_info where accession="+a);
				    rst = pst.executeQuery();
                    while(rst.next())
				    {		
					txt1.setText(rst.getString("accession"));
					txt2.setText(rst.getString("bk_title"));
					txt3.setText(rst.getString("bk_author"));
					txt5.setText(rst.getString("bk_edition"));
					txt6.setText(rst.getString("publisher"));
					txt7.setText(rst.getString("publisher_place"));
					txt8.setText(rst.getString("language"));
					txt13.setText(rst.getString("entry_date"));
					txt14.setText(rst.getString("bk_price"));
					txt15.setText(rst.getString("bk_pages"));
					cb.setSelectedItem(rst.getString("subject"));
					txt16.setText(rst.getString("bk_isbn"));
					txt17.setText(rst.getString("quantity"));
			      }
				}
				catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
	    else if(e.getSource()==btnNext)
		{
				int a = Integer.parseInt(txt1.getText());
				a++;
				try
				{
				    pst=con.prepareStatement("select * from book_info where accession="+a);
				    rst = pst.executeQuery();
                    while(rst.next())
				    {		
					txt1.setText(rst.getString("accession"));
					txt2.setText(rst.getString("bk_title"));
					txt3.setText(rst.getString("bk_author"));
					txt5.setText(rst.getString("bk_edition"));
					txt6.setText(rst.getString("publisher"));
					txt7.setText(rst.getString("publisher_place"));
					txt8.setText(rst.getString("language"));
					txt13.setText(rst.getString("entry_date"));
					txt14.setText(rst.getString("bk_price"));
					txt15.setText(rst.getString("bk_pages"));
					cb.setSelectedItem(rst.getString("subject"));
					txt16.setText(rst.getString("bk_isbn"));
					txt17.setText(rst.getString("quantity"));
			      }
				}
				catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		 }
         else if(e.getSource()==btnExit)
		{
		  this.dispose();
	    }
		else if(e.getSource()==btnSearch)
		{
		  new SearchBook().setVisible(true);
	    }
		else if(e.getSource()==btnDel)
		{
		    new DeleteBook().setVisible(true);
        }
		/*else if(e.getSource()==btnEdit)
		{
		    new BookUpdate().setVisible(true);
        }*/		 
  }
  public static void main(String []args)
  {
   new Book1();
  }
}
