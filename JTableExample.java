import java.awt.*;
import javax.swing.*;
class JTableExample extends JFrame
{
	String head[]={"Name","Address","Contact"};
	String data[][]={{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}};
	JTable tab=new JTable(data,head);
	JScrollPane jsp=new JScrollPane(tab);
	JTableExample()
	{
		add(jsp);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String []args)
	{
		new JTableExample();
	}
}