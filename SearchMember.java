import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class SearchMember extends JFrame implements MouseListener, ActionListener, ItemListener
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
  
 
   Color col1,col2;
   JPanel contentPane,panel ,inPanel,panelCenter,panelSouth;
   JButton btnClose=new JButton("CLOSE");
   JButton btnSearch=new JButton("Search");
   JLabel lblID = new JLabel("Member ID :");
   JLabel lblName = new JLabel("Name :");
   JLabel lblGen = new JLabel("Gender :");
   JLabel lblDept = new JLabel("Department :");
   JLabel lblSession = new JLabel("Session :");
   JLabel lblStat = new JLabel("Status :");
   JLabel lblPhone = new JLabel("Phone Number :");
   JLabel lblAadhar = new JLabel("Aadhar Number :");
   	JLabel lblEmail = new JLabel("E-Mail ID :");
	JLabel lblTemp = new JLabel("Temporary Address :");
	String[] item={"Select Option","Member ID","Email Address"}; 
	JLabel lblDob = new JLabel("Date-Of-Birth :");
	JComboBox cb= new JComboBox(item);
	JLabel l1=new JLabel();
	JLabel l2=new JLabel();
	JLabel l3=new JLabel();
	JLabel l4=new JLabel();
	JLabel l5=new JLabel();
	JLabel l6=new JLabel();
	JLabel l7=new JLabel();
	JLabel l8=new JLabel();
	JLabel l9=new JLabel();
	JLabel l10=new JLabel();
	JLabel l11=new JLabel();
	JLabel l12=new JLabel();
	JTextField t = new JTextField();
	JTextField t1 = new JTextField(30);
	JTextField t2 = new JTextField(30);
	
        String columns[] = {"Accession Number", "Title", "Issue Date"};
        JTable table = new JTable();
 

