public class  FactoryVisitor implements Visitor{
    public void visit(Man man){
          double stature=man.getStature();
          double eyeSight=man.getEyeSight();
          if(stature>1.55&&eyeSight>0.8)
              System.out.println(man.getName()+"���ϵ����˱�׼"); 
          else
              System.out.println(man.getName()+"�����ϵ����˱�׼"); 
    }
    public void visit(Woman woman){
          double stature=woman.getStature();
          double eyeSight=woman.getEyeSight();
          int bloodSugar=woman.getBloodSugar();
          boolean boo=bloodSugar>=50&&bloodSugar<=100;
          if(stature>1.45&&eyeSight>0.8&&boo)
              System.out.println(woman.getName()+"���ϵ����˱�׼"); 
          else
             System.out.println(woman.getName()+"�����ϵ����˱�׼"); 
    }
}
