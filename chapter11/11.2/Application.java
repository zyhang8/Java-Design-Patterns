import java.util.*;
public class Application{
    public static void main(String args[]){
       int n=20;
       int sum=0;  
       Collection<RenMinMony> set=new HashSet<RenMinMony>();  //���϶���
       for(int i=1;i<=n;i++){
          if(i==n/2||i==n/5||i==n/6)
            set.add(new RenMinMony(100,false));
          else
            set.add(new RenMinMony(100,true)); 
       }
       Iterator<RenMinMony> iterator=set.iterator();       //������
       int jia=1,zhen=1;
       System.out.println("�����乲��"+set.size()+"�������");
       int k=0; 
       while(iterator.hasNext()){
           RenMinMony money=iterator.next();
           k++; 
           if(money.getIsTrue()==false){
              System.out.println("��"+k+"���Ǽٱ�,������");
              iterator.remove();
              k++;
           }
       }
       System.out.println("�����������������"+set.size()+"��,�ܼ�ֵ��:");  
       iterator=set.iterator();
       while(iterator.hasNext()){
           RenMinMony money=iterator.next();
           sum=sum+money.getValue();
       }
       System.out.println(sum+"Ԫ");
   }
}
class RenMinMony{
   int value;
   private boolean isTrue;
   RenMinMony(int value,boolean b){
      this.value=value;
       isTrue=b;
   } 
   public boolean getIsTrue(){
      return isTrue;
   }
   public int getValue(){
      return value;
   }
}

