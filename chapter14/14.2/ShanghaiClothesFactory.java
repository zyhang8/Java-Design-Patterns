public class ShanghaiClothesFactory extends ClothesFactory {
    public UpperClothes createUpperClothes(int chestSize,int height){
         return new WesternUpperClothes("�Ϻ���ţ������",chestSize,height);
    }
    public Trousers createTrousers(int waistSize,int height){
         return new WesternTrousers("�Ϻ���ţ�п�",waistSize,height);
    }
}
