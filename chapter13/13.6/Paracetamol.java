public class Paracetamol extends Drug{
     String part1="ÿ��������������";
     String part2="ÿ����������";
     String part3="ÿ�����˹�ţ��";
     String part4="ÿ�����������ȱ�";
     public Paracetamol(String name,int [] a){
        this.name=name;
        part1=part1+":"+a[0]+"����\n";
        part2=part2+":"+a[1]+"����\n";
        part3=part3+":"+a[2]+"����\n";
        part4=part4+":"+a[3]+"����\n";
        constitute=part1+part2+part3+part4;
    } 
}
