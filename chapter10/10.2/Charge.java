public class Charge{
    public final int basicCharge=12;
    CheckWord checkWord;
    Charge(CheckWord checkWord){
       this.checkWord=checkWord;
    }
    public void giveCharge(){
        int charge=checkWord.getAmount()*basicCharge;
        System.out.println("������:"+charge+"Ԫ");
    } 
}