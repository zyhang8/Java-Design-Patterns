public class SubjectPronounOrNounNode implements Node{
      String [] word={"You","He","Teacher","Student"};
      String token; 
      boolean boo;
      public void parse(Context context){
             token=context.nextToken();
             int i=0;
             for(i=0;i<word.length;i++){
                if(token.equalsIgnoreCase(word[i])){
                    boo=true;
                    break;
                }
             }
             if(i==word.length)
                boo=false;
      }
      public void execute(){
            if(boo){
                if(token.equalsIgnoreCase(word[0]))
                    System.out.print("��"); 
                if(token.equalsIgnoreCase(word[1]))
                    System.out.print("��"); 
                if(token.equalsIgnoreCase(word[2]))
                   System.out.print("��ʦ"); 
                if(token.equalsIgnoreCase(word[3]))
                    System.out.print("ѧ��"); 
            }
            else{
                 System.out.println("���Ǹ������еľ���");
                 //System.exit(0);
            }        
     }
}