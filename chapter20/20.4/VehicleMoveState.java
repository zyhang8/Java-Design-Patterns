public  class  VehicleMoveState extends State{
      public  void startUp(Vehicle vehicle){
             System.out.println(vehicle.getName()+"�Ѿ����˶�״̬��");
      }   
       public  void stop(Vehicle vehicle){
            System.out.println(vehicle.getName()+"ֹͣ�˶�");
            vehicle.setState(vehicle.getRestState()); 
      }  
}  
