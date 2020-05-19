import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class DeleteLibrarian extends JFrame implements MouseListener, ActionListener, FocusListener 
{

JPanel contentPane,panel;
 Color col;
 JTextField textField = new JTextField();
 JButton btnDel = new JButton("Delete");
 JButton btnReset = new JButton("Reset");
 JButton btnCancel = new JButton("Cancel");
 
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
  
DeleteLibrarian()
{
        super("Delete Librarian");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     
        setVisible(true);
        setBounds(20, 20, 590, 450);  
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 139, 139));
      //  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel = new JPanel();
        panel.setBounds(72, 57, 450, 250);
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Delete Librarian"));
        panel.setLayout(null);
        contentPane.add(panel);

        textField.setBounds(170, 35, 100, 26);
        panel.add(textField);
        textField.setColumns(10);
		
        JLabel lblNewLabel = new JLabel("Librarian ID :");
        lblNewLabel.setBounds(6, 41, 115, 14);
        panel.add(lblNewLabel);

        btnDel.setBounds(71, 120, 89, 23);
        panel.add(btnDel);

        btnReset.setBounds(171, 120, 89, 23);
        panel.add(btnReset);
        btnCancel.setBounds(271, 120, 89, 23);
        panel.add(btnCancel);
		
	   btnDel.setBackground(new Color(135,206,250));
	   btnReset.setBackground(new Color(135,206,250));
	   btnCancel.setBackground(new Color(135,206,250));


		
		btnDel.addActionListener(this);
		btnReset.addActionListener(this);
		btnCancel.addActionListener(this);
		btnDel.addMouseListener(this);
		btnReset.addMouseListener(this);
		btnCancel.addMouseListener(this);
		textField.addFocusListener(this);
         col=btnDel.getBackground();
	   
  }
    public void focusGained(FocusEvent f)
	{
	  if(f.getSource()==textField)
	  {
	  textField.setBackground(new Color(240,230,140));
	  }
	}
	public void focusLost(FocusEvent f){}
    
    public void mouseEntered(MouseEvent m)
	{}	
	 public void mouseExited(MouseEvent m)
	{
	 if(m.getSource()==btnDel)
	 {
	  btnDel.setBackground(col);
	 }
	  if(m.getSource()==btnReset)
	 {
	  btnReset.setBackground(col);
	 }
	  if(m.getSource()==btnCancel)
	 {
	  btnCancel.setBackground(col);
	 }
	}
	
	public void mouseClicked(MouseEvent m)
	{
	  if(m.getSource()==btnDel)
	 {
	  btnDel.setBackground(Color.gray);
	 }
	  if(m.getSource()==btnReset)
	 {
	  btnReset.setBackground(Color.gray);
	 }
	  if(m.getSource()==btnCancel)
	 {
	  btnCancel.setBackground(Color.gray);
	 }
	}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	
    public void actionPerformed(ActionEvent a)
	{
	  if(a.getSource()==btnDel)
	  {
	   int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete account with this ID", "Delete Librarian",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            try
			{
			pst=con.prepareStatement("delete from lib_registration1 where Lib_id=?");
			pst.setString(1,textField.getText());
			int m=pst.executeUpdate();
			if(m==1)
			{
				JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
			}
			else
		   {
			JOptionPane.showMessageDialog(null, "Sorry! Account with this ID doesnot exist! ");
	       }
		   }
			catch(SQLException ee){JOptionPane.showMessageDialog(null,ee);}
			
	    }
	   }
	  if(a.getSource()==btnReset)
	  {
	   textField.setText(null);
	  }
	   if(a.getSource()==btnCancel)
	  {
	    this.dispose();
	  }
	}  
		
  public static void main(String []args)
  {
   new DeleteLibrarian();   
  }

}