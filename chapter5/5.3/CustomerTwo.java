import java.io.*;
public class CustomerTwo implements Observer{
   Subject subject;
   double oldPrice,newPrice;
   String personName;  
   CustomerTwo(Subject subject,String personName){
      this.subject=subject;
      this.personName=personName;
      subject.addObserver(this);  
   }
   public void update(){
      if(subject instanceof ShopSubject){
        oldPrice=((ShopSubject)subject).getOldPrice();//���þ��������ṩ��getOldPrice()����
        newPrice=((ShopSubject)subject).getNewPrice();//���þ��������ṩ��getNewPrice()����
        System.out.println(personName+"ֻ����Ʒ��ԭ�ۺ��ۿۺ�ļ۸����Ȥ:");
        System.out.println("ԭ����:"+oldPrice);
        System.out.println("�ּ���:"+newPrice);
      }
   } 
}