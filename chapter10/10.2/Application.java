public class Application{
    public static void main(String args[]){
       ClientServerFacade clientFacade;
       String clientAdvertisement="�¹���ԣ��۸�6356Ԫ����ϵ�绰��1234567";
       clientFacade=new ClientServerFacade(clientAdvertisement);
       clientFacade.doAdvertisement();
   }
}
