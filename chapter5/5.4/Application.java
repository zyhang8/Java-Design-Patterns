public class Application{
   public static void main(String args[]){
      WeatherStation weatherStation=new WeatherStation();//��������               
      TravelAgency travelAgency=new TravelAgency();      //��������
      Person ������=new Person(weatherStation,travelAgency);
      weatherStation.doForecast("10��","����С��",28,20);
      travelAgency.giveMess("10��","��ɽ2����");
      weatherStation.doForecast("11��","��ת����",30,22);
      travelAgency.giveMess("11��","�콭1����");
  }
}
