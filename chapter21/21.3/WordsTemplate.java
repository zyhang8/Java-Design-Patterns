import java.io.*;
public abstract class WordsTemplate{
      File file;
      String content;
      String [] word;
      WordsTemplate(File file){
           this.file=file;
           content="";
      }
       public final void  showAllWords(){
            readContent();
            getWords();
            if(isSort())
               sort(word);
            printWords(word);
      }
      public boolean isSort(){       //���ӷ���
           return true;
      }
      public final void readContent(){
           try {
                StringBuffer str=new StringBuffer();
                FileReader  inOne=new FileReader(file);
                BufferedReader inTwo= new BufferedReader(inOne);
                String s=null;
                while((s=inTwo.readLine())!=null)
                      str.append(s+"\n");
                content=new String(str);
                inOne.close();
                inTwo.close();
           }
           catch(IOException exp){}
      }
      public final void  getWords(){
           //�ո��ַ������ֺͷ���(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)��ɵ�������ʽ:
           String regex="[\\s\\d\\p{Punct}]+"; 
           word=content.split(regex); 
      }
      public  void sort(String [] word){}             //���ӷ���
      public final void printWords(String [] word){
           for(int i=0;i<word.length;i++){
                 System.out.printf("%-10s",word[i]);
           }
           System.out.println();
      }
}
