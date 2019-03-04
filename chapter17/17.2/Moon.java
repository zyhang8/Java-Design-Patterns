public class Moon{
      private static Moon  uniqueMoon;
      double radius;
      double distanceToEarth;
      private Moon(){
           uniqueMoon=this;
           radius=1738;
           distanceToEarth=363300;
      }     
      public static synchronized Moon getMoon(){   //����һ��ͬ������
            if(uniqueMoon==null){
                  uniqueMoon=new Moon();
            }
            return uniqueMoon;
      }
      public String show(){
           String s="�����İ뾶��"+radius+"km,�������"+distanceToEarth+"km";
           return s;
      }
}