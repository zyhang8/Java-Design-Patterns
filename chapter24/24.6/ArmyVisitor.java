public class  ArmyVisitor implements Visitor{
    public void visit(Man man){
          double stature=man.getStature();
          double eyeSight=man.getEyeSight();
          if(stature>1.72&&eyeSight>1.2)
              System.out.println(man.getName()+"���ϵ�����׼"); 
          else
             System.out.println(man.getName()+"�����ϵ�����׼");
    } 
    public void visit(Woman woman){
          double stature=woman.getStature();
          double eyeSight=woman.getEyeSight();
          int bloodSugar=woman.getBloodSugar();
          boolean boo=bloodSugar>=60&&bloodSugar<=80;
          if(stature>1.65&&eyeSight>1.2&&boo)
              System.out.println(woman.getName()+"���ϵ�����׼"); 
          else
             System.out.println(woman.getName()+"�����ϵ�����׼"); 
    }
}
