public  class  Gun{
       State  stateThree,stateTwo,stateOne,stateNull;
       State  state;     
       Gun(){
               stateThree=new BulletStateThree(this);
               stateTwo=new BulletStateTwo(this);
               stateOne=new BulletStateOne(this);
               stateNull=new BulletStateNull(this);
               state=stateThree;                   //��ǹ��Ĭ��״̬����3���ӵ�
       }
       public  void  fire(){
            state.fire();  
      }
      public void loadBullet(){
            state.loadBullet();
      }
      public void setState(State state){
           this.state=state;
      }
      public  State getBulletStateThree(){
           return stateThree;
      }
      public  State getBulletStateTwo(){
           return stateTwo;
      }
      public  State getBulletStateOne(){
           return stateOne;
      }
      public  State getBulletStateNull(){
           return stateNull;
      }
}
