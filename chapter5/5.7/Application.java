public class Application{
   public static void main(String args[]){
      WaterMessStation waterStation=new WaterMessStation();//��������               
      WaterDepartment ����ָ�Ӳ�=new WaterDepartment(waterStation);//����۲���
      waterStation.giveMess(10,209.9);
      waterStation.giveMess(11,219.8);
      waterStation.giveMess(7,127);
  }
}
