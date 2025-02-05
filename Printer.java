import java.awt.*;
import java.awt.print.*;

public class Printer implements Printable
{
 final Component comp;
 public Printer(Component comp)
 { 
   this.comp=comp;
 }
 public int print(Graphics g,PageFormat format,int page_index) throws PrinterException
 {
   if(page_index > 0)
   { 
    return Printable.NO_SUCH_PAGE;
   }
 Dimension dim=comp.getSize();
 double cHeight=dim.getHeight();
 double cWidth=dim.getWidth();
 double pHeight=format.getImageableHeight();
 double pWidth=format.getImageableWidth();
 double pxStart=format.getImageableX();
 double pyStart=format.getImageableY();
 double xRatio=pWidth /cWidth;
 double yRatio=pHeight/cHeight;
 Graphics2D g2=(Graphics2D)g;
 g2.translate(pxStart,pyStart);
 g2.scale(xRatio,yRatio);
 comp.printAll(g2);
 return Printable.PAGE_EXISTS;
}
}