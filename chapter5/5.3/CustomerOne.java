import java.io.*;
public class CustomerOne implements Observer{
   Subject subject;
   String goodsName,personName;  
   CustomerOne(Subject subject,String personName){
      this.subject=subject;
      this.personName=personName;
      subject.addObserver(this);  
   }
   public void update(){
      if(subject instanceof ShopSubject){
         goodsName=((ShopSubject)subject).getGoodsName();//���þ��������ṩ�ķ���
         System.out.println(personName+"ֻ�Դ�����Ʒ�����ָ���Ȥ:");
         System.out.println("���۵���Ʒ��:"+goodsName);
      }
   } 
}