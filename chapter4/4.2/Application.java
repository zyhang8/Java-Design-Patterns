public class Application{
   public static void main(String args[]){
      CompanyArmy ����=new CompanyArmy();         //����������
      Command command=new ConcreteCommand(����);  //�����������ָ��������
      ArmySuperior ָ�ӹ�=new ArmySuperior();     //����������
      ָ�ӹ�.setCommand(command);                 
      ָ�ӹ�.startExecuteCommand();
   }
}
