public class Application{
     public static void main(String args[]) {
           FlyweightFactroy  factroy=FlyweightFactroy.getFactroy();
           double width=1.82,height=1.47,length=5.12;
           String key=""+width+"#"+height+"#"+length;
           Flyweight flyweight=factroy.getFlyweight(key);
           Car audiA6One=new Car(flyweight,"�µ�A6","��ɫ",128);
           Car audiA6Two=new Car(flyweight,"�µ�A6","��ɫ",160);
           audiA6One.print();
           audiA6Two.print();
           width=1.77;
           height=1.45;
           length=4.63;
           key=""+width+"#"+height+"#"+length;
           flyweight=factroy.getFlyweight(key);
           Car audiA4One=new Car(flyweight,"�µ�A4","��ɫ",126);
           Car audiA4Two=new Car(flyweight,"�µ�A4","��ɫ",138);
           flyweight.printMess(" ���ƣ��µ�A4 ��ɫ����ɫ ���ʣ�126"); // ����Ԫ�����ⲿ����
           flyweight.printMess(" ���ƣ��µ�A4 ��ɫ����ɫ ���ʣ�138");
     }
} 
