import java.util.Calendar;
import javax.swing.*;
public class CalendarProduct{
   Calendar calendar; 
   String title;              //�����Ƶı���    
   String [] weekTitle;       //�����Ƶ����ڱ���   
   String [][] dayOfMonth;    //�������һ�����еĺ��������
   int year=2008,month=1;
   public void showCalendarPad(){
       JTable table;
       table=new JTable(dayOfMonth,weekTitle);
       JDialog dialog=new JDialog();
       dialog.setTitle(title);
       dialog.add(new JScrollPane(table));
       dialog.setBounds(130,160,220,180);
       dialog.setVisible(true);
       dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
}
 