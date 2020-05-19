import java.awt.Color;
import java.awt.*;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class BookStatus1 extends JFrame 
{
   JPanel centerP = new JPanel();
   JPanel northP  = new JPanel();
   JPanel p1  = new JPanel();   

    
  public BookStatus1() 
  {
    super("Book Status");
    setSize(900, 640);

    JPanel content = new JPanel();
    content.setLayout(null);
	northP.setLayout(null);
	centerP.setLayout(null);
	p1.setLayout(null);
	
	northP.setBorder( BorderFactory.createLineBorder(Color.black));
	add(content);
    content.add(northP,"North");
	northP.setPreferredSize(new Dimension(870,105));
    northP.setBounds(15,5,870,105);
	
    JLabel deptLabel = new JLabel("Department :");
	deptLabel.setBounds(30,40,100,25);
    northP.add(deptLabel);
	
	JComboBox cbDept= new JComboBox();
	cbDept.addItem("SELECT DEPT");
	cbDept.addItem("ALL");
	cbDept.addItem("CSE");
	cbDept.addItem("IT");
	cbDept.addItem("ELECTRONICS");
	cbDept.addItem("NO DEPT");
	cbDept.setBounds(150,40,130,25);
    northP.add(cbDept);
	
    JLabel accLabel = new JLabel("Accession Number :");
	accLabel.setBounds(350,40,150,25);
    northP.add(accLabel);
	
	JTextField txt1 = new JTextField(20);
	txt1.setBounds(500,40,145,25);
    northP.add(txt1);

	JButton btnShow = new JButton("Show");
	btnShow.setBounds(720,40,100,25);
    northP.add(btnShow);
 
    centerP.setPreferredSize(new Dimension(870,480));
    centerP.setBounds(15,115,870,480);
    content.add(centerP,"Center"); 
	centerP.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
	
	JLabel titleLabel = new JLabel("Book Title :");
	titleLabel.setBounds(10,30,100,25);
    centerP.add(titleLabel);
	
    JTextField txt2 = new JTextField(60);
	txt2.setBounds(10,55,820,25);
    centerP.add(txt2);
	
	JLabel authorLabel = new JLabel("Author(s) :");
	authorLabel.setBounds(10,100,100,25);
    centerP.add(authorLabel);
	
	JTextArea area = new JTextArea(200,70);
	area.setBounds(10,125,350,70);
    centerP.add(area);
	
	JLabel priceLabel = new JLabel("Book Price :");
	priceLabel.setBounds(570,100,100,25);
    centerP.add(priceLabel);
	
	JTextField txt3 = new JTextField(20);
	txt3.setBounds(705,100,110,25);
    centerP.add(txt3);
	
	 JRadioButton active = new JRadioButton("Active");
     JRadioButton lost = new JRadioButton("Lost");
	 JRadioButton write = new JRadioButton("Write-Off");
     ButtonGroup bG = new ButtonGroup();
     bG.add(active);
     bG.add(lost);
     bG.add(write);	
	 
	active.setBounds(10,200,70,25);
	centerP.add(active);
	
	lost.setBounds(100,200,70,25);
	centerP.add(lost);
	
	write.setBounds(200,200,100,25);
	centerP.add(write);
	
	 JRadioButton in = new JRadioButton("In");
     JRadioButton out = new JRadioButton("Out");
     ButtonGroup bG1 = new ButtonGroup();
     bG1.add(in);
     bG1.add(out);	
	 in.setBounds(520,200,70,25);
	 centerP.add(in);
	
	out.setBounds(610,200,70,25);
	centerP.add(out);
	
	 p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Issued to Member"));
	 centerP.add(p1,"West");
	 p1.setPreferredSize(new Dimension(630,190));
     p1.setBounds(30,250,630,190);
	 
	JLabel name = new JLabel("Student Name :");
	name.setBounds(70,275,160,20);
    centerP.add(name);
	
	JTextField txt4= new JTextField(20);
	txt4.setBounds(70,320,400,25);
    centerP.add(txt4);
	 
	 JLabel dept1Label = new JLabel("Department/course :");
	 dept1Label.setBounds(70,360,160,25);
     centerP.add(dept1Label);
	
	JTextField txt5 = new JTextField(20);
	txt5.setBounds(70,400,400,25);
    centerP.add(txt5);
	 
	 
	 JButton btnExit = new JButton("Exit");
	 btnExit.setBounds(705,430,100,25);
	 centerP.add(btnExit);
	
	setResizable(false);
    setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String args[]) 
  {
    new BookStatus1();
  }
}
          
         