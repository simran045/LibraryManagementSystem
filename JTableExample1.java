import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
class JTableExample1 extends JFrame
{
	JTable tab=new JTable();
	JScrollPane jsp=new JScrollPane(tab);
	DefaultTableModel dtm;
	int row,col;
	Connection con;
	String colHead[];
	PreparedStatement ps;
	static String data;
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			ps=con.prepareStatement("Select count(*) from myfood");
			ResultSet rst=ps.executeQuery();
			if(rst.next())
			row=rst.getInt(1);
			ps=con.prepareStatement("Select * from myfood");
			rst=ps.executeQuery();
			ResultSetMetaData rsmt=rst.getMetaData();
			col=rsmt.getColumnCount();
			colHead=new String[col];
			for(int k=0;k<col;k++)
			{
				colHead[k]=rsmt.getColumnName(k+1);
			}
			dtm=new DefaultTableModel(row,col);
			tab.setModel(dtm);
			int r=0;
			while(rst.next())
			{
				for(int j=0;j<col;j++)
					tab.setValueAt(rst.getString(j+1),r,j);
				r++;
			}
			TableColumnModel tcm=tab.getColumnModel();
			for(int k=0;k<col;k++)
			{
				tcm.getColumn(k).setHeaderValue(colHead[k]);
			}
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}
		
	}
	JTableExample1()
	{
		add(jsp);
		setSize(500,500);
		setVisible(true);
		tab.addMouseListener(
		new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				int sel_Row=tab.getSelectedRow();
				data=tab.getValueAt(sel_Row,1).toString();
				dispose();
				new JTableDataFetch();
			}
		}
		);
	}
	public static void main(String []args)
	{
		new JTableExample1();
	}
}