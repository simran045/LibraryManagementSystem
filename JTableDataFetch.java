import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
class JTableDataFetch extends JFrame
{
	Connection con;
	PreparedStatement ps;
	int col;
	JPanel p=new JPanel();
	JTableDataFetch()
	{
		add(p);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
			ps=con.prepareStatement("Select * from myfood where pass=?");
			ps.setString(1,JTableExample1.data);
			ResultSet rst=ps.executeQuery();
			ResultSetMetaData rsmt=rst.getMetaData();
			col=rsmt.getColumnCount();
			if(rst.next())
			{
			for(int i=1;i<col;i++)
				p.add(new JLabel(rst.getString(i)));
			}
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}
		setSize(500,500);
		setVisible(true);
	}
}