import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class BookStatus extends JFrame implements MouseListener
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
    Border border = BorderFactory.createLineBorder(new Color(30,144,255), 1);
    Border border1;
		   
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p8=new JPanel();
	 JPanel p5=new JPanel();
	 JPanel p6=new JPanel();
	 /* {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("sir_2.jpg").getImage(),40,10,420,320,null);
		}
	};*/
	 
	 
	 
   JPanel p2=new JPanel();
    JPanel centerP=new JPanel();
	 JPanel northP=new JPanel();
   JPanel panel1=new JPanel();
   JPanel panel2=new JPanel();
   JPanel p3=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,135,null);
		}
	};
	
   JPanel p4=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};
	
  JButton btnHome=new JButton("HOME");
  JButton btnLibrarian=new JButton("LIBRARIANS");
  JButton btnView=new JButton("SERVICES");
  JButton btnEdit=new JButton("EDIT PROFILE");
  JButton btnBook=new JButton("BOOK SECTION");
  JButton btnLogout=new JButton("LOGOUT");
  
   JButton btn1=new JButton("ADD BOOK");
   JButton btn2=new JButton("VIEW BOOKS");
   JButton btn3=new JButton("ISSUE BOOK");
   JButton btn4=new JButton("VIEW ISSUED BOOK");
   JButton btn5=new JButton("RETURN BOOK");
   
   //JLabel label=new JLabel("WELCOME TO LIBRARIAN ZONE");
   
   Color col,col1;
  
  BookStatus()
  {
	  
  
    
  
  super("LIBRARY MANAGMENT ");
  col1=btnHome.getForeground();	 
  t=Toolkit.getDefaultToolkit();
  d=t.getScreenSize();
  h=(int)d.getHeight();
  w=(int)d.getWidth(); 
  Font btnFont2 =new Font("Arial", Font.PLAIN,14);
  setVisible(true);
  setSize(w,h);
  p1.setBackground(new Color(0,139,139));
  add(p1);
  p1.setLayout(null);
  p2.setBounds(710,17,630,470);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(630,470));
  p8.setBounds(0,225,w,h-225);
  p8.setBackground(new Color(0,139,139));
 // p8.setPreferredSize( new Dimension(600,500));
  p1.add(p8);
  p8.setLayout(null);
  p8.add(p2);
  p1.add(p3);
  p2.add(p6);
  p8.add(p4);
  p1.add(p5);
  p2.setLayout(null);
   p3.setBackground(new Color(255,255,255));
   p4.setBackground(new Color(255,255,255));

   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,130,1400,90);
   p5.setBackground(new Color(175,238,238));
   p6.setBackground(Color.white);
   p5.setLayout(null);
   p6.setLayout(null);
   p6.setBounds(0,0,630,470);
   /*label.setFont(new Font("Arial",Font.BOLD,25));
   label.setBounds(95,4,500,100);
   label.setForeground(Color.red);
   p2.add(label);*/
 
  p4.setBounds(20,20,460,280);
  p4.setLayout(null);
  
		
		btn2.setBounds(200,95,90,30);
		btn2.setBackground(new Color(0,139,139));
		btn2.setFont(new Font("Arial",Font.PLAIN,15));
		btn3.setBounds(390,95,120,30);
		btn3.setBackground(new Color(0,139,139));
		btn3.setFont(new Font("Arial",Font.PLAIN,15));
		btn4.setBounds(600,95,95,30);
		btn4.setBackground(new Color(0,139,139));
		btn4.setFont(new Font("Arial",Font.PLAIN,15));
		 
		 p5.add(btn2);
		 p5.add(btn3);
		 p5.add(btn4);
		 
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
		  
		 btnLibrarian.setForeground(Color.black);
	     btnLibrarian.setBounds(1050,40,140,25);
	     btnLibrarian.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnLibrarian.setBorderPainted(false);
	     btnLibrarian.setContentAreaFilled(false);
	     btnLibrarian.setFocusPainted(false);
	  
		 btnLibrarian.setFont(btnFont);
		 p5.add(btnLibrarian);
		 
		 btnView.setForeground(Color.black);
	     btnView.setBounds(670,40,190,25);
	     btnView.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnView.setBorderPainted(false);
	     btnView.setContentAreaFilled(false);
	     btnView.setFocusPainted(false);
	  
		 btnView.setFont(btnFont);
		 p5.add(btnView);
		 
		 btnEdit.setForeground(Color.black);
	     btnEdit.setBounds(860,40,180,25);
	     btnEdit.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	     btnEdit.setBorderPainted(false);
	     btnEdit.setContentAreaFilled(false);
	     btnEdit.setFocusPainted(false);
	  
		 btnEdit.setFont(btnFont);
		 p5.add(btnEdit);
		  
		 btnBook.setForeground(Color.black);
	     btnBook.setBounds(500,40,170,25);
	     btnBook.setBorder(BorderFactory.createLineBorder(Color.black));
         //btnBook.setBorderPainted(false);
	     btnBook.setContentAreaFilled(false);
	     btnBook.setFocusPainted(false);
		 btnBook.setFont(new Font("Arial",Font.BOLD,18));
		 p5.add(btnBook);
		 panel1.setBounds(500,0,200,100);
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
		
	     btnLogout.setForeground(Color.black);
	     btnLogout.setBounds(1220,40,130,25);
	     btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	     btnLogout.setBorderPainted(false);
	     btnLogout.setContentAreaFilled(false);
	     btnLogout.setFocusPainted(false);
	   
		 btnLogout.setFont(btnFont);
		 p5.add(btnLogout);	  
		 
		 
    northP.setBorder( BorderFactory.createLineBorder(Color.black));
    p6.add(northP,"North");
	northP.setLayout(null);
	northP.setPreferredSize(new Dimension(600,100));//870,105
    northP.setBounds(10,50,600,100);
	
    JLabel deptLabel = new JLabel("Department :");
	deptLabel.setBounds(10,25,100,25);//30,40
    northP.add(deptLabel);
	
	JComboBox cbDept= new JComboBox();
	cbDept.addItem("SELECT DEPT");
	cbDept.addItem("ALL");
	cbDept.addItem("CSE");
	cbDept.addItem("IT");
	cbDept.addItem("ELECTRONICS");
	cbDept.addItem("NO DEPT");
	cbDept.setBounds(130,25,130,25);
    northP.add(cbDept);
	
    JLabel accLabel = new JLabel("Accession Number :");
	accLabel.setBounds(320,25,150,25);
    northP.add(accLabel);
	
	JTextField txt1 = new JTextField(20);
	txt1.setBounds(450,25,110,25);
    northP.add(txt1);

	JButton btnShow = new JButton("Show");
	btnShow.setBounds(255,65,100,25);
    northP.add(btnShow);
 
    centerP.setPreferredSize(new Dimension(600,300));
    centerP.setBounds(10,155,600,300);
    p6.add(centerP,"Center"); 
	centerP.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
	centerP.setLayout(null);
	JLabel titleLabel = new JLabel("Book Title :");
	titleLabel.setBounds(10,20,100,25);
    centerP.add(titleLabel);
	
    JTextField txt2 = new JTextField(60);
	txt2.setBounds(10,45,580,25);//55
    centerP.add(txt2);
	
	JLabel authorLabel = new JLabel("Author(s) :");
	authorLabel.setBounds(10,90,100,25);
    centerP.add(authorLabel);
	
	JTextArea area = new JTextArea(200,70);
	area.setBounds(10,120,230,70);
    centerP.add(area);
	
	JLabel priceLabel = new JLabel("Book Price :");
	priceLabel.setBounds(330,100,100,25);
    centerP.add(priceLabel);
	
	JTextField txt3 = new JTextField(20);
	txt3.setBounds(460,100,110,25);
    centerP.add(txt3);
	
	JRadioButton active = new JRadioButton("Active");
     JRadioButton lost = new JRadioButton("Lost");
	 JRadioButton write = new JRadioButton("Write-Off");
     ButtonGroup bG = new ButtonGroup();
     bG.add(active);
     bG.add(lost);
     bG.add(write);	
	 
	active.setBounds(10,200,70,25);
	centerP.add(active);
	
	lost.setBounds(100,200,70,25);
	centerP.add(lost);
	
	write.setBounds(200,200,100,25);
	centerP.add(write);
	
	 JRadioButton in = new JRadioButton("In");
     JRadioButton out = new JRadioButton("Out");
     ButtonGroup bG1 = new ButtonGroup();
     bG1.add(in);
     bG1.add(out);	
	 in.setBounds(420,200,70,25);
	 centerP.add(in);
	
	out.setBounds(510,200,70,25);
	centerP.add(out);
	 
	 JButton btnExit = new JButton("CLOSE");
	 btnExit.setBounds(290,255,100,25);
	 centerP.add(btnExit);
		 
		 
		  setResizable(false);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  setVisible(true);

  
          btnHome.addMouseListener(this);
		  btnLibrarian.addMouseListener(this);
		  btnView.addMouseListener(this);
		  btnEdit.addMouseListener(this);
		  btnBook.addMouseListener(this);
		  btnLogout.addMouseListener(this);
		  btn1.addMouseListener(this);
		  btn2.addMouseListener(this);
		  btn3.addMouseListener(this);
		  btn4.addMouseListener(this);
		  btn5.addMouseListener(this);
  }
  
   public void mouseClicked(MouseEvent e)
   {
 
		if(e.getSource()==btnBook)
		{
		 panel1.setVisible(true);
		}
		if(e.getSource()==btn1)
		{ 
         new Book().setVisible(true);
		}
		if(e.getSource()==btn2)
		{
		  new BookTable().setVisible(true);
		}
		if(e.getSource()==btn3)
		{
		  new IssueBook().setVisible(true);
		}
		  
		 if(e.getSource()==btn4)
		{
		  new IssueBookTable().setVisible(true);
		  
		}
		if(e.getSource()==btn5)
		{
		  
		  new ReturnBookT().setVisible(true);
		}
		if(e.getSource()==btnHome)
		{
		  new HomePage().setVisible(true);
		}
		if(e.getSource()==btnLibrarian )
		{
		  new LibrarianTable().setVisible(true);
		}
		if(e.getSource()==btnView )
		{
		  new Service().setVisible(true);
		}
		if(e.getSource()==btnEdit )
		{
		  new LastUpdate().setVisible(true);
		}
		if(e.getSource()==btnLogout )
		{
		  this.dispose();
		  new Logout().setVisible(true);
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
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(new Color(0,139,139));
		}
		if(e.getSource()==btnEdit)
		{
		btnEdit.setForeground(new Color(0,139,139));
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
		
		if(e.getSource()==btnHome)
		{
			btnHome.setForeground(col1);
		}
		if(e.getSource()==btnBook)
		{
			btnBook.setForeground(col1);
		}
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(col1);
		}
		if(e.getSource()==btnView)
		{
		btnView.setForeground(col1);
		}
		if(e.getSource()==btnEdit)
		{
		btnEdit.setForeground(col1);
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
  
  
  
  
  
  public static void main(String []args)
  {
   new BookStatus();
  }
}
