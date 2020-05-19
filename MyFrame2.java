import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame2 extends JFrame //implements ActionListener
{
	JPanel p=new JPanel();
	JLabel lbl=new JLabel("Name");
	static JTextField txt=new JTextField();
	static JButton btn=new JButton("Sumit");
	MyFrame2()
	{
		add(p);
		p.setLayout(null);
		lbl.setBounds(50,100,200,20);
		txt.setBounds(260,100,200,20);
		btn.setBounds(150,140,200,20);
		p.add(lbl);p.add(txt);p.add(btn);
		setSize(600,400);
		setVisible(true);
		btn.addMouseListener(new EventHandlers1());
	}
	
	public static void main(String[]args)
	{
		new MyFrame2();
	}
}


class EventHandlers1 extends MouseAdapter
{
	public void mouseEntered(MouseEvent e)
	{
		MyFrame2.btn.setBackground(Color.red);
	}
	/*public void mouseExited(MouseEvent e)
	{
		MyFrame2.btn.setBackground(Color.green);
	}
	public void mousePressed(MouseEvent e)
	{
		MyFrame2.btn.setBackground(Color.blue);
	}
	public void mouseReleased(MouseEvent e)
	{
		MyFrame2.btn.setBackground(Color.yellow);
	}
	public void mouseClicked(MouseEvent e)
	{
		MyFrame2.btn.setBackground(Color.pink);
	}*/
}