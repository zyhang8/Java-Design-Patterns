public class ParaDrugCreator implements DrugCreator{
    public Drug getDrug(){
       int [] a={250,15,1,10};
       Drug drug=new Paracetamol("���ӻ�������",a);
       return drug;
    }
}