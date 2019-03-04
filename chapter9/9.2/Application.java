public class Application{
    private Handler beijing,shanghai,tianjin;    //�������ϵĶ���
    public void createChain(){       //����������
       beijing=new Beijing();
       shanghai=new Shanghai();
       tianjin=new Tianjin();
       beijing.setNextHandler(shanghai);
       shanghai.setNextHandler(tianjin);
    }
    public void reponseClient(String number){  //��Ӧ�û�������
       beijing.handleRequest(number);
    }
    public static void main(String args[]){
       Application  application=new  Application();
       application.createChain();
       application.reponseClient("77720810340930632");;
    }
}

