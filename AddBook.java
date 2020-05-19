import java.awt.*;
import javax.swing.*;
import javax.swing.JTextField.*;
import javax.swing.JTextField.*;
import java.awt.event.*;
import java.sql.*;


 public class AddBook extends JFrame implements MouseListener, FocusListener,ActionListener
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
           JPanel p1=new JPanel();
		   JPanel p5=new JPanel();
		   JPanel p2=new JPanel();
		   JPanel p8=new JPanel();
		   JPanel p3=new JPanel()
		   {
		     public void paintComponent(Graphics g)
			 {
			    g.drawImage(new ImageIcon("nielit.jpg").getImage(),0,0,w,135,null);
			 }
		   };
		   
		   JPanel p4=new JPanel();
		   /*JPanel p4=new JPanel()
		   {
		     public void paintComponent(Graphics g)
			 {
			    g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
			 }
		   };*/
		   
		   Dimension dim;
		   int w,h;
		   Toolkit toolkit;
		   
		   
		   JButton btnHome=new JButton("HOME");
           JButton btnLibrarian=new JButton("LIBRARIANS");
           JButton btnViewP=new JButton("SERVICES");
           JButton btnEditP=new JButton("ABOUT US");
           JButton btnBook=new JButton("BOOK SECTION");
           JButton btnLogout=new JButton("LOGOUT");
          
		   //defining components
          
	      JLabel l1=new JLabel("Accession Number:");
	      JLabel l2=new JLabel("Book Title:");
		  JTextField txt2=new JTextField(10);
		  JLabel l3=new JLabel("Author(s:)");
		  JTextArea area=new JTextArea(200,80);
		  JScrollPane jsp=new JScrollPane(area);
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
		  JLabel l10=new JLabel("Supplier Id:");
		  JTextField txt10=new JTextField(10);
		  JLabel l11=new JLabel("Supplier Name:");
		  JLabel l12=new JLabel("Last Name:");
		  JTextField txt11=new JTextField(10);
		  JLabel l13=new JLabel("First Name:");
		  JTextField txt12=new JTextField(10);
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
		  
	       // defining buttons
		  JButton btnAdd=new JButton("ADD");
		  JButton btnEdit=new JButton("UPDATE");
		  JButton btnSearch=new JButton("SEARCH");
		  JButton btnExit=new JButton("EXIT");
		  JButton btnDel=new JButton("DELETE");
		  JButton btnNext=new JButton("NEXT");
		  JButton btnPrev=new JButton("PREVIOUS");
		  JLabel lblPic=new JLabel();
		  Color col,col1;
		
        public AddBook()
        {
          super("Library Management System");
		  toolkit=Toolkit.getDefaultToolkit();
		  dim=toolkit.getScreenSize();
		  w=(int)dim.getWidth();
		  h=(int)dim.getHeight();
		  
          
		  p1.setBackground(new Color(0,139,139));
          add(p1);
          p1.setLayout(null);
		  p2.setBounds(40,10,1245,450);
		  p2.setBackground(Color.white);
		  p2.setPreferredSize(new Dimension(1250,450));
		  p2.setBorder(BorderFactory.createLineBorder(Color.black));
		  p8.setBounds(0,230,w,h-240);
		  p8.setBackground(new Color(0,139,139));
		  p8.setLayout(null);
		  p1.add(p8);
		  p8.add(p2);
		  p1.add(p3);
		  p1.add(p4);
		  p1.add(p5);
		  p2.setLayout(null);
		  
		  p3.setBackground(new Color(255,255,255));
		 // p4.setBackground(new Color(255,255,255));
		  
		  p3.setBounds(0,0,w,125);
		  p5.setBounds(0,125,w,100);
		  p5.setBackground(new Color(175,238,238));
		  p5.setLayout(null);
		  
		 // p4.setBounds(20,200,600,300);
		 // p4.setLayout(null);
		 
		  
		 l1.setBounds(100,40,270,30);//accession
		 l1.setVisible(true);
		 txt1.setBounds(300,40,200,30);
		 l2.setBounds(100,90,150,30);//title
		 l2.setVisible(true);
		 txt2.setBounds(300,90,200,30);
		 l3.setBounds(100,140,150,30);//author
		 l3.setVisible(true);
		 jsp.setBounds(300,140,200,60);
		 l5.setBounds(100,220,220,30);//edition
		 l5.setVisible(true);
		 txt5.setBounds(300,220,200,30);
		  l6.setBounds(100,270,150,30);//publisher
		 l6.setVisible(true);
		 txt6.setBounds(300,270,200,30);
		  l7.setBounds(100,320,150,30);//place of publisher
		 l7.setVisible(true);
		 txt7.setBounds(300,320,200,30);
		 txt13.setColumns(10);
		 /*l10.setBounds(620,40,100,30);//supplier id
		 txt10.setBounds(750,40,150,30);
		 l11.setBounds(620,90,100,30); //name
		 //l12.setBounds(620,140,150,30);    //firstname
		 //txt11.setBounds(620,190,150,30);
		 //l13.setBounds(750,140,150,30); */    //last name
		 //txt12.setBounds(750,90,150,30);
		 txt13.setBounds(890,40,200,30);//entry date field
		 l14.setBounds(750,40,100,30);//entry date
		 l15.setBounds(750,90,100,30);//price
		 txt14.setBounds(890,90,200,30);
		 l16.setBounds(750,140,100,30);//pages
		 txt15.setBounds(890,140,200,30);
		 l17.setBounds(750,190,100,30);//category
		 cb.addItem("Computer");
		 cb.addItem("it");
		 cb.addItem("Electronic"); 
         cb.setBounds(890,190,200,30);
		 l18.setBounds(750,240,100,30);//isbn
		 txt16.setBounds(890,240,200,30);
		 l19.setBounds(750,290,100,30);//quantity
		 txt17.setBounds(890,290,200,30);
		 l8.setBounds(750,340,150,30);//language
		 txt8.setBounds(890,340,200,30);
		 
		 JLabel l = new JLabel("ADD BOOK");
	     l.setFont(new Font("Arial", Font.BOLD, 17));
	     l.setForeground(Color.black);
	     l.setBounds(590,5,120,20);
		 p2.add(l);
		 
		 JLabel l1 = new JLabel("Library ");
	     l1.setFont(new Font("Arial", Font.BOLD, 22));
	     l1.setForeground(Color.red);
	     l1.setBounds(25,10,120,30);
		 
	   
	     JLabel l2 = new JLabel("Management ");
	     l2.setFont(new Font("Arial", Font.BOLD, 18));
	     l2.setBounds(25,50,120,20);
	   
	     JLabel l3 = new JLabel("System ");
	     l3.setFont(new Font("Arial", Font.BOLD, 18));
	     l3.setBounds(47,70,90,30);
		 
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
		 
		 lblPic.setBounds(155,5,150,90);
		 lblPic.setBackground(new Color(100,149,237));
		 
		 p2.add(l1);p2.add(txt1);p2.add(l2);p2.add(txt2);
		 p2.add(l3);p2.add(jsp);
		 p2.add(l5);p2.add(txt5);p2.add(l6);p2.add(txt6);
		 p2.add(l7);p2.add(txt7);p2.add(l8);p2.add(txt8);
		 p2.add(l14);p2.add(txt13);
		 p2.add(l10);p2.add(txt10);p2.add(l15);p2.add(txt14);
		 p2.add(txt12);
		 p2.add(l16);p2.add(txt15); p2.add(l17); p2.add(cb); 
		 p2.add(l18);p2.add(txt16); p2.add(l19); p2.add(txt17);
		 p2.add(l11);p2.add(l12);p2.add(txt11);p2.add(l13);
		 p2.add(txt12);
		 p5.add(l1);  p5.add(l2); p5.add(l3);
		 p5.add(lblPic);
		 
		/*Image img=new ImageIcon("globe.jpg").getImage().getScaledInstance(140,90,Image.SCALE_DEFAULT);
		lblPic.setIcon(new ImageIcon(img));*/
		
		 
		 
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
		
		
		 
		 		
		  // adding mouse listener to buttons
				
		btnPrev.addMouseListener(this);
		btnAdd.addMouseListener(this);
		btnEdit.addMouseListener(this);
		btnSearch.addMouseListener(this);
		btnExit.addMouseListener(this);
		btnDel.addMouseListener(this);
		btnNext.addMouseListener(this);

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

		
		//adding focus listener to textfields
	    txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		jsp.addFocusListener(this);
		txt5.addFocusListener(this);
		txt6.addFocusListener(this);
		txt7.addFocusListener(this);
		txt8.addFocusListener(this);
		txt10.addFocusListener(this);
		txt11.addFocusListener(this);
		txt12.addFocusListener(this);
		txt13.addFocusListener(this);
		txt14.addFocusListener(this);
		txt15.addFocusListener(this);
		txt16.addFocusListener(this);
		txt17.addFocusListener(this);
		
		setVisible(true);		  
        setSize(w,h);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	
   }
   
   public void focusGained(FocusEvent e)
   {
	 if(e.getSource()==txt2)
	{
     txt2.setBackground(new Color(240,230,140));	 //(238,232,170)
	}
	 
	if(e.getSource()==jsp)
	{
     jsp.setBackground(new Color(128,128,128));
	} 
	if(e.getSource()==txt5)
	{
     txt5.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt6)
	{
     txt6.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt7)
	{
     txt7.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt8)
	{
     txt8.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt10)
	{
     txt10.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt11)
	{
     txt11.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt12)
	{
     txt12.setBackground(new Color(240,230,140));   
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
     txt16.setBackground(new Color(240,230,140));   
    }
	if(e.getSource()==txt17)
	{
     txt17.setBackground(new Color(240,230,140));   
    }
   }
   public void focusLost(FocusEvent e)
   {}
  
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
		if(e.getSource()==btnAdd)
		{
			try
			{

				
				pst=con.prepareStatement("insert into book_info values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setInt(1,Integer.parseInt(txt1.getText()));
				pst.setString(2,txt2.getText());
				pst.setString(3,area.getText());
				pst.setString(4,txt5.getText());
				pst.setString(5,txt6.getText());
				pst.setString(6,txt7.getText());
				pst.setString(7,txt8.getText());
				pst.setString(8,txt13.getText());
				pst.setString(9,txt14.getText());
				pst.setString(10,cb.getSelectedItem().toString());
				pst.setString(11,txt15.getText());
				pst.setInt(12, Integer.parseInt(txt16.getText()));
				pst.setString(13,txt17.getText());
				
				if(pst.executeUpdate()>0)
				{
				     //new AddedBook().setVisible(true);
					JOptionPane.showMessageDialog(null,"Data Saved Successfully");
					txt1.setText("");
					txt2.setText("");
					area.setText("");
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
				pst.setString(2,area.getText());
				pst.setString(3,txt5.getText());
				pst.setString(4,txt6.getText());
				pst.setString(5,txt7.getText());
				pst.setString(6,txt8.getText());
				pst.setString(7,txt13.getText());
				//pst.setString(10,txt10.getText());
				//pst.setString(11,txt11.getText());
				//pst.setString(12,txt12.getText());
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
					area.setText("");
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
					area.setText(rst.getString("bk_author"));
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
					area.setText(rst.getString("bk_author"));
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
		else if(e.getSource()==btnEdit)
		{
		    new LastUpdate().setVisible(true);
        }
   }		 
	 
	 
        public static void main(String args[])
        {
              new  AddBook();
				                
        }
}
