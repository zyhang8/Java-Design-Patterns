import java.io.*;
public class Goat implements Prototype,Serializable{
       StringBuffer color;
       public void setColor(StringBuffer c){
             color=c;
      }
      public  StringBuffer getColor(){
            return color;
      }
      public Object cloneMe() throws CloneNotSupportedException{ //ʵ�ֽӿ��еķ���
            Object object=null;
            try{ 
                   ByteArrayOutputStream outOne=new ByteArrayOutputStream();
                   ObjectOutputStream outTwo=new ObjectOutputStream(outOne);
                   outTwo.writeObject(this);     //��ԭ�Ͷ���д����������
                   ByteArrayInputStream  inOne=
                   new ByteArrayInputStream(outOne.toByteArray());
                   ObjectInputStream inTwo=new ObjectInputStream(inOne);
                   object=inTwo.readObject();    //�����µĶ���ԭ�͵ĸ���Ʒ
           }
           catch(Exception event){
                   System.out.println(event);
           }
           return object;
      }
}
