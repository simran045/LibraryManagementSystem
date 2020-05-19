import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Main {
  public static void main(String[] argv)  
  {
  try
  {
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);

    model.addColumn("Col1");
    model.addColumn("Col2");
  }
        catch(SQLException e){}
		catch(ClassNotFoundException e){}
    JFrame f = new JFrame();
    f.setSize(300, 300);
    //f.add(new JScrollPane(table));
    f.setVisible(true);
  }
}
