public class SafetyCheck{
    String clientPacket;
    public SafetyCheck(String clientPacket){
       this.clientPacket=clientPacket;
    }
    public boolean isSave(){
       if(clientPacket.contains("����"))
          return false;
       else
          return true; 
    } 
}
