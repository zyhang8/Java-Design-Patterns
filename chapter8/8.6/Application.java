import java.util.*;
import java.io.*;
public class Application{
   public static void main(String args[]){
      BookNameList oldBookList=new BookNameList();
      oldBookList.setBookName();
      Enumeration bookenum=oldBookList.getEnumeration();
      IteratorAdapter adapter=new IteratorAdapter(bookenum);
      NewBookNameList newBookList=new NewBookNameList(adapter);
      newBookList.setBookName();
      System.out.println("���뵽��ϵͳ�е�ͼ���б�:");
      newBookList.getBookName();
   }
}
