import java.util.*;
public class Application{
     public static void main(String args[]) {
           Visitor visitor=new Company();
           ArrayList<Student>  studentList=new  ArrayList<Student>();
           Student student=null;
           studentList.add(student=new Undergraduate("����",67,88));
           studentList.add(student=new Undergraduate("����",90,98));
           studentList.add(student=new Undergraduate("������",85,92));
           studentList.add(student=new GraduateStudent("����",88,70,87));
           studentList.add(student=new GraduateStudent("����",90,95,82));
           Iterator<Student> iter=studentList.iterator();
           while(iter.hasNext()){
                Student stu=iter.next();
                stu.accept(visitor);  
           }
     }
} 
