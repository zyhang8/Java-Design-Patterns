public  class Woman extends Person{
      String name;
      double stature;       //��� 
      double eyeSight;        //����
      int  bloodSugar ;   //Ѫ��
      Woman(String name,double stature,double eyeSight,int bloodSugar){
            this.name=name;
            this.stature=stature;
            this.eyeSight=eyeSight;
            this.bloodSugar=bloodSugar;
      } 
      public double getStature(){
            return stature;
      } 
      public double getEyeSight(){
            return eyeSight;
      } 
      public int getBloodSugar(){
            return bloodSugar;
      } 
      public String getName(){
            return name;
      }
      public void accept(Visitor v){
           v.visit(this);
      }
}
