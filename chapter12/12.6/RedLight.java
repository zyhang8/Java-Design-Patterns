import javax.swing.*;
import java.awt.Font;
public class RedLight extends JLabel{
   ImageIcon onIcon,offIcon;
   RedLight(){
      onIcon=new ImageIcon("onRed.jpg");
      offIcon=new ImageIcon("offRed.jpg");
      setHorizontalTextPosition(AbstractButton.CENTER);
      setVerticalTextPosition(AbstractButton.CENTER); 
      setFont(new Font("����",Font.BOLD,11)); 
   }
   public void on(){
      setIcon(onIcon);
      setText("�����");
   }
   public void off(){
      setIcon(offIcon);
      setText("�����");
   }
}