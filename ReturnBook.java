import java.awt.*;
import javax.swing.*;
class ReturnBook extends JFrame
{
      Toolkit toolkit;
	  Dimension dim;
	  int w,h;
	    
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
			
		//JPanel p5=new JPanel();
		JPanel p6=new JPanel()
		{
		
           public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("books2.jpg").getImage(),0,0,570,300,null);
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
			g.drawImage(new ImageIcon("gl.jpg").getImage(),40,30,460,400,null);
		}
	};
			          JLabel l2=new JLabel("     Book    Returned  Successfully.........   ");
					  

		  
ReturnBook()
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
		 p2.setBounds(w/2-80,h/2-200,650,470);
		 p2.setBackground(new Color(255,255,255));
		 p2.setPreferredSize(new Dimension(600,700));
		 p2.setLayout(null);
		 p1.add(p3);
		 p3.setBackground(new Color(255,255,255));
		 p4.setBackground(new Color(255,255,255));
		 p3.setBounds(0,2,1400,140);
		 p3.setLayout(null);
		 p1.add(p4);
		 p2.add(p6);
		 p6.setLayout(null);
		 p6.setBounds(90,70,500,300);
		
		 
		 		 p4.setBounds(10,200,600,400);
		         p4.setLayout(null);
		  
		        
		 		 l2.setBounds(100,400,500,50);
		         l2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,28));
				  l2.setForeground(new Color(255,0,0));
			
                  p2.add(l2);
				  setResizable(false);
				  setDefaultCloseOperation(EXIT_ON_CLOSE);
		 		  setSize(w,h);
		          setVisible(true); 
		
	}
		public static void main(String[]args)
	{
		new ReturnBook();
	}
}