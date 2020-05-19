import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
   
public class LibrarianHomePage extends JFrame implements MouseListener
{
   Toolkit toolkit;
   Dimension dim;
   int w,h;
   Color col;
   
   JPanel firstPanel=new JPanel();
   JPanel secPanel=new JPanel();
   JButton btnHome=new JButton("HOME");
   JButton btnLibrarian=new JButton("LIBRARIANS");
   JButton btnViewP=new JButton("VIEW PROFILE");
   JButton btnEditP=new JButton("EDIT PROFILE");
   JButton btnBook=new JButton("BOOK SECTION");
   JButton btnLogout=new JButton("LOGOUT");
   
   public LibrarianHomePage() 
   {
     super("Library Management System");
  
      
     add(firstPanel);
     firstPanel.setLayout(null);
     firstPanel.add(secPanel,"Center");
     secPanel.setLayout(null);
     secPanel.setPreferredSize(new Dimension(1500,600));
     secPanel.setBounds(0,120,1500,600);
     secPanel.setBackground(new Color(65,130,155));
	  
	
	   btnHome.setForeground(Color.black);
	   btnHome.setBounds(370,40,100,25);
	   btnHome.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnHome.setBorderPainted(false);
	   btnHome.setContentAreaFilled(false);
	   btnHome.setFocusPainted(false);
		
		Font btnFont =new Font("Arial", Font.PLAIN,18);
		btnHome.setFont(btnFont);
		firstPanel.add(btnHome);
		
	   btnLibrarian.setForeground(Color.black);
	   btnLibrarian.setBounds(490,40,150,25);
	   btnLibrarian.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnLibrarian.setBorderPainted(false);
	   btnLibrarian.setContentAreaFilled(false);
	   btnLibrarian.setFocusPainted(false);
	   
		btnLibrarian.setFont(btnFont);
		firstPanel.add(btnLibrarian);
		
	   btnViewP.setForeground(Color.black);
	   btnViewP.setBounds(660,40,150,25);
	   btnViewP.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnViewP.setBorderPainted(false);
	   btnViewP.setContentAreaFilled(false);
	   btnViewP.setFocusPainted(false);
	   

		btnViewP.setFont(btnFont);
		firstPanel.add(btnViewP);
		
	   btnEditP.setForeground(Color.black);
	   btnEditP.setBounds(830,40,180,25);
	   btnEditP.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnEditP.setBorderPainted(false);
	   btnEditP.setContentAreaFilled(false);
	   btnEditP.setFocusPainted(false);
	   

		btnEditP.setFont(btnFont);
		firstPanel.add(btnEditP);
		
	   btnBook.setForeground(Color.black);
	   btnBook.setBounds(1040,40,170,25);
	   btnBook.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	   btnBook.setBorderPainted(false);
	   btnBook.setContentAreaFilled(false);
	   btnBook.setFocusPainted(false);
	   
		btnBook.setFont(btnFont);
		firstPanel.add(btnBook);
		
	   btnLogout.setForeground(Color.black);
	   btnLogout.setBounds(1240,40,130,30);
	   btnLogout.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
	   //btnLogout.setBorderPainted(false);
	   btnLogout.setContentAreaFilled(false);
	   btnLogout.setFocusPainted(false);
	   
		btnLogout.setFont(btnFont);
		firstPanel.add(btnLogout);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
	    toolkit=Toolkit.getDefaultToolkit();
	    dim=toolkit.getScreenSize();
	    w=(int)dim.getWidth();
	    h=(int)dim.getHeight();
		
		setSize(w,h);
		setVisible(true);
		col=btnHome.getForeground();
		
		btnHome.addMouseListener(this);
		btnLibrarian.addMouseListener(this);
		btnViewP.addMouseListener(this);
		btnEditP.addMouseListener(this);
		btnBook.addMouseListener(this);
		btnLogout.addMouseListener(this);
	
		
   }
   
   
    public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e)
	{
		if(e.getSource()==btnHome)
		{
		btnHome.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnLibrarian)
		{
		btnLibrarian.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnViewP)
		{
		btnViewP.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnEditP)
		{
		btnEditP.setForeground(new Color(65,130,155));
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(new Color(65,130,155));
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
			btnHome.setForeground(col);
		}
		if(e.getSource()==btnLibrarian)
		{
			btnLibrarian.setForeground(col);
		}
		if(e.getSource()==btnViewP)
		{
		btnViewP.setForeground(col);
		}
		if(e.getSource()==btnEditP)
		{
		btnEditP.setForeground(col);
		}
		if(e.getSource()==btnBook)
		{
		btnBook.setForeground(col);
		}
		if(e.getSource()==btnLogout)
		{
		btnLogout.setForeground(col);
		}
	}
  
   public static void main(String[] args) 
   {
      new LibrarianHomePage();
   }
}
  
           