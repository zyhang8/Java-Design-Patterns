public class Application{
    public static void main(String args[]){
       ThreeElectricOutlet outlet;        //Ŀ��ӿڣ����������
       Wash wash=new Wash();              //ϴ�»�
       outlet=wash;                       //ϴ�»��������������
       System.out.println("ʹ�����������ͨ������");
       outlet.connectElectricCurrent();   //��ͨ��������ʼϴ�·�
       TV tv=new TV();                     //���ӻ�
       TreeElectricAdapter adapter=new  TreeElectricAdapter(tv);//�ѵ��Ӳ�����������
       outlet=adapter;                    //�������������������
       System.out.println("ʹ�����������ͨ������");
       outlet.connectElectricCurrent();   //��ͨ��������ʼ���ŵ��ӽ�Ŀ
    }
}
class Wash implements ThreeElectricOutlet{ //ϴ�»�ʹ���������
    String name;
    Wash(){
       name="�ƺ�ϴ�»�";
    }
    Wash(String s){
       name=s;
    }
    public void connectElectricCurrent(){
       turnOn();
    }
    public void turnOn(){
       System.out.println(name+"��ʼϴ���");
    }
}
class TV implements TwoElectricOutlet{    //���ӻ�ʹ���������
    String name;
    TV(){
       name="�������ӻ�";
    }
    TV(String s){
       name=s;
    }
    public void connectElectricCurrent(){
       turnOn();
    }
    public void turnOn(){
       System.out.println(name+"��ʼ���Ž�Ŀ��");
    }
}