public class Application{
     public static void main(String args[]) {
           ElementFactory  factory=ElementFactory.getFactory();
           String key="CO",name;
           int number1,number2;
           Element  element=factory.getElement(key);
           number1=1;
           number2=2;
           name="������̼";
           Compound compound=new Compound(element,name,number1,number2);
           element.printMess(name,number1,number2);
           number1=1;
           number2=1;
           name="һ����̼";
           compound=new Compound(element,name,number1,number2);
           element.printMess(name,number1,number2);
            key="HO";
           element=factory.getElement(key);
           number1=2;
           number2=1;
           name="ˮ";
           compound=new Compound(element,name,number1,number2);
           element.printMess(name,number1,number2);
           number1=2;
           number2=2;
           name="��������";
           compound=new Compound(element,name,number1,number2);
           element.printMess(name,number1,number2);
     }
}
