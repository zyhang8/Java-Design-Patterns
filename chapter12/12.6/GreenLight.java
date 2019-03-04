import javax.swing.*;
import java.awt.Font;
public class GreenLight extends JLabel{
   ImageIcon onIcon,offIcon;
   GreenLight(){
      onIcon=new ImageIcon("onGreen.jpg");
      offIcon=new ImageIcon("offGreen.jpg");
      setHorizontalTextPosition(AbstractButton.CENTER);
      setVerticalTextPosition(AbstractButton.CENTER);
      setFont(new Font("����",Font.BOLD,11));  
   }
   public void on(){
      setIcon(onIcon);
      setText("�̵���"); 
   }
   public void off(){
      setIcon(offIcon);
      setText("�̵���");
   }
}