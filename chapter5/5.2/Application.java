public class Application{
   public static void main(String args[]){
      SeekJobCenter center=new SeekJobCenter();                
      UniverStudent zhangLin=new UniverStudent(center,"A.txt");
      HaiGui wangHao=new HaiGui(center,"B.txt");               
      center.giveNewMess("�ڻԹ�˾��Ҫ10��java����Ա��");    
      center.notifyObservers();                                
      center.giveNewMess("������˾��Ҫ8���������ʦ��");
      center.notifyObservers();
      center.giveNewMess("�ʺ���˾��Ҫ9���繤��");
      center.notifyObservers();
      center.giveNewMess("�ʺ���˾��Ҫ9���繤��");      
      center.notifyObservers();                          
  }
}
