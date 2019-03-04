import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Application extends JFrame implements ActionListener{
       JButton  start;
       Player playerOne,playerTwo,playerThree;
       JButton  one,two,three;
       JTextField showLabel;
       int width=60;
       int height=28;
       int MaxDistance=460;
       public Application(){
           setLayout(null);
           start=new JButton("��ʼ����");
           start.addActionListener(this);
           add(start);
           start.setBounds(200,30,90,20);
           showLabel=new JTextField("�ھ�����˭�أ�");
           showLabel.setEditable(false);
           add(showLabel);
           showLabel.setBounds(300,30,120,20);
           showLabel.setBackground(Color.orange);
           showLabel.setFont(new Font("����",Font.BOLD,16));
           one=new JButton("�տ�"); 
           one.setSize(60,30);
           one.setBackground(Color.yellow); 
           playerOne=new Player(18,2,MaxDistance,one,width,height,showLabel);
           two=new JButton("�"); 
           two.setSize(65,30); 
           two.setBackground(Color.cyan);
           playerTwo=new Player(19,2,MaxDistance,two,width,height,showLabel);
           three=new JButton("����");
           three.setSize(62,30);
           three.setBackground(Color.green); 
           playerThree=new Player(21,2,MaxDistance,three,width,height,showLabel);
           initPosition();
           setBounds(100,100,600,300);
           setVisible(true);
           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void  initPosition(){
            Champion.initChampion();
            showLabel.setText("�ھ�����˭�أ�");
            repaint();
            remove(one);
            remove(two);
            remove(three) ;
            add(one);
            add(two);
            add(three);
            one.setLocation(1,60);
            two.setLocation(1,60+height+2);
            three.setLocation(1,60+2*height+4);
    }
    public void actionPerformed(ActionEvent e){
          boolean boo=playerOne.isAlive()||playerTwo.isAlive()||playerThree.isAlive();
          if(boo==false){
                 initPosition();
                 int m=(int)(Math.random()*2)+19;
                 playerOne=new Player(m,2,MaxDistance,one,width,height,showLabel);
                 m=(int)(Math.random()*3)+18;
                 playerTwo=new Player(m,2,MaxDistance,two,width,height,showLabel);
                 m=(int)(Math.random()*4)+17;
                 playerThree=new Player(m,2,MaxDistance,three,width,height,showLabel);
          }
          try{
                  playerOne.start();
                  playerTwo.start();
                  playerThree.start();
          }
          catch(Exception exp){}
    }
    public void paint(Graphics g){
           super.paint(g);
           g.drawLine(MaxDistance,0,MaxDistance,MaxDistance);
    }
    public static void main(String args[]){
           new Application();
    }
}
