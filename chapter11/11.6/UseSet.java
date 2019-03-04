import java.util.*;
public class UseSet{
    LinkedList<Student> list;
    Hashtable<String,Student> table;
    TreeSet<Student> tree;
    UseSet(){
       list=new LinkedList<Student>();
       table=new Hashtable<String,Student>();
       tree=new TreeSet<Student>(); 
    }
    public void addStudent(Student stu){
       list.add(stu);
       update();
    }
    public void lookStudent(String num){
       Student stu=table.get(num);
       String number=stu.getNumber();
       String name=stu.getName();
       double score=stu.getScore(); 
       System.out.println("ѧ��:"+number+" ����:"+name+" ����:"+score);
    }
    public void printStudentsByScore(){
        Iterator<Student> iterator=tree.iterator();
         while(iterator.hasNext()){
          Student stu=iterator.next();
          String number=stu.getNumber();
          String name=stu.getName();
          double score=stu.getScore();
          System.out.println("ѧ��:"+number+" ����:"+name+" ����:"+score);
       }
    }
    private void  update(){
       tree.clear(); 
       Iterator<Student> iterator=list.iterator();
       while(iterator.hasNext()){
          Student stu=iterator.next();
          String number=stu.getNumber();
          table.put(number,stu);
          tree.add(stu); 
       }
    }
}

