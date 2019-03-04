import java.util.Observable;       //����Observablel��
import java.util.Observer;         //����Observer�ӿ�
public class WaterMessStation extends Observable{
    double  waterVelocity;         //ˮ���ٶ�
    double  waterDischarge;        //ˮ����
    public void giveMess(double waterVelocity,double waterDischarge){
       if(this.waterVelocity!=waterVelocity||this.waterDischarge!=waterDischarge)
          setChanged();
       this.waterVelocity=waterVelocity;
       this.waterDischarge=waterDischarge;
       notifyObservers();
    }
    public double getWaterVelocity(){
       return waterVelocity;
    }
    public double getWaterDischarge(){
       return waterDischarge;
    }
}
