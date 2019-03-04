public class BeijingClothesFactory extends ClothesFactory {
    public UpperClothes createUpperClothes(int chestSize,int height){
         return new WesternUpperClothes("��������������",chestSize,height);
    }
    public Trousers createTrousers(int waistSize,int height){
         return new WesternTrousers("��������������",waistSize,height);
    }
}
