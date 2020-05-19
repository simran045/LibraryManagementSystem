import java.awt.*;
import javax.swing.*;
class About extends JFrame
{
      Toolkit toolkit;
	  Dimension dim;
	  int w,h;
	  
	  
	  		JPanel p1=new JPanel();
			JPanel p2=new JPanel();
			JPanel p5=new JPanel()
			{
			  public void paintComponent(Graphics g)
		    { 
			g.drawImage(new ImageIcon("grp1.jpg").getImage(),0,0,560,240,null);
		    }
	     };
			JPanel p3=new JPanel()
		{
		     public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("logo1.jpg").getImage(),0,0,1400,140,null);
		}
	};
			JPanel p4=new JPanel()
		{
		     public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("gi1.jpg").getImage(),40,30,460,400,null);
		}
	};
	          JLabel l2=new JLabel("       Thank You.........   ");
		  JTextArea a=new JTextArea(40,40);
About()
	{
			super("Online Library Management System Of NIELIT");
		 toolkit=Toolkit.getDefaultToolkit();
		 dim=toolkit.getScreenSize();
		 w=(int)dim.getWidth();
		 h=(int)dim.getHeight();
		 add(p1);
		 p1.setLayout(null);
		 p1.add(p2);
		 p1.setBackground(new Color(0,206,209));
		 p2.setBounds(w/2-80,h/2-170,650,500);
		 p2.setBackground(new Color(211,211,211));
		 p2.setPreferredSize(new Dimension(900,550));
		 p2.setLayout(null);
		 p1.add(p3);
		 p3.setBackground(new Color(255,255,255));
		 p4.setBackground(new Color(255,255,255));
		 p3.setBounds(0,2,1400,140);
		 p3.setLayout(null);
		 p1.add(p4);
		 p2.add(p5);
		 p5.setLayout(null);
		 p5.setBounds(90,50,500,200);
		
		 
		 		 p4.setBounds(10,200,600,400);
		         p4.setLayout(null);
		  
		        
		 		 l2.setBounds(190,460,270,25);
		         l2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,20));
				 l2.setForeground(new Color(255,0,0));
				 a.setBounds(100,270,470,180);
			
                  p2.add(a); p2.add(l2);
				  setResizable(false);
				  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 		  setSize(w,h);
		          setVisible(true); 
		
	}
		public static void main(String[]args)
	{
		new About();
	}
}