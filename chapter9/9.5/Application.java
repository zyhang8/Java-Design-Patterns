public class Application{
    private Handler useInt,useLong,useBig;     //�������ϵĶ���
    public void createChain(){       //����������
       useInt=new UseInt();
       useLong=new UseLong();
       useBig=new UseBigInteger();
       useInt.setNextHandler(useLong);
       useLong.setNextHandler(useBig); 
    }
    public void reponseClient(String number){  //��Ӧ�û�������
       useInt.compuerMultiply(number);
    }
    public static void main(String args[]){
       Application  application=new  Application();
       application.createChain();
       application.reponseClient("32");
   }
}
