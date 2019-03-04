public class Person implements Observer{
   Subject subjectOne,subjectTwo;         //������������
   String forecastTime,forecastMess;
   String tourStartTime,tourMess;
   int maxTemperature,minTemperature;
   Person(Subject subjectOne,Subject subjectTwo){
      this.subjectOne=subjectOne;
      this.subjectTwo=subjectTwo;
      subjectOne.addObserver(this); 
      subjectTwo.addObserver(this); 
   }
   public void update(Subject subject){
      if(subject instanceof WeatherStation){
        WeatherStation WS=(WeatherStation)subject;
        forecastTime=WS.getForecastTime();
        forecastMess=WS.getForecastMess();
        maxTemperature=WS.getMaxTemperature();
        minTemperature=WS.getMinTemperature();
        System.out.print("Ԥ������:"+forecastTime+"��");
        System.out.print("����״��:"+forecastMess+"��");
        System.out.print("����¶�:"+maxTemperature+"��");
        System.out.println("����¶�:"+minTemperature+"��");
      }
      else if(subject instanceof TravelAgency){
        TravelAgency TA=(TravelAgency)subject;
        tourStartTime=TA.getTourStartTime();
        tourMess=TA.getTourMess();
        System.out.print("���ο�ʼ����:"+tourStartTime+"��");
        System.out.println("������Ϣ:"+tourMess+"��");
     }
   } 
}
