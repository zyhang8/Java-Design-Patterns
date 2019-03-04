import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class  AutoCoffeeMachine extends JFrame {
       State  haveCoffeeNoCoin,haveCoffeeAndCoin,haveNotCaffee;
       State  state;   
       JButton putInCoin,getCaffee;  
       JLabel messShowing;
       int caffeeCount;             //��¼һ���ж��ٱ����� 
       AutoCoffeeMachine(int caffeeCount){
               this.caffeeCount=caffeeCount;
               haveCoffeeNoCoin=new HaveCoffeeNoCoin(this);
               haveCoffeeAndCoin=new HaveCoffeeAndCoin(this);
               haveNotCaffee=new HaveNotCaffee(this);
               state=haveCoffeeNoCoin;   //���Ȼ���Ĭ��״̬���п��ȵ�����Ͷ��
               putInCoin=new JButton("Ͷ��");
               getCaffee=new JButton("ȡ����");
               putInCoin.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent exp){
                      if(state==haveCoffeeNoCoin){
                             state=haveCoffeeAndCoin;
                             messShowing.setText("��Ͷ��һԪ");
                             messShowing.setIcon(new ImageIcon("machine.jpg"));
                      }
                      else if(state==haveCoffeeAndCoin){
                            messShowing.setText("���Ѿ�Ͷ��һԪ����ȡ����");
                            messShowing.setIcon(new ImageIcon("machine.jpg"));
                      }
                      else if(state==haveNotCaffee){
                            messShowing.setText("û�п��ȣ��޷�Ͷ��");
                            messShowing.setIcon(new ImageIcon("no.jpg"));
                     }}});
               getCaffee=new JButton("ȡ����");
               getCaffee.addActionListener(new ActionListener(){
                                 public void actionPerformed(ActionEvent exp){
                                           giveAnCupCaffee();   
                                     }});
               messShowing=new JLabel();
               messShowing.setIcon(new ImageIcon("machine.jpg"));
               messShowing.setFont(new Font("",Font.BOLD,14));
               JPanel pSouth=new JPanel();
               pSouth.add(putInCoin);
               pSouth.add(getCaffee);
               add(messShowing,BorderLayout.CENTER);
               add(pSouth,BorderLayout.SOUTH);
               setVisible(true);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
      public  void  giveAnCupCaffee(){
            state.giveAnCupCaffee();  
      }
      public void showMessage(){
            state.showMessage();
      }
      public void setState(State state){
           this.state=state;
      }
      public  State getHaveCoffeeNoCoin(){
           return haveCoffeeNoCoin;
      }
      public  State getHaveCoffeeAndCoin(){
           return haveCoffeeAndCoin;
      }
      public  State getHaveNotCaffee(){
           return haveNotCaffee;
      }
      public int getCaffeeCount(){
          return caffeeCount;
      }
      public void setCaffeeCount(int n){
          caffeeCount=n;
     }
}
