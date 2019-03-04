import java.util.HashMap;
public class ElementFactory{
       private   HashMap<String,Element>  hashMap;
       static  ElementFactory  factory=new ElementFactory();
       private ElementFactory(){
             hashMap=new HashMap<String,Element>();
       }
       public static ElementFactory getFactory(){
             return factory;
       }
       public synchronized Element getElement(String key){
            if(hashMap.containsKey(key))
                       return hashMap.get(key);
            else{ 
                      char elementOne='\0',elementTwo='\0';
                      elementOne=key.charAt(0);
                      elementTwo=key.charAt(1);
                      Element element=new TwoElement(elementOne,elementTwo);
                      hashMap.put(key,element);
                      return element;
            } 
       }
       class TwoElement implements Element{  // TwoElement���ڲ���
             char elementOne,elementTwo;
             private TwoElement(char elementOne,char elementTwo){
                   this.elementOne=elementOne;
                   this.elementTwo=elementTwo;
            }
            public void printMess(String name,int elementOneNumber,int elementTwoNumber) {
                 System.out.print(name+"��"+elementOne+"��"+elementTwo+"���"); //����ڲ�����
                 System.out.println(" ����"+elementOneNumber+ "��"+elementOne+"Ԫ��"+
                   "��"+elementTwoNumber+ "��"+elementTwo+"Ԫ��"); //����ⲿ����
           }
      }
} 
