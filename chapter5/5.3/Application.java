public class Application{
   public static void main(String args[]){
      ShopSubject shop=new ShopSubject();                
      CustomerOne boy=new CustomerOne(shop,"�Ŵ���"); 
      CustomerTwo girl=new CustomerTwo(shop,"��컨");
      shop.setDiscountGoods("Photo�������",2345.9,2008.8);
      shop.setDiscountGoods("HKO�ֻ�",1236,998);
  }
}