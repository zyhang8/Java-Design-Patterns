import java.io.*;
public class Application{
   public static void main(String args[]){
     File fileOne=new File("A.txt");
     File fileTwo=new File("B.txt");
     String s="";
     EncodeContext encode=new EncodeContext();         //�����Ķ���
     encode.setStrategy(new StrategyOne("���hello")); //�����Ķ���ʹ�ò���һ
     encode.encryptFile(fileOne);
     System.out.println(fileOne.getName()+"���ܺ������:");
     try{  FileReader inOne=new FileReader(fileOne);
           BufferedReader inTwo= new BufferedReader(inOne);
           while((s=inTwo.readLine())!=null){
             System.out.println(s);
           } 
           inOne.close();
           inTwo.close();
     }
     catch(IOException exp){} 
     String str=encode.decryptFile(fileOne); 
     System.out.println(fileOne.getName()+"���ܺ������:");
     System.out.println(str);
     encode.setStrategy(new StrategyTwo("����game"));  //�����Ķ���ʹ�ò��Զ�
     encode.encryptFile(fileTwo);
     System.out.println("\n"+fileTwo.getName()+"���ܺ������:");
     try{  FileReader inOne=new FileReader(fileTwo);
           BufferedReader inTwo= new BufferedReader(inOne);
           while((s=inTwo.readLine())!=null){
             System.out.println(s);
           } 
           inOne.close();
           inTwo.close();
     }
     catch(IOException exp){}
     str=encode.decryptFile(fileTwo); 
     System.out.println(fileTwo.getName()+"���ܺ������:");
     System.out.println(str); 
  }
}
