public class Application{
   public static void main(String args[]) {
     OperationDatabase operation1=new OperationAccessDatabase("moon","chengjibiao");
     OperationDatabase operation2=new OperationSQLServerDatabase("teacher","wagesTable");
     System.out.println("��ѯ���ļ�¼:");
     operation1.lookResult(); 
     System.out.println("��ѯ���ļ�¼:");
     operation2.lookResult();     
   }
}
