public class AmorDrugCreator implements DrugCreator{
    public Drug getDrug(){
       int [] a={200,5};
       Drug drug=new Amorolfine("��������",a);
       return drug;
    }
}