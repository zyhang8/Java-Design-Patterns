public  class   BulletStateThree extends State{
       Gun gun;
       BulletStateThree(Gun gun){
            this.gun=gun; 
       }
       public  void fire(){
            System.out.print("���һ���ӵ�");
            gun.setState(gun.getBulletStateTwo()); 
            System.out.println("(����"+gun.getBulletStateTwo().showStateMess()+")") ;
      }   
      public  void loadBullet(){
            System.out.println("�޷�װ��");
      }  
      public String showStateMess(){
           return "3���ӵ�״̬";
      }
}  
