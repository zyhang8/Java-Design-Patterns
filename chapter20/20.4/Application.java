public class Application{
     public static void main(String args[]) {
           Vehicle carOne=new Vehicle("���̳���");
           Vehicle carTwo=new Vehicle("��ͨ����");
           carOne.startUp();
           carTwo.startUp();  
           carTwo.stop();
           carOne.stop();  
     }
}
