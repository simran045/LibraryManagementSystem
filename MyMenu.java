import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMenu extends JFrame  
{
   
     Toolkit toolkit;
     Dimension dim;	
     JPanel p=new JPanel()
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage(new ImageIcon("use.jpg").getImage(),0,0,1450,250,null);
		}
	};	 
     //JTextArea field= new JTextArea();
	 
	
	
     JMenuBar bar=new JMenuBar();
	 JMenu books = new JMenu("Books");
	 JMenuItem addBook = new JMenuItem("Add book");
	 JMenuItem editBook = new JMenuItem("Edit/Update book");
	 JMenuItem deleteBook = new JMenuItem("Delete Book");
	 JMenuItem languageBook = new JMenuItem(" Book Language");
     JMenuItem exit = new JMenuItem("Exit");
		 
	 JMenu search = new JMenu("Search");
	 JMenuItem searchb = new JMenuItem("Book Search");
	 JMenu searchM = new JMenu("Search Member ");
	 JMenuItem searchS = new JMenuItem(" Search Student");
	 JMenuItem searchT = new JMenuItem("Search Teacher ");
     JMenuItem status = new JMenuItem("Book Status");
	 
	 JMenu circulation = new JMenu("Circulation");
	 JMenuItem issueBook = new JMenuItem("Issue Book");
	 JMenuItem returnBook = new JMenuItem("Return Book");
	 JMenuItem rissueBook = new JMenuItem("RE-Issue book");
	 
	 JMenu reports = new JMenu("Reports");
	 JMenu memberDetails = new JMenu("Member Details");
	  JMenuItem teacher = new JMenuItem("Teacher Details");
	  JMenuItem student = new JMenuItem("Student Details");
	 JMenuItem bookStock = new JMenuItem("Book Stock");
     JMenuItem issueBookDetails = new JMenuItem("Issue Book Details");
	 JMenuItem returnBookDetails = new JMenuItem("Return Book Details");
	
	 JMenu help  = new JMenu("Help");
	 JMenuItem viewHelp = new JMenuItem("View Help");
	 JMenuItem aboutLib = new JMenuItem("About Library");
	 
	 
	 public JScrollPane pane=new JScrollPane();
	 
       public MyMenu()
      {
          super("Library Management System");
		  add(p);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		 // pane.add(field);
		  //setContentPane(pane);
		  
		 books.add(addBook);
	     books.add(editBook);
	     books.add(deleteBook);
	     books.add(languageBook);
	     books.add(exit);
		
         search.add(searchb);
		 search.add(searchM);
		 searchM.add(searchS);
		 searchM.add(searchT);
	     search.add(status);		
		 
		 circulation.add(issueBook);
	     circulation.add(returnBook);
	     circulation.add(rissueBook);
	 
		 reports.add(memberDetails);
		 memberDetails.add(teacher);
		 memberDetails.add(student);
	     reports.add(bookStock);
	     reports.add(issueBookDetails);
	     reports.add(returnBookDetails);
		  
         help.add(viewHelp);
	     help.add(aboutLib); 
       		 
		  bar.add(books);
		  bar.add(search);
		  bar.add(circulation);
		  bar.add(reports);
		  bar.add(help);
		  
		  
		   toolkit=Toolkit.getDefaultToolkit();
		   dim=toolkit.getScreenSize();
		   int h=(int)dim.getHeight();
		   int  w=(int)dim.getWidth(); 
		   setSize(w,h);
		   setJMenuBar(bar);
		   setVisible(true);
		  
		  searchb.addMouseListener(new MouseAdapter() 
		  {   
		  
		  public void mousePressed(MouseEvent e)
		  {
			   if(e.getSource()==searchb)
				   new BookSearch().setVisible(true);
			   
		  }
  });
  
           status.addMouseListener(new MouseAdapter() 
		  {   
		  
		  public void mousePressed(MouseEvent e)
		  {
			   if(e.getSource()==status)
				   new BookStatus1().setVisible(true);
			   
		  }
  });
  
  
          issueBookDetails.addMouseListener(new MouseAdapter()
	 {		  
		  public void mousePressed(MouseEvent ee)
		  {
               if(ee.getSource()==issueBookDetails)
				   new IssueBookTable().setVisible(true);
	      }
	 });
	 
	  returnBookDetails.addMouseListener(new MouseAdapter() 
		  {   
		  
		  public void mousePressed(MouseEvent e)
		  {
			   if(e.getSource()==returnBookDetails)
				   new ReturnBookTable().setVisible(true);
			   
		  }
  });
 
 
     teacher.addMouseListener(new MouseAdapter() 
		  {   
		  
		  public void mousePressed(MouseEvent e)
		  {
			   if(e.getSource()==teacher)
				   new TeacherListTable().setVisible(true);
			   
		  }
  });
  
     student.addMouseListener(new MouseAdapter() 
		  {   
		  
		  public void mousePressed(MouseEvent e)
		  {
			   if(e.getSource()==student)
				   new StudentTable().setVisible(true);
			   
		  }
  });
        languageBook.addMouseListener(new MouseAdapter()
	 {		  
		  public void mousePressed(MouseEvent e)
		  {
               if(e.getSource()==languageBook)
				   new BookLanguage().setVisible(true);
	      }
	 });
 
 deleteBook.addMouseListener(new MouseAdapter()
	 {		  
		  public void mousePressed(MouseEvent ee)
		  {
               if(ee.getSource()==deleteBook)
				   new DeleteBook().setVisible(true);
	      }
	 });
 
 
}
  public static void main(String[] args)
  {
      new MyMenu();
	  
  }
  
 }