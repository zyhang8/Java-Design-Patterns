import java.util.*;
public class IteratorAdapter implements Iterator{
    Enumeration bookenum;
    IteratorAdapter(Enumeration bookenum){
        this.bookenum=bookenum;
    }
    public boolean hasNext(){
        return bookenum.hasMoreElements();
    }
    public Object next(){
        return bookenum.nextElement();
    }
    public void remove(){
        System.out.println("ö����û��ɾ������Ԫ�صķ���");
    }
}