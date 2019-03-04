import javax.swing.*;
import java.awt.*;
public class Application{
    public static void main(String args[]){
          MyFrame f1=new MyFrame("����������");
          MyFrame f2=new MyFrame( "���Ŀ�����");
          f1.setBounds(10,10,360,150);
          f2.setBounds(370,10,360,150);
          f1.validate();
          f2.validate();
    }
}
class  MyFrame extends JFrame{
    String str;
    MyFrame(String title){
        setTitle(title);
        Moon moon=Moon.getMoon();
        str=moon.show();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        repaint();
   } 
    public void paint(Graphics g){
          super.paint(g);
          g.setFont(new Font("����",Font.BOLD,14));
          g.drawString(str,5,100);
    }
}
