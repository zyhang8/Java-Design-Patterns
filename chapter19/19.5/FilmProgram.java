import java.util.ArrayList;
public class FilmProgram implements Program{
      ArrayList<String> content;
      FilmProgram(){
          content=new ArrayList<String>();
     }
      public  ArrayList<String>  makeTVProgram(){
              content.clear();
              content.add("�ص�ս");
              content.add("1937��������Ի���");
              content.add("��·���������չ���ص�վ");
              content.add("�ѹ��Ӵ���Ҳ��ű�");
              content.add("�������������");
              return content;
      }
}
