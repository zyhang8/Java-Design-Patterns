public  class  VehicleRestState extends State{
      public  void startUp(Vehicle vehicle){
            System.out.println(vehicle.getName()+"��ʼ�˶�");
            vehicle.setState(vehicle.getMoveState()); 
      }   
       public  void stop(Vehicle vehicle){
            System.out.println(vehicle.getName()+"�Ѿ��Ǿ�ֹ״̬��");
      }  
}  
