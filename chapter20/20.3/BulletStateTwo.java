public  class  BulletStateTwo extends State{
       Gun gun;
       BulletStateTwo(Gun gun){
            this.gun=gun; 
       }
       public  void fire(){
            System.out.print("���һ���ӵ�");
            gun.setState(gun.getBulletStateOne()); 
            System.out.println("(����"+gun.getBulletStateOne().showStateMess()+")") ;
      }   
      public  void loadBullet(){
            System.out.println("�޷�װ��");
      }  
      public String showStateMess(){
           return "2���ӵ�״̬";
      }
}  
