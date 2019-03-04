import java.math.BigInteger;
public class UseBigInteger implements Handler{
     private Handler handler;      //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
     private BigInteger result=new BigInteger("1") ; 
     public void compuerMultiply(String number){
        try{ 
            BigInteger n=new BigInteger(number);
            BigInteger ONE=new BigInteger("1");
            BigInteger i=ONE; 
            while(i.compareTo(n)<=0){
                result=result.multiply(i);
                i=i.add(ONE);
            }
            System.out.println(number+"�Ľ׳�:"+result);
        }
        catch(NumberFormatException exp){
            System.out.println(exp.toString());
        } 
     }
     public void setNextHandler(Handler handler){
        this.handler=handler;
     }
}
