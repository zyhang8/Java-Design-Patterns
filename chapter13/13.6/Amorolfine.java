public class Amorolfine extends Drug{
     String part1="ÿ����������";
     String part2="ÿ�����˹�ţ��";
     public Amorolfine(String name,int [] a){
        this.name=name;
        part1=part1+":"+a[0]+"����\n";
        part2=part2+":"+a[1]+"����\n";
        constitute=part1+part2;
    } 
}
