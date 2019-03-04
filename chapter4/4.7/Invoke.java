import javax.swing.*;
import java.awt.event.*;
public class Invoke{
  JButton button;             //������Ҫ�İ�ť
  Command command;
  Invoke(){
     button=new JButton();
     button.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                executeCommand();
              }
            });
  }
  public void setCommand(Command command){
     this.command=command;
     button.setText(command.getName()); //��ť��ʾ���������
  }
  public JButton getButton(){
     return button;
  }
  private void executeCommand(){   
     command.execute();
  }
}
