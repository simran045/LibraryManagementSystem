import java.awt.*;
import javax.swing.*;
class MyBook extends JFrame
{
	JPanel p=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("Penguins.jpg").getImage(),0,0,400,300,null);
		}
	};
	
	JLabel lbl=new JLabel("User Id");
	JTextField txt=new JTextField(10);
	JButton btn=new JButton("Submit");
	
	
	String str[]={"Indian","Srilankan","Pakistani","Nepali","French","Englandian","Indian","Srilankan","Pakistani","Nepali","French","Englandian"};
	JList lst=new JList(str);
	JScrollPane jsp=new JScrollPane(lst);
	
	JComboBox cmb=new JComboBox();
	
	JRadioButton rd1=new JRadioButton("Male");
	JRadioButton rd2=new JRadioButton("Female");
	
	ButtonGroup btnGroup=new ButtonGroup();
	
	JCheckBox ch1=new JCheckBox("Checkbox1");
	JCheckBox ch2=new JCheckBox("Checkbox2");
	JCheckBox ch3=new JCheckBox("Checkbox3");
	
	
	MyBook()
	{
		add(p,"North");add(p1,"South");add(p2,"East");
		add(p3,"West");add(p4,"Center");
		
		p.setPreferredSize(new Dimension(600,100));
		p1.setPreferredSize(new Dimension(600,100));
		p2.setPreferredSize(new Dimension(100,400));
		p3.setPreferredSize(new Dimension(100,400));
		
		p.setLayout(new FlowLayout(FlowLayout.CENTER,30,0));
		p.add(lbl);p.add(txt);p.add(btn);
		txt.setOpaque(false);
		lbl.setFont(new Font("monotype corsiva",Font.BOLD,30));
		btn.setBackground(new Color(100,255,190));
		
		p.setBackground(Color.pink);
		p1.setBackground(Color.green);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.gray);
		p4.setBackground(Color.white);
		
		
		p4.add(jsp);p4.add(cmb);
		/*Add Component*/
		cmb.addItem("Matric");cmb.addItem("10+2");cmb.addItem("Under Graduate");cmb.addItem("Graduate");cmb.addItem("Post Graduate");
		p4.add(rd1);p4.add(rd2);
		btnGroup.add(rd1);btnGroup.add(rd2);
		
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		
		
		p4.add(ch1);p4.add(ch2);p4.add(ch3);
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new MyBook();
	}
}