public class Car{
     Flyweight  flyweight;    //�����Ԫ���������
     String name,color;
     int power;
     Car(Flyweight  flyweight,String name,String color,int power){
           this.flyweight=flyweight;
           this.name=name;
           this.color=color;
           this.power=power;
     }
    public void print(){
          System.out.print(" ���ƣ�"+name);
          System.out.print(" ��ɫ��"+color);
          System.out.print(" ���ʣ�"+power); 
          System.out.print(" ��ȣ�"+flyweight.getWidth());
          System.out.print(" �߶ȣ�"+flyweight.getHeight());
          System.out.println("���ȣ�"+flyweight.getLength());
         
    }
} 