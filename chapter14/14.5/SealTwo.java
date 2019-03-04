import java.awt.image.*;
import java.awt.geom.*;
import java.awt.*;
public class SealTwo implements Seal{
     BufferedImage image;
    Graphics2D g;
    SealTwo(){
       image=new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
       g=image.createGraphics();                                 
       g.setColor(Color.white);
       Rectangle2D rect=new Rectangle2D.Double(0,0,100,100);  
       g.fill(rect); 
       g.setColor(Color.red);
       BasicStroke bs=
       new BasicStroke(3f,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND);
       rect=new Rectangle2D.Double (5,6,80,80);
       g.setStroke(bs);
       g.draw(rect);
       g.setFont(new Font("����",Font.BOLD,14));
       g.drawString("��������",16,50);                                             }
   public Image getImage(){
        return image;
   }
}
