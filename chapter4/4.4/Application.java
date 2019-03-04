import java.util.ArrayList;
public class Application{
   public static void main(String args[]){
    ArrayList<Command> list=new ArrayList<Command>();
    RequestPerson person=new RequestPerson();                  //������������
    Command command1=new PintEnglishCommand(new PrintLetter());//������������ָ��������
    Command command2=new PintRussianCommand(new PrintLetter());
    Command command3=new PintEvenNumberCommand(new PrintNumber(20)); 
    list.add(command1);
    list.add(command2);
    list.add(command3); 
    Command macroCommand=new MacroCommand(list);               //���������� 
    System.out.println("�������Ӣ����ĸ��:");
    person.setCommand(command1);
    person.startExecuteCommand();         
    System.out.printf("%n��һ�����������Ӣ����ĸ��,������ĸ���1-20֮���ż��:%n");
    person.setCommand(macroCommand);
    person.startExecuteCommand();
  }
}
