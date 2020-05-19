import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ContactUsPage extends JFrame
{
   Toolkit toolkit;
   Dimension dim;
   int w,h;
	 JPanel northPanel = new JPanel()
	   {
		     public void paintComponent(Graphics g)
		     {
			           g.drawImage(new ImageIcon("woork.jpg").getImage(),0,0,northPanel.getWidth(),northPanel.getHeight(),null);
		     }
	   };
     
ContactUsPage()
{

        super("ContactUs");
		
	    JPanel firstPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel mainPanel = new JPanel();
		
	    toolkit=Toolkit.getDefaultToolkit();
	    dim=toolkit.getScreenSize();
	    w=(int)dim.getWidth();
	    h=(int)dim.getHeight();
		
		Border thinBorder=LineBorder.createBlackLineBorder();
		
		add(firstPanel);
		firstPanel.setLayout(null);  	
        firstPanel.setPreferredSize(new Dimension(800,600));
        firstPanel.setBackground(new Color(0,139,139));
	 
         firstPanel.add(northPanel,"North");
		 northPanel.setBackground(new Color(135,206,235));
		 northPanel.setBounds(0,0,w,190);
		 northPanel.setPreferredSize(new Dimension(w,190));
		 northPanel.setLayout(null);
		 
		 JButton btnHomePage=new JButton("HomePage");
		 btnHomePage.setBounds(950,155,100,30);
		 btnHomePage.setBackground(new Color(127,255,212));
		 
		 JButton btnLogin=new JButton("Login");
		 btnLogin.setBounds(1100,155,70,30);
		 btnLogin.setBackground(new Color(127,255,212));
		 JButton btnContact=new JButton("Contact Us");
		 btnContact.setBounds(1200,155,100,30);
		 btnContact.setBackground(new Color(127,255,212));
		 
		 northPanel.add(btnHomePage);
		 northPanel.add(btnLogin);
		 northPanel.add(btnContact);
		 
		 firstPanel.add(centerPanel,"Center");
		 centerPanel.setBounds(160,192,1055,600);
		 centerPanel.setPreferredSize(new Dimension(1055,600)); 
		 centerPanel.setLayout(null);
		 JPanel p1= new JPanel();
		 centerPanel.add(p1,"North");
		 p1.setBounds(198,100,690,320);
		 p1.setBorder(thinBorder);
		 
		 JLabel lbl=new JLabel("Contact Us");-
		 lbl.setBounds(10,50,50,25);
		 p1.add(lbl);
	  
	  
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(w,h);
	    setVisible(true);
      	   
}

public static void main(String []args)
{
    new ContactUsPage();
}
}