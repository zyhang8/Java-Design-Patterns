public  class  BulletStateOne extends State{
       Gun gun;
       BulletStateOne(Gun gun){
            this.gun=gun; 
       }
       public  void fire(){
            System.out.print("������һ���ӵ�");
            gun.setState(gun.getBulletStateNull());
            System.out.println("(����"+gun.getBulletStateNull().showStateMess()+")") ;
      }   
      public  void loadBullet(){
            System.out.println("�޷�װ��");
      }  
      public String showStateMess(){
           return "1���ӵ�״̬";
      }
}  
