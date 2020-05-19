import java.awt.*;
import javax.swing.*;

public class SplashScreen1 extends JFrame implements Runnable
{
Toolkit toolkit;
Dimension dim;
static int w,h;
JPanel pnl=new JPanel();
JLabel lblImg=new JLabel();
JLabel lbl4=new JLabel("Loading Library project...");
JLabel lbl1=new JLabel("PrePared By-");
JLabel lbl2=new JLabel("Simran");
JLabel lbl3=new JLabel("This product is licensed to:NIELIT Company");
JLabel lblImage=new JLabel();
JLabel lblProgress=new JLabel();
JProgressBar pro=new JProgressBar();
String str[]=new String[7];
{
str[0]="nielit1.jpg";
str[1]="library1.jpg";
str[2]="library_img1.jpg";
str[3]="library_img.jpg";
str[4]="grl2.jpg";
str[5]="library2.jpg";
str[6]="gi4.jpg";
}

Thread th;
int i=0;
public void run()
{
 for(int j=1;j<=100;j++)
 {
   Image img=new ImageIcon(str[i]).getImage().getScaledInstance(540,260,Image.SCALE_DEFAULT);
   lblImage.setIcon(new ImageIcon(img));
   pro.setValue(j);
   i++;
   lblProgress.setText(j+"% Completed");
   if(i==7)
   i=0;
   try
   {
    Thread.sleep(180);
   }
   catch(InterruptedException iex){}  
 }
 dispose();
 //JOptionPane.showMessageDialog(null,"Progress Completed");
 new HomePage().setVisible(true);
}
SplashScreen1()
{
 super("Library Management System");
 
 th=new Thread(this);
 th.start();
 add(pnl);
 pnl.setLayout(null);
 
 Image img1=new ImageIcon("software_img.png").getImage().getScaledInstance(540,105,Image.SCALE_DEFAULT);
 lblImg.setIcon(new ImageIcon(img1));
 lblImg.setBounds(0,0,540,105);
 lblImage.setBounds(0,106,540,260);
 pnl.add(lblImg);
 
 lbl4.setBounds(200,390,150,20);
 lbl1.setBounds(370,400,120,20);
 lbl2.setBounds(370,421,230,20);
 lbl3.setBounds(12,440,270,13);
 lbl2.setForeground(Color.blue);
 //lbl3.setBounds();
 //lbl4.setBounds();
 pnl.add(lbl4);
 pnl.add(lbl1);
 pnl.add(lbl2);
 pnl.add(lbl3);
 
 pnl.add(lblImage);
// lblProgress.setBounds(440,650,400,30);
 pnl.add(lblProgress);
 pro.setStringPainted(true);
 pro.setBounds(0,367,540,20);
 pnl.add(pro);
 pro.setFont(new Font("arial",Font.BOLD,18));
 setSize(550,500);
 setLocation(400,150);
 setVisible(true);
 }
 
 public static void main(String[] args)
 {
  new SplashScreen1();
 }
}