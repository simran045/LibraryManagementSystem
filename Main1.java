import javax.swing.SwingUtilities;
import java.lang.*;
import java.util.*;
public class Main1 
{
    public static void main(String args[]) throws Exception
    {
        Splash s=new Splash();
        s.setVisible(true);
        Thread t=Thread.currentThread();
        t.sleep(10000);
        s.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                //opening the main application
                 new HomePage().setVisible(true);
            }
        });
    }
 
}