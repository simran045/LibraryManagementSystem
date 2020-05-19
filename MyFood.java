import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class MyFood extends JFrame implements ActionListener
{
	
	Connection con;
	PreparedStatement pst;
	ResultSet rst;
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
		}
		catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
		catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,e);}
	}	
	JPanel p=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("logo.png").getImage(),0,0,200,100,null);
		}
	};
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("food.jpg").getImage(),0,0,400,300,null);
		}
	};
	
	JLabel lbl=new JLabel("User Name");
	JTextField txt=new JTextField(10);
	
	
	JLabel lbl1=new JLabel("Password");
	JPasswordField pass = new JPasswordField(10);
	JLabel lbl2=new JLabel("Drinks");
	JCheckBox ch1=new JCheckBox("Cold Drinks");
	JCheckBox ch2=new JCheckBox("Lassi");
	JCheckBox ch3=new JCheckBox("Coffee");
	JLabel lbl3=new JLabel("Menu");
	
	
      JComboBox cmb=new JComboBox();

	JButton btn=new JButton("update");
	JButton btn1=new JButton("delete");
	JButton btn2=new JButton("search");
	JButton btn5=new JButton("save");
	JButton btn3=new JButton("report");
	JButton btn4=new JButton("exit");
	
	
	
	
	
	
	JRadioButton rd1=new JRadioButton("Veg");
	JRadioButton rd2=new JRadioButton("Non-Veg");
	
	ButtonGroup btnGroup=new ButtonGroup();
	
	
	
	
	MyFood()
	{
		add(p,"North");add(p1,"South");add(p2,"East");
		add(p3,"West");add(p4,"Center");
		
		p.setPreferredSize(new Dimension(600,100));
		p1.setPreferredSize(new Dimension(600,100));
		p2.setPreferredSize(new Dimension(100,400));
		p3.setPreferredSize(new Dimension(100,400));
		
		p.setLayout(new FlowLayout(FlowLayout.CENTER,30,0));
		p4.setLayout(null);
	
		lbl.setBounds(20,10,150,30);
		txt.setBounds(120,10,150,30);
		lbl1.setBounds(20,60,150,30);
		pass.setBounds(120,60,150,30);
		lbl2.setBounds(20,100,150,30);
		ch1.setBounds(120,100,150,30);
		ch2.setBounds(120,120,150,30);
		ch3.setBounds(120,140,150,30);
		lbl3.setBounds(20,180,250,30);
		
		cmb.setBounds(120,180,150,30);
		rd1.setBounds(20,210,150,30);
		rd2.setBounds(20,230,150,30);
		
		
		
		
	
		
		p4.add(lbl);p4.add(txt);
		p4.add(lbl1);p4.add(pass);
		p4.add(lbl2);        p4.add(ch1);p4.add(ch2);p4.add(ch3);
		p4.add(lbl3); p4.add(cmb);  
		p1.add(btn);p1.add(btn1);p1.add(btn2);
		p1.add(btn3);p1.add(btn4);p1.add(btn5);
		txt.setOpaque(true);
		
		lbl.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl.setForeground(new Color(218,165,32));
		lbl1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl1.setForeground(new Color(218,165,32));
		lbl2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl2.setForeground(new Color(218,165,32));
		lbl3.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		lbl3.setForeground(new Color(218,165,32));
		rd1.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		rd1.setForeground(new Color(218,165,32));
		rd2.setFont(new Font("FRANKLIN GOTHIC",Font.BOLD,18));
		rd2.setForeground(new Color(218,165,32));
		btn.setBackground(new Color(100,255,190));
	     btn1.setBackground(new Color(100,255,190));
		 btn2.setBackground(new Color(100,255,190));
		 btn3.setBackground(new Color(100,255,190));
		 btn4.setBackground(new Color(100,255,190));
		p.setBackground(Color.white);
	    p1.setBackground(new Color(225,228,181));
		p2.setBackground(new Color(225,228,181));
		p3.setBackground(new Color(225,228,181));
		
		
		
		
		/*Add Component*/
		cmb.addItem("Chinese");cmb.addItem("Indian");cmb.addItem("Continental"); 
		p4.add(rd1);p4.add(rd2);
		btnGroup.add(rd1);btnGroup.add(rd2);
		
		rd1.setOpaque(false);
		rd2.setOpaque(false);
		
		
		
		setSize(600,500);
		setVisible(true);
		
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn5)
		{
			try
			{
				String drink="",menu="";
				if(ch1.isSelected())
					drink="Cold Drinks-";
				if(ch2.isSelected())
					drink=drink+"Lassi-";
				if(ch3.isSelected())
					drink=drink+"Coffee";
				if(rd1.isSelected())
					menu="Veg";
				else if(rd2.isSelected())
					menu="Non Veg";
				
				pst=con.prepareStatement("insert into myfood values(?,?,?,?,?)");
				pst.setString(1,txt.getText());
				pst.setString(2,pass.getText());
				pst.setString(3,drink);
				pst.setString(4,cmb.getSelectedItem().toString());
				pst.setString(5,menu);
				
				if(pst.executeUpdate()>0)
				{
					JOptionPane.showMessageDialog(null,"Data Saved");
					txt.setText("");
					pass.setText("");
					btnGroup.clearSelection();
					ch1.setSelected(false);
					ch2.setSelected(false);
					ch3.setSelected(false);
					cmb.setSelectedIndex(0);
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		else if(e.getSource()==btn2)
		{
			try{
				String drink="",category="";
				pst=con.prepareStatement("Select * from myfood where pass=?");
				pst.setString(1,pass.getText());
				rst=pst.executeQuery();
				if(rst.next())
				{
					txt.setText(rst.getString("id"));
					drink=rst.getString("drinks");
					cmb.setSelectedItem(rst.getString("menu"));
					category=rst.getString("category");
					String sp[]=drink.split("-");
					for(int i=0;i<sp.length;i++)
					{
						if(sp[i].equals("Cold Drinks"))
							ch1.setSelected(true);
						if(sp[i].equals("Lassi"))
							ch2.setSelected(true);
						if(sp[i].equals("Coffee"))
							ch3.setSelected(true);
					}
					if(category.equals("Veg"))
						rd1.setSelected(true);
					if(category.equals("Non-Veg"))
						rd2.setSelected(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Data Not Found");
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		else if(e.getSource()==btn)
		{
			try
			{
				String drink="",menu="";
				if(ch1.isSelected())
					drink="Cold Drinks-";
				if(ch2.isSelected())
					drink=drink+"Lassi-";
				if(ch3.isSelected())
					drink=drink+"Coffee";
				if(rd1.isSelected())
					menu="Veg";
				else if(rd2.isSelected())
					menu="Non Veg";
				
				pst=con.prepareStatement("update myfood set id=?,drinks=?,menu=?, category=? where pass=?");
				pst.setString(1,txt.getText());
				pst.setString(2,drink);
				pst.setString(3,cmb.getSelectedItem().toString());
				pst.setString(4,menu);
				pst.setString(5,pass.getText());
				if(pst.executeUpdate()>0)
				{
					JOptionPane.showMessageDialog(null,"Data Updated");
					txt.setText("");
					pass.setText("");
					btnGroup.clearSelection();
					ch1.setSelected(false);
					ch2.setSelected(false);
					ch3.setSelected(false);
					cmb.setSelectedIndex(0);
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		else if(e.getSource()==btn1)
		{
			try
			{
				pst=con.prepareStatement("Delete from myfood where pass=?");
				pst.setString(1,pass.getText());
				if(pst.executeUpdate()>0)
				{
					JOptionPane.showMessageDialog(null,"Data Deleted successfully");
					txt.setText("");
					pass.setText("");
					btnGroup.clearSelection();
					ch1.setSelected(false);
					ch2.setSelected(false);
					ch3.setSelected(false);
					cmb.setSelectedIndex(0);
				}
			}
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
		}
		else if(e.getSource()==btn4)
		{
			System.exit(0);
		}
		else if(e.getSource()==btn3)
		{
			new Food();
		}
	}
	public static void main(String[]args)
	{
		new MyFood();
	}
}