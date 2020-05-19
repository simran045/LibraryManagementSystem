import java.awt.*;
import javax.swing.*;

public class MDI extends JFrame
{
	JPanel p1=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("ssmm.png").getImage(),0,0,900,400,null);
		}
	};
	
	
	JMenu m=new JMenu("File");
	JMenu mE=new JMenu("Edit");
	JMenu m1=new JMenu("Print");
	JMenuItem m_i1=new JMenuItem("save");
	JMenuItem m_m1_mi1=new JMenuItem("print");
	JMenuItem m_m1_mi2=new JMenuItem("page setup");
	
	JMenuBar mb=new JMenuBar();
	
	MDI()
	{
		m.add(m1);m.add(m_i1);
		m1.add(m_m1_mi1);
		m1.add(m_m1_mi2);
		mb.add(m);mb.add(mE);
		
		setJMenuBar(mb);
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new MDI();
	}
	
}