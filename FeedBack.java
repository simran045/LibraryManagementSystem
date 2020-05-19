import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class FeedBack extends JFrame  implements ActionListener ,MouseListener
{
  
  Dimension d;
  Toolkit t;
  int w,h;
     JPanel p1=new JPanel();
	 JPanel p5=new JPanel();
	 
	 
	 
   JPanel p2=new JPanel();
   JPanel p3=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,1400,105,null);
		}
	};
	
   JPanel p4=new JPanel()
   {
	public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("girl.jpg").getImage(),40,30,460,270,null);
		}
	};
	
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
	
  
    JLabel lbl1=new JLabel("FEEDBACK FORM");
	JLabel lbl2=new JLabel("How Was Our Service ");
	JComboBox cmb=new JComboBox();
	JLabel lbl3=new JLabel("How Was Book Managed");
	JComboBox cmb1=new JComboBox();
	JLabel lbl4=new JLabel("How Was Our Librarian Behaviour ");
	JComboBox cmb2=new JComboBox();
	JLabel lbl5=new JLabel("Which book do you want");
    JTextField txt=new JTextField(20);
	JLabel lbl6=new JLabel("FeedBack");
    JTextField txt1=new JTextField(50);
	JButton btn=new JButton("SUBMIT");
	JButton btn2=new JButton("HOME");
	JButton btn3=new JButton("SERVICES");
	JButton btn4=new JButton(" VIEW LIBRARIAN");
	JButton btn5=new JButton("ABOUT US");
	JButton btn6=new JButton(" LOGOUT");
	

  
  FeedBack()
  {
	  
		super("LIBRARY MANAGMENT ");
		 
  t=Toolkit.getDefaultToolkit();
  d=t.getScreenSize();
  h=(int)d.getHeight();
  w=(int)d.getWidth(); 
  
  
  
  setVisible(true);
  setSize(w,h);
  p1.setBackground(new Color(0,139,139));
  add(p1);
  p1.setLayout(null);
  p2.setBounds(w/2-80,h/2-170,680,500);
  p2.setBackground(Color.white);
  p2.setPreferredSize( new Dimension(600,500));
 
  p1.add(p2);
  p1.add(p3);
 
  p1.add(p4);
  p1.add(p5);
  p2.setLayout(null);
   p3.setBackground(new Color(255,255,255));
   p4.setBackground(new Color(255,255,255));

   p3.setBounds(0,0,1400,135);
   p5.setBounds(0,50,1400,135);
   p5.setBackground(new Color(127,255,212));
   
   p5.setLayout(null);
   
   p4.setBounds(20,200,600,300);
   p4.setLayout(null);
   JLabel l1 = new JLabel("Library");
	   
	   l1.setFont(new Font("Arial", Font.BOLD, 25));
	   l1.setForeground(Color.red);
	   l1.setBounds(30,50,130,30);
	  
	
	
	   JLabel l2 = new JLabel("Management");
	   l2.setFont(new Font("Arial", Font.BOLD, 18));
	   l2.setBounds(35,80,120,25);
	   
	   JLabel l3 = new JLabel("System");
	   l3.setFont(new Font("Arial", Font.BOLD, 18));
	   l3.setBounds(47,100,90,30);
 

 
  
		
		lbl1.setBounds(200,30,290,60);
		lbl1.setFont(new Font("Arial",Font.BOLD,25));
		lbl2.setBounds(60,120,240,20);
		lbl2.setFont(new Font("Arial",Font.PLAIN,16));
		cmb.setBounds(60,160,200,30);
		lbl3.setBounds(410,120,240,20);
		lbl3.setFont(new Font("Arial",Font.PLAIN,16));
		cmb1.setBounds(410,160,200,30);
		lbl4.setBounds(60,220,240,20);
		lbl4.setFont(new Font("Arial",Font.PLAIN,16));
		cmb2.setBounds(60,260,200,30);
		lbl5.setBounds(410,220,240,20);
		lbl5.setFont(new Font("Arial",Font.PLAIN,16));
		txt.setBounds(410,260,200,30);
		lbl6.setBounds(60,310,250,20);
		lbl6.setFont(new Font("Arial",Font.PLAIN,16));
		txt1.setBounds(60,340,550,70);
	
		btn.setBounds(60,440,500,30);
		btn.setBackground(new Color(0,139,139));
		btn.setFont(new Font("Arial",Font.PLAIN,20));
		
		
		btn2.setBounds(500,77,90,30);
		btn2.setForeground(Color.black);
	    
	    btn2.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn2.setBorderPainted(false);
	    btn2.setContentAreaFilled(false);
	    btn2.setFocusPainted(false);
		btn2.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn2);
		
		
		
		btn3.setBounds(670,77,120,30);
		btn3.setForeground(Color.black);
	    
	    btn3.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn3.setBorderPainted(false);
	    btn3.setContentAreaFilled(false);
	    btn3.setFocusPainted(false);
		btn3.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn3);
		btn4.setBounds(820,77,195,30);
		btn4.setForeground(Color.black);
	    
	    btn4.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn4.setBorderPainted(false);
	    btn4.setContentAreaFilled(false);
	    btn4.setFocusPainted(false);
		btn4.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn4);
		btn5.setBounds(1050,77,140,30);
		btn5.setForeground(Color.black);
	    
	    btn5.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn5.setBorderPainted(false);
	    btn5.setContentAreaFilled(false);
	    btn5.setFocusPainted(false);
		btn5.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn5);
		btn6.setBounds(1200,77,140,30);
		btn6.setForeground(Color.black);
	    
	    btn6.setBorder(BorderFactory.createLineBorder(Color.black));
	    btn6.setBorderPainted(false);
	    btn6.setContentAreaFilled(false);
	    btn6.setFocusPainted(false);
		btn6.setFont(new Font("Arial",Font.PLAIN,18));
		 p5.add(btn6);
		
		
		
		
		
		btn3.setBackground(new Color(0,139,139));

		btn4.setBackground(new Color(0,139,139));
		
		
		
  
   p2.add(lbl1);
   p2.add(lbl2);p2.add(cmb);
   
   p2.add(lbl3);p2.add(cmb1);
   p2.add(lbl4);p2.add(cmb2);
   p2.add(lbl5);p2.add(txt);
   p2.add(lbl6);p2.add(txt1);
   cmb.addItem("Excellent");cmb.addItem("Very Good");cmb.addItem("Good");
   cmb.addItem("Satisfactory");cmb.addItem("Need Improvment");   
		cmb1.addItem("Arranged");cmb1.addItem("Not Arranged");
		cmb2.addItem("Polite");cmb2.addItem("Rude");
  
   
		 
		  p2.add(btn);
		   p5.add(l1);
		 p5.add(l2);
		 p5.add(l3);
		 
		  
		  setResizable(false);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  setVisible(true);
		   btn.addActionListener(this);
		  
		   btn2.addMouseListener(this);
		   btn3.addMouseListener(this);
		   btn4.addMouseListener(this);
		   btn5.addMouseListener(this);
		   btn6.addMouseListener(this);
		

  
  }
  
   public void mouseClicked(MouseEvent m)
  {
	  if(m.getSource()==btn)
	  {
		  btn.setBackground(Color.gray);
	  }
	  
	   if(m.getSource()==btn2)
	  {
	      this.dispose();
		  new HomePage().setVisible(true);
	  }
	   if(m.getSource()==btn3)
	  {
	      this.dispose();
		  new Service().setVisible(true);
	  }
	   if(m.getSource()==btn4)
	  {
	     this.dispose();
		  new LibrarianTable().setVisible(true);
	  }
	  if(m.getSource()==btn5)
	  {
	     this.dispose();
		  new AboutUs().setVisible(true);
	  }
	  if(m.getSource()==btn6)
	  {
	      this.dispose();
		  new Logout().setVisible(true);
	  }
  
  } 
  public void mousePressed(MouseEvent m){}
  public void mouseReleased(MouseEvent m){}
  public void mouseEntered(MouseEvent m){}
  public void mouseExited(MouseEvent m){}


  
   public void actionPerformed(ActionEvent a)
  {
	  if(a.getSource()==btn)
	  {
	    try
		  {
				pst=con.prepareStatement("insert into feedback values(?,?,?,?,?)");
			    pst.setString(1,cmb.getSelectedItem().toString());
				pst.setString(2,cmb1.getSelectedItem().toString());
				pst.setString(3,cmb2.getSelectedItem().toString());
				pst.setString(4,txt.getText());
				pst.setString(5,txt1.getText());
			    
				 if(txt1.getText().isEmpty())
				{
				       JOptionPane.showMessageDialog(this,"please enter feedback","Submission Failed",JOptionPane.WARNING_MESSAGE);
			    }
				else if(cmb.getSelectedItem().equals("---------------------------Questions----------------------------"))
				{
				       JOptionPane.showMessageDialog(this,"please enter ......","Submission Failed",JOptionPane.WARNING_MESSAGE);
			    }
					  else 
				    {
					  pst.executeUpdate(); 
                      JOptionPane.showMessageDialog(this,"Successfully Submitted.","success",JOptionPane.INFORMATION_MESSAGE);
					  new FeedBackDone().setVisible(true);
				    }
				  }
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
			        cmb1.setSelectedIndex(0);
					cmb.setSelectedIndex(0);
					cmb2.setSelectedIndex(0);
					txt1.setText("");
					txt.setText("");
					
	  }
  } 
  
  public static void main(String []args)
  {
   new FeedBack();
  }
}
