import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame1 extends JFrame //implements ActionListener
{
	JPanel p=new JPanel();
	JLabel lbl=new JLabel("Name");
	JTextField txt=new JTextField();
	JButton btn=new JButton("Sumit");
	MyFrame1()
	{
		add(p);
		p.setLayout(null);
		lbl.setBounds(50,100,200,20);
		txt.setBounds(260,100,200,20);
		btn.setBounds(150,140,200,20);
		p.add(lbl);p.add(txt);p.add(btn);
		setSize(600,400);
		setVisible(true);
		btn.addActionListener(new EventHandlers());
	}
	
	public static void main(String[]args)
	{
		new MyFrame1();
	}
}


class EventHandlers implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			JOptionPane.showMessageDialog(null,txt.getText());
		}
	}
}