import java.util.ArrayList;
public class AthleticProgram implements Program{
      ArrayList<String> content;
     AthleticProgram(){
          content=new ArrayList<String>();
     }
      public  ArrayList<String>  makeTVProgram(){
              content.clear();
              content.add("����ֱ��");
              content.add("��������ӽ���");
              content.add("����͢����ӽ���");
              content.add("��������ӽ���");
              content.add("��������");
              return content;
      }
}
