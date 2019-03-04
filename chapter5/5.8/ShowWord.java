import java.util.Observable;       
import java.util.Observer;
import java.util.TreeSet;
import java.util.Iterator;
import javax.swing.*;         
public class ShowWord extends JPanel implements Observer {
   Observable subject;
   JTextArea text;
   TreeSet<String> wordList;
   ShowWord(Observable subject){
      this.subject=subject;
      subject.addObserver(this);
      text=new JTextArea(10,15);
      text.setLineWrap(true);
      text.setWrapStyleWord(true);
      text.setEditable(false); 
      add(new JScrollPane(text));
      wordList=new TreeSet<String>(); 
   }
   public void update(Observable subject,Object object){
      text.setText(null);
      text.append("���ֵĵ�����(���ֵ�������)��\n");
      wordList.clear(); 
      String content=object.toString();
      //�ո��ַ������ֺͷ���(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)��ɵ�������ʽ:
       String regex="[\\s\\d\\p{Punct}]+"; 
       String words[]=content.split(regex); 
       for(int i=0;i<words.length;i++){
           wordList.add(words[i]);  
       }
       Iterator<String> te=wordList.iterator();
       while(te.hasNext()){
          String str=te.next();
          text.append(str+" ");
       }   
   } 
}
