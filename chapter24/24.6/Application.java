import java.util.*;
public class Application{
     public static void main(String args[]) {
           Visitor armyVisitor=new ArmyVisitor();
           Visitor factoryVisitor=new FactoryVisitor();
           ArrayList<Person>  personList=new  ArrayList<Person>();
           Person person=null;
           personList.add(person=new Man("����",1.56,1.2));
           personList.add(person=new Man("��ǿ",1.76,1.5));
           personList.add(person=new Man("�ž�",1.86,1.3));
           personList.add(person=new Woman("��ƼƼ",1.62,1.2,67));
           personList.add(person=new Woman("������",1.67,1.5,70));
           personList.add(person=new Woman("��С��",1.42,0.9,70));
           Iterator<Person> iter=personList.iterator();
           while(iter.hasNext()){
                person=iter.next();
                person.accept(armyVisitor);  
                person.accept(factoryVisitor); 
           }
     }
} 