SearchMember()
{
        super("Search For A Member");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        setVisible(true);
        setSize(1000,650);
        setLocationRelativeTo(null);
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBackground(Color.gray);
        add(contentPane);
        contentPane.setLayout(null);
	
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "SELECT A MEMBER"));
        panel.setLayout(null);
		//panel.setBackground(new Color(70,130,180));
		panel.setPreferredSize(new Dimension(495,150));
		panel.setBounds(5,5,495,150);
        contentPane.add(panel,"North");
		
		btnClose.setBounds(800,520,100,30);
		contentPane.add(btnClose);
		
		inPanel = new JPanel();
        inPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "BORROWED BOOK"));
        //inPanel.setLayout(null);
		inPanel.setPreferredSize(new Dimension(432,140));
		inPanel.setBounds(520,11,432,140);
        contentPane.add(inPanel,"East");
		
		panelCenter = new JPanel();
        panelCenter.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "BASIC INFORMATION"));
        panelCenter.setLayout(null);
		panelCenter.setPreferredSize(new Dimension(955,175));
		panelCenter.setBounds(5,170,955,175);
        contentPane.add(panelCenter,"Center");
	
        lblID.setBounds(20,17,70,25);
        panelCenter.add(lblID);
		l1.setBounds(140,17,120,25);
		panelCenter.add(l1);
		col1=btnClose.getBackground();
		col2=lblID.getBackground();
        lblName.setBounds(20,47,120,25);
        panelCenter.add(lblName);
		l2.setBounds(140,47,120,25);
		panelCenter.add(l2);
        lblGen.setBounds(20,77,100,25);
        panelCenter.add(lblGen);
		panelCenter.add(l3);
		l3.setBounds(140,77,120,25);
	
        lblDept.setBounds(20,107,100,25);
        panelCenter.add(lblDept);
		panelCenter.add(l4);
		l4.setBounds(140,107,150,25);
        lblSession.setBounds(430,17,70,25);
        panelCenter.add(lblSession);
        lblStat.setBounds(430,47,140,25);
		panelCenter.add(l11);
		l11.setBounds(590,17,120,25);
        panelCenter.add(lblStat);
		panelCenter.add(l6);
		l6.setBounds(590,47,120,25);
	
        lblAadhar.setBounds(430,77,100,25);
        panelCenter.add(lblAadhar);
		panelCenter.add(l7);
		l7.setBounds(590,77,120,25);
        lblDob.setBounds(430,107,100,25);
        panelCenter.add(lblDob);
		panelCenter.add(l8);
		l8.setBounds(590,107,120,25);
	
		
		panelSouth = new JPanel();
        panelSouth.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "CONTACT INFORMATION"));
        panelSouth.setLayout(null);
		panelSouth.setPreferredSize(new Dimension(955,130));
		panelSouth.setBounds(5,365,955,135);
        contentPane.add(panelSouth,"South");
        lblPhone.setBounds(20,17,100,25);
        panelSouth.add(lblPhone);
		panelSouth.add(l9);
		l9.setBounds(140,17,120,25);
        lblEmail.setBounds(20,47,100,25);
        panelSouth.add(lblEmail);
		panelSouth.add(l12);
		l12.setBounds(140,47,190,25);
        lblTemp.setBounds(20,77,150,25);
        panelSouth.add(lblTemp);
		panelSouth.add(l10);
		l10.setBounds(140,77,190,25);
		
		/*JLabel lblPer = new JLabel("Permanent Address :");
        lblPer.setBounds(20,107,150,25);
        panelSouth.add(lblPer);*/
		
		cb.setBounds(60,35,130,25);
		panel.add(cb);
		
		JLabel l = new JLabel(":");
        l.setBounds(210,36,10, 25);
        panel.add(l);
	
        t.setBounds(225, 35, 156, 25);
        panel.add(t);
        t.setColumns(10);
		
		t1.setBounds(225, 35, 156, 25);
        panel.add(t1);
        t1.setVisible(false);
		t.setVisible(false);
		t1.setBackground(new Color(238,232,170));
	    t.setBackground(new Color(238,232,170));
	
		btnSearch.setBounds(140,100,100,25);
		panel.add(btnSearch);
		
		//String data[][] = {{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}};  //create table with data
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.yellow);
        JScrollPane pane = new JScrollPane(table);
		pane.setPreferredSize(new Dimension(400,100));
        //add the table to the frame
         inPanel.add(pane);
		 
		 
		 btnClose.setBackground(new Color(135,206,250));
		 btnClose.setFocusPainted(false);
		 btnSearch.addActionListener(this);
		 btnClose.addMouseListener(this);
		 cb.addItemListener(this);

  }
  
   public void itemStateChanged(ItemEvent ie)
	{

		  String getItem=(String)cb.getSelectedItem();
		  if(getItem.equals(item[1]))
		  {
		  t.setVisible(true);
	      }	
		  else if(getItem.equals(item[2]))
		  {
		  t.setVisible(false);
		  t1.setVisible(true);
	      }	     		  
	}
  
  public void actionPerformed(ActionEvent ae)
  {
   if(ae.getSource()==btnSearch)
   {
    try
			 {
			 
			    pst=con.prepareStatement("Select mem_id, mem_name, gender,contact,mem_depart,mem_design, address, status,mem_dob, aadhar,session,email from member_info where mem_id=? or  email=? ");
			    pst.setString(1,t.getText());
				pst.setString(2,t1.getText());
			    rst=pst.executeQuery();
				if(rst.next())
				{
                l1.setText(rst.getString("mem_id"));
				l2.setText(rst.getString("mem_name"));
				l3.setText(rst.getString("gender"));
				l4.setText(rst.getString("mem_depart"));
				l5.setText(rst.getString("mem_design"));
				l7.setText(rst.getString("aadhar"));
				l6.setText(rst.getString("status"));
				l8.setText(rst.getString("mem_dob"));
				l9.setText(rst.getString("contact"));
				l10.setText(rst.getString("address"));
				l11.setText(rst.getString("session"));
				l12.setText(rst.getString("email"));
				}
			 
			    pst=con.prepareStatement("Select accession,title,issue_date from issue_book where mem_id=? ");
			    pst.setString(1,t.getText());
				ResultSet rst=pst.executeQuery();
			   DefaultTableModel model=(DefaultTableModel)table.getModel();
	           model.setColumnIdentifiers(columns);
			   model.getDataVector().removeAllElements();
			   ResultSetMetaData rsmd=rst.getMetaData();
			   int colNo=rsmd.getColumnCount();
			   while(rst.next())
			  {
				 Object[] objects=new Object[colNo];
				 for(int i=0;i<colNo;i++)
				 {
				 objects[i]=rst.getObject(i+1);
			     }
              model.addRow(objects);				 
			 }
			   table.setModel(model);
			    
			}
		catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
   }
  }
  
  public void mouseEntered(MouseEvent me)
  {}
  public void mouseExited(MouseEvent me)
  {} 
  public void mouseReleased(MouseEvent me){} 
  public void mouseClicked(MouseEvent me)
  {
  if(me.getSource()==btnClose)
  {
   btnClose.setBackground(Color.lightGray);
  }
  if(me.getSource()==btnClose)
  {
   this.dispose();
  }
  }
  public void mousePressed(MouseEvent me){}  
  
  public static void main(String []args)
  {
   new SearchMember();   
  }

}