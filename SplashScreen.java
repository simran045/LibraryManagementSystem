import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SplashScreen extends JFrame implements Runnable,MouseListener
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			pro.setValue(i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException iex){}
		}
		dispose();
		//new SplashScreen();
	}
	JButton btn=new JButton("Save");
	JButton btn1=new JButton("Exit");
	JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JProgressBar pro=new JProgressBar();
	Thread th;
	Color col;
	SplashScreen()
	{
		th=new Thread(this);
		th.start();
		pro.setStringPainted(true);
		add(panel);
		panel.add(btn);panel.add(btn1);
		add(panel1,"South");
		panel1.setPreferredSize(new Dimension(500,50));
		panel1.setLayout(null);
		panel1.add(pro);
		panel1.setBackground(new Color(250,100,100));
		pro.setBounds(20,10,460,30);
		panel.setBackground(new Color(120,240,100));
		//setLocationRelativeTo(null);
		setSize(500,430);
		setLocation(400,150);
		setVisible(true);
		col=btn.getBackground();
		btn.addMouseListener(this);
		btn1.addMouseListener(this);
		/*btn.addMouseListener(
		new MouseAdapter()
		{
				public void mouseEntered(MouseEvent e)
				{
					btn.setBackground(Color.gray);
					btn.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
				}
				public void mouseExited(MouseEvent e)
				{
					btn.setBackground(col);
					btn.setFont(new Font("Arial",Font.BOLD,12));
				}
		});*/
	}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e)
	{
		if(e.getSource()==btn)
		{
		btn.setBackground(Color.gray);
		btn.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
		}
		if(e.getSource()==btn1)
		{
		btn1.setBackground(Color.gray);
		btn1.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
		}
	}
	public void mouseExited(MouseEvent e)
	{
		if(e.getSource()==btn)
		{
			btn.setBackground(col);
			btn.setFont(new Font("Arial",Font.BOLD,12));
		}
		if(e.getSource()==btn1)
		{
			btn1.setBackground(col);
			btn1.setFont(new Font("Arial",Font.BOLD,12));
		}
	}
	public static void main(String[]args)
	{
		new SplashScreen();
	}
}