public class ConcreteCommand implements Command{
   CompanyArmy army;           //���н����ߵ�����
   ConcreteCommand(CompanyArmy army){
      this.army=army;
   }
   public  void execute(){    //��װ��ָ�ӹٵ�����
      army.sneakAttack();     //͵Ϯ����  
   }
}
