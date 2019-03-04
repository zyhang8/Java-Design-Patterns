public class Shop{
    UpperClothes cloth;
    Trousers trouser; 
    public void giveSuit(ClothesFactory factory,int chestSize,int waistSize,int height){
       cloth=factory.createUpperClothes(chestSize,height);
       trouser=factory.createTrousers(waistSize,height);
       showMess();
    }
    private void showMess(){
       System.out.println("<��װ��Ϣ>");
       System.out.println(cloth.getName()+":");
       System.out.print("��Χ:"+cloth.getChestSize());
       System.out.println("���:"+cloth.getHeight());
       System.out.println(trouser.getName()+":");
       System.out.print("��Χ:"+trouser.getWaistSize());
       System.out.println("���:"+trouser.getHeight());
    }
}