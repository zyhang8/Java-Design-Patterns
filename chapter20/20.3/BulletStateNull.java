public  class  BulletStateNull extends State{
       Gun gun;
       BulletStateNull(Gun gun){
            this.gun=gun; 
       }
       public  void fire(){
            System.out.print("��������ӵ�");
            System.out.println("(Ŀǰ��"+showStateMess()+")") ;
      }   
      public  void loadBullet(){
          System.out.print("װ��");
          gun.setState(gun.getBulletStateThree()); 
          System.out.println("(����"+gun.getBulletStateThree().showStateMess()+")") ;
      } 
      public String showStateMess(){
           return "���ӵ�״̬";
      } 
}  
