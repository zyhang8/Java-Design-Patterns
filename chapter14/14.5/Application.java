import javax.swing.*;
public class Application{
    public static void main(String args[]){
       ShowDepositSlip showDepositSlip=new ShowDepositSlip();
       Bank bank=new ChinaBank();
       showDepositSlip.showDepositSlip(bank,"298765423","����",5000);
       showDepositSlip.setLocation(20,20); 
       showDepositSlip=new ShowDepositSlip();
       bank=new ChinaConstructionBank();
       showDepositSlip.showDepositSlip(bank,"128700542","����",3000);
       showDepositSlip.setLocation(240,20);
       showDepositSlip=new ShowDepositSlip();
       bank=new BankOfCommunications();
       showDepositSlip.showDepositSlip(bank,"108765469","����",8000);
       showDepositSlip.setLocation(460,20);
    }
}
