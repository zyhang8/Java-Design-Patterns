import java.io.File;
public class Application{
     public static void main(String args[]) {
         File file=new File("Hello.txt");
         WordsTemplate  template=new WordSortTemplate(file);
         System.out.println(file.getName()+"�������µĵ��ʣ����ֵ������򣩣�");
         template.showAllWords();
         template=new WordNoSortTemplate(file);
         System.out.println(file.getName()+"�������µĵ��ʣ������г��ֵ��Ⱥ�˳�򣩣�");
         template.showAllWords();
     }
}
