public class CheckWord{
    public final int basicAmount=85;
    String advertisement;
    int amount;
    public CheckWord(String advertisement){
       this.advertisement=advertisement;
    }
    public void setChargeAmount(){  
       amount=advertisement.length()+basicAmount; //������Ʒ��ַ���Ŀ
    } 
    public int getAmount(){
       return amount;
    }
}
