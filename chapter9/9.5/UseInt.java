public class UseInt implements Handler{
     private Handler handler;      //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
     private int result=1 ; 
     public void compuerMultiply(String number){
        try{ 
            int n=Integer.parseInt(number);
            int i=1; 
            while(i<=n){
                result=result*i;
                if(result<=0){
                   System.out.println("�����ҵ�������Χ,�Ҽ��㲻��");
                   handler.compuerMultiply(number);
                   return;
                }
                i++;
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
