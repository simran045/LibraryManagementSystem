import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TeacherListTable extends JFrame {
private JTable table;

/**
* Launch the application.

*/

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
 TeacherListTable frame = new TeacherListTable();
frame.setVisible(true);

}
});
}

/**
* Create the frame.
*/
public TeacherListTable() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(600,400);

setTitle("Teacher details");
getContentPane().setLayout(null);
// ScrollPane
JScrollPane scrollPane = new JScrollPane(table);
scrollPane.setBounds(64, 44, 440, 89);
getContentPane().add(scrollPane);
// Table
table = new JTable()
{
@Override
public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
Component comp = super.prepareRenderer(renderer, row, column);
comp.setBackground(row % 2 == 0 ? Color.white : Color.orange);
return comp;
}

};
scrollPane.setViewportView(table);

// Windows Loaded
addWindowListener(new WindowAdapter() {
@Override
public void windowOpened(WindowEvent e) {
PopulateData();
}
});
}
 

private void PopulateData()
{
// Model for Table
DefaultTableModel model = (DefaultTableModel)table.getModel();
model.addColumn("Serial No.");
model.addColumn("Member ID");
model.addColumn("Name");
model.addColumn("Qualifications");
model.addColumn("Date-of-Birth");
model.addColumn("Email ID");
model.addColumn("Contact Number");
model.addColumn("Address");
model.addColumn("Status");

/*Connection connect = null;
Statement s = null;

try {
Class.forName("com.mysql.jdbc.Driver");
connect =  DriverManager.getConnection("jdbc:mysql://localhost/mydatabase" +
"?user=root&password=root");
s = connect.createStatement();
String sql = "SELECT * FROM  customer ORDER BY CustomerID ASC";
ResultSet rec = s.executeQuery(sql);
int row = 0;

while((rec!=null) && (rec.next()))
{          
model.addRow(new Object[0]);
model.setValueAt(rec.getString("CustomerID"), row, 0);
model.setValueAt(rec.getString("Name"), row, 1);
model.setValueAt(rec.getString("Email"), row, 2);
model.setValueAt(rec.getString("CountryCode"), row, 3);
model.setValueAt(rec.getFloat("Budget"), row, 4);
model.setValueAt(rec.getFloat("Used"), row, 5);
row++;
}

rec.close();
} catch (Exception e) {

// TODO Auto-generated catch block
JOptionPane.showMessageDialog(null, e.getMessage());
e.printStackTrace();
}
try {
if(s != null) {
s.close();
connect.close();

}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}*/
}
}
