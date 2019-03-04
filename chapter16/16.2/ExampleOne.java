class Circle implements Cloneable{   //ʵ��Cloneable�ӿ�
     private double radius;
     public void setRadius(double r){
           radius=r;
    }
    public double getRadius(){
          return radius;
    }
    public Object clone() throws CloneNotSupportedException{ //��дclone����
          Object  object=super.clone();
          return object;
    }
}
public class ExampleOne{
    public static void main(String args[]){
         Circle circle=new Circle();
         circle.setRadius(198.99);
         try{
              Circle circleCopy=(Circle)circle.clone();//����clone()�����Լ�
              System.out.println("circle�����е����ݣ�"+circle.getRadius());
              System.out.println("circleCopy�����е����ݣ�"+circle.getRadius()); 
           }
          catch(CloneNotSupportedException exp){} 
    } 
}
