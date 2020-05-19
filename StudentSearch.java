import java.awt.*;
import javax.swing.*;
class StudentSearch extends JFrame
{
	
	
	 
     JLabel labelID = new JLabel("Enter Student ID: ");
     JPasswordField fieldID = new JPasswordField(20);
	 JLabel labelCategory = new JLabel("Select Course : ");
	 JComboBox course =new JComboBox();
     JButton btnsearch = new JButton("Search");
     Dimension d;
     Toolkit t;
     int w,h;	 
        
	StudentSearch()
	{
	     
	    super("Search Student");
		JPanel mainPanel=new JPanel();
        mainPanel.setBackground(Color.yellow);		
	
		// create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
         newPanel.setBackground(Color.pink);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(20, 10, 30, 120);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelID, constraints);
         
        constraints.gridx = 1;
        newPanel.add(fieldID, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;		
        newPanel.add(labelCategory, constraints);
			
		course.addItem("Computer");
	    course.addItem("IT");
	    course.addItem("Electronics");
		constraints.gridx = 3;
		constraints.anchor = GridBagConstraints.WEST;
        newPanel.add(course, constraints);
		
		
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 4;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(btnsearch, constraints);
         
        //set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Search Student"));
         
        // add the panel to this frame
		add(mainPanel);
		mainPanel.add(newPanel);
		
		         		 
        pack();
        //setLocationRelativeTo(null);
		
		t=Toolkit.getDefaultToolkit();
	    d=t.getScreenSize();
	    h=(int)d.getHeight();
	    w=(int)d.getWidth(); 
		setSize(w,h);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new StudentSearch();
	}
}